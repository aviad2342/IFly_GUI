package core;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import utils.Constants;
import utils.E_LicenseType;

/**
 * Class Pilot ~ represent one of our company pilots
 * @author Aviad Ben Hayun
 */
@SuppressWarnings("serial")
public class Pilot extends Employee implements java.io.Serializable{

	//-------------------------------Class Members------------------------------
	/**
	 * The pilot license type
	 */
	private E_LicenseType licenseType;
	/**
	 * This pilots flights
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
	 * @param licenseType
	 */
	public Pilot(int employeeNumber, String firstName, String lastName,
			Date birthDate, Date startWorkingDate, String password,
			Address address, E_LicenseType licenseType) {
		super(employeeNumber, firstName, lastName, birthDate, startWorkingDate,
				password, address);
		this.licenseType = licenseType;
		this.flights = new HashSet<Flight>();
	}
	
	/**
	 * Partial Constructor ~ use for initial key fields
	 * 
	 * @param employeeNumber
	 */
	public Pilot(int employeeNumber) {
		super(employeeNumber);
	}
	
	//-------------------------------Getters And Setters------------------------------
	/**
	 * @return the licenseType
	 */
	public E_LicenseType getLicenseType() {
		return licenseType;
	}

	/**
	 * @param licenseType the licenseType to set
	 */
	public void setLicenseType(E_LicenseType licenseType) {
		this.licenseType = licenseType;
	}

	/**
	 * @return the flights
	 */
	public Set<Flight> getFlights() {
		return Collections.unmodifiableSet(flights);
	}
	
	//-------------------------------More Methods------------------------------
	//TODO - Add more methods 
	/**
	 * This method add a new flight to this pilot flights data base.<br>
	 * <h3>hint - he cannot be in more than one flight at the same time
	 * <h3>hint - he can participate in this flight only if his license type
	 * 			  compatible with flight airplane.
	 * @param flight
	 * @return true if the flight successfully added, false otherwise
	 */
	public boolean addFlight(Flight flight){
		
		if(flight == null || flights.contains(flight))
			return false;
		
		for(Flight f : flights)
			if(! (flight.getFlightDateAndTimeDestination().before(f.getFlightDateAndTimeSource())
			|| flight.getFlightDateAndTimeSource().after(f.getFlightDateAndTimeDestination())) )
				return false;
		
		return flights.add(flight);
	}//END OF ~ addFlight
	
	/**
	 * This method remove flight from this pilot flights data base.
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
	 * this pilot need/needed to do for this summer months.
         * @return numberOfAssignments
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
		return "Pilot [" + super.toString() + ", licenseType= " + licenseType + "]";
	}
	/**
         * This method return a custom String to fit program display 
         * @return String
         */
        public String theString() {
		return "************************************ Pilot *****************************************\n"
                        + "Emploee Number: "+super.getEmployeeNumber()+"\nFirst Name: "+super.getFirstName()+"\nLast Name: "+super.getLastName()+
                        "\nBirth Date: "+super.getBirthDate()+"\nStart Working Date: "+super.getStartWorkingDate()+"\nPassword: "+super.getPassword()+"\nLicense Type: "+licenseType;
	}
}// ~ END OF Class Pilot
