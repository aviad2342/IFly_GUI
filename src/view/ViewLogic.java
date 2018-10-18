/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import com.toedter.calendar.JDateChooser;
import controller.IFly;
import core.Address;
import core.Agent;
import core.Airplane;
import core.Branch;
import core.Customer;
import core.Employee;
import core.Flight;
import core.FlightAttendant;
import core.Order;
import core.Pilot;
import exceptions.DigitException;
import exceptions.IntegersTestException;
import exceptions.LettersTestException;
import exceptions.LoginFailedException;
import exceptions.MissingDataException;
import exceptions.MissingFieldsException;
import exceptions.NotInTheSystemYestException;
import exceptions.SpaceStartException;
import exceptions.SpacesException;

import java.awt.Toolkit;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.Users;
import utils.Constants;
import utils.Constants.typeOfUser;
import utils.E_Airports;
import utils.E_Cities;
import utils.E_LicenseType;
import utils.E_Months;
import utils.InputTestsStaticClass;

/**
 *
 * @author Aviad
 */
public final class ViewLogic {
    //*************************************************** Variables *****************************************************// 
    /**
     * Singleton instance of this class, loaded on the first execution of ViewLogic.getInstance()
     */
    private static ViewLogic instance;
    /**
     * the type of the user
     */
    @SuppressWarnings("unused")
	private typeOfUser type;
    /**
     * the user log-in name
     */
    private static String logInName;
    /**
     * the loginFrame
     */
    private static LoginFrame loginFrame;
    /**
     * the desktop frame
     */
    private static DesktopFrame desktopFrame;
    /**
     * Boolean flag for class instance existence (singleton)
     */
    private static boolean exist = false;
    /**
     * ControllerLogic reference pointer
     */
    private static IFly iFlyController;

//*************************************************** Constructors *************************************************
    /**
     * empty constructor.
     */
    public ViewLogic() {
    }
//*************************************************** Methods *************************************************

    /**
     * The method creates this class's instance & provides access to it, by returning a reference (singleton).
     * @param ins
     * @return reference to this class's only instance, or null if reference was already returned (singleton).
     */
    public static ViewLogic getInstance(IFly ins) {
        if (!exist) {
            iFlyController = ins;
        }
        if (iFlyController != null) {     // if controller is null create new viewLogic object
            exist = true;
            instance = new ViewLogic();
            return instance;
        }
        return null;
    }

        /**
         * get the typeOfUser
         * @param name
         * @param pass
         * @return typeOfUser
         * @throws MissingFieldsException
         * @throws LoginFailedException
         */
        public typeOfUser login(String name, String pass) throws MissingFieldsException, LoginFailedException {
            return (iFlyController.login(name, pass));
        }

        
        /**
         * this method add new branch to our company IIF the branch not exists
	 * already and the details are valid. to create new branch you need address
	 * object first
         * @param txtNumber
         * @param txtName
         * @param cbCity
         * @param txtCountry
         * @param txtStreet
         * @param txtHouseNumber
         * @param txtPhoneNum1
         * @param txtPhoneNum2
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void addBranch(JTextField txtNumber, JTextField txtName, JComboBox cbCity, JTextField txtCountry, JTextField txtStreet, JTextField txtHouseNumber, JTextField txtPhoneNum1, JTextField txtPhoneNum2, JInternalFrame frame) {
       
            try{
            //check if any of textFields are empty.    
            InputTestsStaticClass.checkEmptyTextFields(txtNumber.getText(), txtName.getText(), txtCountry.getText(), txtStreet.getText(), txtHouseNumber.getText(), txtPhoneNum1.getText());
            //check if the text starts with space.
            InputTestsStaticClass.spaceInStartTest(txtNumber.getText(), "Branch Number");
            InputTestsStaticClass.spaceInStartTest(txtName.getText(), "Branch Name");
            InputTestsStaticClass.spaceInStartTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spaceInStartTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spaceInStartTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNum1.getText(), "Phone Number 1");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains spaces.
            InputTestsStaticClass.spacesTest(txtNumber.getText(), "Branch Number");
            InputTestsStaticClass.spacesTest(txtName.getText(), "Branch Name");
            InputTestsStaticClass.spacesTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spacesTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spacesTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spacesTest(txtPhoneNum1.getText(), "Phone Number 1");
            InputTestsStaticClass.spacesTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains letters.
            InputTestsStaticClass.lettersTest(txtNumber.getText(), "Branch Number");
            InputTestsStaticClass.lettersTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.lettersTest(txtPhoneNum1.getText(), "Phone Number 1");
            InputTestsStaticClass.lettersTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains numbers.
            InputTestsStaticClass.integerTest(txtName.getText(), "Branch Name");
            InputTestsStaticClass.integerTest(txtCountry.getText(), "Country");
           
            
            
            E_Cities city = (E_Cities)cbCity.getSelectedItem();
            int branchNumber = Integer.parseInt(txtNumber.getText());
            int houseNumber = Integer.parseInt(txtHouseNumber.getText());
            
            String[] phoneNumber = new String[2];
            phoneNumber[0] = txtPhoneNum1.getText();   
            phoneNumber[1] = txtPhoneNum2.getText();       
            if(iFlyController.addBranch(branchNumber, txtName.getText(), city , txtCountry.getText(), txtStreet.getText(), houseNumber, phoneNumber)){
                sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully added Branch "+txtNumber.getText()+" to IFly", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to add new branch "+txtNumber.getText()+" to IFly \nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    clearFields(txtNumber, txtName, txtCountry, txtStreet, txtHouseNumber, txtPhoneNum1, txtPhoneNum2);
                    cbCity.setSelectedIndex(0);                   
                } else {
                    frame.dispose();
                }
            }
            } catch (MissingDataException | SpaceStartException | SpacesException | LettersTestException | IntegersTestException ex) {
            ex.getStackTrace();
          } catch (NullPointerException e){
                sound("/sounds/errorSound.wav");
                JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
            } 
        }
        
        /**
         * this method remove branch from our company IIF the branch exists
         * @param cbRemoveBranch
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void removeBranch( JComboBox cbRemoveBranch, JInternalFrame frame) {
          
          try{
            // checks if ComboBox values exists in the system  
            InputTestsStaticClass.notInSystem(cbRemoveBranch, "branches");  
            int branchNumber = (Integer)cbRemoveBranch.getSelectedItem();
            if(iFlyController.removeBranch(branchNumber)){
                 sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully removed branch "+branchNumber+" from IFly", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }
            }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            frame.dispose();
           } catch (NullPointerException e ) {
               sound("/sounds/errorSound.wav");
               JOptionPane.showMessageDialog(null, "You must choose value!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
           }
        }//~ END OF addBranch
        
       /**
        * edit existsing branch Details
        * @param cbNumber
        * @param txtName
        * @param cbCity
        * @param txtCountry
        * @param txtStreet
        * @param txtHouseNumber
        * @param txtPhoneNum1
        * @param txtPhoneNum2
        * @param frame 
        */
        @SuppressWarnings("rawtypes")
		public void editBranchDetails(JComboBox cbNumber, JTextField txtName, JComboBox cbCity, JTextField txtCountry, JTextField txtStreet, JTextField txtHouseNumber, JTextField txtPhoneNum1, JTextField txtPhoneNum2, JInternalFrame frame) {
       
            try{
            // checks if ComboBox values exists in the system 
            InputTestsStaticClass.notInSystem(cbNumber, "branches");
            //check if any of textFields are empty.    
            InputTestsStaticClass.checkEmptyTextFields( txtName.getText(), txtCountry.getText(), txtStreet.getText(), txtHouseNumber.getText(), txtPhoneNum1.getText());
            //check if the text starts with space.
            InputTestsStaticClass.spaceInStartTest(txtName.getText(), "Branch Name");
            InputTestsStaticClass.spaceInStartTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spaceInStartTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spaceInStartTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNum1.getText(), "Phone Number 1");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains spaces.
            InputTestsStaticClass.spacesTest(txtName.getText(), "Branch Name");
            InputTestsStaticClass.spacesTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spacesTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spacesTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spacesTest(txtPhoneNum1.getText(), "Phone Number 1");
            InputTestsStaticClass.spacesTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains letters.
            InputTestsStaticClass.lettersTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.lettersTest(txtPhoneNum1.getText(), "Phone Number 1");
            InputTestsStaticClass.lettersTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains numbers.
            InputTestsStaticClass.integerTest(txtName.getText(), "Branch Name");
            InputTestsStaticClass.integerTest(txtCountry.getText(), "Country");
           
            
            
            E_Cities city = (E_Cities)cbCity.getSelectedItem();
            int branchNumber = (Integer)cbNumber.getSelectedItem();
            int houseNumber = Integer.parseInt(txtHouseNumber.getText());

            String[] phoneNumber = new String[2];
            phoneNumber[0] = txtPhoneNum1.getText();   
            phoneNumber[1] = txtPhoneNum2.getText();       
            if(iFlyController.editBranchDetails(branchNumber, txtName.getText(), city ,txtCountry.getText(),txtStreet.getText(),houseNumber,phoneNumber)){
                sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully edit Branch "+branchNumber, "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to edit branch "+branchNumber+" \nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    clearFields(txtName, txtCountry, txtStreet, txtHouseNumber, txtPhoneNum1, txtPhoneNum2);
                    cbCity.setSelectedIndex(0);  
                    cbNumber.setSelectedIndex(0);
                } else {
                    frame.dispose();
                }
            }
            } catch (MissingDataException | SpaceStartException | SpacesException | LettersTestException | IntegersTestException | NotInTheSystemYestException ex) {
            ex.getStackTrace();
          } catch (NullPointerException e){
                sound("/sounds/errorSound.wav");
                JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
            } 
        }//~ END OF editBranchDetails
        
        /**
         * this method adds stop to specific flight IIF the stop is not already in part of the flight path.
         * @param cbFlightNumber
         * @param cbAirport
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void addStepInToFlight(JComboBox cbFlightNumber, JComboBox cbAirport,  JInternalFrame frame){  
          try{   
            // checks if ComboBox values exists in the system   
            InputTestsStaticClass.notInSystem(cbFlightNumber, "flights");
            E_Airports airport = (E_Airports)cbAirport.getSelectedItem();
            int flightNumber = (Integer)cbFlightNumber.getSelectedItem();
            
            if(iFlyController.addStepInToFlight(flightNumber, airport)){
                 sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully added a new stepping airport "+airport+" to flight "+flightNumber, "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            } else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to add new stepping airport "+airport+" to flight "+flightNumber+"\nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    cbFlightNumber.setSelectedIndex(0);
                    cbAirport.setSelectedIndex(0);                   
                } else {
                    frame.dispose();
                }
            }
            }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            frame.dispose();
           } catch (NullPointerException e ) {
               sound("/sounds/errorSound.wav");
               JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
           }
        }// ~ END OF addStepInToFlight
        
        /**
         * this method remove stop from specific flight IIF the stop is already in part of the flight path.
         * @param cbFlightNumber
         * @param cbStepIn
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void removeStepInFromeFlight(JComboBox cbFlightNumber, JComboBox cbStepIn, JInternalFrame frame){
            try{
            // checks if ComboBox values exists in the system     
            InputTestsStaticClass.notInSystem(cbFlightNumber, "flights");    
            int flightNumber = (Integer)cbFlightNumber.getSelectedItem();
            E_Airports airport = (E_Airports)cbStepIn.getSelectedItem();
            if(iFlyController.removeStepInFromeFlight(flightNumber, airport)){
                 sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully removed branch "+airport+" from flight "+flightNumber, "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }
            }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            frame.dispose();
           } catch (NullPointerException e ) {
               sound("/sounds/errorSound.wav");
               JOptionPane.showMessageDialog(null, "You must choose value!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
           }
        }//~ END OF removeStepInFromeFlight
        
        /**
         * Creates and adds new customer
	 * into the appropriate data-structure
	 * spatial validity: 
	 * - passport number length need to be as it represented 
	 *   in Constants class, and contains only digits.
         * @param txtPassNumber
         * @param txtBalance
         * @param txtFirstName
         * @param txtLastName
         * @param calDate
         * @param txtPassword
         * @param txtEmail
         * @param txtCountry
         * @param cbCity
         * @param txtStreet
         * @param txtHouseNumber
         * @param txtPhoneNum1
         * @param txtPhoneNumber2
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void addCustomer (JTextField txtPassNumber, JTextField txtBalance, JTextField txtFirstName, JTextField txtLastName, JDateChooser calDate,
                JTextField txtPassword, JTextField txtEmail, JTextField txtCountry, JComboBox cbCity, JTextField txtStreet, JTextField txtHouseNumber, JTextField txtPhoneNum1, JTextField txtPhoneNumber2, JInternalFrame frame ){
            
            try{    
            //check the Passport Number length.    
            InputTestsStaticClass.digitTest(txtPassNumber.getText());
            //check if any of textFields are empty.
            InputTestsStaticClass.checkEmptyTextFields(txtPassNumber.getText(), txtBalance.getText(), txtFirstName.getText(), txtLastName.getText(), txtPassword.getText(), txtEmail.getText(), txtCountry.getText(), txtStreet.getText(), txtHouseNumber.getText(), txtPhoneNum1.getText());
            //check if the text starts with space.
            InputTestsStaticClass.spaceInStartTest(txtPassNumber.getText(), "Passport Number");
            InputTestsStaticClass.spaceInStartTest(txtBalance.getText(), "Balance");
            InputTestsStaticClass.spaceInStartTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.spaceInStartTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.spaceInStartTest(txtPassword.getText(), "Password");
            InputTestsStaticClass.spaceInStartTest(txtEmail.getText(), "E-mail Address");
            InputTestsStaticClass.spaceInStartTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spaceInStartTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spaceInStartTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNum1.getText(), "Phone Number 1");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNumber2.getText(), "Phone Number 2");           
            //check if the text contains spaces.
            InputTestsStaticClass.spacesTest(txtPassNumber.getText(), "Passport Number");
            InputTestsStaticClass.spacesTest(txtBalance.getText(), "Balance");
            InputTestsStaticClass.spacesTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.spacesTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.spacesTest(txtPassword.getText(), "Password");
            InputTestsStaticClass.spacesTest(txtEmail.getText(), "E-mail Address");
            InputTestsStaticClass.spacesTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spacesTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spacesTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spacesTest(txtPhoneNum1.getText(), "Phone Number 1");
            InputTestsStaticClass.spacesTest(txtPhoneNumber2.getText(), "Phone Number 2");
            //check if the text contains letters.
            InputTestsStaticClass.lettersTest(txtPassNumber.getText(), "Passport Number");
            InputTestsStaticClass.lettersTest(txtBalance.getText(), "Balance");
            InputTestsStaticClass.lettersTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.lettersTest(txtPhoneNum1.getText(), "Phone Number 1");
            InputTestsStaticClass.lettersTest(txtPhoneNumber2.getText(), "Phone Number 2");
            //check if the text contains numbers.
            InputTestsStaticClass.integerTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.integerTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.integerTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.integerTest(txtStreet.getText(), "Street");
            
            
         
            E_Cities city = (E_Cities)cbCity.getSelectedItem();
            double balance = Double.parseDouble(txtBalance.getText());
            int houseNumber = Integer.parseInt(txtHouseNumber.getText());
            URL email = null;
        try {
            email = new URL(txtEmail.getText());
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, "E-mail id not correct", "Digit Error", JOptionPane.ERROR_MESSAGE);
        }
            String[] phoneNumber = new String[2];
            phoneNumber[0] = txtPhoneNum1.getText();   
            phoneNumber[1] = txtPhoneNumber2.getText();
            Address address = new Address(txtCountry.getText(), city, txtStreet.getText(), houseNumber, phoneNumber);
            
            
            if(iFlyController.addCustomer(txtPassNumber.getText(), balance, txtFirstName.getText(), txtLastName.getText(), calDate.getDate(), txtPassword.getText(), email, address)){
                sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully added Customer with passport "+txtPassNumber.getText()+" to IFly", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to add new Customer "+txtPassNumber.getText()+" to IFly \nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    clearFields(txtPassNumber, txtBalance, txtFirstName, txtLastName, txtPassword, txtEmail, txtCountry, txtStreet, txtHouseNumber, txtPhoneNum1, txtPhoneNumber2 );
                    cbCity.setSelectedIndex(0); 
                    calDate.setDate(new Date());
                } else {
                    frame.dispose();
                }
            }
           } catch (MissingDataException | SpaceStartException | SpacesException | LettersTestException | IntegersTestException | DigitException ex) {
            ex.getStackTrace();
          } catch (NullPointerException e){
                sound("/sounds/errorSound.wav");
                JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
            } 
        }// ~ END OF addCustomer
        
        /**
         * remove customer from the appropriate data-structure
         * @param cbCustomerNumber
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void removeCustomer( JComboBox cbCustomerNumber, JInternalFrame frame) {
          
          try{
            // checks if ComboBox values exists in the system   
            InputTestsStaticClass.notInSystem(cbCustomerNumber, "customers");  
            String customerNumber = (String)cbCustomerNumber.getSelectedItem();
            if(iFlyController.removeCustomer(customerNumber)){
                 sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully removed branch "+customerNumber+" from IFly", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }
            }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            frame.dispose();
           } catch (NullPointerException e ) {
               sound("/sounds/errorSound.wav");
               JOptionPane.showMessageDialog(null, "You must choose value!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
           }
        }// ~ END OF removeCustomer
        
        /**
         * edit existsing Customer Details
         * @param cbPassNumber
         * @param txtBalance
         * @param txtFirstName
         * @param txtLastName
         * @param calDate
         * @param txtPassword
         * @param txtEmail
         * @param txtCountry
         * @param cbCity
         * @param txtStreet
         * @param txtHouseNumber
         * @param txtPhoneNum1
         * @param txtPhoneNumber2
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void editCustomerDetails(JComboBox cbPassNumber, JTextField txtBalance, JTextField txtFirstName, JTextField txtLastName, JDateChooser calDate,
                JTextField txtPassword, JTextField txtEmail, JTextField txtCountry, JComboBox cbCity, JTextField txtStreet, JTextField txtHouseNumber, JTextField txtPhoneNum1, JTextField txtPhoneNumber2, JInternalFrame frame ){           
            try{    
            // checks if ComboBox values exists in the system     
            InputTestsStaticClass.notInSystem(cbPassNumber, "customers");   
            //check if any of textFields are empty.              
            InputTestsStaticClass.checkEmptyTextFields(txtBalance.getText(), txtFirstName.getText(), txtLastName.getText(), txtPassword.getText(), txtEmail.getText(), txtCountry.getText(), txtStreet.getText(), txtHouseNumber.getText(), txtPhoneNum1.getText() );
            //check if the text starts with space.
            InputTestsStaticClass.spaceInStartTest(txtBalance.getText(), "Balance");
            InputTestsStaticClass.spaceInStartTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.spaceInStartTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.spaceInStartTest(txtPassword.getText(), "Password");
            InputTestsStaticClass.spaceInStartTest(txtEmail.getText(), "E-mail Address");
            InputTestsStaticClass.spaceInStartTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spaceInStartTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spaceInStartTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNum1.getText(), "Phone Number 1");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNumber2.getText(), "Phone Number 2");
            //check if the text contains spaces.         
            InputTestsStaticClass.spacesTest(txtBalance.getText(), "Balance");
            InputTestsStaticClass.spacesTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.spacesTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.spacesTest(txtPassword.getText(), "Password");
            InputTestsStaticClass.spacesTest(txtEmail.getText(), "E-mail Address");
            InputTestsStaticClass.spacesTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spacesTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spacesTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spacesTest(txtPhoneNum1.getText(), "Phone Number 1");
            InputTestsStaticClass.spacesTest(txtPhoneNumber2.getText(), "Phone Number 2");
            //check if the text contains letters.
            InputTestsStaticClass.lettersTest(txtBalance.getText(), "Balance");
            InputTestsStaticClass.lettersTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.lettersTest(txtPhoneNum1.getText(), "Phone Number 1");
            InputTestsStaticClass.lettersTest(txtPhoneNumber2.getText(), "Phone Number 2");
            //check if the text contains numbers.
            InputTestsStaticClass.integerTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.integerTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.integerTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.integerTest(txtStreet.getText(), "Street");
            
            E_Cities city = (E_Cities)cbCity.getSelectedItem();
            String passNumber = (String)cbPassNumber.getSelectedItem();           
            double balance = Double.parseDouble(txtBalance.getText());
            int houseNumber = Integer.parseInt(txtHouseNumber.getText());
            URL email = null;
        try {
            email = new URL(txtEmail.getText());
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, "E-mail id not correct", "Digit Error", JOptionPane.ERROR_MESSAGE);
        }
            String[] phoneNumber = new String[2];
            phoneNumber[0] = txtPhoneNum1.getText();   
            phoneNumber[1] = txtPhoneNumber2.getText();
            Address address = new Address(txtCountry.getText(), city, txtStreet.getText(), houseNumber, phoneNumber);
            
            
            if(iFlyController.editCustomerDetails(passNumber, balance, txtFirstName.getText(), txtLastName.getText(), calDate.getDate(), txtPassword.getText(), email, address)){
                sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully edit Customer with passport "+passNumber, "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to edit Customer "+passNumber+" \nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    clearFields(txtBalance, txtFirstName, txtLastName, txtPassword, txtEmail, txtCountry, txtStreet, txtHouseNumber, txtPhoneNum1, txtPhoneNumber2 );
                    cbPassNumber.setSelectedIndex(0);
                    cbCity.setSelectedIndex(0); 
                    calDate.setDate(new Date());
                } else {
                    frame.dispose();
                }
            }
            }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            frame.dispose();
           } catch (MissingDataException | SpaceStartException | SpacesException | LettersTestException | IntegersTestException ex) {
            ex.getStackTrace();
          } catch (NullPointerException e){
                sound("/sounds/errorSound.wav");
                JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
            } 
        }// ~ END OF editCustomerDetails
        
        /**
         * This method add new Flight to our company IIF this conditions are valid:
	 * - landing date has to be after the take off date
	 * - flight doesn't exists
	 * - all the variables are valid( number>0 & objects != null)
	 * - source and destination can't be the same airport
         * @param txtFlightNumber
         * @param DateTimeDeparture
         * @param DateTimeArrival
         * @param txtFlightCost
         * @param cbDepartureAirport
         * @param cbArrivalAirport
         * @param txtAirplaneNumber
         * @param BusinessSeatsNumber
         * @param FirstClassSeatsNumber
         * @param TouristsClassSeatsNumber
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void addFlight(JTextField txtFlightNumber, JDateChooser DateTimeDeparture, JDateChooser  DateTimeArrival,JTextField txtFlightCost, JComboBox cbDepartureAirport,
                JComboBox cbArrivalAirport, JTextField txtAirplaneNumber, JTextField BusinessSeatsNumber, JTextField FirstClassSeatsNumber, JTextField TouristsClassSeatsNumber, JInternalFrame frame){
            
            try{    
            //check if any of textFields are empty.           
            InputTestsStaticClass.checkEmptyTextFields(txtFlightNumber.getText(), txtFlightCost.getText(), txtAirplaneNumber.getText(), BusinessSeatsNumber.getText(), FirstClassSeatsNumber.getText(), TouristsClassSeatsNumber.getText());
            //check if the text starts with space.
            InputTestsStaticClass.spaceInStartTest(txtFlightNumber.getText(), "Flight Number");
            InputTestsStaticClass.spaceInStartTest(txtFlightCost.getText(), "Flight Cost");
            InputTestsStaticClass.spaceInStartTest(txtAirplaneNumber.getText(), "Airplane Number");
            InputTestsStaticClass.spaceInStartTest(BusinessSeatsNumber.getText(), "Business Seats Number");
            InputTestsStaticClass.spaceInStartTest(FirstClassSeatsNumber.getText(), "First Class Seats Number");
            InputTestsStaticClass.spaceInStartTest(TouristsClassSeatsNumber.getText(), "Tourists Class Seats Number");
            //check if the text contains spaces.
            InputTestsStaticClass.spacesTest(txtFlightNumber.getText(), "Flight Number");
            InputTestsStaticClass.spacesTest(txtFlightCost.getText(), "Flight Cost");
            InputTestsStaticClass.spacesTest(txtAirplaneNumber.getText(), "Airplane Number");
            InputTestsStaticClass.spacesTest(BusinessSeatsNumber.getText(), "Business Seats Number");
            InputTestsStaticClass.spacesTest(FirstClassSeatsNumber.getText(), "First Class Seats Number");
            InputTestsStaticClass.spacesTest(TouristsClassSeatsNumber.getText(), "Tourists Class Seats Number");
            //check if the text contains letters.
            InputTestsStaticClass.lettersTest(txtFlightNumber.getText(), "Flight Number");
            InputTestsStaticClass.lettersTest(txtFlightCost.getText(), "Flight Cost");
            InputTestsStaticClass.lettersTest(txtAirplaneNumber.getText(), "Airplane Number");
            InputTestsStaticClass.lettersTest(BusinessSeatsNumber.getText(), "Business Seats Number");
            InputTestsStaticClass.lettersTest(FirstClassSeatsNumber.getText(), "First Class Seats Number");
            InputTestsStaticClass.lettersTest(TouristsClassSeatsNumber.getText(), "Tourists Class Seats Number");
            
                      
            int flightNumber = Integer.parseInt(txtFlightNumber.getText());
            double flightCost = Double.parseDouble(txtFlightCost.getText());
            E_Airports departureAirport = (E_Airports)cbDepartureAirport.getSelectedItem();
            E_Airports arrivalAirport = (E_Airports)cbArrivalAirport.getSelectedItem();
            int airplaneNumber = Integer.parseInt(txtAirplaneNumber.getText());
            int businessSeatsNumber = Integer.parseInt(BusinessSeatsNumber.getText());
            int firstClassSeatsNumber = Integer.parseInt(FirstClassSeatsNumber.getText());
            int touristsClassSeatsNumber = Integer.parseInt(TouristsClassSeatsNumber.getText());
            Airplane air = new Airplane(airplaneNumber, businessSeatsNumber, firstClassSeatsNumber, touristsClassSeatsNumber);

            
            if(iFlyController.addFlight(flightNumber, DateTimeDeparture.getDate(), DateTimeArrival.getDate(), flightCost, departureAirport, arrivalAirport, air)){
                sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully added Flight "+txtFlightNumber.getText()+" to IFly", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to add new Flight "+txtFlightNumber.getText()+" to IFly \nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    clearFields(txtFlightNumber, txtFlightCost, txtAirplaneNumber, BusinessSeatsNumber, FirstClassSeatsNumber, TouristsClassSeatsNumber);
                    cbDepartureAirport.setSelectedIndex(0);
                    cbArrivalAirport.setSelectedIndex(0);
                    DateTimeDeparture.setDate(new Date());
                    DateTimeArrival.setDate(new Date());                   
                } else {
                    frame.dispose();
                }
            }
            } catch (MissingDataException | SpaceStartException | SpacesException | LettersTestException ex) {
            ex.getStackTrace();
          } catch (NullPointerException e){
                sound("/sounds/errorSound.wav");
                JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
            } 
        }// ~ END OF addFlight
        
        /**
         * This method remove Flight from our company IIF the Flight exists
         * @param cbFlightNumber
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void removeFlight( JComboBox cbFlightNumber, JInternalFrame frame) {
          
          try{
            // checks if ComboBox values exists in the system   
            InputTestsStaticClass.notInSystem(cbFlightNumber, "flights");
            Integer flightNumber = (Integer)cbFlightNumber.getSelectedItem();
            if(iFlyController.removeFlight(flightNumber)){
                 sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully removed branch "+flightNumber+" from IFly", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }
            }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            frame.dispose();
           } catch (NullPointerException e ) {
               sound("/sounds/errorSound.wav");
               JOptionPane.showMessageDialog(null, "You must choose value!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
           }
        }// ~ END OF removeFlight
        
        /**
         * edit existsing Flight Details
         * @param cbFlightNumber
         * @param DateTimeDeparture
         * @param DateTimeArrival
         * @param txtFlightCost
         * @param cbDepartureAirport
         * @param cbArrivalAirport
         * @param txtAirplaneNumber
         * @param BusinessSeatsNumber
         * @param FirstClassSeatsNumber
         * @param TouristsClassSeatsNumber
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void editFlightDetails(JComboBox cbFlightNumber, JDateChooser DateTimeDeparture, JDateChooser  DateTimeArrival,JTextField txtFlightCost, JComboBox cbDepartureAirport,
                JComboBox cbArrivalAirport, JTextField txtAirplaneNumber, JTextField BusinessSeatsNumber, JTextField FirstClassSeatsNumber, JTextField TouristsClassSeatsNumber, JInternalFrame frame){
            
            try{ 
            // checks if ComboBox values exists in the system     
            InputTestsStaticClass.notInSystem(cbFlightNumber, "flights");    
            //check if any of textFields are empty.           
            InputTestsStaticClass.checkEmptyTextFields(txtFlightCost.getText(), txtAirplaneNumber.getText(), BusinessSeatsNumber.getText(), FirstClassSeatsNumber.getText(), TouristsClassSeatsNumber.getText());
            //check if the text starts with space.
            InputTestsStaticClass.spaceInStartTest(txtFlightCost.getText(), "Flight Cost");
            InputTestsStaticClass.spaceInStartTest(txtAirplaneNumber.getText(), "Airplane Number");
            InputTestsStaticClass.spaceInStartTest(BusinessSeatsNumber.getText(), "Business Seats Number");
            InputTestsStaticClass.spaceInStartTest(FirstClassSeatsNumber.getText(), "First Class Seats Number");
            InputTestsStaticClass.spaceInStartTest(TouristsClassSeatsNumber.getText(), "Tourists Class Seats Number");
            //check if the text contains spaces.
            InputTestsStaticClass.spacesTest(txtFlightCost.getText(), "Flight Cost");
            InputTestsStaticClass.spacesTest(txtAirplaneNumber.getText(), "Airplane Number");
            InputTestsStaticClass.spacesTest(BusinessSeatsNumber.getText(), "Business Seats Number");
            InputTestsStaticClass.spacesTest(FirstClassSeatsNumber.getText(), "First Class Seats Number");
            InputTestsStaticClass.spacesTest(TouristsClassSeatsNumber.getText(), "Tourists Class Seats Number");
            //check if the text contains letters.
            InputTestsStaticClass.lettersTest(txtFlightCost.getText(), "Flight Cost");
            InputTestsStaticClass.lettersTest(txtAirplaneNumber.getText(), "Airplane Number");
            InputTestsStaticClass.lettersTest(BusinessSeatsNumber.getText(), "Business Seats Number");
            InputTestsStaticClass.lettersTest(FirstClassSeatsNumber.getText(), "First Class Seats Number");
            InputTestsStaticClass.lettersTest(TouristsClassSeatsNumber.getText(), "Tourists Class Seats Number");
            
                      
            int flightNumber = (Integer)cbFlightNumber.getSelectedItem();
            double flightCost = Double.parseDouble(txtFlightCost.getText());
            E_Airports departureAirport = (E_Airports)cbDepartureAirport.getSelectedItem();
            E_Airports arrivalAirport = (E_Airports)cbArrivalAirport.getSelectedItem();
            int airplaneNumber = Integer.parseInt(txtAirplaneNumber.getText());
            int businessSeatsNumber = Integer.parseInt(BusinessSeatsNumber.getText());
            int firstClassSeatsNumber = Integer.parseInt(FirstClassSeatsNumber.getText());
            int touristsClassSeatsNumber = Integer.parseInt(TouristsClassSeatsNumber.getText());
            Airplane air = new Airplane(airplaneNumber, businessSeatsNumber, firstClassSeatsNumber, touristsClassSeatsNumber);

            
            if(iFlyController.editFlightDetails(flightNumber, DateTimeDeparture.getDate(), DateTimeArrival.getDate(), flightCost, departureAirport, arrivalAirport, air)){
                sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully edit Flight "+flightNumber, "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to edit Flight "+flightNumber+" \nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    clearFields(txtFlightCost, txtAirplaneNumber, BusinessSeatsNumber, FirstClassSeatsNumber, TouristsClassSeatsNumber);
                    cbFlightNumber.setSelectedIndex(0);
                    cbDepartureAirport.setSelectedIndex(0);
                    cbArrivalAirport.setSelectedIndex(0);
                    DateTimeDeparture.setDate(new Date());
                    DateTimeArrival.setDate(new Date());                   
                } else {
                    frame.dispose();
                }
            }
            }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            frame.dispose();
            } catch (MissingDataException | SpaceStartException | SpacesException | LettersTestException ex) {
            ex.getStackTrace();
          } catch (NullPointerException e){
                sound("/sounds/errorSound.wav");
                JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
            } 
        }// ~ END OF editFlightDetails
        
        /**
         * this method add new Agent to our company IIF the Agent not exists
	 * already and the details are valid
         * @param txtEmployeeNumber
         * @param txtFirstName
         * @param txtLastName
         * @param birthDate
         * @param startWorkingDate
         * @param txtPassWord
         * @param txtCountry
         * @param cbCity
         * @param txtStreet
         * @param txtHouseNumber
         * @param txtPhoneNumber1
         * @param txtPhoneNum2
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void addAgent(JTextField txtEmployeeNumber, JTextField txtFirstName, JTextField txtLastName, JDateChooser birthDate, JDateChooser startWorkingDate, JTextField txtPassWord,
                JTextField txtCountry, JComboBox cbCity, JTextField txtStreet, JTextField txtHouseNumber, JTextField txtPhoneNumber1, JTextField txtPhoneNum2, JInternalFrame frame ){
            
            try{    
            //check if any of textFields are empty.           
            InputTestsStaticClass.checkEmptyTextFields(txtEmployeeNumber.getText(), txtFirstName.getText(), txtLastName.getText(), txtPassWord.getText(), txtCountry.getText(), txtStreet.getText(), txtHouseNumber.getText(), txtPhoneNumber1.getText());
            //check if the text starts with space.
            InputTestsStaticClass.spaceInStartTest(txtEmployeeNumber.getText(), "Employee Number");         
            InputTestsStaticClass.spaceInStartTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.spaceInStartTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.spaceInStartTest(txtPassWord.getText(), "Password");           
            InputTestsStaticClass.spaceInStartTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spaceInStartTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spaceInStartTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains spaces.           
            InputTestsStaticClass.spacesTest(txtEmployeeNumber.getText(), "Employee Number");           
            InputTestsStaticClass.spacesTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.spacesTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.spacesTest(txtPassWord.getText(), "Password");
            InputTestsStaticClass.spacesTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spacesTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spacesTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spacesTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.spacesTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains letters.
            InputTestsStaticClass.lettersTest(txtEmployeeNumber.getText(), "Employee Number");     
            InputTestsStaticClass.lettersTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.lettersTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.lettersTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains numbers.
            InputTestsStaticClass.integerTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.integerTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.integerTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.integerTest(txtStreet.getText(), "Street");
                               
            E_Cities city = (E_Cities)cbCity.getSelectedItem();
            int employeeNumber = Integer.parseInt(txtEmployeeNumber.getText());
            int houseNumber = Integer.parseInt(txtHouseNumber.getText());
            String[] phoneNumber = new String[2];
            phoneNumber[0] = txtPhoneNumber1.getText();   
            phoneNumber[1] = txtPhoneNum2.getText();
            Address address = new Address(txtCountry.getText(), city, txtStreet.getText(), houseNumber, phoneNumber);
            Agent agent = new Agent(employeeNumber, txtFirstName.getText(), txtLastName.getText(), birthDate.getDate(), startWorkingDate.getDate(), txtPassWord.getText(), address);
         
            
            if(iFlyController.addEmployee(agent)){
                  sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully added Agent "+txtEmployeeNumber.getText()+" to IFly", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to add new Agent "+txtEmployeeNumber.getText()+" to IFly \nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    clearFields(txtEmployeeNumber, txtFirstName, txtLastName, txtPassWord, txtCountry, txtStreet, txtHouseNumber, txtPhoneNumber1, txtPhoneNum2 );
                    cbCity.setSelectedIndex(0);                   
                    birthDate.setDate(new Date());
                    startWorkingDate.setDate(new Date());                   
                } else {
                    frame.dispose();
                }
            }
           } catch (MissingDataException | SpaceStartException | SpacesException | LettersTestException | IntegersTestException ex) {
            ex.getStackTrace();
          } catch (NullPointerException e){
                sound("/sounds/errorSound.wav");
                JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
            } 
        }// ~ END OF addAgent
        
        /**
         * edit existsing Agent Details
         * @param cbEmployeeNumber
         * @param txtFirstName
         * @param txtLastName
         * @param birthDate
         * @param startWorkingDate
         * @param txtPassWord
         * @param txtCountry
         * @param cbCity
         * @param txtStreet
         * @param txtHouseNumber
         * @param txtPhoneNumber1
         * @param txtPhoneNum2
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void editAgentDetails(JComboBox cbEmployeeNumber, JTextField txtFirstName, JTextField txtLastName, JDateChooser birthDate, JDateChooser startWorkingDate, JTextField txtPassWord,
                JTextField txtCountry, JComboBox cbCity, JTextField txtStreet, JTextField txtHouseNumber, JTextField txtPhoneNumber1, JTextField txtPhoneNum2, JInternalFrame frame ){
            
            try{ 
            // checks if ComboBox values exists in the system     
            InputTestsStaticClass.notInSystem(cbEmployeeNumber, "agents");    
            //check if any of textFields are empty.           
            InputTestsStaticClass.checkEmptyTextFields(txtFirstName.getText(), txtLastName.getText(), txtPassWord.getText(), txtCountry.getText(), txtStreet.getText(), txtHouseNumber.getText(), txtPhoneNumber1.getText());
            //check if the text starts with space.         
            InputTestsStaticClass.spaceInStartTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.spaceInStartTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.spaceInStartTest(txtPassWord.getText(), "Password");           
            InputTestsStaticClass.spaceInStartTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spaceInStartTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spaceInStartTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains spaces.                      
            InputTestsStaticClass.spacesTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.spacesTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.spacesTest(txtPassWord.getText(), "Password");
            InputTestsStaticClass.spacesTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spacesTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spacesTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spacesTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.spacesTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains letters.     
            InputTestsStaticClass.lettersTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.lettersTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.lettersTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains numbers.
            InputTestsStaticClass.integerTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.integerTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.integerTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.integerTest(txtStreet.getText(), "Street");
                               
            E_Cities city = (E_Cities)cbCity.getSelectedItem();
            int employeeNumber = (Integer)cbEmployeeNumber.getSelectedItem();
            int houseNumber = Integer.parseInt(txtHouseNumber.getText());
            String[] phoneNumber = new String[2];
            phoneNumber[0] = txtPhoneNumber1.getText();   
            phoneNumber[1] = txtPhoneNum2.getText();
            Address address = new Address(txtCountry.getText(), city, txtStreet.getText(), houseNumber, phoneNumber);
                            
            if(iFlyController.editAgentDetails(employeeNumber, txtFirstName.getText(), txtLastName.getText(), birthDate.getDate(), startWorkingDate.getDate(), txtPassWord.getText(), address)){
                  sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully edit agent "+employeeNumber, "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to edit agent "+employeeNumber+" \nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    clearFields(txtFirstName, txtLastName, txtPassWord, txtCountry, txtStreet, txtHouseNumber, txtPhoneNumber1, txtPhoneNum2 );
                    cbEmployeeNumber.setSelectedIndex(0);
                    cbCity.setSelectedIndex(0);                   
                    birthDate.setDate(new Date());
                    startWorkingDate.setDate(new Date());                   
                } else {
                    frame.dispose();
                }
            }
            }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            frame.dispose();
           } catch (MissingDataException | SpaceStartException | SpacesException | LettersTestException | IntegersTestException ex) {
            ex.getStackTrace();
          } catch (NullPointerException e){
                sound("/sounds/errorSound.wav");
                JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
            } 
        }// ~ END OF editAgentDetails
        
        /**
         * this method add new FlightAttendant to our company IIF the FlightAttendant not exists
	 * already and the details are valid
         * @param txtEmployeeNumber
         * @param txtFirstName
         * @param txtLastName
         * @param birthDate
         * @param startWorkingDate
         * @param txtPassWord
         * @param heraldCheckBox
         * @param txtCountry
         * @param cbCity
         * @param txtStreet
         * @param txtHouseNumber
         * @param txtPhoneNumber1
         * @param txtPhoneNum2
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void addFlightAttendant(JTextField txtEmployeeNumber, JTextField txtFirstName, JTextField txtLastName, JDateChooser birthDate, JDateChooser startWorkingDate, JTextField txtPassWord,
              JCheckBox  heraldCheckBox, JTextField txtCountry, JComboBox cbCity, JTextField txtStreet, JTextField txtHouseNumber, JTextField txtPhoneNumber1, JTextField txtPhoneNum2, JInternalFrame frame ){   
            try{    
            //check if any of textFields are empty.           
            InputTestsStaticClass.checkEmptyTextFields(txtEmployeeNumber.getText(), txtFirstName.getText(), txtLastName.getText(), txtPassWord.getText(), txtCountry.getText(), txtStreet.getText(), txtHouseNumber.getText(), txtPhoneNumber1.getText());
            //check if the text starts with space.
            InputTestsStaticClass.spaceInStartTest(txtEmployeeNumber.getText(), "Employee Number");         
            InputTestsStaticClass.spaceInStartTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.spaceInStartTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.spaceInStartTest(txtPassWord.getText(), "Password");           
            InputTestsStaticClass.spaceInStartTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spaceInStartTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spaceInStartTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains spaces.       
            InputTestsStaticClass.spacesTest(txtEmployeeNumber.getText(), "Employee Number");           
            InputTestsStaticClass.spacesTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.spacesTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.spacesTest(txtPassWord.getText(), "Password");
            InputTestsStaticClass.spacesTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spacesTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spacesTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spacesTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.spacesTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains letters.
            InputTestsStaticClass.lettersTest(txtEmployeeNumber.getText(), "Employee Number");     
            InputTestsStaticClass.lettersTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.lettersTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.lettersTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains numbers.
            InputTestsStaticClass.integerTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.integerTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.integerTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.integerTest(txtStreet.getText(), "Street");
            
            boolean isHerald = heraldCheckBox.isSelected();
            E_Cities city = (E_Cities)cbCity.getSelectedItem();
            int employeeNumber = Integer.parseInt(txtEmployeeNumber.getText());
            int houseNumber = Integer.parseInt(txtHouseNumber.getText());
            String[] phoneNumber = new String[2];
            phoneNumber[0] = txtPhoneNumber1.getText();   
            phoneNumber[1] = txtPhoneNum2.getText();
            Address address = new Address(txtCountry.getText(), city, txtStreet.getText(), houseNumber, phoneNumber);
            FlightAttendant flightAttendant = new FlightAttendant(employeeNumber, txtFirstName.getText(), txtLastName.getText(), birthDate.getDate(), startWorkingDate.getDate(), txtPassWord.getText(), address, isHerald );
            
            if(iFlyController.addEmployee(flightAttendant)){              
                  sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully added FlightAttendant "+txtEmployeeNumber.getText()+" to IFly", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to add new FlightAttendant "+txtEmployeeNumber.getText()+" to IFly \nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    clearFields(txtEmployeeNumber, txtFirstName, txtLastName, txtPassWord, txtCountry, txtStreet, txtHouseNumber, txtPhoneNumber1, txtPhoneNum2 );
                    cbCity.setSelectedIndex(0);                   
                    birthDate.setDate(new Date());
                    startWorkingDate.setDate(new Date());
                    heraldCheckBox.setSelected(false);
                } else {
                    frame.dispose();
                }
            }
           } catch (MissingDataException | SpaceStartException | SpacesException | LettersTestException | IntegersTestException ex) {
            ex.getStackTrace();
          } catch (NullPointerException e){
                sound("/sounds/errorSound.wav");
                JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
            } 
        }// ~ END OF addFlightAttendant
        
        /**
         * edit existsing FlightAttendant Details
         * @param cbEmployeeNumber
         * @param txtFirstName
         * @param txtLastName
         * @param birthDate
         * @param startWorkingDate
         * @param txtPassWord
         * @param heraldCheckBox
         * @param txtCountry
         * @param cbCity
         * @param txtStreet
         * @param txtHouseNumber
         * @param txtPhoneNumber1
         * @param txtPhoneNum2
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void editFlightAttendantDetails(JComboBox cbEmployeeNumber, JTextField txtFirstName, JTextField txtLastName, JDateChooser birthDate, JDateChooser startWorkingDate, JTextField txtPassWord,
              JCheckBox  heraldCheckBox, JTextField txtCountry, JComboBox cbCity, JTextField txtStreet, JTextField txtHouseNumber, JTextField txtPhoneNumber1, JTextField txtPhoneNum2, JInternalFrame frame ){
            
            try{  
            // checks if ComboBox values exists in the system     
            InputTestsStaticClass.notInSystem(cbEmployeeNumber, "flightAttendants");    
            //check if any of textFields are empty.           
            InputTestsStaticClass.checkEmptyTextFields(txtFirstName.getText(), txtLastName.getText(), txtPassWord.getText(), txtCountry.getText(), txtStreet.getText(), txtHouseNumber.getText(), txtPhoneNumber1.getText());
            //check if the text starts with space.         
            InputTestsStaticClass.spaceInStartTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.spaceInStartTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.spaceInStartTest(txtPassWord.getText(), "Password");           
            InputTestsStaticClass.spaceInStartTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spaceInStartTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spaceInStartTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains spaces.                      
            InputTestsStaticClass.spacesTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.spacesTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.spacesTest(txtPassWord.getText(), "Password");
            InputTestsStaticClass.spacesTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spacesTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spacesTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spacesTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.spacesTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains letters.     
            InputTestsStaticClass.lettersTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.lettersTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.lettersTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains numbers.
            InputTestsStaticClass.integerTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.integerTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.integerTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.integerTest(txtStreet.getText(), "Street");
                        
            boolean isHerald = heraldCheckBox.isSelected();
            E_Cities city = (E_Cities)cbCity.getSelectedItem();
            int employeeNumber = (Integer)cbEmployeeNumber.getSelectedItem();
            int houseNumber = Integer.parseInt(txtHouseNumber.getText());
            String[] phoneNumber = new String[2];
            phoneNumber[0] = txtPhoneNumber1.getText();   
            phoneNumber[1] = txtPhoneNum2.getText();
            Address address = new Address(txtCountry.getText(), city, txtStreet.getText(), houseNumber, phoneNumber);
                            
            if(iFlyController.editFlightAttendantDetails(employeeNumber, txtFirstName.getText(), txtLastName.getText(), birthDate.getDate(), startWorkingDate.getDate(), txtPassWord.getText(), address, isHerald )){
                iFlyController.getUsers().get(String.valueOf(employeeNumber)).setPassword(txtPassWord.getText());
                  sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully edit FlightAttendant "+employeeNumber, "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to edit FlightAttendant "+employeeNumber+" \nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    clearFields(txtFirstName, txtLastName, txtPassWord, txtCountry, txtStreet, txtHouseNumber, txtPhoneNumber1, txtPhoneNum2 );
                    cbEmployeeNumber.setSelectedIndex(0);
                    cbCity.setSelectedIndex(0);                   
                    birthDate.setDate(new Date());
                    startWorkingDate.setDate(new Date()); 
                    heraldCheckBox.setSelected(false);
                } else {
                    frame.dispose();
                }
            }
            }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            frame.dispose();
           } catch (MissingDataException | SpaceStartException | SpacesException | LettersTestException | IntegersTestException ex) {
            ex.getStackTrace();
          } catch (NullPointerException e){
                sound("/sounds/errorSound.wav");
                JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
            } 
        }// ~ END OF editFlightAttendantDetails
        
        /**
         * this method add new Pilot to our company IIF the Pilot not exists
	 * already and the details are valid
         * @param txtEmployeeNumber
         * @param txtFirstName
         * @param txtLastName
         * @param birthDate
         * @param startWorkingDate
         * @param txtPassWord
         * @param cbLicenseType
         * @param txtCountry
         * @param cbCity
         * @param txtStreet
         * @param txtHouseNumber
         * @param txtPhoneNumber1
         * @param txtPhoneNum2
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void addPilot(JTextField txtEmployeeNumber, JTextField txtFirstName, JTextField txtLastName, JDateChooser birthDate, JDateChooser startWorkingDate, JTextField txtPassWord,
              JComboBox  cbLicenseType, JTextField txtCountry, JComboBox cbCity, JTextField txtStreet, JTextField txtHouseNumber, JTextField txtPhoneNumber1, JTextField txtPhoneNum2, JInternalFrame frame ){
            
            try{    
            //check if any of textFields are empty.           
            InputTestsStaticClass.checkEmptyTextFields(txtEmployeeNumber.getText(), txtFirstName.getText(), txtLastName.getText(), txtPassWord.getText(), txtCountry.getText(), txtStreet.getText(), txtHouseNumber.getText(), txtPhoneNumber1.getText());
            //check if the text starts with space.
            InputTestsStaticClass.spaceInStartTest(txtEmployeeNumber.getText(), "Employee Number");         
            InputTestsStaticClass.spaceInStartTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.spaceInStartTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.spaceInStartTest(txtPassWord.getText(), "Password");           
            InputTestsStaticClass.spaceInStartTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spaceInStartTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spaceInStartTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains spaces.       
            InputTestsStaticClass.spacesTest(txtEmployeeNumber.getText(), "Employee Number");           
            InputTestsStaticClass.spacesTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.spacesTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.spacesTest(txtPassWord.getText(), "Password");
            InputTestsStaticClass.spacesTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spacesTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spacesTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spacesTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.spacesTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains letters.
            InputTestsStaticClass.lettersTest(txtEmployeeNumber.getText(), "Employee Number");     
            InputTestsStaticClass.lettersTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.lettersTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.lettersTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains numbers.
            InputTestsStaticClass.integerTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.integerTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.integerTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.integerTest(txtStreet.getText(), "Street");
            
            E_LicenseType licenseType = (E_LicenseType)cbLicenseType.getSelectedItem();
            E_Cities city = (E_Cities)cbCity.getSelectedItem();
            int employeeNumber = Integer.parseInt(txtEmployeeNumber.getText());
            int houseNumber = Integer.parseInt(txtHouseNumber.getText());
            String[] phoneNumber = new String[2];
            phoneNumber[0] = txtPhoneNumber1.getText();   
            phoneNumber[1] = txtPhoneNum2.getText();
            Address address = new Address(txtCountry.getText(), city, txtStreet.getText(), houseNumber, phoneNumber);
            Pilot pilot = new Pilot(employeeNumber, txtFirstName.getText(), txtLastName.getText(), birthDate.getDate(), startWorkingDate.getDate(), txtPassWord.getText(), address, licenseType);
        
            
            if(iFlyController.addEmployee(pilot)){
                sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully added Pilot "+txtEmployeeNumber.getText()+" to IFly", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to add new Pilot "+txtEmployeeNumber.getText()+" to IFly \nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    clearFields(txtEmployeeNumber, txtFirstName, txtLastName, txtPassWord, txtCountry, txtStreet, txtHouseNumber, txtPhoneNumber1, txtPhoneNum2 );
                    cbCity.setSelectedIndex(0); 
                    cbLicenseType.setSelectedIndex(0);
                    birthDate.setDate(new Date());
                    startWorkingDate.setDate(new Date());                   
                } else {
                    frame.dispose();
                }
            }
           } catch (MissingDataException | SpaceStartException | SpacesException | LettersTestException | IntegersTestException ex) {
            ex.getStackTrace();
          } catch (NullPointerException e){
                sound("/sounds/errorSound.wav");
                JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
            } 
        }// ~ END OF addPilot
        
        /**
         * edit existsing pilot Details
         * @param cbEmployeeNumber
         * @param txtFirstName
         * @param txtLastName
         * @param birthDate
         * @param startWorkingDate
         * @param txtPassWord
         * @param cbLicenseType
         * @param txtCountry
         * @param cbCity
         * @param txtStreet
         * @param txtHouseNumber
         * @param txtPhoneNumber1
         * @param txtPhoneNum2
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void editPilotDetails(JComboBox cbEmployeeNumber, JTextField txtFirstName, JTextField txtLastName, JDateChooser birthDate, JDateChooser startWorkingDate, JTextField txtPassWord,
              JComboBox  cbLicenseType, JTextField txtCountry, JComboBox cbCity, JTextField txtStreet, JTextField txtHouseNumber, JTextField txtPhoneNumber1, JTextField txtPhoneNum2, JInternalFrame frame ){
            
            try{  
            // checks if ComboBox values exists in the system     
            InputTestsStaticClass.notInSystem(cbEmployeeNumber, "pilots");    
            //check if any of textFields are empty.           
            InputTestsStaticClass.checkEmptyTextFields(txtFirstName.getText(), txtLastName.getText(), txtPassWord.getText(), txtCountry.getText(), txtStreet.getText(), txtHouseNumber.getText(), txtPhoneNumber1.getText());
            //check if the text starts with space.         
            InputTestsStaticClass.spaceInStartTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.spaceInStartTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.spaceInStartTest(txtPassWord.getText(), "Password");           
            InputTestsStaticClass.spaceInStartTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spaceInStartTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spaceInStartTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains spaces.                      
            InputTestsStaticClass.spacesTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.spacesTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.spacesTest(txtPassWord.getText(), "Password");
            InputTestsStaticClass.spacesTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spacesTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spacesTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spacesTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.spacesTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains letters.     
            InputTestsStaticClass.lettersTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.lettersTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.lettersTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains numbers.
            InputTestsStaticClass.integerTest(txtFirstName.getText(), "First Name");
            InputTestsStaticClass.integerTest(txtLastName.getText(), "Last Name");
            InputTestsStaticClass.integerTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.integerTest(txtStreet.getText(), "Street");
                        
            E_LicenseType licenseType = (E_LicenseType)cbLicenseType.getSelectedItem();
            E_Cities city = (E_Cities)cbCity.getSelectedItem();
            int employeeNumber = (Integer)cbEmployeeNumber.getSelectedItem();
            int houseNumber = Integer.parseInt(txtHouseNumber.getText());
            String[] phoneNumber = new String[2];
            phoneNumber[0] = txtPhoneNumber1.getText();   
            phoneNumber[1] = txtPhoneNum2.getText();
            Address address = new Address(txtCountry.getText(), city, txtStreet.getText(), houseNumber, phoneNumber);
                            
            if(iFlyController.editPilotDetails(employeeNumber, txtFirstName.getText(), txtLastName.getText(), birthDate.getDate(), startWorkingDate.getDate(), txtPassWord.getText(), address, licenseType)){
                iFlyController.getUsers().get(String.valueOf(employeeNumber)).setPassword(txtPassWord.getText());
                  sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully edit Pilot "+employeeNumber, "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to edit pilot "+employeeNumber+" \nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    clearFields(txtFirstName, txtLastName, txtPassWord, txtCountry, txtStreet, txtHouseNumber, txtPhoneNumber1, txtPhoneNum2 );
                    cbEmployeeNumber.setSelectedIndex(0);
                    cbCity.setSelectedIndex(0);                   
                    birthDate.setDate(new Date());
                    startWorkingDate.setDate(new Date());                   
                } else {
                    frame.dispose();
                }
            }
            }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            frame.dispose();
           } catch (MissingDataException | SpaceStartException | SpacesException | LettersTestException | IntegersTestException ex) {
            ex.getStackTrace();
          } catch (NullPointerException e){
                sound("/sounds/errorSound.wav");
                JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
            } 
        }// ~ END OF editPilotDetails
        
        /**
         * remove employee from appropriate data-structure
         * @param cbAgents
         * @param cbPilots
         * @param cbFlightAttendants
         * @param rbAgent
         * @param rbPilot
         * @param rbFlightAttendant
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void removeEmployee(JComboBox cbAgents, JComboBox cbPilots, JComboBox cbFlightAttendants, JRadioButton rbAgent, JRadioButton rbPilot, JRadioButton rbFlightAttendant, JInternalFrame frame){
            int employee;
            try{
            if(rbAgent.isSelected()){
                employee = (Integer)cbAgents.getSelectedItem();
            } else if(rbPilot.isSelected()) {
                employee = (Integer)cbPilots.getSelectedItem();
            } else if(rbFlightAttendant.isSelected()){
                employee = (Integer)cbFlightAttendants.getSelectedItem();                           
            } else{
                throw new NullPointerException();
            }
            if(iFlyController.removeEmployee(employee)){
                 sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully removed employee number "+employee+" from IFly ", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else{
                System.out.println("fuck you ");
            }
           } catch (NullPointerException e ) {
               sound("/sounds/errorSound.wav");
               JOptionPane.showMessageDialog(null, "You must choose value!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
           }
        }// ~ END OF removeEmployee
        
        /**
         * this method connect existing agent to existing branch IIF the branch and
	 * the agent exists
         * @param cbAgentNumber
         * @param cbBranchNumber
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void ConnectAgentToBranch(JComboBox  cbAgentNumber, JComboBox cbBranchNumber, JInternalFrame frame ){
           try{
            // checks if ComboBox values exists in the system    
            InputTestsStaticClass.notInSystem(cbAgentNumber, "agents");  
            InputTestsStaticClass.notInSystem(cbBranchNumber, "branches"); 
            int agentNumber = (Integer)cbAgentNumber.getSelectedItem();
            int branchNumber = (Integer)cbBranchNumber.getSelectedItem();
          
            if(iFlyController.connectAgentToBranch(agentNumber, branchNumber)){
                  sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully connected between agent "+agentNumber+" and branch "+branchNumber, "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to connect between agent "+agentNumber+" and branch "+branchNumber+"\nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    cbAgentNumber.setSelectedIndex(0); 
                    cbBranchNumber.setSelectedIndex(0);                   
                } else {
                    frame.dispose();
                }
            }
            }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            frame.dispose();
           } catch (NullPointerException e) {
            sound("/sounds/errorSound.wav");
            JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
          }
        }// ~ END OF ConnectAgentToBranch
        
        /**
         * This method first add a given flight to a given employee (pilot or FlightAttendant)
	 * and do the opposite (use instanceof operation).
         * @param cbPilot
         * @param cbFlightAttendant
         * @param cbFlightNumber
         * @param rbPilot
         * @param rbFlightAttendant
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void addPilotOrFlightAttendantToFlight(JComboBox cbPilot, JComboBox cbFlightAttendant, JComboBox cbFlightNumber, JRadioButton rbPilot, JRadioButton rbFlightAttendant , JInternalFrame frame ){
            
            Employee employee ;
            try{
                if(rbPilot.isSelected()){
                    int pilotNumber = (Integer)cbPilot.getSelectedItem();
                    employee = getEmployees().get(pilotNumber);
                }else {
                    int flightAttendantNumber = (Integer)cbFlightAttendant.getSelectedItem();
                    employee = getEmployees().get(flightAttendantNumber);          
                }                 
                 int flightNumber = (Integer)cbFlightNumber.getSelectedItem();
                 Flight flight = getFlights().get(flightNumber);
                        
            if(iFlyController.addPilotOrFlightAttendantToFlight(employee, flight)){
                sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully associated Flight "+flightNumber+" with "+employee.getClass().getSimpleName()+" "+employee.getEmployeeNumber(), "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to associated Flight "+flightNumber+" with "+employee.getClass().getSimpleName()+" "+employee.getEmployeeNumber()+" \nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {         
                    cbPilot.setSelectedIndex(0); 
                    cbFlightAttendant.setSelectedIndex(0);
                    cbFlightNumber.setSelectedIndex(0);                                    
                } else {
                    frame.dispose();
                }
            }
            } catch (NullPointerException e){
                sound("/sounds/errorSound.wav");
                JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
            } 
        
        }// ~ END OF addPilotOrFlightAttendantToFlight
        
        /**
         * This method add a new flight order to order.
         * @param cbAgentNumber
         * @param cbCustomerPassport
         * @param txtOrderNumber
         * @param cbFlightNumber
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void addFlightToOrder(JComboBox  cbAgentNumber, JComboBox cbCustomerPassport,  JTextField txtOrderNumber, JComboBox cbFlightNumber, JInternalFrame frame ){
            
            try{
            // checks if ComboBox values exists in the system     
            InputTestsStaticClass.notInSystem(cbAgentNumber, "agents");
            InputTestsStaticClass.notInSystem(cbCustomerPassport, "customers");
            InputTestsStaticClass.notInSystem(cbFlightNumber, "Flights");    
            //check if any of textFields are empty.           
            InputTestsStaticClass.checkEmptyTextFields(txtOrderNumber.getText());
            //check if the text starts with space.
            InputTestsStaticClass.spaceInStartTest(txtOrderNumber.getText(), "Order Number");
            //check if the text contains spaces.
            InputTestsStaticClass.spacesTest(txtOrderNumber.getText(), "Order Number");
            //check if the text contains letters.
            InputTestsStaticClass.lettersTest(txtOrderNumber.getText(), "Order Number");     
           
            int agentNumber = (Integer)cbAgentNumber.getSelectedItem();
            int flightNumber = (Integer)cbFlightNumber.getSelectedItem();
            int orderNumber = Integer.parseInt(txtOrderNumber.getText());
            String customerPassport = (String)cbCustomerPassport.getSelectedItem();
          
            if(iFlyController.addFlightToOrder(agentNumber, customerPassport, orderNumber, flightNumber)){
                sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully added Flight "+flightNumber+" to order "+orderNumber, "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to add Flight "+flightNumber+" to order "+orderNumber+" \nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    clearFields(txtOrderNumber );
                    cbAgentNumber.setSelectedIndex(0); 
                    cbCustomerPassport.setSelectedIndex(0);
                    cbFlightNumber.setSelectedIndex(0);
                } else {
                    frame.dispose();
                }
            }
            }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            frame.dispose();
           } catch (MissingDataException | SpaceStartException | SpacesException | LettersTestException ex) {
            ex.getStackTrace();
          } catch (NullPointerException e){
                sound("/sounds/errorSound.wav");
                JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
            } 
         }// ~ END OF addFlightToOrder
        
        /**
         * This method add a new flight ticket to an existing flight order.
         * @param cbFlightNumber
         * @param cbOrderNumber
         * @param cbPassportNumber
         * @param txtSeatNumber
         * @param txtRowNumber
         * @param cbClassType
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void addFlightTicketToFlightOrder(JComboBox  cbFlightNumber, JComboBox cbOrderNumber, JComboBox cbPassportNumber, JTextField txtSeatNumber, JTextField txtRowNumber, JComboBox cbClassType, JInternalFrame frame ){
            
            try{   
            // checks if ComboBox values exists in the system     
            InputTestsStaticClass.notInSystem(cbOrderNumber, "orders");
            InputTestsStaticClass.notInSystem(cbPassportNumber, "customers");
            InputTestsStaticClass.notInSystem(cbFlightNumber, "Flights");    
            //check if the text starts with space.
            InputTestsStaticClass.spaceInStartTest(txtSeatNumber.getText(), "Seat Number");  
            InputTestsStaticClass.spaceInStartTest(txtRowNumber.getText(), "Row Number");
            //check if the text contains spaces.
            InputTestsStaticClass.spacesTest(txtSeatNumber.getText(), "Seat Number");  
            InputTestsStaticClass.spacesTest(txtRowNumber.getText(), "Row Number");
            //check if the text contains letters.
            InputTestsStaticClass.lettersTest(txtSeatNumber.getText(), "Seat Number"); 
            InputTestsStaticClass.lettersTest(txtRowNumber.getText(), "Row Number");
           
            
            int orderNumber = (Integer)cbOrderNumber.getSelectedItem();
            int flightNumber = (Integer)cbFlightNumber.getSelectedItem();
            int seatNumber = Integer.parseInt(txtSeatNumber.getText());
            int rowNumber = Integer.parseInt(txtRowNumber.getText());
            String passportNumber = (String)cbPassportNumber.getSelectedItem();
            String classType = (String)cbClassType.toString();
          
            if(iFlyController.addFlightTicketToFlightOrder(flightNumber, orderNumber, passportNumber, seatNumber, rowNumber, classType)){
                sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully added a new flight ticket to flight order"+flightNumber+" "+orderNumber, "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to add flight ticket to flight order "+flightNumber+" "+orderNumber+" \nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    clearFields(txtSeatNumber, txtRowNumber );
                    cbFlightNumber.setSelectedIndex(0); 
                    cbOrderNumber.setSelectedIndex(0);
                    cbPassportNumber.setSelectedIndex(0);
                    cbClassType.setSelectedIndex(0);
                } else {
                    frame.dispose();
                }
            }
            }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            frame.dispose();
           } catch (SpaceStartException | SpacesException | LettersTestException ex) {
            ex.getStackTrace();
          } catch (NullPointerException e){
                sound("/sounds/errorSound.wav");
                JOptionPane.showMessageDialog(null, "You must choose a seat!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
                System.err.println(e.getMessage());
            } 
         }// ~ END OF addFlightTicketToFlightOrder
        
        /**
         * this method change the address of existing customer IIF the customer already exists and the detail are valid.
         * @param cbCustomerPassport
         * @param txtCountry
         * @param cbCity
         * @param txtStreet
         * @param txtHouseNumber
         * @param txtPhoneNumber1
         * @param txtPhoneNum2
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void changeCustomerAddress(JComboBox cbCustomerPassport, JTextField txtCountry, JComboBox cbCity, JTextField txtStreet, JTextField txtHouseNumber, JTextField txtPhoneNumber1, JTextField txtPhoneNum2, JInternalFrame frame ){                             
            try{    
            // checks if ComboBox values exists in the system     
            InputTestsStaticClass.notInSystem(cbCustomerPassport, "customers");    
            //check if any of textFields are empty.           
            InputTestsStaticClass.checkEmptyTextFields(txtCountry.getText(), txtStreet.getText(), txtHouseNumber.getText(), txtPhoneNumber1.getText()); 
            //check if the text starts with space.
            InputTestsStaticClass.spaceInStartTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spaceInStartTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spaceInStartTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.spaceInStartTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains spaces.       
            InputTestsStaticClass.spacesTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.spacesTest(txtStreet.getText(), "Street");
            InputTestsStaticClass.spacesTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.spacesTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.spacesTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains letters.                 
            InputTestsStaticClass.lettersTest(txtHouseNumber.getText(), "House Number");
            InputTestsStaticClass.lettersTest(txtPhoneNumber1.getText(), "Phone Number 1");
            InputTestsStaticClass.lettersTest(txtPhoneNum2.getText(), "Phone Number 2");
            //check if the text contains numbers.
            InputTestsStaticClass.integerTest(txtCountry.getText(), "Country");
            InputTestsStaticClass.integerTest(txtStreet.getText(), "Street");
        
            String passportNumber = (String)cbCustomerPassport.getSelectedItem();           
            E_Cities city = (E_Cities)cbCity.getSelectedItem();
            int houseNumber = Integer.parseInt(txtHouseNumber.getText());
            String[] phoneNumber = new String[2];
            phoneNumber[0] = txtPhoneNumber1.getText();   
            phoneNumber[1] = txtPhoneNum2.getText();
            System.out.print("fuck you ");
            if(iFlyController.changeCustomerAddress(passportNumber, txtCountry.getText(), city, txtStreet.getText(), houseNumber, phoneNumber)){
                sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully changed address of customer with passport "+passportNumber, "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to change address of customer with passport "+passportNumber+"\nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    clearFields(txtCountry, txtStreet, txtHouseNumber, txtPhoneNumber1, txtPhoneNum2 );
                    cbCustomerPassport.setSelectedIndex(0);                   
                } else {
                    frame.dispose();
                } 
            }
            }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            frame.dispose();
           } catch (MissingDataException | SpaceStartException | SpacesException | LettersTestException | IntegersTestException ex) {
            ex.getStackTrace();
          } catch (NullPointerException e){
                sound("/sounds/errorSound.wav");
                JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
            } 
        }// ~ END OF changeCustomerAddress
        
        /**
         * this method cancel order from the system by order number (Primary Key).
         * @param cbOrderNumber
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void cancelOrder(JComboBox  cbOrderNumber, JInternalFrame frame ){
           try{
            // checks if ComboBox values exists in the system    
            InputTestsStaticClass.notInSystem(cbOrderNumber, "orders");    
            int orderNumber = (Integer)cbOrderNumber.getSelectedItem();
          
            if(iFlyController.cancelOrder(orderNumber)){
                  sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully canceled order "+orderNumber, "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to cancel order "+orderNumber+"\nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    cbOrderNumber.setSelectedIndex(0);                    
                } else {
                    frame.dispose();
                }
            }
            }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            frame.dispose();
           } catch (NullPointerException e) {
            sound("/sounds/errorSound.wav");
            JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
          }
        }// ~ END OF cancelOrder
        
        /**
         * this Method associate Customer to Pay for order IIF the customer have enough money to pay
	 * and the order didn't paid already
         * @param cbOrderNumber
         * @param cbCustomerPassport
         * @param frame 
         */
        @SuppressWarnings("rawtypes")
		public void associateCustomerPayingOrder(JComboBox  cbOrderNumber, JComboBox  cbCustomerPassport, JInternalFrame frame ){
           try{
            // checks if ComboBox values exists in the system    
            InputTestsStaticClass.notInSystem(cbCustomerPassport, "customers");
            InputTestsStaticClass.notInSystem(cbOrderNumber, "orders");    
            int orderNumber = (Integer)cbOrderNumber.getSelectedItem();
            String passportNumber = (String)cbCustomerPassport.getSelectedItem();
          
            if(iFlyController.associateCustomerPayingOrder(orderNumber, passportNumber)){
                  sound("/sounds/okSound.wav");
                JOptionPane.showMessageDialog(null, "Successfully payed for order "+orderNumber+" by customer with passport "+passportNumber, "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png"));
                frame.dispose();
            }else {
                sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "Failed to pay for order "+orderNumber+" by customer with passport "+passportNumber+"\nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    cbOrderNumber.setSelectedIndex(0);
                    cbCustomerPassport.setSelectedIndex(0);
                } else {
                    frame.dispose();
                }
            }
            }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            frame.dispose();
           } catch (NullPointerException e) {
            sound("/sounds/errorSound.wav");
            JOptionPane.showMessageDialog(null, "You must choose values!", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/symbolError.png"));
          }
        }// ~ END OF associateCustomerPayingOrder
        
        /**
         * employee of the month is the employee that take part in the highest 
	 * number of flights, soars in the given month, and have at list 2 stops
         * @param cbMonths
         * @param taEmployeeOfTheMonth
         * @param frame 
         */
        @SuppressWarnings({ "rawtypes", "deprecation" })
		public void employeeOfTheMonth(JComboBox  cbMonths, JTextArea taEmployeeOfTheMonth, JInternalFrame frame ){
               
            E_Months months = (E_Months)cbMonths.getSelectedItem();       
            Date date = new Date(2014, months.getMonth(), 1);
            Employee employeeOfTheMonth = iFlyController.employeeOfTheMonth(date);
            Pilot pilot;
            FlightAttendant flightAttendant;
            if(employeeOfTheMonth != null){
                sound("/sounds/okSound.wav");
                if(employeeOfTheMonth instanceof Pilot){
                    pilot = (Pilot)employeeOfTheMonth;
                    taEmployeeOfTheMonth.setText("The employee of month "+months.name()+" is:\n "+pilot.theString());
                    taEmployeeOfTheMonth.setCaretPosition(0);
                }else {
                    flightAttendant = (FlightAttendant)employeeOfTheMonth;
                    taEmployeeOfTheMonth.setText("The employee of the month "+months.name()+" is:\n "+flightAttendant.theString());
                taEmployeeOfTheMonth.setCaretPosition(0);
                }
            }else {
                sound("/sounds/errorSound.wav"); 
                int response = JOptionPane.showConfirmDialog(null, "Employee of the month  "+months.name()+" not found \nwould you like to pick a different month?", "Add Error", JOptionPane.YES_NO_OPTION);        
                if (response == JOptionPane.YES_OPTION) {
                    cbMonths.setSelectedIndex(0);     
                } else {
                    frame.dispose();
                }
            }
        }// ~ END OF employeeOfTheMonth
        
        /**
         * Query that gets the top given number of Flight with the most passengers that bought tickets.
         * @param spinNumberOfFlights
         * @return list of flights
         */
        public List<Flight> getTheTopXPopularFlights(JSpinner spinNumberOfFlights ){                       
           return iFlyController.getTheTopXPopularFlights((Integer)spinNumberOfFlights.getValue());   
        }// ~ END OF employeeOfTheMonth
        
        /**
	 * The most Profitable order is the order with the higher profit of money in all orders.
	 * user helper methods!
         * @param taMostProfitableOrder
         * @param frame
	 */
        public void getTheMostProfitableOrder(JTextArea taMostProfitableOrder, JInternalFrame frame ){
            
            if(iFlyController.getTheMostProfitableOrder() != null){
                sound("/sounds/okSound.wav");  
                taMostProfitableOrder.setText("The Most Profitable Order is:\n"+iFlyController.getTheMostProfitableOrder().theString());
            }else {
                sound("/sounds/errorSound.wav"); 
                JOptionPane.showMessageDialog(null, "Sorry no orders was found ", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png")); 
                frame.dispose();
            }
        }// ~ END OF getTheMostProfitableOrder
        
        public List<Employee> getAllThisSummerWorkEmployeesSortedBySeniority(){                       
           return iFlyController.getAllThisSummerWorkEmployeesSortedBySeniority();  
        }// ~ END OF getAllThisSummerWorkEmployeesSortedBySeniority
        
        /** 
	 * super agent is an agent thats sells more then 10 
	 * flight tickets and those tickets belong to a paid order.
	 * @return an agent
	 */
	public List<Employee> getAllSuperAgents(){		
		return iFlyController.getAllSuperAgents();
	}// ~ END OF getAllSuperAgents
        
        /**
         * The method returns the orders of the profitable customer, the customer
	 * with the highest paid orders number.
         * @param taAllOrdersOfMostProfitableCustomer
         * @param frame profitable customer's list of orders
         */
        public void getAllOrdersOfMostProfitableCustomer(JTextArea taAllOrdersOfMostProfitableCustomer, JInternalFrame frame ){
            
            if(!iFlyController.getAllOrdersOfMostProfitableCustomer().isEmpty()){
                String order = "";
                int i = 1;
                sound("/sounds/okSound.wav");  
                for(Order o : iFlyController.getAllOrdersOfMostProfitableCustomer()){
                    order += i+"."+o.customString()+"\n" ;
                    i++;
                }
                taAllOrdersOfMostProfitableCustomer.setText("Customer: "+iFlyController.getAllOrdersOfMostProfitableCustomer().get(0).getResponsibleCustomer().getFirstName()+"  "+iFlyController.getAllOrdersOfMostProfitableCustomer().get(0).getResponsibleCustomer().getLastName()+"\n"+order);
            }else {
                sound("/sounds/errorSound.wav"); 
                JOptionPane.showMessageDialog(null, "Sorry no customer orders was found ", "Added Message", JOptionPane.PLAIN_MESSAGE, icon("/images/succeedIcon.png")); 
                frame.dispose();
            }
        }// ~ END OF getAllOrdersOfMostProfitableCustomer
        
        /**
	 * this method return all the summer flights in this year sorted by number of stops
	 * @see Constants#SUMMER_MONTHES
	 * @return TreeSet<Flight>
	 */
	public TreeSet<Flight> getAllSummerFlightsSortedByNumberOfStops(){
		return iFlyController.getAllSummerFlightsSortedByNumberOfStops();
	} // ~ END OF getAllSummerFlightsSortedByNumberOfStops
        
        /**
	 * This method return all this summer flights that soars from or lands
	 * in a given airport sorted by flight cost in an ascending order.
	 * @param location
	 * @return flights 
	 */
	public ArrayList<Flight> getAllThisSummerFlightsByLocation(E_Airports location){
		return iFlyController.getAllThisSummerFlightsByLocation(location);
	} // ~ END OF getAllThisSummerFlightsByLocation
        
        /**
	 * potential customers for Agents is a customer who lives in the same city where Agent lives
	 * but the customer never ordered from the agent.
	 * this method Retrieve <Agent,List<Customer>> of agent with list of potential customers for each Agent IIF 
	 * the Agent have any, otherwise the Agent will exclude from the map
	 * @return <Agent,List<Customer>>
	 */
	public Map<Agent,List<Customer>> getPotentialCustomersForAgents(){		
		return iFlyController.getPotentialCustomersForAgents();
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
		return iFlyController.getPotentialCustomersForBranch();
	} // ~ END OF getPotentialCustomersForBranch
        
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
		return iFlyController.getBranchesAgentsSortedByRating();
	} // ~ END OF getBranchesAgentsSortedByRating
        
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
		return iFlyController.findTheBestFlightBack(flightNumberSource, vacationDays);
        }
        
        /**
         * create new LoginFrame
         */
        public void executeLoginView() {
            loginFrame = new LoginFrame(instance);      // create new login frame
        }

        /**
         * handle the execute of the desktop frame
         * @param type 
         */
        public void executeDesktopView(typeOfUser type) {
            if (loginFrame.loginApproved()) {           // if there is permit to enter the system we will check whether its Admin or User
                desktopFrame = new DesktopFrame(instance, type);   // create new admin desktop frame, send the type to know which type of user
                loginFrame.setVisible(false);            // close the login frame
                desktopFrame.setVisible(true);           // open desktop frame
            }
        }

        
     /**
     * the method gets address of icon file and return the icon for display.
     * @param iconAddress
     * @return the icon
     */
    public Icon icon(String iconAddress) {          ///////// icon method
        Icon succeedIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(iconAddress)));
        return succeedIcon;
    }
        /**
     * the method gets address of sound file and return the sound for play.
     * @param soundAddress
     * @return sound
     */
    public SoundClass sound(String soundAddress) {          ///////// sound method
        SoundClass sound = new SoundClass(soundAddress);
        return sound;
    }
    /**
     * the methods clear all fields that she get
     * using ellipsis
     * @param text 
     */
    public void clearFields(JTextField... text) {            // ellipsis method to clear fields
        for (JTextField t : text) {
            t.setText("");
        }
    }
    
     //*****************************************Get Methods *************************************************
    /**
	 * @return the employees
	 */
	public Map<Integer, Employee> getEmployees() {
		return iFlyController.getEmployees();
	}

	/**
	 * @return the branches
	 */
	public Map<Integer, Branch> getBranches() {
		return iFlyController.getBranches();
	}

	/**
	 * @return the customers
	 */
	public Map<String, Customer> getCustomers() {
		return iFlyController.getCustomers();
	}

	/**
	 * @return the flights
	 */
	public Map<Integer, Flight> getFlights() {
		return iFlyController.getFlights();
	}
	
        /**
         * @return the users
         */
         public HashMap<String, Users> getUsers() {
                return iFlyController.getUsers();
        }
         
          /**
         * @return the users
         */
         public String getLogInName() {
                return ViewLogic.logInName ;
        }
         
        public void setLogInName(String logInName){
            ViewLogic.logInName = logInName;
        } 
    /**
     * the method return all Agent sorted by employee number.
     * @return Object array with after sorting
     */
    public Object[] getAllAgents() {
        ArrayList<Integer> sortArray = new ArrayList<>();
        for(Employee e : getEmployees().values()){
            if(e instanceof Agent)
                sortArray.add(e.getEmployeeNumber());
        }
        Collections.sort(sortArray);
        return sortArray.toArray();
    }        
    
    /**
     * the method return all Pilots sorted by employee number.
     * @return Object array with after sorting
     */
    public Object[] getAllPilots() {
        ArrayList<Integer> sortArray = new ArrayList<>();
        for(Employee e : getEmployees().values()){
            if(e instanceof Pilot)
                sortArray.add(e.getEmployeeNumber());
        }
        Collections.sort(sortArray);
        return sortArray.toArray();
    } 
    
    /**
     * the method return all FlightAttendants sorted by employee number.
     * @return Object array with after sorting
     */
    public Object[] getAllFlightAttendant() {
        ArrayList<Integer> sortArray = new ArrayList<>();
        for(Employee e : getEmployees().values()){
            if(e instanceof FlightAttendant)
                sortArray.add(e.getEmployeeNumber());
        }
        Collections.sort(sortArray);
        return sortArray.toArray();
    } 
    /**
     * the method return all Orders sorted by employee number.
     * @return Object array with after sorting
     */
    public Object[] getAllOrders() {
        ArrayList<Integer> sortArray = new ArrayList<>();
        for(Customer c : getCustomers().values()){
            for(Order o : c.getOrders())
                sortArray.add(o.getOrderNumber());
        }
        Collections.sort(sortArray);
        return sortArray.toArray();
    } 
    /**
     * the method return all un paid Orders sorted by employee number.
     * @return Object array with after sorting
     */
    public Object[] getAllUnPaidOrders() {
        ArrayList<Integer> sortArray = new ArrayList<>();
        for(Customer c : getCustomers().values()){
            for(Order o : c.getOrders()){
                if(o.isPaid() == false)
                sortArray.add(o.getOrderNumber());
            }
        }
        Collections.sort(sortArray);
        return sortArray.toArray();
    } 
    /**
     * method executes the system's exit
     * @param logOut
     * @throws IOException 
     */
    public void executeSysExit(boolean logOut) throws IOException {
        iFlyController.executeSysExit(logOut);
    }
}
