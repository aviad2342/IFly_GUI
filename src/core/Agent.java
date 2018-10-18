package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import utils.Constants;
import utils.Rating;

/**
 * Class Agent ~ represent the employee that responsible 
 * for order handling and produce flight tickets
 * @author Aviad Ben Hayun
 */
@SuppressWarnings("serial")
public class Agent extends Employee implements Rating, java.io.Serializable {
	
	//-------------------------------Class Members------------------------------
	/**
	 * All agent's orders
	 */
	private ArrayList<Order> orders;
	
	/**
	 * The branch where this agent work in
	 */
	private Branch workBranch;

	//-------------------------------Constructors------------------------------
	/**
	 * @param employeeNumber
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param startWorkingDate
	 * @param password
	 * @param address
	 */
	public Agent(int employeeNumber, String firstName, String lastName,
			Date birthDate, Date startWorkingDate, String password, Address address) {
		super(employeeNumber, firstName, lastName, birthDate, startWorkingDate,
				password, address);
		this.orders = new ArrayList<Order>();
	}

	/**
	 * @param employeeNumber
	 */
	public Agent(int employeeNumber) {
		super(employeeNumber);
	}
	
	//-------------------------------Getters And Setters------------------------------
	/**
	 * @return the orders
	 */
	public List<Order> getOrders() {
		return Collections.unmodifiableList(orders);
	}
	
	/**
	 * @return the workBranch
	 */
	public Branch getWorkBranch() {
		return workBranch;
	}

	/**
	 * This method set a new branch to this agent.
	 * If necessary - remove this agent from his last branch
	 * @param workBranch the workBranch to set
	 */
	public void setWorkBranch(Branch workBranch) {
		if(this.workBranch != null)
			this.workBranch.removeAgent(this);
		this.workBranch = workBranch;
	}

	//-------------------------------More Methods------------------------------
		//TODO - Add more methods 
	/**
	 * The role of this method is to add a new
	 * order to the orders set
	 * @param order
	 * @return true if this order had successfully added or false otherwise
	 */
	public boolean addOrder(Order order){
		//TODO - complete this method
		if(order != null && orders != null)
			if(!orders.contains(order))
				return orders.add(order);
		return false;
	}// ~ END OF Method addOrder
	
	/**
	 * The role of this method is to remove a 
	 * order from the orders set
	 * @param order
	 * @return true if this order removed successfuly or false otherwise
	 */
	public boolean removeOrder(Order order){
		//TODO - complete this method
		if(order != null && orders != null)
			if(orders.contains(order))
				return orders.remove(order);
		return false;
	}// ~ END OF Method removeOrder
	
	/**
	 * This method find all orders that handle by this Agent
	 * and have at list one flight that soars in this summer months
	 * <b> hint:<\b> use the method - getFlightDateAndTimeSource  and compare
	 * the month to this summer months and the year to the same year of this summer months.
	 * This method is a tool for the implemented method - calcRating.
	 * @return set of orders for flights soars in the last month
	 */
	@SuppressWarnings("deprecation")
	private Set<Order> getAllOrdersMadeInSummertMonths(){
		//TODO - complete this method
		//Set for the last month orders
		HashSet<Order> summerOrders = new HashSet<Order>();
		//today date object
		Date today = new Date();
		
		//start running over the orders set and find relevant flight orders
		for(Order order : orders)
			for(FlightOrder flightOrder : order.getFlightOrders()){
				int flightYear = flightOrder.getFlight().getFlightDateAndTimeSource().getYear();
				int flightMonth = flightOrder.getFlight().getFlightDateAndTimeSource().getMonth() == 0 ? 12 : flightOrder.getFlight().getFlightDateAndTimeSource().getMonth() + 1;
				if(flightYear == today.getYear() + 1900 && 
						(Constants.SUMMER_MONTHES[0] == flightMonth || Constants.SUMMER_MONTHES[1] == flightMonth ||
						Constants.SUMMER_MONTHES[2] == flightMonth)){
					summerOrders.add(order);
					break;
				}
			}
		
		return summerOrders;
	}// ~ END OF Method getAllOrdersMadeInTheLastMonth
	
	/**
	 * @return this entity key 
	 */
	@Override
	public int getPrimaryKey() {
		return getEmployeeNumber();
	}// ~ END OF Method getPrimaryKey

	/**
	 * This method calculate this Agent rating by 
	 * the average cost of all orders 
	 * (that have at least one flight order soars in the summer months) 
	 * he handled * number of different customers made those orders
	 */
	@Override
	public double calcRating() {
		//TODO - complete this method
		double rating = 0;
		//create a set of orders and a set of customers
		Set<Order> lastMonthOrders = getAllOrdersMadeInSummertMonths();
		Set<Customer> differentCustomers = new HashSet<Customer>();
		
		double totalOrdersCost = 0;
		double avgOrderCost = 0;
		
		//calculate the total cost and find all different customers
		for(Order order : lastMonthOrders){
			totalOrdersCost += order.getOrderCost();
			differentCustomers.add(order.getResponsibleCustomer());
		}
		
		//preventing divide by zero
		if(lastMonthOrders.size() > 0){
			avgOrderCost = totalOrdersCost/(double)lastMonthOrders.size();
			rating = avgOrderCost * differentCustomers.size();
		}
		
		return rating;
		
	}// ~ END OF Method calcRating
	
	/**
	 * This method calculate the number of assignments (flight order to handle)
	 * this agent need/needed to handle with this summer months.
	 */
	@SuppressWarnings("deprecation")
	@Override
	public int getNumberOfThisYearSummerAssignments(){
		//TODO - complete this method
		int numberOfAssignments = 0;
		Date today = new Date();
	
		for(Order order : orders){
			for(FlightOrder flightOrder : order.getFlightOrders()){
				if(flightOrder.getFlight().getFlightDateAndTimeSource().getYear() == today.getYear()){
					int mon = flightOrder.getFlight().getFlightDateAndTimeSource().getMonth() + 1;
					if(Constants.SUMMER_MONTHES[0] == mon || Constants.SUMMER_MONTHES[1] == mon ||
							Constants.SUMMER_MONTHES[2] == mon){
						numberOfAssignments++;
					}
				}
			}
		}
		
		return numberOfAssignments;
	}//END OF ~ getNumberOfSummerAssignments
	
	//-------------------------------hashCode equals & toString------------------------------
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Agent [" + super.toString() +", orders=" + orders + "]";
	}
        /**
         * This method return a custom String to fit program display 
         * @return String
         */
        public String theString() {
            int i = 1;
            String agentOrders = "";
		for(Order order : orders){
			agentOrders += i+"."+ order.toString() + "\n";
                        i++;
                }
		return "************************************* Agent ********************************************* \n"
                        + "Emploee Number: "+super.getEmployeeNumber()+"\nFirst Name: "+super.getFirstName()+"\nLast Name: "+super.getLastName()+
                        "\nBirth Date: "+super.getBirthDate()+"\nStart Working Date: "+super.getStartWorkingDate()+"\nPassword: "+super.getPassword()+"\nOrders:\n "+agentOrders;
	}
}// ~ END OF Class Agent
