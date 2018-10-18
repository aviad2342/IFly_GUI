package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 * Class Constants ~ all constants necessary for the system
 * @author Aviad Ben Hayun
 */
public final class Constants {
	
    	/**The date format of project*/
	public static final DateFormat DF = new SimpleDateFormat("dd/MM/yyyy");
	/**The date format of project*/
	public static final DateFormat DFY = new SimpleDateFormat("yyyy");
	/**The date time format of project*/
	public static final DateFormat DTF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	/**The time format of project*/
	public static final DateFormat TF = new SimpleDateFormat("HH:mm:ss");

	/**
	 * All summer months month 
	 */
	public final static int[] SUMMER_MONTHES = {7, 8, 9};
	/**Error value to be set if invalid input*/
        public static final int FLAG = 1; 
	/**
	 * Step types
	 */
        /**Error value to be set if invalid input*/
	public static final int ERROR_VALUE = -1;      
	/**Lowest value to be set if invalid calculation made*/
	public static final int LOWEST_VALUE = 0;
	/**The length of citizens id filed (Israel 9 digits)*/
	public static final int INPUT_ERR_ID_LENGTH = 9;
        
	public final static String[] STEP_TYPES= {"Source","Stopover","Destination"}; 
	
//	/**
//	 * The maximum of phone numbers for a single entity
//	 */
//	public static final int MAX_OF_PHONE_NUMBERS = 2;
	
	/**
	 * The tax 
	 */
	public static final double TAX = 0.13;
	
	/**
	 * The maximum number of pilots in a single flight
	 */
	public static final int MAX_NUMBER_OF_PILOTS = 2;
	
	/**
	 * The standard size of a passport number
	 */
	public static final int PASSPORT_NUMBER_SIZE = 8;
        
        public static enum typeOfUser {ADMIN , AGENT , CUSTOMER };
		//***************************************** Constructors ******************************************
	/**
	 * Full C'tor.
	 */
	public Constants() {
		DF.setTimeZone(TimeZone.getTimeZone("Asia/Jerusalem"));   
		DFY.setTimeZone(TimeZone.getTimeZone("Asia/Jerusalem"));
		TF.setTimeZone(TimeZone.getTimeZone("Asia/Jerusalem"));
		DTF.setTimeZone(TimeZone.getTimeZone("Asia/Jerusalem"));
	} 
}// ~ END OF Class Constants
