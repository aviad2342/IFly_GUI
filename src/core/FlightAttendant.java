package core;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import utils.Constants;

/**
 * Class FlightAttendant ~ represent one of our company FlightAttendants
 * @author Aviad Ben Hayun
 */
@SuppressWarnings("serial")
public class FlightAttendant extends Employee implements java.io.Serializable{

	//-------------------------------Class Members------------------------------
	/**
	 * This field tell if this FlightAttendant certified for herald
	 */
	private boolean isHerald;
	/**
	 * This FlightAttendant flights
	 */
	private Set<Flight> flights;

	//-------------------------------Constructors-----------------------------
	/**
	 * Full Constructor ~ use for initial all fields
	 * 
	 * @param employeeNumber
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param startWorkingDate
	 * @param password
	 * @param address
	 * @param isHerald
	 */
	public FlightAttendant(int employeeNumber, String firstName, String lastName,
			Date birthDate, Date startWorkingDate, String password,
			Address address, boolean isHerald) {
		super(employeeNumber, firstName, lastName, birthDate, startWorkingDate,
				password, address);
		this.isHerald = isHerald;
		flights = new HashSet<Flight>();
	}

	/**
	 * Partial Constructor ~ use for initial key fields
	 * 
	 * @param employeeNumber
	 */
	public FlightAttendant(int employeeNumber) {
		super(employeeNumber);
	}

	//-------------------------------Getters And Setters------------------------------
	/**
	 * @return the isHerald
	 */
	public boolean isHerald() {
		return isHerald;
	}

	/**
	 * @param isHerald the isHerald to set
	 */
	public void setHerald(boolean isHerald) {
		this.isHerald = isHerald;
	}
	
	/**
	 * @return the flights
	 */
	public Set<Flight> getFlights() {
		return Collections.unmodifiableSet(flights);
	}
	
	//-------------------------------More Methods------------------------------
	/**
	 * This method add a new flight to this FlightAttendant flights data base.<br>
	 * <h3>hint - he cannot be in more than one flight at the same time
	 * @param flight
	 * @return true if the flight successfully added false otherwise
	 */
	public boolean addFlight(Flight flight){
		
		if(flight == null || flights.contains(flight))
			return false;
		
		for(Flight f : flights)
			if(flight.getFlightDateAndTimeDestination().before(f.getFlightDateAndTimeSource())
			|| flight.getFlightDateAndTimeSource().after(f.getFlightDateAndTimeDestination()))
				continue;
			else
				return false;
		
		return flights.add(flight);
	}//END OF ~ addFlight
	
	/**
	 * This method remove flight from this FlightAttendant flights data base.
	 * @param flight
	 * @return true if the flight successfully removed, false otherwise
	 */
	public boolean removeFlight(Flight flight){
		
		if(flight == null || !flights.contains(flight))
			return false;
		
		return flights.remove(flight);
	}//END OF ~ removeFlight
	
	/**
	 * This method calculate the number of assignments (flights to participate in)
	 * this FlightAttendant need/needed to participate in for this summer months.
	 */
	@SuppressWarnings("deprecation")
	@Override
	public int getNumberOfThisYearSummerAssignments(){
		int numberOfAssignments = 0;
		Date today = new Date();
		
		for(Flight flight : flights){
			if(flight.getFlightDateAndTimeSource().getYear() == today.getYear()){
					if(flight.getFlightDateAndTimeSource().getMonth() + 1 == Constants.SUMMER_MONTHES[0] ||
							flight.getFlightDateAndTimeSource().getMonth() + 1 == Constants.SUMMER_MONTHES[1] ||
							flight.getFlightDateAndTimeSource().getMonth() + 1 == Constants.SUMMER_MONTHES[2]){
						numberOfAssignments++;
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
		return "FlightAttendant [" + super.toString() + ", " + "isHerald=" + isHerald + "]";
	}
	/**
         * This method return a custom String to fit program display 
         * @return String
         */	
        public String theString() {
		return "****************************** FlightAttendant ************************************** \n"
                        + "Emploee Number: "+super.getEmployeeNumber()+"\nFirst Name: "+super.getFirstName()+"\nLast Name: "+super.getLastName()+
                        "\nBirth Date: "+super.getBirthDate()+"\nStart Working Date: "+super.getStartWorkingDate()+"\nPassword: "+super.getPassword()+"\nIs Herald: "+isHerald;
	}

}// ~ END OF Class FlightAttendant
