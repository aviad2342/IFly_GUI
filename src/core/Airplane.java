package core;

/**
 * Class Airplane ~ represent a single 
 * airplane use for a trip 
 * @author Aviad Ben Hayun
 */
@SuppressWarnings("serial")
public class Airplane implements java.io.Serializable{

	//-------------------------------Class Members------------------------------
	/**
	 * The airplane number - the key
	 */
	private int airplaneNumber;
	/**
	 * The number of seats in the business department
	 */
	private int numberOfSeatsBusinessClass;
	/**
	 * The number of seats in the first department
	 */
	private int numberOfSeatsFirstClass;
	/**
	 * The number of seats in the tourists department
	 */
	private int numberOfSeatsTouristsClass;
	
	//-------------------------------Constructors-----------------------------
	/**
	 * Full constructor ~ use for initial all fields
	 * 
	 * @param airplaneNumber
	 * @param numberOfSeatsBusinessClass
	 * @param numberOfSeatsFirstClass
	 * @param numberOfSeatsTouristsClass
	 */
	public Airplane(int airplaneNumber, int numberOfSeatsBusinessClass,
			int numberOfSeatsFirstClass, int numberOfSeatsTouristsClass) {
		super();
		this.airplaneNumber = airplaneNumber;
		this.numberOfSeatsBusinessClass = numberOfSeatsBusinessClass;
		this.numberOfSeatsFirstClass = numberOfSeatsFirstClass;
		this.numberOfSeatsTouristsClass = numberOfSeatsTouristsClass;
	}

	/**
	 * Partial Constructor ~ use for initial key fields
	 * 
	 * @param airplaneNumber
	 */
	public Airplane(int airplaneNumber) {
		super();
		this.airplaneNumber = airplaneNumber;
	}

	//-------------------------------Getters And Setters------------------------------
	/**
	 * @return the airplaneNumber
	 */
	public int getAirplaneNumber() {
		return airplaneNumber;
	}

	/**
	 * @param airplaneNumber the airplaneNumber to set
	 */
	public void setAirplaneNumber(int airplaneNumber) {
		this.airplaneNumber = airplaneNumber;
	}

	/**
	 * @return the numberOfSeatsBusinessClass
	 */
	public int getNumberOfSeatsBusinessClass() {
		return numberOfSeatsBusinessClass;
	}

	/**
	 * @param numberOfSeatsBusinessClass the numberOfSeatsBusinessClass to set
	 */
	public void setNumberOfSeatsBusinessClass(int numberOfSeatsBusinessClass) {
		this.numberOfSeatsBusinessClass = numberOfSeatsBusinessClass;
	}

	/**
	 * @return the numberOfSeatsFirstClass
	 */
	public int getNumberOfSeatsFirstClass() {
		return numberOfSeatsFirstClass;
	}

	/**
	 * @param numberOfSeatsFirstClass the numberOfSeatsFirstClass to set
	 */
	public void setNumberOfSeatsFirstClass(int numberOfSeatsFirstClass) {
		this.numberOfSeatsFirstClass = numberOfSeatsFirstClass;
	}

	/**
	 * @return the numberOfSeatsTouristsClass
	 */
	public int getNumberOfSeatsTouristsClass() {
		return numberOfSeatsTouristsClass;
	}

	/**
	 * @param numberOfSeatsTouristsClass the numberOfSeatsTouristsClass to set
	 */
	public void setNumberOfSeatsTouristsClass(int numberOfSeatsTouristsClass) {
		this.numberOfSeatsTouristsClass = numberOfSeatsTouristsClass;
	}
	
	//-------------------------------More Methods------------------------------
	/**
	 * This method return the total number of seats in this airplane
	 * @return the total number of seats in this airplane = (bussiness + first + tourists) classes seats
	 */
	public int getTotalNumberSeats(){
		return getNumberOfSeatsBusinessClass() + getNumberOfSeatsFirstClass() + getNumberOfSeatsTouristsClass();
	}// ~ END OF Method getTotalNumberSeats

	//-------------------------------hashCode equals & toString------------------------------
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Airplane [airplaneNumber=" + airplaneNumber
				+ ", numberOfSeatsBusinessClass=" + numberOfSeatsBusinessClass
				+ ", numberOfSeatsFirstClass=" + numberOfSeatsFirstClass
				+ ", numberOfSeatsTouristsClass=" + numberOfSeatsTouristsClass
				+ "]";
	}
        /**
         * This method return a custom String to fit program display 
         * @return String
         */
        public String theString() {
		return "[Airplane Number: " + airplaneNumber
				+ ", Number Of Seats Business Class: " + numberOfSeatsBusinessClass
				+ ", Number Of Seats First Class: " + numberOfSeatsFirstClass
				+ ", Number Of Seats Tourists Class: " + numberOfSeatsTouristsClass
				+ "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + airplaneNumber;
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
		Airplane other = (Airplane) obj;
		if (airplaneNumber != other.airplaneNumber)
			return false;
		return true;
	}
	
}// ~ END OF Class Airplane
