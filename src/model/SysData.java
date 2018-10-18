package model;
//***************************************** Imports *********************************************
import core.Branch;
import core.Customer;
import core.Employee;
import core.Flight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;


/**
 * System Data class
 */
@SuppressWarnings("serial")
public final class SysData implements java.io.Serializable {
    //***************************************** Variables *********************************************

    /**
     * Singleton instance of this class, loaded on the first execution of SysData.getInstance()
     */
    private static SysData instance;
    /**
     * Boolean flag for class instance existence (singleton)
     */
    private static boolean exists = false;
	/**
	 * All IFly employees (agents, flight attendants, pilots)
	 */
	private final HashMap<Integer,Employee> employees;
	/**
	 * All IFly branches
	 */
	private final HashMap<Integer, Branch> branches;
	/**
	 * All IFly customers
	 */
	private final HashMap<String, Customer> customers;
	/**
	 * All IFly flights
	 */
	private final HashMap<Integer, Flight> flights;
        /**
         * Stores all the users
         */
        private final HashMap<String, Users> users;

    //***************************************** Constructors ******************************************
    /**
     * Full C'tor.
     */
    private SysData() {
        employees = new HashMap<Integer,Employee>();
	branches = new HashMap<Integer,Branch>();
	customers = new HashMap<String,Customer>();
	flights = new HashMap<Integer,Flight>();
        users = new HashMap<String, Users>();
        executeInput();
    }
    //***************************************** Getters & Setters *************************************
//-----------------------------------------Getters--------------------------------------
	/**
	 * @return the employees
	 */
	public Map<Integer, Employee> getEmployees() {
		return employees;
	}

	/**
	 * @return the branches
	 */
	public Map<Integer, Branch> getBranches() {
		return branches;
	}

	/**
	 * @return the customers
	 */
	public Map<String, Customer> getCustomers() {
		return customers;
	}

	/**
	 * @return the flights
	 */
	public Map<Integer, Flight> getFlights() {
		return flights;
	}
	
        /**
         * @return the users
         */
        protected HashMap<String, Users> getUsers() {
            return users;
        }

    //***************************************** Methods ***********************************************

    protected static void setInstance(SysData sysData) {
        instance = sysData;
    }

    /**
     * The method creates this class's instance & provides access to it, by returning a reference (singleton).
     *
     * @return reference to this class's only instance, or null if reference was already returned (singleton).
     */
    protected static SysData getInstance() {
        executeInput();
        if (!exists) {
            exists = true;
            instance = new SysData();
            return instance;
        }
        return instance;
    }
    //----------------------------------- Data IO methods ---------------------------------------------

    /**
     * the methods execute the input from file.
     */
    public static void executeInput() {
        try {
            FileInputStream fileIn = new FileInputStream("IFly.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            setInstance(((SysData) in.readObject()));
            exists = true;
            in.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            e.getStackTrace();
        }

    }
    /**
     * the methods execute the output to file.
     * @param logOut
     */
    protected void executeOutput(boolean logOut) {

        try {
            FileOutputStream fileOut = new FileOutputStream("IFly.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(instance);
            out.close();
            fileOut.close();
            if (!logOut) {
                System.exit(0);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
    }
    }
}
