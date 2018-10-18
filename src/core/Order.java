package core;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import utils.Constants;

/**
 * Class Order ~ represent the order of a single customer for a single flight
 * @author Aviad Ben Hayun
 */
@SuppressWarnings("serial")
public class Order implements java.io.Serializable{

	//-------------------------------Class Members------------------------------
	/**
	 * The order number - the key
	 */
	private int orderNumber;
	/**
	 * The order status - can be true(paid) or by default false(unpaid)
	 */
	private boolean isPaid;
	/**
	 * The customer who made this order
	 */
	private Customer responsibleCustomer;
	/**
	 * All flight orders associated with this order
	 */
	private Set<FlightOrder> flightOrders;
	/**
	 * The employee (Agent) that handle this order
	 */
	private Agent agent;
	
	//-------------------------------Constructors------------------------------
	/**
	 * Full Constructor ~ use for initial all fields
	 * 
	 * @param orderNumber
	 * @param isPaid
	 * @param responsibleCustomer
         * @param agent
	 */
	public Order(int orderNumber, boolean isPaid,
			Customer responsibleCustomer, Agent agent) {
		super();
		this.orderNumber = orderNumber;
		this.isPaid = isPaid;
		this.responsibleCustomer = responsibleCustomer;
		this.agent = agent;
		this.flightOrders = new HashSet<FlightOrder>();
	}

	/**
	 * Partial Constructor ~ use for initial key fields
	 * 
	 * @param orderNumber
	 */
	public Order(int orderNumber) {
		super();
		this.orderNumber = orderNumber;
	}
	
	//-------------------------------Getters And Setters------------------------------
	/**
	 * @return the orderNumber
	 */
	public int getOrderNumber() {
		return orderNumber;
	}
	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	/**
	 * @return the isPaid
	 */
	public boolean isPaid() {
		return isPaid;
	}
	/**
	 * @param isPaid the isPaid to set
	 */
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
	/**
	 * @return the responsibleCustomer
	 */
	public Customer getResponsibleCustomer() {
		return responsibleCustomer;
	}
	/**
	 * @param responsibleCustomer the responsibleCustomer to set
	 */
	public boolean setResponsibleCustomer(Customer responsibleCustomer) {
		if(getResponsibleCustomer() == null){
			this.responsibleCustomer = responsibleCustomer;
			return true;
		}
		return false;
	}
	/**
	 * @return the flight
	 */
	/**
	 * @return the agent
	 */
	public Agent getAgent() {
		return agent;
	}
	/**
	 * @param agent the agent to set
	 */
	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	/**
	 * @return the flightOrders
	 */
	public Set<FlightOrder> getFlightOrders() {
		return Collections.unmodifiableSet(flightOrders);
	}
	
	//-------------------------------More Methods------------------------------
	/**
	 * This method calculate the total cost of this
	 * order by summing the total cost of each flight order
	 * associated with this order and add a tax to it.
	 * @return the total cost
	 */
	public double getOrderCost(){ 
		double totalAmont = 0;
		for(FlightOrder flightOrder : flightOrders)
			totalAmont += flightOrder.getTotalAmount();
		
		return totalAmont + Constants.TAX * totalAmont;
	}// ~ END OF Method getOrderCost
	
	/**
	 * This method add a new flight order to this order
	 * @param flightOrder
	 * @return true if flight order addedd successfuly or false otherwise
	 */
	public boolean addFlightOrder(FlightOrder flightOrder){
		if(flightOrder != null && flightOrders != null)
			if(!flightOrders.contains(flightOrder))
				return flightOrders.add(flightOrder);
		return false;
	}// ~ END OF Method addFlightOrder
	
	/**
	 * This method remove a flight order from this order
	 * @param flightOrder
	 * @return true if flight order removed successfuly or false otherwise
	 */
	public boolean removeFlightOrder(FlightOrder flightOrder){
		if(flightOrder != null && flightOrders != null)
			if(flightOrders.contains(flightOrder))
				return flightOrders.remove(flightOrder);
		return false;
	}// ~ END OF Method removeFlightOrder

	//-------------------------------hashCode equals & toString------------------------------
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlightOrder [orderNumber=" + orderNumber + ", isPaid=" + isPaid
				 + ", responsibleCustomer=" + responsibleCustomer + "]";
	}
        /**
         * This method return a custom String to fit program display 
         * @return String
         */
        public String theString() {
		return "Order Number: " + orderNumber + ", IsPaid: " + isPaid
				 + "\nResponsible Customer:\n" + responsibleCustomer.theString()+"\n";
	}
        /**
         * @return Custom String
         */
        public String customString() {
		return "Order Number: " + orderNumber + ", IsPaid: " + isPaid ;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderNumber;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orderNumber != other.orderNumber)
			return false;
		return true;
	}
}// ~ END OF Class Order
