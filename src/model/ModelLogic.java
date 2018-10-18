 package model;
//***************************************** Imports *********************************************
import core.Address;
import core.Agent;
import core.Airplane;
import core.Branch;
import core.Customer;
import core.Employee;
import core.Flight;
import core.FlightAttendant;
import core.FlightOrder;
import core.Order;
import core.Pilot;
import core.StepIn;
import exceptions.LoginFailedException;
import exceptions.MissingFieldsException;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import utils.*;
import utils.Constants.typeOfUser;

/**
 * Model Logic class
 */
@SuppressWarnings("serial")
public final class ModelLogic implements I_ModelLogic, java.io.Serializable {
    //***************************************** Variables *********************************************

    /**
     * Singleton instance of this class, loaded on the first execution of ModelLogic.getInstance()
     */
    private static ModelLogic instance;
    /**
     * Boolean flag for class instance existence (singleton)
     */
    private static boolean exists = false;
    /**
     * SysData reference pointer
     */
    private static SysData sData;


    //***************************************** Constructors ******************************************

    /**
     * Full C'tor, for singleton support.
     */
    private ModelLogic() {
    }
    //***************************************** Methods ***********************************************

    /**
     * The method creates this class's instance & provides access to it, by returning a reference (singleton).
     * @return reference to this class's only instance, or null if reference was already returned (singleton).
     * @throws java.io.IOException
     */
    public static ModelLogic getInstance() throws IOException {
        if (!exists) {
            sData = SysData.getInstance();
            if (sData != null) {
                exists = true;
                instance = new ModelLogic();
                return instance;
            }
        }
        return null;
    }
//-----------------------------------------Getters--------------------------------------
	/**
	 * @return the employees
	 */
	public Map<Integer, Employee> getEmployees() {
		return sData.getEmployees();
	}

	/**
	 * @return the branches
	 */
	public Map<Integer, Branch> getBranches() {
		return sData.getBranches();
	}

	/**
	 * @return the customers
	 */
	public Map<String, Customer> getCustomers() {
		return sData.getCustomers();
	}

	/**
	 * @return the flights
	 */
	public Map<Integer, Flight> getFlights() {
		return sData.getFlights();
        } 
	
        /**
         * @return the users
         */
        public HashMap<String, Users> getUsers() {
            return sData.getUsers();
        }

    //***************************************** CRUD Methods ******************************************
    //----------------------------------- add methods -------------------------------------------------
    /**
     * the method add user to system.
     * @param name
     * @param pass
     * @param theType
     * @return the name of the user
     * @throws exceptions.AlreadyInSystemException
     */
    public String AddMyUser(String name, String pass, typeOfUser theType) {
        sData.getUsers().put(name, new Users(name, pass, theType));
        return name;
    }

    /**
     * the method add user to system (only for checkers)!.
     * @param name
     * @param pass
     */
    public void addUser(String name, String pass) {
        if (name.equals("admin") || name.equals("1234"))
        {
            sData.getUsers().put(name, new Users(name, pass, typeOfUser.ADMIN));
        } 
        if ((name.equals("agent") || name.equals("1234")))
        {
            sData.getUsers().put(name, new Users(name, pass, typeOfUser.AGENT));
        }
        if ((name.equals("customer") || name.equals("1234")))
        {
            sData.getUsers().put(name, new Users(name, pass, typeOfUser.CUSTOMER));
        }
    }
    
    
    //********************************** Other methods ****************************
    /**
     * the method checks the input of the user at the loginFrame.
     * @param name
     * @param pass
     * @return the type of the user
     * @throws exceptions.MissingFieldsException
     * @throws exceptions.LoginFailedException
     */
    public typeOfUser login(String name, String pass) throws MissingFieldsException, LoginFailedException {

        if (name.trim().length() == 0 || pass.trim().length() == 0){ // error exception if one of the fields are empty
            throw new MissingFieldsException();
        }
        if (!sData.getUsers().containsKey(name) || !sData.getUsers().get(name).getPassword().equals(pass)) {
            throw new LoginFailedException();
        }

        return sData.getUsers().get(name).getType();
    }
    
    //********************************** Layer's closure procedure methods ****************************


        @Override
	public boolean addBranch(int branchNumber, String branchName, E_Cities city,String country,
			String street, int houseNumber, String[] phoneNumber) {
		if (branchName != null && branchNumber > 0 && city != null
				&& street != null && houseNumber > 0 && phoneNumber != null && country!=null) {
			if (!sData.getBranches().containsKey(branchNumber)) {
				Address branchAddress = new Address(country,city, street, houseNumber, phoneNumber);
				Branch branchToAdd = new Branch(branchNumber, branchName,
						branchAddress);
				if (sData.getBranches().put(branchNumber, branchToAdd) == null)
					return true;
			}
		}
		return false;
	} //~ END OF addBranch
	
        /**
	 * this method remove branch from our company IIF the branch not exists
	 * already.
	 * @param branchNumber
	 * @return true if the branch removed successfully, false otherwise
	 */
    @Override
	public boolean removeBranch(int branchNumber){
            if(branchNumber > 0 && sData.getBranches().containsKey(branchNumber)){
                for(Employee e : sData.getBranches().get(branchNumber).getAgents()){
                    ((Agent)e).setWorkBranch(null);
                }
                 sData.getBranches().remove(branchNumber);
                 return true;
            }
            return false;
        }//~ END OF removeBranch
        
        /**
	 * edit existsing branch Details
         * @param branchNumber
         * @param branchName
         * @param city
         * @param country
         *  @param street
	 * @param houseNumber
	 * @param phoneNumber
	 * @return true if succeeded to edit
	 */
    @Override
        public boolean editBranchDetails(int branchNumber, String branchName, E_Cities city, String country,
			String street, int houseNumber, String[] phoneNumber){
            if(branchNumber > 0 && sData.getBranches().containsKey(branchNumber)){
                sData.getBranches().get(branchNumber).setbranchName(branchName);
                Address address = new Address(country, city, street, houseNumber, phoneNumber);
                sData.getBranches().get(branchNumber).setBranchAddress(address);
                return true;
            }
            return false;
        }//~ END OF editBranchDetails
        
	/**
	 * Creates and adds new employee
	 * into the appropriate data-structure
	 * @param employee
	 * @return true if this employee added successfully or false otherwise
	 */
        @Override
	public boolean addEmployee(Employee employee){
		//check validity first
		if(employee != null && employee.getEmployeeNumber() >= 0 && 
				!sData.getEmployees().containsKey(employee.getEmployeeNumber())){
			sData.getEmployees().put(employee.getEmployeeNumber(), employee);
                        if(employee instanceof Agent){
                            AddMyUser(String.valueOf(employee.getEmployeeNumber()), employee.getPassword(), typeOfUser.AGENT);
                        }
			return true;
		}
		
		return false;
	}// ~ END OF addEmployee
	
        /**
	 * remove employee
	 * from appropriate data-structure
         * * @param employeeNumber
	 * @return true if this employee removed successfully or false otherwise
	 */
    @Override
	public boolean removeEmployee(int employeeNumber){
            if(employeeNumber > 0 && sData.getEmployees().containsKey(employeeNumber)){
                if(sData.getEmployees().get(employeeNumber) instanceof Pilot && !((Pilot)sData.getEmployees().get(employeeNumber)).getFlights().isEmpty()){
                    for(Flight f : ((Pilot)sData.getEmployees().get(employeeNumber)).getFlights()){
                    sData.getFlights().get(f.getFlightNumber()).removePilot(((Pilot)sData.getEmployees().get(employeeNumber)));
                    }
                }
                if(sData.getEmployees().get(employeeNumber) instanceof FlightAttendant && !((FlightAttendant)sData.getEmployees().get(employeeNumber)).getFlights().isEmpty()){
                    for(Flight f : ((FlightAttendant)sData.getEmployees().get(employeeNumber)).getFlights()){
                        sData.getFlights().get(f.getFlightNumber()).removeFlightAttendant(((FlightAttendant)sData.getEmployees().get(employeeNumber)));                   
                    }
                }
                 if(sData.getEmployees().get(employeeNumber) instanceof Agent && ((Agent)sData.getEmployees().get(employeeNumber)).getWorkBranch() != null){    
                     int branchNumber = (int)((Agent)sData.getEmployees().get(employeeNumber)).getWorkBranch().getbranchNumber();                 
                     sData.getBranches().get(branchNumber).removeAgent(((Agent)sData.getEmployees().get(employeeNumber))); 
                     sData.getUsers().remove(String.valueOf(employeeNumber));
                 }
                sData.getEmployees().remove(employeeNumber);
                return true;
                }             
            return false;
        }// ~ END OF removeEmployee
        
        /**
	 * edit existsing Agent Details
         * @param employeeNumber
         * @param firstName
         * @param lastName
         * @param birthDate
         * @param startWorkingDate
         * @param password
         * @param address
	 * @see Constants#PASSPORT_NUMBER_SIZE
	 * @return true if succeeded to edit
	 */
    @Override
	public boolean editAgentDetails(int employeeNumber, String firstName, String lastName,
			Date birthDate, Date startWorkingDate, String password, Address address){
            if(employeeNumber > 0 && sData.getEmployees().containsKey(employeeNumber)){
                sData.getEmployees().get(employeeNumber).setFirstName(firstName);
                sData.getEmployees().get(employeeNumber).setLastName(lastName);
                sData.getEmployees().get(employeeNumber).setBirthDate(birthDate);
                sData.getEmployees().get(employeeNumber).setStartWorkingDate(startWorkingDate);
                sData.getEmployees().get(employeeNumber).setPassword(password);
                sData.getEmployees().get(employeeNumber).setAddress(address);
                sData.getUsers().get(String.valueOf(employeeNumber)).setPassword(password);
                return true;  
            }
            return false;
        }// ~ END OF editAgentDetails
        
        /**
	 * edit existsing pilot Details
         * @param employeeNumber
         * @param firstName
         * @param lastName
         * @param birthDate
         * @param startWorkingDate
         * @param password
         * @param address
         * @param licenseType
	 * @return true if succeeded to edit
	 */
    @Override
	public boolean editPilotDetails(int employeeNumber, String firstName, String lastName,
			Date birthDate, Date startWorkingDate, String password, Address address, E_LicenseType licenseType){
            if(employeeNumber > 0 && sData.getEmployees().containsKey(employeeNumber)){
                sData.getEmployees().get(employeeNumber).setFirstName(firstName);
                sData.getEmployees().get(employeeNumber).setLastName(lastName);
                sData.getEmployees().get(employeeNumber).setBirthDate(birthDate);
                sData.getEmployees().get(employeeNumber).setStartWorkingDate(startWorkingDate);
                sData.getEmployees().get(employeeNumber).setPassword(password);
                sData.getEmployees().get(employeeNumber).setAddress(address);
                ((Pilot)sData.getEmployees().get(employeeNumber)).setLicenseType(licenseType);
                return true;  
            }
            return false;
        }// ~ END OF editPilotDetails
        
        /**
	 * edit existsing FlightAttendant Details
         * @param employeeNumber 
         * @param firstName 
         * @param lastName 
         * @param birthDate 
         * @param startWorkingDate 
         * @param password 
         * @param address 
         * @param isHerald 
	 * @return true if succeeded to edit
	 */
    @Override
	public boolean editFlightAttendantDetails(int employeeNumber, String firstName, String lastName,
			Date birthDate, Date startWorkingDate, String password, Address address, boolean isHerald){
            if(employeeNumber > 0 && sData.getEmployees().containsKey(employeeNumber)){
                sData.getEmployees().get(employeeNumber).setFirstName(firstName);
                sData.getEmployees().get(employeeNumber).setLastName(lastName);
                sData.getEmployees().get(employeeNumber).setBirthDate(birthDate);
                sData.getEmployees().get(employeeNumber).setStartWorkingDate(startWorkingDate);
                sData.getEmployees().get(employeeNumber).setPassword(password);
                sData.getEmployees().get(employeeNumber).setAddress(address);
                ((FlightAttendant)sData.getEmployees().get(employeeNumber)).setHerald(isHerald);
                return true;  
            }
            return false;
        }// ~ END OF editFlightAttendantDetails
        
	/**
	 * Creates and adds new customer
	 * into the appropriate data-structure
	 * spatial validity: 
	 * - passport number length need to be as it represented 
	 *   in Constants class, and contains only digits.
	 * @see Constants#PASSPORT_NUMBER_SIZE
	 * @param passportNumber
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param password
	 * @param email
	 * @param customerAddress
	 * @return true if succeeded to add
	 */
        @Override
	public boolean addCustomer(String passportNumber, double balance, String firstName, String lastName,
			Date birthDate, String password, URL email, Address customerAddress){
		//check validity first
		if(passportNumber != null && firstName != null && lastName != null && birthDate != null &&
				password != null && email != null && customerAddress != null && balance >0){
			if(passportNumber.length() == Constants.PASSPORT_NUMBER_SIZE)
				for(int i = 0; i < passportNumber.length(); i++)
					if(! Character.isDigit(passportNumber.charAt(i)))
						return false;
			
			//creating a new customer with his full constructor
			Customer customer = new Customer(Integer.parseInt(passportNumber),balance, firstName, lastName, birthDate, password, email, customerAddress);
			
			if(!sData.getCustomers().containsKey(passportNumber)){
				sData.getCustomers().put(passportNumber, customer); // add this customer
                                AddMyUser(passportNumber, password, typeOfUser.CUSTOMER);
				return true;
			}
		}
		
		return false;
		
	}// ~ END OF addCustomer

        /**
	 * remove customer
	 * from the appropriate data-structure
	 * spatial validity: 
	 * - passport number length need to be as it represented 
	 *   in Constants class, and contains only digits.
	 * @see Constants#PASSPORT_NUMBER_SIZE
	 * @param passportNumber
	 * @return true if succeeded to remove
	 */
    @Override
	public boolean removeCustomer(String passportNumber){
            if(passportNumber != null && sData.getCustomers().containsKey(passportNumber)){
                for(Order o : sData.getCustomers().get(passportNumber).getOrders() ){
                    cancelOrder(o.getOrderNumber());
                }
                sData.getUsers().remove(passportNumber);
                sData.getCustomers().remove(passportNumber);
                return true;
            }
            return false;
        }// ~ END OF removeCustomer
       
        /**
	 * edit existsing Customer Details
	 * @param passportNumber
         * @param balance
         * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param password
	 * @param email
	 * @param customerAddress
	 * @return true if succeeded to edit
	 */
    @Override
        public boolean editCustomerDetails(String passportNumber, double balance, String firstName, String lastName,
			Date birthDate, String password, URL email, Address customerAddress){
                        if(passportNumber != null && sData.getCustomers().containsKey(passportNumber)){
                sData.getCustomers().get(passportNumber).setBalance(balance);
                sData.getCustomers().get(passportNumber).setFirstName(firstName);
                sData.getCustomers().get(passportNumber).setLastName(lastName);
                sData.getCustomers().get(passportNumber).setBirthDate(birthDate);
                sData.getCustomers().get(passportNumber).setPassword(password);
                sData.getCustomers().get(passportNumber).setEmail(email);
                sData.getCustomers().get(passportNumber).setCustomerAddress(customerAddress);
                sData.getUsers().get(passportNumber).setPassword(password);
                return true;
            }
            return false; 
        }// ~ END OF editCustomerDetails
        
	/**
	 * This method add new Flight to our company IIF this conditions are valid:
	 * - landing date has to be after the take off date
	 * - flight doesn't exists
	 * - all the variables are valid( number>0 & objects != null)
	 * - source and destination can't be the same airport
	 * @param flightNumber
	 * @param flightDateAndTimeSource
	 * @param flightDateAndTimeDestination
	 * @param flightCost
         * @param source
         * @param destination
	 * @param airplane
	 * @return true if Flight added successfully, false otherwise 
	 */
        @Override
	public boolean addFlight(int flightNumber, Date flightDateAndTimeSource,
			Date flightDateAndTimeDestination, double flightCost, E_Airports source, E_Airports destination,
			Airplane airplane) {
		if (flightNumber > 0 && flightDateAndTimeSource != null && flightDateAndTimeDestination != null && 
				flightCost > 0 && airplane != null && source != null && destination != null)
		{
			if(flightDateAndTimeSource.before(flightDateAndTimeDestination) && 
					!source.equals(destination) && !sData.getFlights().containsKey(flightNumber))
			{
				Flight flightToAdd = new Flight(flightNumber,flightDateAndTimeSource,flightDateAndTimeDestination,source, destination,flightCost,airplane);
				if(sData.getFlights().put(flightNumber, flightToAdd)==null){
					return true;
				}
			}
		}

		return false;
	}// ~ END OF addFlight
	
        /**
	 * This method remove Flight from our company IIF the Flight exists:
	 * @param flightNumber
	 * @return true if Flight removed successfully, false otherwise 
	 */
    @Override
	public boolean removeFlight(int flightNumber){
            if(flightNumber > 0 && sData.getFlights().containsKey(flightNumber)){
                for(Employee e : sData.getFlights().get(flightNumber).getPilots()){
                   ((Pilot) sData.getEmployees().get(e.getEmployeeNumber())).removeFlight(sData.getFlights().get(flightNumber));                   
                } 
                for(Employee e : sData.getFlights().get(flightNumber).getFlightAttendants()){
                   ((FlightAttendant) sData.getEmployees().get(e.getEmployeeNumber())).removeFlight(sData.getFlights().get(flightNumber));                   
                }
                sData.getFlights().remove(flightNumber);
                return true;
            }
            return false;
        }// ~ END OF removeFlight
        
        /**
	 * edit existsing Flight Details
         * @param flightNumber
	 * @param flightDateAndTimeSource
	 * @param flightDateAndTimeDestination
	 * @param flightCost
         * @param source
         * @param destination
	 * @param airplane
	 * @return true if succeeded to edit
	 */
    @Override
	public boolean editFlightDetails(int flightNumber, Date flightDateAndTimeSource,
			Date flightDateAndTimeDestination, double flightCost, E_Airports source, E_Airports destination, Airplane airplane){
            if(flightNumber > 0 && sData.getFlights().containsKey(flightNumber) && !source.equals(destination)){
                sData.getFlights().get(flightNumber).setFlightDateAndTimeSource(flightDateAndTimeSource);
                sData.getFlights().get(flightNumber).setFlightDateAndTimeDestination(flightDateAndTimeDestination);
                sData.getFlights().get(flightNumber).setFlightCost(flightCost);
                sData.getFlights().get(flightNumber).setSource(source);
                sData.getFlights().get(flightNumber).setDestination(destination);
                sData.getFlights().get(flightNumber).setAirplane(airplane);
                return true;
            }
            return false;
        }// ~ END OF editFlightDetails
        
	/**
	 * this method adds stop to specific flight IIF the stop is not already in part of the flight path.
	 * Hint! the path is not only the step in's.
	 * stepNumber of the stepIn represent the stop number 
         * @param flightNumber
         * @param stepLocation
	 * @return true if step added successfully, false otherwise
	 */
        @Override
	public boolean addStepInToFlight(int flightNumber,E_Airports stepLocation){

		if(flightNumber>0 && stepLocation !=null)
		{
			if(sData.getFlights().containsKey(flightNumber))
			{
				Flight flight = sData.getFlights().get(flightNumber);
				if(!flight.getDestination().equals(stepLocation) && !flight.getSource().equals(stepLocation))
				{
					for(StepIn s : flight.getStops())
					{
						if(s.getAirport().equals(stepLocation))
							return false;
					}
					StepIn stopToAdd = new StepIn(flight.getStops().size()+1, flight, stepLocation);
					return flight.addStop(stopToAdd);
				}
			}
		}
		return false;
	} //~ END OF addStepInToFlight
	
        /**
	 * this method remove stop from specific flight IIF the stop is already in part of the flight path.
	 * Hint! the path is not only the step in's.
	 * stepNumber of the stepIn represent the stop number 
         * @param flightNumber
         * @param stepLocation
	 * @return true if step added successfully, false otherwise
	 */
    @Override
	public boolean removeStepInFromeFlight(int flightNumber,E_Airports stepLocation){
            if(sData.getFlights().containsKey(flightNumber) && stepLocation != null){
               for(StepIn s : sData.getFlights().get(flightNumber).getStops()){
                   if(s.getAirport().equals(stepLocation)){
                       sData.getFlights().get(flightNumber).removeStop(s);
                   return true;
                   }
                }
            }
            return false;
        }//~ END OF removeStepInFromeFlight
        
	/**
	 * This method first add a given flight to a given employee (pilot or FlightAttendant)
	 * and do the opposite (use instanceof operation).
	 * If the employee unsuccessfully added to the flight ==> Roll back is needed
	 * @param employee
	 * @param flight
	 * @return true if the connection added successfully, false otherwise
	 */
        @Override
	public boolean addPilotOrFlightAttendantToFlight(Employee employee, Flight flight){
		
		if(employee != null && flight != null){
			if(employee instanceof FlightAttendant){
				if(((FlightAttendant) employee).addFlight(flight))
					if(flight.addFlightAttendant((FlightAttendant)employee))
						return true;
					else
						((FlightAttendant) employee).removeFlight(flight); //Roll back
			}
			else if(employee instanceof Pilot){
				if(((Pilot) employee).addFlight(flight)){
					if(flight.addPilot((Pilot)employee)){
						
						return true;
					}
					else
						((Pilot) employee).removeFlight(flight); //Roll back
				}
			}

		}
		
		return false;
	}// ~ END OF addPilotOrFlightAttendantToFlight

	/**
	 * this method connect existing agent to existing branch IIF the branch and
	 * the agent exists
	 * @param agentNumber
	 * @param branchNumber
	 * @return true if succeeded, false otherwise
	 */
        @Override
	public boolean connectAgentToBranch(int agentNumber, int branchNumber){
		if(agentNumber > 0 && branchNumber > 0)
		{
			if(sData.getEmployees().containsKey(agentNumber) && sData.getBranches().containsKey(branchNumber))
			{
				Employee agent = sData.getEmployees().get(agentNumber);
				Branch branch = sData.getBranches().get(branchNumber);
				if(agent instanceof Agent && !branch.getAgents().contains((Agent)agent))
				{
					if(branch.addAgent((Agent)agent))
					{
						((Agent)agent).setWorkBranch(branch);
						return true;
					}
				}
			}
	
		}
		return false;	
	}// ~ END OF connectAgentToBranch
	
	/**
	 * This method add a new flight order to order.
	 * If the order is already exist in the customer's orders, than just add it to the existing order.
	 * If there no such order in the customer's orders, than create a new order and add it to 
	 * customer's orders and agent's orders and associate this flight order with the flight and order.
	 * do not forget to set this customer as a responsible for this order.
	 * @param agentNumber
	 * @param customerPassport
	 * @param orderNumber
	 * @param flightNumber
	 * @return true if the FlightOrder added successfully, false otherwise
	 */
        @Override
	public boolean addFlightToOrder(int agentNumber, String customerPassport, int orderNumber, int flightNumber){
		
		if(agentNumber > 0 && customerPassport != null && orderNumber > 0 && flightNumber > 0){
			if(sData.getCustomers().containsKey(customerPassport) && 
					sData.getEmployees().containsKey(agentNumber) && sData.getFlights().containsKey(flightNumber)){
				
				Flight flight = sData.getFlights().get(flightNumber);
				Agent agent = (Agent)sData.getEmployees().get(agentNumber);
				Customer customer = sData.getCustomers().get(customerPassport);
				
				
				Order order = new Order(orderNumber);
				
				for(Order ord : customer.getOrders()){
					for(FlightOrder fo : ord.getFlightOrders())
						if(fo.equals(new FlightOrder(flight, order)))
							return false;
				}
				
				boolean isNew = false;
				
				if(customer.getOrders().contains(order)){ //there exist such order in this castomer's orders
					order = customer.getOrders().get(customer.getOrders().indexOf(order));
				}
				else{
					isNew = true;
					order = new Order(orderNumber, false, customer, agent);
					customer.addOrder(order);
					agent.addOrder(order);
					order = customer.getOrders().get(customer.getOrders().indexOf(order));
				}

				FlightOrder flightOrder = new FlightOrder(flight, order);
				
				order.addFlightOrder(flightOrder);
				
				if(!flight.addFlightOrder(flightOrder)){//check if roll back is needed
					if(isNew){
						agent.removeOrder(order);
						customer.removeOrder(order);
					}
					else
						order.removeFlightOrder(flightOrder);
					return false;
				}
				
				return true;
			}
		}
		return false;
		
	}// ~ END OF addFlightOrder
	
	/**
	 * This method add a new flight ticket to an existing flight order.
	 * Given the passenger's passport number, this method also add this ticket
	 * to this passenger IFF he is'nt a passenger on this specific flight order and 
	 * the exact seat is available 
	 * @param flightNumber
	 * @param orderNumber
	 * @param passportNumber
	 * @param seat
	 * @param row
	 * @param classType
	 * @return true if the ticket added successfully, false otherwise
	 */
        @Override
	public boolean addFlightTicketToFlightOrder(int flightNumber, int orderNumber, String passportNumber, 
                int seat, int row, String classType){
		
		if(flightNumber > 0 && orderNumber > 0 && passportNumber != null && seat > 0 && row > 0 && classType != null){
			if(sData.getFlights().containsKey(flightNumber) && sData.getCustomers().containsKey(passportNumber)){
				Customer passenger = sData.getCustomers().get(passportNumber);
				Flight flight = sData.getFlights().get(flightNumber);
				Order order = new Order(orderNumber);
				FlightOrder flightOrder = new FlightOrder(flight, order);
                                
				if(flight.getFlightOrders().contains(flightOrder)){
					flightOrder = flight.getFlightOrders().get(flight.getFlightOrders().indexOf(flightOrder));
					FlightOrder.FlightTicket ft = flightOrder.addTicket(passenger, seat, row, classType);
					if(ft != null){
						return passenger.addFlightTicket(ft);
					}
				}
			}
		}
		
		return false;
		
	}// ~ END OF addFlightTicketToFlightOrder
	
	/**
	 * this method change the address of existing customer IIF the customer already exists and the detail are valid.
	 * @param customerId
	 * @param country
	 * @param city
	 * @param street
	 * @param houseNumber
	 * @param phonenumbers
	 * @return true if succeeded, false otherwise.
	 */
        @Override
	public boolean changeCustomerAddress(String customerId, String country, E_Cities city,String street
			,int houseNumber,String[] phonenumbers){
		if(customerId!=null && country!=null && city != null && street!=null && houseNumber>0 && phonenumbers!=null && sData.getCustomers().containsKey(customerId))
		{
			Customer tempCustomer = sData.getCustomers().get(customerId);
			Address addressToChange = new Address(country, city, street, houseNumber, phonenumbers);
			tempCustomer.setCustomerAddress(addressToChange);
			return true;
		}
		return false;
	} // ~ END OF changeCustomerAddress
	
	
	/**
	 * this method cancel order from the system by order number (Primary Key).
	 * completely canceled order IIF all related objects will delete from order.
	 * <b>Hint!</b> disconnect the order from the flight (flightOrder), use helper method!
	 * 	 * ~ use disconnectFlightOrder
	 * @param orderNumber
	 * @return true if order completely canceled, false otherwise
	 */
        @Override
	public boolean cancelOrder(int orderNumber){
		Order orderToRemove;
		if(orderNumber > 0)
		{
			orderToRemove = new Order(orderNumber);
			for(Customer c : sData.getCustomers().values())
			{
				if(c.getOrders().contains(orderToRemove))
				{
					
					orderToRemove = c.getOrders().get(c.getOrders().indexOf(orderToRemove));
					
					for(FlightOrder fo : orderToRemove.getFlightOrders()){
						disconnectFlightOrder(fo);
					}
				
					for(Employee employee : sData.getEmployees().values()){
						if(employee instanceof Agent){
							if(((Agent)employee).removeOrder(orderToRemove)){
								break;
							}
						}
					}
					
					return c.removeOrder(orderToRemove);
				}
			}
			
		}
		return false;
	}// ~ END OF cancelOrder
	
	/**
	 * this method disconnect the flight and the order from flight order from both sided.
	 * @param flightOrder
	 */
        @Override
	public void disconnectFlightOrder(FlightOrder flightOrder){
		if(flightOrder != null)
		{
			if(flightOrder.getFlight() != null){
				flightOrder.getFlight().removeFlightOrder(flightOrder);	
			}
			if(flightOrder.getOrder() != null){
				flightOrder.getOrder().removeFlightOrder(flightOrder);
			}
		
		}
	}// ~ END OF disconnectFlightOrder
	 
	/**
	 * this Method associate Customer to Pay for order IIF the customer have enough money to pay
	 * and the order didn't paid already
	 * @param orderNumber
	 * @param customerNumber
	 * @return true if succeeded, false otherwise
	 */
        @Override
	public boolean associateCustomerPayingOrder(int orderNumber, String customerNumber){
		if(orderNumber>0 && customerNumber!=null)
		{
			Order tempOrder = new Order(orderNumber);
			Customer cust = sData.getCustomers().get(customerNumber);

			if(cust!=null)
			{
				if(cust.getOrders().indexOf(tempOrder)!=-1)
				{		
					tempOrder = cust.getOrders().get(cust.getOrders().indexOf(tempOrder));
					if(tempOrder.isPaid()==false && sData.getCustomers().get(customerNumber).payOrder(tempOrder.getOrderCost()))
					{	                                            
						tempOrder.setPaid(true);
						return true;
					}
				}
			}
		}
		return false;
	}
	//-------------------------------Queries------------------------------
	
	//===================================================
	// 					HW_1_Queries
	//===================================================
	/**
	 * Query that gets the top given number of Flight with the most passengers that bought tickets. 
         * @param x 
	 * @return list of flights
	 */
    @Override
	public List<Flight> getTheTopXPopularFlights(int x) {
		if (x <= 0)
			return null;
		int maxTickets = 0;
		ArrayList<Flight> maxFlights = new ArrayList<Flight>();
		int sum = 0;
		Flight flighToAdd = null;
		
		for (int i = 0; i < x; i++) {
			for (Flight f : sData.getFlights().values()) {
				sum = 0;
				if(!maxFlights.contains(f))
				{
					for (FlightOrder fo : f.getFlightOrders()) {
						sum += fo.getTickets().size();
					}
					if (sum >= maxTickets) {
						maxTickets = sum;
						flighToAdd = f;
					}
				}
			}
			
			if(!maxFlights.contains(flighToAdd) && flighToAdd != null)
				maxFlights.add(flighToAdd);
			maxTickets=0;
		}
		return maxFlights;
	}// ~END OF getTheTopXPopularFlights
	
	
	/**
	 * The most Profitable order is the order with the higher profit of money in all orders.
	 * user helper methods!
	 * @return order or null
	 */
        @Override
	public Order getTheMostProfitableOrder(){
		Order maxOrder=null;
		double maxAmount=0;
		for(Customer c : sData.getCustomers().values())
		{
			for(Order o : c.getOrders())
			{
				if(o.getOrderCost()>=maxAmount && o.getOrderCost() > 0 )
				{
					maxAmount = o.getOrderCost();
					maxOrder = o;
				}
			}		
		}
		return maxOrder;
	}// ~ END OF getTheMostProfitableOrder
	
	/** 
	 * super agent is an agent thats sells more then 10 
	 * flight tickets and those tickets belong to a paid order.
	 * @return an agent
	 */
        @Override
	public List<Employee> getAllSuperAgents(){
		List<Employee> superAgents = new ArrayList<Employee>();
		int count=0;
		for(Employee agent : sData.getEmployees().values())
		{
			count=0;
			if(agent instanceof Agent)
			{
				for(Order o : ((Agent)agent).getOrders())
				{
					if(o.isPaid()==true)
					{
						for(FlightOrder fo : o.getFlightOrders())
							{
								count+= fo.getTickets().size();
							}
					}
				}
				if(count>10)
					superAgents.add(agent);				
			}
		}
		return superAgents;
	}// ~ END OF getAllSuperAgents
	
	
	/**
	 * <b> Using any data-structure is not allowed <b>. only what we already have.
	 *  The method returns the orders of the profitable customer, the customer
	 * 	with the highest paid orders number.
	 * <b>Hint:<b> create and use a method that counts paid orders for a given customer 
	 * @return profitable customer
	 */
        @Override
	public List<Order> getAllOrdersOfMostProfitableCustomer(){
            ArrayList<Order> orders = new ArrayList<>();
		int numberOfOrders = 0;
		
		for(Customer customer : sData.getCustomers().values()){
			if(!customer.getOrders().isEmpty() && customer.getOrders().size() > numberOfOrders){
				numberOfOrders = customer.getOrders().size();
                                orders.addAll(customer.getOrders());
			}
		}
		return orders;
	} // ~ END OF getAllOrdersOfMostProfitableCustomer

	//===================================================
	// 					HW_2_Queries
	//===================================================
	/**
	 * employee of the month is the employee that take part in the highest 
	 * number of flights, soars in the given month, and have at list 2 stops
	 * @param month
	 * @return employee
	 */
	@SuppressWarnings("deprecation")
        @Override
	public Employee employeeOfTheMonth(Date month){
			int max=0;
			Employee employeeOfTheMonth=null;
			int maxEmployee=0;
			for(Employee e: sData.getEmployees().values())
			{
				max=0;
				if(e instanceof Pilot || e instanceof FlightAttendant)
				{
					Set<Flight> flights = null;
					if(e instanceof Pilot)
						flights = ((Pilot)e).getFlights();
					else
						flights = ((FlightAttendant)e).getFlights();
					
					for(Flight f : flights)
					{
						if(f.getFlightDateAndTimeSource().getMonth() + 1 == month.getMonth() && f.getFlightDateAndTimeSource().getYear() + 1900 == month.getYear() && f.getStops().size() >= 2)
						{
							max += 1;
						}
					}

					if(max > maxEmployee)
					{
						maxEmployee = max;
						employeeOfTheMonth = e;
					}				
				}
			}
			return employeeOfTheMonth;
	}// ~ END OF employeeOfTheMonth
	
	/**
	 * this method return all the summer flights in this year sorted by number of stops
	 * @see Constants#SUMMER_MONTHES
	 * @return TreeSet<Flight>
	 */
	@SuppressWarnings("deprecation")
        @Override
	public TreeSet<Flight> getAllSummerFlightsSortedByNumberOfStops(){
		TreeSet<Flight> sortedFlights = new TreeSet<Flight>();
		Date year = new Date();
		
		for(Flight f : sData.getFlights().values())
		{
			if(f.getFlightDateAndTimeSource().getYear() == year.getYear())
			{
				for(int i=0; i<Constants.SUMMER_MONTHES.length; i++)
				{
					if(f.getFlightDateAndTimeSource().getMonth() + 1 == Constants.SUMMER_MONTHES[i])
					{
						sortedFlights.add(f);
						break;
					}
				}
			}
		}
		return sortedFlights;
	} // ~ END OF getAllSummerFlightsSortedByNumberOfStops
	
	/**
	 * This method return all this summer flights that soars from or lands
	 * in a given airport sorted by flight cost in an ascending order.
	 * @param location
	 * @return flights 
	 */
	@SuppressWarnings("deprecation")
        @Override
	public ArrayList<Flight> getAllThisSummerFlightsByLocation(E_Airports location){
		ArrayList<Flight> summerFlights = new ArrayList<Flight>();
		Date today = new Date();
		
		for(Flight flight : sData.getFlights().values()){
			if(flight.getSource().equals(location) || flight.getDestination().equals(location)){
				if(flight.getFlightDateAndTimeSource().getYear() == today.getYear()){ 
					if(flight.getFlightDateAndTimeSource().getMonth() + 1 == Constants.SUMMER_MONTHES[0] ||
							flight.getFlightDateAndTimeSource().getMonth() + 1 == Constants.SUMMER_MONTHES[1] ||
									flight.getFlightDateAndTimeSource().getMonth() + 1 == Constants.SUMMER_MONTHES[2]){
						summerFlights.add(flight);
					}
				}
			}
		}
		
		Collections.sort(summerFlights, new Comparator<Flight>(){
			@Override
			public int compare(Flight flight1, Flight flight2) {
				return new Double(flight1.getFlightCost()).compareTo(flight2.getFlightCost());
			}
			
		});
		
		return summerFlights;
	} // ~ END OF getAllThisSummerFlightsByLocation
	
	/**
	 * potential customers for Agents is a customer who lives in the same city where Agent lives
	 * but the customer never ordered from the agent.
	 * this method Retrieve <Agent,List<Customer>> of agent with list of potential customers for each Agent IIF 
	 * the Agent have any, otherwise the Agent will exclude from the map
	 * @return <Agent,List<Customer>>
	 */
        @Override
	public Map<Agent,List<Customer>> getPotentialCustomersForAgents(){
		boolean isTheSame;
		Map<Agent,List<Customer>> potentialCustomers = new HashMap<Agent,List<Customer>>();
		
		for(Employee e : sData.getEmployees().values()){
			if(e instanceof Agent){
				for(Customer c : sData.getCustomers().values()){
					isTheSame = false;
					if(c.getCustomerAddress().getCountry().equals(e.getAddress().getCountry()) && 
							c.getCustomerAddress().getCity().equals(e.getAddress().getCity())){
							for(Order ord : c.getOrders())
							{
								if(ord.getAgent().equals((Agent)e))
									isTheSame = true;
							}
							
							if(!isTheSame)
							{
								if(potentialCustomers.containsKey((Agent)e))
									potentialCustomers.get((Agent)e).add(c);
								else{
									ArrayList<Customer> a = new ArrayList<Customer>();
									a.add(c);
									potentialCustomers.put((Agent)e, a);
								}
							}
							
					}
					
				}
			}
		}
				
		return potentialCustomers;
	} // ~ END OF getPotentialCustomersForAgents
	
	/**
	 * Retrieve Refugees - Potential customer for branch is a customer how lives in a city where IFly
	 * owns a branch but the customer never bought from it.
	 * This method return a Map with a list of potential customers for each branch.
	 * <b>Warning:<b> branch that as no such customers will not show up
	 * 					in your Map. 
	 * @return map with potential customers for each branch
	 */
        @Override
	public Map<Branch, List<Customer>> getPotentialCustomersForBranch(){
		Map<Branch, List<Customer>> branchesRefugees = new HashMap<Branch, List<Customer>>();
		ArrayList<Customer> potentialCustomers = null;
		boolean isBought = false;
		
		for(Branch branch : sData.getBranches().values()){
			potentialCustomers = new ArrayList<>();
			
			for(Customer customer : sData.getCustomers().values()){
				isBought = false;
				if(customer.getCustomerAddress().getCity().equals(branch.getBranchAddress().getCity())){
					for(Agent branchAgent : branch.getAgents()){
						for(Order agentOrder : branchAgent.getOrders()){
							if(customer.getOrders().contains(agentOrder))
								isBought = true;
						}
					}
					
					if(!isBought)
						potentialCustomers.add(customer);
				}
			}
			
			if(potentialCustomers.size() > 0)
				branchesRefugees.put(branch, potentialCustomers);
		}
		
		return branchesRefugees;
	} // ~ END OF getPotentialCustomersForBranch
	
	/**
	 * This method return all flights sorted by occupancy in an ascending order.
	 * Occupancy of flight: (number of occupied seats)/(airplane size)
	 * <b>Hint:<b> first get all flight into a map where value is the occupancy
	 * then try sorting the "Map.Entry" by using a proper data structure.
	 * @return priority queue of sorted flights and their occupancy
	 */
        @Override
	public PriorityQueue<Map.Entry<Flight, Double>> getFlightsSortedByOccupancy(){
		Map<Flight, Double>	unSortedFlights = new HashMap<Flight, Double>();
		double occupancy;
		
		for(Flight flight : sData.getFlights().values()){
			occupancy = 0;
			
			for(FlightOrder flightOrder : flight.getFlightOrders())
				occupancy += flightOrder.getTickets().size();
			
			occupancy /= flight.getAirplane().getTotalNumberSeats();

			unSortedFlights.put(flight, occupancy);
		}
		
		PriorityQueue<Map.Entry<Flight, Double>> sortedFlights = new PriorityQueue<Map.Entry<Flight, Double>>(10, 
				new Comparator<Map.Entry<Flight, Double>>(){
					@Override
					public int compare(Map.Entry<Flight, Double> entry1,
							Map.Entry<Flight, Double> entry2) {
						return entry1.getValue().compareTo(entry2.getValue());
					}	
				});
		
		sortedFlights.addAll(unSortedFlights.entrySet());
		
		return sortedFlights;
	} // ~ END OF getFlightsSortedByOccupancy
	
	/**
	 * This method find all this year summer workers and 
	 * sort them by their seniority in a descending order.
	 * This year summer workers are workers that have more than 0 number of this year summer assignments.
	 * @see Employee#getNumberOfThisYearSummerAssignments()
	 * @return list of employees
	 */
        @Override
	public List<Employee> getAllThisSummerWorkEmployeesSortedBySeniority(){
		ArrayList<Employee> allEmployees = new ArrayList<Employee>();

		for(Employee emp : sData.getEmployees().values()){
			if(emp.getNumberOfThisYearSummerAssignments() > 0)
				allEmployees.add(emp);
		}
		
		// sort the array - allEmployees using an anonymous comparator
		Collections.sort(allEmployees, new Comparator<Employee>(){
			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp2.getEmployeeSeniority() - emp1.getEmployeeSeniority();
			}
			
		});
		
		return allEmployees;
	} // ~ END OF getAllEmployeesSortedBySeniority
	
	/**
	 * This method return for each branch a list of agents working in it.
	 * The agents list is sorted by agent rating, if two agents have
	 * the same rating, than sort them by their number of assignment 
	 * each of them need to do on this summer.
	 * <b>Hint:<b> build for each branch in the hashMap a new sorting array list.
	 * 			   Use a comparator that answer the sorting mission and sort the array list
	 * 				before you put it in the hashMap.
	 * @return map of agents as a value of branch keys 
	 */
        @Override
	public Map<Branch, ArrayList<Agent>> getBranchesAgentsSortedByRating(){
		Map<Branch, ArrayList<Agent>> allBranchesAndAgents = new HashMap<Branch, ArrayList<Agent>>();
		
		for(Branch branch : sData.getBranches().values()){
			ArrayList<Agent> agentsList = new ArrayList<Agent>(branch.getAgents());
			Collections.sort(agentsList, new AgentsComparator());
			allBranchesAndAgents.put(branch, agentsList);
		}
		
		return allBranchesAndAgents;
	} // ~ END OF getBranchesAgentsSortedByRating
	
	
	//===================================
	// $$$       Bonus Methods       $$$
	//===================================
	
	/**
	 * This method find the best flight back.
	 * The given flight number belong to the source flight and
	 * now, by using this flight details and vacation time, 
	 * you need to find flight back from the given flight destination
	 * to the given flight source.
	 * The returning flight have to return between: 
	 * (given flight destination date) + (vacationDays) - 1 TO
	 * (given flight destination date) + (vacationDays) + 1.
	 * <b>Best flight means:<b> the flight back with minimum steps (stops) includes.
	 * If this method (findTheBestFlightBack) didn't find a direct flight, than you need to search for 
	 * a connection flight (contains exactly 2 flights no more no less) with a helper method:
	 * @see #getPairFlightsBack(Flight, Date, Date)
	 * @param flightNumberSource
	 * @param vacationDays
	 * @return list of flights - because if we call the helper method, we need to return list of two flights
	 */
        @Override
	public List<Flight> findTheBestFlightBack(int flightNumberSource, int vacationDays){
		List<Flight> backFlights = new ArrayList<Flight>();
		Flight sourceFlight = sData.getFlights().get(flightNumberSource);
		
		if(sourceFlight == null)
			return null;
		
		int minStepIn = Integer.MAX_VALUE;
		Flight minFlight = null;
		
		Calendar firstEdgeInterval = Calendar.getInstance();
		Calendar secondEdgeInterval = Calendar.getInstance();

		firstEdgeInterval.setTime(sourceFlight.getFlightDateAndTimeDestination());
		secondEdgeInterval.setTime(sourceFlight.getFlightDateAndTimeDestination());
		
		firstEdgeInterval.add(Calendar.DATE, vacationDays-1);
		secondEdgeInterval.add(Calendar.DATE, vacationDays+1);

		for(Flight flight : sData.getFlights().values()){
			if(flight.getSource().equals(sourceFlight.getDestination()) && 
					flight.getDestination().equals(sourceFlight.getSource())){
				if(!flight.getFlightDateAndTimeSource().before(firstEdgeInterval.getTime()) && 
						!flight.getFlightDateAndTimeSource().after(secondEdgeInterval.getTime())){
					if(flight.getStops().size() < minStepIn){
						minStepIn = flight.getStops().size();
						minFlight = flight;
					}
				}
			}
		}
		
		if(minFlight != null){
			backFlights.add(minFlight);
			return backFlights;
		}
		
		return getPairFlightsBack(sourceFlight, firstEdgeInterval.getTime(), secondEdgeInterval.getTime());
		
	} // ~ END OF findTheBestFlightBack
	
	/**
	 * This is a helper method for the method - findTheBestFlightBack.
	 * This method gets the income flight and two dates that represents range to find flights back.
	 * the method will take apart when there is no direct flight back.
	 * You need to find exactly two flights, that their connection is at the same day (e.g: flight1 lands in 1.1.2015 and flight2 soars in 1.1.2015).
	 * The chosen pair of flights back has to be the pair with the minimum number of stops (sum of the first and the second flight's stops).
	 * @param incomeFlight
	 * @param minRange - the minimum edge for soars
	 * @param maxRange - the maximum edge for soars
	 * @return List of two flights {firstFlight, secondFlight}
	 */
	@SuppressWarnings("deprecation")
        @Override
	public List<Flight> getPairFlightsBack(Flight incomeFlight, Date minRange, Date maxRange){	
		
		List<Flight> flights= new ArrayList<Flight>();
		int stopsNum=Integer.MAX_VALUE;
		if(incomeFlight!=null)
		{
			for(Flight f : sData.getFlights().values())
			{

				if(incomeFlight.getDestination().equals(f.getSource()) && 
						minRange.before(f.getFlightDateAndTimeSource()) && 
						maxRange.after(f.getFlightDateAndTimeSource()))
				{
					
					for(Flight f2 : sData.getFlights().values())
					{
						
						if(f2.getSource().equals(f.getDestination()) && f2.getDestination().equals(incomeFlight.getSource()))
						{
							
							if(f2.getFlightDateAndTimeSource().getYear() == f.getFlightDateAndTimeDestination().getYear() && 
									f2.getFlightDateAndTimeSource().getMonth() == f.getFlightDateAndTimeDestination().getMonth() && 
									f2.getFlightDateAndTimeSource().getDay() == f.getFlightDateAndTimeDestination().getDay())
							{
								
								if(f.getStops().size() + f2.getStops().size() < stopsNum)
								{
									
									flights.clear();
									flights.add(f);
									flights.add(f2);
									stopsNum = f.getStops().size() + f2.getStops().size();
								}
							}
						}
					}
				}
			}
		}		
		return flights;
	}// ~ END OF getPairFlightsBack
        
            /**
     * The method handle the exit from system.
     * @param logOut
     */
    public void executeSysExit(boolean logOut) throws IOException {
        sData.executeOutput(logOut);
    }
}
