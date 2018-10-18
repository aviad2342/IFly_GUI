package controller;

import core.Address;
import core.Agent;
import core.Airplane;
import core.Branch;
import core.Customer;
import core.Employee;
import core.Flight;
import core.FlightOrder;
import core.Order;
import exceptions.AlreadyInSystemException;
import exceptions.LoginFailedException;
import exceptions.MissingFieldsException;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeSet;

import model.ModelLogic;
import model.Users;
import utils.Constants;
import utils.E_Airports;
import utils.E_Cities;
import utils.E_LicenseType;
import view.ViewLogic;

/**
 * This IFly object represents the class system
 * @author Aviad Ben Hayun
 */
public final class IFly {
    
    //***************************************** Variables *********************************************


	/**
     * Singleton instance of this class, loaded on the first execution of ControllerLogic.getInstance()
     */
    private static IFly instance;
    /**
     * Boolean flag for class instance existence (singleton)
     */
    private static boolean exists = false;
    /**
     * ViewLogic reference pointer
     */
    private static ViewLogic view; //assuming we've only one.
    /**
     * ModelLogic reference pointer
     */
    private static ModelLogic model; //assuming we've only one.
    
    //***************************************** Constructors ******************************************
    /**
     * Full C'tor, for singleton support.
     */
    private IFly() {
        new Constants();
    }
    //***************************************** Methods ***********************************************

    /**
     * The method creates this class's instance & provides access to it, by returning a reference (singleton).
     * @return reference to this class's only instance, or null if reference was already returned (singleton).
     */
    public static IFly getInstance() {
        try {
            if (!exists) {
                exists = true;
                model = ModelLogic.getInstance();
                instance = new IFly();
                view = ViewLogic.getInstance(instance);
                view.executeLoginView();

                return instance;
            }
        
        } catch (IOException e) {
            System.err.println("Error: cannot initialize ModelLogic, please contact as administrator!"); 
        }
        return instance;
    }					
	
	//-----------------------------------------Getters--------------------------------------
	/**
	 * @return the employees
	 */
	public Map<Integer, Employee> getEmployees() {
		return model.getEmployees();
	}

	/**
	 * @return the branches
	 */
	public Map<Integer, Branch> getBranches() {
		return model.getBranches();
	}

	/**
	 * @return the customers
	 */
	public Map<String, Customer> getCustomers() {
		return model.getCustomers();
	}

	/**
	 * @return the flights
	 */
	public Map<Integer, Flight> getFlights() {
		return model.getFlights();
	}
        
        /**
     * @return the users
     */
        public HashMap<String, Users> getUsers() {
        return model.getUsers();
    }
	
	//-------------------------------Add && Remove Methods------------------------------
	/**
	 * this method add new branch to our company IIF the branch not exists
	 * already and the details are valid. to create new branch you need address
	 * object first
	 * 
	 * @param branchNumber
	 * @param branchName
	 * @param city
         * @param country
	 * @param street
	 * @param houseNumber
	 * @param phoneNumber
	 * @return true if the branch added successfully, false otherwise
	 */
	public boolean addBranch(int branchNumber, String branchName, E_Cities city, String country,
			String street, int houseNumber, String[] phoneNumber) {
		return model.addBranch(branchNumber, branchName, city, country, street, houseNumber, phoneNumber );
	} //~ END OF addBranch
        
        /**
	 * this method remove branch from our company IIF the branch not exists
	 * already.
	 * @param branchNumber
	 * @return true if the branch removed successfully, false otherwise
	 */
	public boolean removeBranch(int branchNumber){
            return model.removeBranch(branchNumber);
        }
        
        /**
	 * edit existsing branch Details
         * @param branchNumber
         * @param branchName
         * @param city
         * @param country
         * @param street
	 * @param houseNumber
	 * @param phoneNumber
	 * @return true if succeeded to edit
	 */
        public boolean editBranchDetails(int branchNumber, String branchName, E_Cities city, String country,
			String street, int houseNumber, String[] phoneNumber){
            return model.editBranchDetails(branchNumber, branchName, city, country, street, houseNumber, phoneNumber);
        }//~ END OF editBranchDetails
	
	/**
	 * Creates and adds new employee
	 * into the appropriate data-structure
	 * @param employee
	 * @return true if this employee added successfully or false otherwise
	 */
	public boolean addEmployee(Employee employee){	
		return model.addEmployee(employee);
	}// ~ END OF addEmployee
	
        /**
	 * remove employee from appropriate data-structure
         * @param employeeNumber
	 * @return true if this employee removed successfully or false otherwise
	 */
	public boolean removeEmployee(int employeeNumber){                  
            return model.removeEmployee(employeeNumber);
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
	public boolean editAgentDetails(int employeeNumber, String firstName, String lastName,
			Date birthDate, Date startWorkingDate, String password, Address address){
            return model.editAgentDetails(employeeNumber, firstName, lastName, birthDate, startWorkingDate, password, address);
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
	public boolean editPilotDetails(int employeeNumber, String firstName, String lastName,
			Date birthDate, Date startWorkingDate, String password, Address address, E_LicenseType licenseType){
            return model.editPilotDetails(employeeNumber, firstName, lastName, birthDate, startWorkingDate, password, address, licenseType);
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
	public boolean editFlightAttendantDetails(int employeeNumber, String firstName, String lastName,
			Date birthDate, Date startWorkingDate, String password, Address address, boolean isHerald){
            return model.editFlightAttendantDetails(employeeNumber, firstName, lastName, birthDate, startWorkingDate, password, address, isHerald);
        }// ~ END OF editFlightAttendantDetails
        
	/**
	 * Creates and adds new customer
	 * into the appropriate data-structure
	 * spatial validity: 
	 * - passport number length need to be as it represented 
	 *   in Constants class, and contains only digits.
	 * @see Constants#PASSPORT_NUMBER_SIZE
	 * @param passportNumber
         * @param balance
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param password
	 * @param email
	 * @param customerAddress
	 * @return true if succeeded to add
	 */
	public boolean addCustomer(String passportNumber,double balance, String firstName, String lastName,
			Date birthDate, String password, URL email, Address customerAddress){
		return model.addCustomer(passportNumber, balance, firstName, lastName, birthDate, password, email, customerAddress);	
	}// ~ END OF addCustomer

         /**
	 * remove customer
	 * from the appropriate data-structure
         * @param passportNumber	 
         * @return true if succeeded to remove	 
	 */
	public boolean removeCustomer(String passportNumber){         
            return model.removeCustomer(passportNumber);
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
        public boolean editCustomerDetails(String passportNumber, double balance, String firstName, String lastName,
			Date birthDate, String password, URL email, Address customerAddress){
            return model.editCustomerDetails(passportNumber, balance, firstName, lastName, birthDate, password, email, customerAddress);
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
	public boolean addFlight(int flightNumber, Date flightDateAndTimeSource, Date flightDateAndTimeDestination, double flightCost,
                E_Airports source, E_Airports destination, Airplane airplane) {
		return model.addFlight(flightNumber, flightDateAndTimeSource, flightDateAndTimeDestination, flightCost, source, destination, airplane);
	}// ~ END OF addFlight
	
        /**
	 * This method remove Flight from our company IIF the Flight exists:
	 * @param flightNumber
	 * @return true if Flight removed successfully, false otherwise 
	 */   
	public boolean removeFlight(int flightNumber){           
            return model.removeFlight(flightNumber);
        }// ~ END OF removeFlightt
        
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
	public boolean editFlightDetails(int flightNumber, Date flightDateAndTimeSource,
			Date flightDateAndTimeDestination, double flightCost, E_Airports source, E_Airports destination, Airplane airplane){
            return model.editFlightDetails(flightNumber, flightDateAndTimeSource, flightDateAndTimeDestination, flightCost, source, destination, airplane);
        }// ~ END OF editFlightDetails
        
	/**
	 * this method adds stop to specific flight IIF the stop is not already in part of the flight path.
	 * Hint! the path is not only the step in's.
	 * stepNumber of the stepIn represent the stop number 
         * @param flightNumber
         * @param stepLocation
	 * @return true if step added successfully, false otherwise
	 */
	public boolean addStepInToFlight(int flightNumber,E_Airports stepLocation){
		return model.addStepInToFlight(flightNumber, stepLocation);
	} //~ END OF addStepInToFlight
	
        /**
	 * this method remove stop from specific flight IIF the stop is already in part of the flight path.
	 * Hint! the path is not only the step in's.
	 * stepNumber of the stepIn represent the stop number 
         * @param flightNumber
         * @param stepLocation
	 * @return true if step added successfully, false otherwise
	 */
	public boolean removeStepInFromeFlight(int flightNumber,E_Airports stepLocation){
            return model.removeStepInFromeFlight(flightNumber, stepLocation);
        }//~ END OF removeStepInFromeFlight
        
	/**
	 * This method first add a given flight to a given employee (pilot or FlightAttendant)
	 * and do the opposite (use instanceof operation).
	 * If the employee unsuccessfully added to the flight ==> Roll back is needed
	 * @param employee
	 * @param flight
	 * @return true if the connection added successfully, false otherwise
	 */
	public boolean addPilotOrFlightAttendantToFlight(Employee employee, Flight flight){
		return model.addPilotOrFlightAttendantToFlight(employee, flight);
	}// ~ END OF addPilotOrFlightAttendantToFlight

	/**
	 * this method connect existing agent to existing branch IIF the branch and
	 * the agent exists
	 * @param agentNumber
	 * @param branchNumber
	 * @return true if succeeded, false otherwise
	 */
	public boolean connectAgentToBranch(int agentNumber, int branchNumber){	
		return model.connectAgentToBranch(agentNumber, branchNumber);
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
	public boolean addFlightToOrder(int agentNumber, String customerPassport, int orderNumber, int flightNumber){
		return model.addFlightToOrder(agentNumber, customerPassport, orderNumber, flightNumber);
		
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
	public boolean addFlightTicketToFlightOrder(int flightNumber, int orderNumber, String passportNumber, 
			int seat, int row, String classType){
		return model.addFlightTicketToFlightOrder(flightNumber, orderNumber, passportNumber, seat, row, classType);
		
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
	public boolean changeCustomerAddress(String customerId, String country, E_Cities city,String street
			,int houseNumber,String[] phonenumbers){
		return model.changeCustomerAddress(customerId, country, city, street, houseNumber, phonenumbers);
	} // ~ END OF changeCustomerAddress
	
	
	/**
	 * this method cancel order from the system by order number (Primary Key).
	 * completely canceled order IIF all related objects will delete from order.
	 * <b>Hint!</b> disconnect the order from the flight (flightOrder), use helper method!
	 * 	 * ~ use disconnectFlightOrder
	 * @param orderNumber
	 * @return true if order completely canceled, false otherwise
	 */
	public boolean cancelOrder(int orderNumber){
		return model.cancelOrder(orderNumber);
	}// ~ END OF cancelOrder
	
	/**
	 * this method disconnect the flight and the order from flight order from both sided.
	 * @param flightOrder
	 */
	@SuppressWarnings("unused")
	private void disconnectFlightOrder(FlightOrder flightOrder){
               model.disconnectFlightOrder(flightOrder);
	}// ~ END OF disconnectFlightOrder
	
	/**
	 * this Method associate Customer to Pay for order IIF the customer have enough money to pay
	 * and the order didn't paid already
	 * @param orderNumber
	 * @param customerNumber
	 * @return true if succeeded, false otherwise
	 */
	public boolean associateCustomerPayingOrder(int orderNumber, String customerNumber){
		return model.associateCustomerPayingOrder(orderNumber, customerNumber);
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
	public List<Flight> getTheTopXPopularFlights(int x) {
		return model.getTheTopXPopularFlights(x);
	}// ~END OF getTheTopXPopularFlights
	
	
	/**
	 * The most Profitable order is the order with the higher profit of money in all orders.
	 * user helper methods!
	 * @return order or null
	 */
	public Order getTheMostProfitableOrder(){
		return model.getTheMostProfitableOrder();
	}// ~ END OF getTheMostProfitableOrder
	
	/** 
	 * super agent is an agent thats sells more then 10 
	 * flight tickets and those tickets belong to a paid order.
	 * @return an agent
	 */
	public List<Employee> getAllSuperAgents(){		
		return model.getAllSuperAgents();
	}// ~ END OF getAllSuperAgents
	
	
	/**
	 *  Using any data-structure is not allowed . only what we already have.
	 *  The method returns the orders of the profitable customer, the customer
	 *  with the highest paid orders number.
	 *  Hint: create and use a method that counts paid orders for a given customer 
	 * @return profitable customer
	 */
	public List<Order> getAllOrdersOfMostProfitableCustomer(){
		return model.getAllOrdersOfMostProfitableCustomer();
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
	public Employee employeeOfTheMonth(Date month){
			return model.employeeOfTheMonth(month);
	}// ~ END OF employeeOfTheMonth
	
	/**
	 * this method return all the summer flights in this year sorted by number of stops
	 * @see Constants#SUMMER_MONTHES
	 * @return TreeSet<Flight>
	 */
	public TreeSet<Flight> getAllSummerFlightsSortedByNumberOfStops(){
		return model.getAllSummerFlightsSortedByNumberOfStops();
	} // ~ END OF getAllSummerFlightsSortedByNumberOfStops
	
	/**
	 * This method return all this summer flights that soars from or lands
	 * in a given airport sorted by flight cost in an ascending order.
	 * @param location
	 * @return flights 
	 */
	public ArrayList<Flight> getAllThisSummerFlightsByLocation(E_Airports location){
		return model.getAllThisSummerFlightsByLocation(location);
	} // ~ END OF getAllThisSummerFlightsByLocation
	
	/**
	 * potential customers for Agents is a customer who lives in the same city where Agent lives
	 * but the customer never ordered from the agent.
	 * this method Retrieve <Agent,List<Customer>> of agent with list of potential customers for each Agent IIF 
	 * the Agent have any, otherwise the Agent will exclude from the map
	 * @return <Agent,List<Customer>>
	 */
	public Map<Agent,List<Customer>> getPotentialCustomersForAgents(){		
		return model.getPotentialCustomersForAgents();
	} // ~ END OF getPotentialCustomersForAgents
	
	/**
	 * Retrieve Refugees - Potential customer for branch is a customer how lives in a city where IFly
	 * owns a branch but the customer never bought from it.
	 * This method return a Map with a list of potential customers for each branch.
	 * <b>Warning:<b> branch that as no such customers will not show up
	 * 					in your Map. 
	 * @return map with potential customers for each branch
	 */
	public Map<Branch, List<Customer>> getPotentialCustomersForBranch(){
		return model.getPotentialCustomersForBranch();
	} // ~ END OF getPotentialCustomersForBranch
	
	/**
	 * This method return all flights sorted by occupancy in an ascending order.
	 * Occupancy of flight: (number of occupied seats)/(airplane size)
	 * <b>Hint:<b> first get all flight into a map where value is the occupancy
	 * then try sorting the "Map.Entry" by using a proper data structure.
	 * @return priority queue of sorted flights and their occupancy
	 */
	public PriorityQueue<Entry<Flight, Double>> getFlightsSortedByOccupancy(){
		return model.getFlightsSortedByOccupancy();
	} // ~ END OF getFlightsSortedByOccupancy
	
	/**
	 * This method find all this year summer workers and 
	 * sort them by their seniority in a descending order.
	 * This year summer workers are workers that have more than 0 number of this year summer assignments.
	 * @see Employee#getNumberOfThisYearSummerAssignments()
	 * @return list of employees
	 */
	public List<Employee> getAllThisSummerWorkEmployeesSortedBySeniority(){				
		return model.getAllThisSummerWorkEmployeesSortedBySeniority();
	} // ~ END OF getAllEmployeesSortedBySeniority
	
	/**
	 * This method return for each branch a list of agents working in it.
	 * The agents list is sorted by agent rating, if two agents have
	 * the same rating, than sort them by their number of assignment 
	 * each of them need to do on this summer.
	 * <b>Hint:<b> build for each branch in the hashMap a new sorting array list.
	 * Use a comparator that answer the sorting mission and sort the array list
	 * before you put it in the hashMap.
	 * @return map of agents as a value of branch keys 
	 */
	public Map<Branch, ArrayList<Agent>> getBranchesAgentsSortedByRating(){
		return model.getBranchesAgentsSortedByRating();
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
	 * @see IFly#getPairFlightsBack
	 * @param flightNumberSource
	 * @param vacationDays
	 * @return list of flights - because if we call the helper method, we need to return list of two flights
	 */
	public List<Flight> findTheBestFlightBack(int flightNumberSource, int vacationDays){
		return model.findTheBestFlightBack(flightNumberSource, vacationDays);
		
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
	@SuppressWarnings("unused")
	private List<Flight> getPairFlightsBack(Flight incomeFlight, Date minRange, Date maxRange){			
		return model.getPairFlightsBack(incomeFlight, minRange, maxRange);
	}// ~ END OF getPairFlightsBack

    //----------------------------------- Other methods ----------------------------------------------
    /**
     * The method checks the input from the user and returns the name.
     * @param pass
     * @param theType
     * @param name
     * @return ModelLogic#AddMyUser
     * @throws exceptions.AlreadyInSystemException
     */
    public String myUser(String name, String pass, Constants.typeOfUser theType) throws  AlreadyInSystemException {
        return (model.AddMyUser(name, pass, theType));
    }

    /**
     * The method return the type of the user.
     * @param pass
     * @param name
     * @return ModelLogic#login
     * @throws exceptions.MissingFieldsException
     * @throws exceptions.LoginFailedException
     */
    public Constants.typeOfUser login(String name, String pass) throws MissingFieldsException, LoginFailedException {
        return (model.login(name, pass));
    }

    //********************************** Layer's closure procedure methods ****************************
    /**
     * The method handle the exit from system.
     * @param logOut
     * @throws java.io.IOException
     */
    public void executeSysExit(boolean logOut) throws IOException {
        model.executeSysExit(logOut);
    }

    public void addUser(String name, String pass) {
        model.addUser(name,pass);
    }
}// ~ END OF Class IFly


