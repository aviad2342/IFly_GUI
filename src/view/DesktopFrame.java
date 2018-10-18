/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import core.Branch;
import core.Flight;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import utils.Constants;
import utils.TableColumnAdjuster;

/**
 *
 * @author Aviad
 */
@SuppressWarnings("serial")
public class DesktopFrame extends javax.swing.JFrame {
   //***************************************** Variables *********************************************
    /**view field*/
    private ViewLogic view;
    /**User type field*/
    private Constants.typeOfUser UserType;
    /**
     * Creates new form DesktopFrame
     * @param view
     * @param type
     */
    public DesktopFrame(ViewLogic view, Constants.typeOfUser type) {
        this.UserType = type;
                try {
                UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException  e) {
                    e.getMessage();
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                ex.getMessage();
            }
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(DesktopFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.view = view;
        setVisible(true);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("IFly"); //the title of the frame
        setIcon(); //frame's icon
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        currentDate();
        flightsTable();
        branchTable();
        logUser(type);
        // if it AGENT remove some components.
        if (type.equals(Constants.typeOfUser.AGENT)){   // hide menus from the user
            //Add Menu
            branchMenuItem.setVisible(false);
            StepinToFlightMenuItem.setVisible(false);
            agentMenuItem.setVisible(false);
            flightAttendantMenuItem.setVisible(false);
            flightMenuItem.setVisible(false);
            pilotMenuItem.setVisible(false);
            //Remove Menu
            removeBranchMenuItem.setVisible(false);
            removeEmployeeMenuItem.setVisible(false);
            removeStepInFromeFlightMenuItem.setVisible(false);
            removeFlightMenuItem.setVisible(false);               
            //Connect Menu
            AgentToBranchMenuItem.setVisible(false);
            addPilotOrFlightAttendantToFlightMenuItem.setVisible(false);
            addFlightToOrderMenuItem.setVisible(false);
            //Edit Menu
            editBranchDetailsMenuItem.setVisible(false);
            editFlightDetailsMenuItem.setVisible(false);
            editAgentDetailsMenuItem.setVisible(false);
            editPilotDetailsMenuItem.setVisible(false);
            editFlightAttendantDetailsMenuItem.setVisible(false);
            //Reports Menu
            employeeOfTheMonthMenuItem.setVisible(false);                                
            employeeOfTheMonthMenuItem.setVisible(false);
            getAllThisSummerWorkEmployeesSortedBySeniorityMenuItem.setVisible(false);
            getAllSuperAgentsMenuItem.setVisible(false);
            getPotentialCustomersForBranchMenuItem.setVisible(false);
            getBranchesAgentsSortedByRatingMenuItem.setVisible(false);
            UsersMenuItem.setVisible(false);    
            setTitle("iFly - AGENT Permission");           
        }
        // if it CUSTOMER remove some components.
        if (type.equals(Constants.typeOfUser.CUSTOMER)){   // hide menus from the user
            //Add Menu
            menuBar.remove(addMenu);
            //Remove Menu
            menuBar.remove(removeMenu);
            //Connect Menu
            menuBar.remove(connectMenu);
            //Edit Menu
            editBranchDetailsMenuItem.setVisible(false);
            editCustomerDetailsMenuItem.setVisible(false);
            editFlightDetailsMenuItem.setVisible(false);
            editAgentDetailsMenuItem.setVisible(false);
            editPilotDetailsMenuItem.setVisible(false);
            editFlightAttendantDetailsMenuItem.setVisible(false);
            cancelOrderMenuItem.setVisible(false);
            //Reports Menu
            employeeOfTheMonthMenuItem.setVisible(false);
            getAllThisSummerWorkEmployeesSortedBySeniorityMenuItem.setVisible(false);
            getTheMostProfitableOrderMenuItem.setVisible(false);
            getAllSuperAgentsMenuItem.setVisible(false);
            getAllOrdersOfMostProfitableCustomerMenuItem.setVisible(false);  
            UsersMenuItem.setVisible(false);
            getPotentialCustomersForAgentsMenuItem.setVisible(false);
            getPotentialCustomersForBranchMenuItem.setVisible(false);
            getBranchesAgentsSortedByRatingMenuItem.setVisible(false);
            setTitle("iFly - CUSTOMER Permission");           
        }
    }
    /**
     * Initiate the flight table with flights
     */
    private void flightsTable(){ 
        
           DefaultTableModel modle = new DefaultTableModel(new String[]{"Flight Number", "Departure Data And Time", "Arrival Date And Time", "Cost", "Number Of Seats","Source", "Destination"},0);
           tbFlights.setModel(modle);
           tbFlights.setShowGrid(true);
           tbFlights.setColumnSelectionAllowed(true);
           if(!view.getFlights().isEmpty()){
               for(Flight f : view.getFlights().values()){ 
                 modle.addRow(new Object[]{f.getFlightNumber(), f.getFlightDateAndTimeSource(), f.getFlightDateAndTimeDestination(), f.getFlightCost(), f.getAirplane().getTotalNumberSeats(),
                 f.getSource(), f.getDestination()});                         
                }
           TableColumnAdjuster tca = new TableColumnAdjuster(tbFlights);
            tca.adjustColumns();
           } else {
               modle.addRow(new Object[]{"No fliths fund", "No fliths fund", "No fliths fund", "No fliths fund", "No fliths fund", "No fliths fund", "No fliths fund"});
           }
    }
    /**
     * Initiate the branch table with branches
     */
    private void branchTable(){
        DefaultTableModel modle = new DefaultTableModel(new String[]{"Branch Name", "Branch Number", "Country", "City", "Street", "House Number"},0);
        tbBranch.setModel(modle);
        tbBranch.setShowGrid(true);
        tbBranch.setColumnSelectionAllowed(true);
        if(!view.getBranches().isEmpty()){
            for(Branch b : view.getBranches().values()){
                modle.addRow(new Object[]{b.getbranchName(), b.getbranchNumber(), b.getBranchAddress().getCountry(), b.getBranchAddress().getCity(), b.getBranchAddress().getStreet(),
                    b.getBranchAddress().getHouseNumber()});
            }
        }else {
               modle.addRow(new Object[]{"No Branches fund", "No Branches fund", "No Branches fund", "No Branches fund", "No Branches fund", "No Branches fund"});
           }
    }
    /**
     * Update the current time and date 
     */
    private void currentDate(){  
        Thread update = new Thread(){
        @Override
        public void run(){
        for(;;){
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        taDateAndTime.setText(" "+day+"/"+(month+1)+"/"+year+"   "+hour+":"+minute+":"+(second));
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(DesktopFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
         }       
        };
        update.start();
    }

    /**
     * Identity the user log-in the system
     * @param UserType 
     */
    private void logUser(Constants.typeOfUser UserType){
        if(UserType.equals(Constants.typeOfUser.ADMIN)){
            taLogName.setText(" Hi, Admin");
        }else if(UserType.equals(Constants.typeOfUser.CUSTOMER)){
           taLogName.setText(" Hi, "+view.getCustomers().get(view.getLogInName()).getFirstName()); 
        }else if(UserType.equals(Constants.typeOfUser.AGENT)){
           taLogName.setText(" Hi, "+view.getEmployees().get(Integer.parseInt(view.getLogInName())).getFirstName()); 
        }
        
    }
    /**
     * initialize desktopPane with MyDesktopPane object
     * @return MyDesktopPane
     */
    public MyDesktopPane myDesktop() {
        return myDesktopPane;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myDesktopPane = new view.MyDesktopPane();
        taDateAndTime = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taLogName = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbFlights = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbBranch = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        LogOutMenuItem = new javax.swing.JMenuItem();
        ExitMenuItem = new javax.swing.JMenuItem();
        addMenu = new javax.swing.JMenu();
        branchMenuItem = new javax.swing.JMenuItem();
        flightMenuItem = new javax.swing.JMenuItem();
        StepinToFlightMenuItem = new javax.swing.JMenuItem();
        customerMenuItem = new javax.swing.JMenuItem();
        agentMenuItem = new javax.swing.JMenuItem();
        flightAttendantMenuItem = new javax.swing.JMenuItem();
        pilotMenuItem = new javax.swing.JMenuItem();
        removeMenu = new javax.swing.JMenu();
        removeBranchMenuItem = new javax.swing.JMenuItem();
        removeStepInFromeFlightMenuItem = new javax.swing.JMenuItem();
        removeEmployeeMenuItem = new javax.swing.JMenuItem();
        removeCustomerMenuItem = new javax.swing.JMenuItem();
        removeFlightMenuItem = new javax.swing.JMenuItem();
        connectMenu = new javax.swing.JMenu();
        AgentToBranchMenuItem = new javax.swing.JMenuItem();
        addPilotOrFlightAttendantToFlightMenuItem = new javax.swing.JMenuItem();
        addFlightToOrderMenuItem = new javax.swing.JMenuItem();
        addFlightTicketToFlightOrderMenuItem = new javax.swing.JMenuItem();
        CustomerPayingOrderMenuItem = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        changeCustomerAddress = new javax.swing.JMenuItem();
        cancelOrderMenuItem = new javax.swing.JMenuItem();
        editBranchDetailsMenuItem = new javax.swing.JMenuItem();
        editCustomerDetailsMenuItem = new javax.swing.JMenuItem();
        editFlightDetailsMenuItem = new javax.swing.JMenuItem();
        editAgentDetailsMenuItem = new javax.swing.JMenuItem();
        editPilotDetailsMenuItem = new javax.swing.JMenuItem();
        editFlightAttendantDetailsMenuItem = new javax.swing.JMenuItem();
        reportsMenu = new javax.swing.JMenu();
        employeeOfTheMonthMenuItem = new javax.swing.JMenuItem();
        getTheTopXPopularFlightsMenuItem = new javax.swing.JMenuItem();
        getTheMostProfitableOrderMenuItem = new javax.swing.JMenuItem();
        getAllThisSummerWorkEmployeesSortedBySeniorityMenuItem = new javax.swing.JMenuItem();
        getAllSuperAgentsMenuItem = new javax.swing.JMenuItem();
        getAllOrdersOfMostProfitableCustomerMenuItem = new javax.swing.JMenuItem();
        getAllSummerFlightsSortedByNumberOfStopsMenuItem = new javax.swing.JMenuItem();
        UsersMenuItem = new javax.swing.JMenuItem();
        getAllThisSummerFlightsByLocationMenuItem = new javax.swing.JMenuItem();
        getPotentialCustomersForAgentsMenuItem = new javax.swing.JMenuItem();
        getPotentialCustomersForBranchMenuItem = new javax.swing.JMenuItem();
        getBranchesAgentsSortedByRatingMenuItem = new javax.swing.JMenuItem();
        findTheBestFlightBackMenuItem = new javax.swing.JMenuItem();
        CustomerOrdersMenuItem = new javax.swing.JMenuItem();
        AboutMenu = new javax.swing.JMenu();
        AboutUsMenuItem = new javax.swing.JMenuItem();
        officialSiteMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        taDateAndTime.setEditable(false);
        taDateAndTime.setBackground(new java.awt.Color(51, 51, 51));
        taDateAndTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        taDateAndTime.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        myDesktopPane.add(taDateAndTime);
        taDateAndTime.setBounds(990, 0, 190, 30);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        taLogName.setEditable(false);
        taLogName.setBackground(new java.awt.Color(51, 51, 51));
        taLogName.setColumns(20);
        taLogName.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        taLogName.setRows(5);
        taLogName.setBorder(null);
        jScrollPane1.setViewportView(taLogName);

        myDesktopPane.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 130, 30);

        tbFlights.setBackground(new java.awt.Color(102, 102, 102));
        tbFlights.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tbFlights.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Departure Data And Time", "Arrival Date And Time", "Cost", "Number Of Seats", "Source", "Destination"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbFlights.setToolTipText("Click to watch flight details");
        tbFlights.setGridColor(new java.awt.Color(0, 0, 0));
        tbFlights.setSelectionForeground(new java.awt.Color(204, 204, 204));
        tbFlights.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbFlightsMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbFlights);

        myDesktopPane.add(jScrollPane2);
        jScrollPane2.setBounds(30, 130, 1110, 190);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Our Branches:");
        myDesktopPane.add(jLabel1);
        jLabel1.setBounds(30, 380, 180, 30);

        tbBranch.setBackground(new java.awt.Color(102, 102, 102));
        tbBranch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tbBranch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbBranch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Branch Name", "Branch Number", "Country", "City", "Street", "House Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBranch.setToolTipText("");
        tbBranch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbBranchMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tbBranch);

        myDesktopPane.add(jScrollPane3);
        jScrollPane3.setBounds(30, 410, 1110, 190);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("All Available Flights:");
        myDesktopPane.add(jLabel2);
        jLabel2.setBounds(30, 100, 180, 30);

        menuBar.setBackground(new java.awt.Color(102, 102, 102));
        menuBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuBar.setForeground(new java.awt.Color(51, 51, 51));

        FileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Basic-Folder-.png"))); // NOI18N
        FileMenu.setText("File       ");
        FileMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        LogOutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        LogOutMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LogOutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_logout-icon.gif"))); // NOI18N
        LogOutMenuItem.setText("LogOut");
        LogOutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(LogOutMenuItem);

        ExitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        ExitMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ExitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/500px-Crystal_Clear_action_exit.svg.png"))); // NOI18N
        ExitMenuItem.setText("Exit");
        ExitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(ExitMenuItem);

        menuBar.add(FileMenu);

        addMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Adds-Add-list-.png"))); // NOI18N
        addMenu.setText("Add      ");
        addMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        branchMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        branchMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        branchMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ofice.png"))); // NOI18N
        branchMenuItem.setText("Branch");
        branchMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchMenuItemActionPerformed(evt);
            }
        });
        addMenu.add(branchMenuItem);

        flightMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        flightMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        flightMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plane-icon-blue.png"))); // NOI18N
        flightMenuItem.setText("Flight");
        flightMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightMenuItemActionPerformed(evt);
            }
        });
        addMenu.add(flightMenuItem);

        StepinToFlightMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        StepinToFlightMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        StepinToFlightMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/footsteps-98468_640.png"))); // NOI18N
        StepinToFlightMenuItem.setText("Stepin To Flight");
        StepinToFlightMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StepinToFlightMenuItemActionPerformed(evt);
            }
        });
        addMenu.add(StepinToFlightMenuItem);

        customerMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        customerMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        customerMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addp.jpg"))); // NOI18N
        customerMenuItem.setText("Customer");
        customerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerMenuItemActionPerformed(evt);
            }
        });
        addMenu.add(customerMenuItem);

        agentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        agentMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        agentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agent.jpg"))); // NOI18N
        agentMenuItem.setText("Agent");
        agentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentMenuItemActionPerformed(evt);
            }
        });
        addMenu.add(agentMenuItem);

        flightAttendantMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        flightAttendantMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        flightAttendantMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/attendant_avatar.png"))); // NOI18N
        flightAttendantMenuItem.setText("FlightAttendant");
        flightAttendantMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightAttendantMenuItemActionPerformed(evt);
            }
        });
        addMenu.add(flightAttendantMenuItem);

        pilotMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        pilotMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pilotMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pilot_Male_Light.png"))); // NOI18N
        pilotMenuItem.setText("Pilot");
        pilotMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilotMenuItemActionPerformed(evt);
            }
        });
        addMenu.add(pilotMenuItem);

        menuBar.add(addMenu);

        removeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Trash.png"))); // NOI18N
        removeMenu.setText("Remove     ");
        removeMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        removeBranchMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        removeBranchMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        removeBranchMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ofice.png"))); // NOI18N
        removeBranchMenuItem.setText("Branch");
        removeBranchMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBranchMenuItemActionPerformed(evt);
            }
        });
        removeMenu.add(removeBranchMenuItem);

        removeStepInFromeFlightMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        removeStepInFromeFlightMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        removeStepInFromeFlightMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/footsteps-98468_640.png"))); // NOI18N
        removeStepInFromeFlightMenuItem.setText("Step-In Frome Flight");
        removeStepInFromeFlightMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStepInFromeFlightMenuItemActionPerformed(evt);
            }
        });
        removeMenu.add(removeStepInFromeFlightMenuItem);

        removeEmployeeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        removeEmployeeMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        removeEmployeeMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove_business_user.png"))); // NOI18N
        removeEmployeeMenuItem.setText("Employee");
        removeEmployeeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEmployeeMenuItemActionPerformed(evt);
            }
        });
        removeMenu.add(removeEmployeeMenuItem);

        removeCustomerMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        removeCustomerMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        removeCustomerMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Remove-Male-User-icon.png"))); // NOI18N
        removeCustomerMenuItem.setText("Customer");
        removeCustomerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCustomerMenuItemActionPerformed(evt);
            }
        });
        removeMenu.add(removeCustomerMenuItem);

        removeFlightMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        removeFlightMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        removeFlightMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/errr.png"))); // NOI18N
        removeFlightMenuItem.setText("Flight");
        removeFlightMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFlightMenuItemActionPerformed(evt);
            }
        });
        removeMenu.add(removeFlightMenuItem);

        menuBar.add(removeMenu);

        connectMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/links.png"))); // NOI18N
        connectMenu.setText("Connect     ");
        connectMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        AgentToBranchMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        AgentToBranchMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AgentToBranchMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Online Agent Add.jpg"))); // NOI18N
        AgentToBranchMenuItem.setText("Agent To Branch");
        AgentToBranchMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgentToBranchMenuItemActionPerformed(evt);
            }
        });
        connectMenu.add(AgentToBranchMenuItem);

        addPilotOrFlightAttendantToFlightMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        addPilotOrFlightAttendantToFlightMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addPilotOrFlightAttendantToFlightMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/437,1281013050,3.jpg"))); // NOI18N
        addPilotOrFlightAttendantToFlightMenuItem.setText("Pilot Or FlightAttendant To Flight");
        addPilotOrFlightAttendantToFlightMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPilotOrFlightAttendantToFlightMenuItemActionPerformed(evt);
            }
        });
        connectMenu.add(addPilotOrFlightAttendantToFlightMenuItem);

        addFlightToOrderMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        addFlightToOrderMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addFlightToOrderMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/order-icon.jpg"))); // NOI18N
        addFlightToOrderMenuItem.setText("Flight To Order");
        addFlightToOrderMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightToOrderMenuItemActionPerformed(evt);
            }
        });
        connectMenu.add(addFlightToOrderMenuItem);

        addFlightTicketToFlightOrderMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        addFlightTicketToFlightOrderMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addFlightTicketToFlightOrderMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Airport_icons-09-128.png"))); // NOI18N
        addFlightTicketToFlightOrderMenuItem.setText("Flight Ticket To FlightOrder");
        addFlightTicketToFlightOrderMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightTicketToFlightOrderMenuItemActionPerformed(evt);
            }
        });
        connectMenu.add(addFlightTicketToFlightOrderMenuItem);

        CustomerPayingOrderMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        CustomerPayingOrderMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CustomerPayingOrderMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pay-icon.gif"))); // NOI18N
        CustomerPayingOrderMenuItem.setText("Customer Paying Order");
        CustomerPayingOrderMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerPayingOrderMenuItemActionPerformed(evt);
            }
        });
        connectMenu.add(CustomerPayingOrderMenuItem);

        menuBar.add(connectMenu);

        EditMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Editing.png"))); // NOI18N
        EditMenu.setText("Edit       ");
        EditMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        changeCustomerAddress.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        changeCustomerAddress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        changeCustomerAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/address box.jpg"))); // NOI18N
        changeCustomerAddress.setText("Customer Address");
        changeCustomerAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeCustomerAddressActionPerformed(evt);
            }
        });
        EditMenu.add(changeCustomerAddress);

        cancelOrderMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        cancelOrderMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelOrderMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_cancel.png"))); // NOI18N
        cancelOrderMenuItem.setText("Cancel Order");
        cancelOrderMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(cancelOrderMenuItem);

        editBranchDetailsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        editBranchDetailsMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editBranchDetailsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/branch ditails.jpg"))); // NOI18N
        editBranchDetailsMenuItem.setText("Branch Details");
        editBranchDetailsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBranchDetailsMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(editBranchDetailsMenuItem);

        editCustomerDetailsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        editCustomerDetailsMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editCustomerDetailsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customerdt.png"))); // NOI18N
        editCustomerDetailsMenuItem.setText("Customer Details");
        editCustomerDetailsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCustomerDetailsMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(editCustomerDetailsMenuItem);

        editFlightDetailsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        editFlightDetailsMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editFlightDetailsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_256.png"))); // NOI18N
        editFlightDetailsMenuItem.setText("Flight Details");
        editFlightDetailsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFlightDetailsMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(editFlightDetailsMenuItem);

        editAgentDetailsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        editAgentDetailsMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editAgentDetailsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/spy_user_agent_webroot_undercover-128.png"))); // NOI18N
        editAgentDetailsMenuItem.setText("Agent Details");
        editAgentDetailsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAgentDetailsMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(editAgentDetailsMenuItem);

        editPilotDetailsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        editPilotDetailsMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editPilotDetailsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pilot_icon.jpg"))); // NOI18N
        editPilotDetailsMenuItem.setText("Pilot Details");
        editPilotDetailsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPilotDetailsMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(editPilotDetailsMenuItem);

        editFlightAttendantDetailsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        editFlightAttendantDetailsMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editFlightAttendantDetailsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FlightAttendant_Female_Dark.png"))); // NOI18N
        editFlightAttendantDetailsMenuItem.setText("FlightAttendant Details");
        editFlightAttendantDetailsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFlightAttendantDetailsMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(editFlightAttendantDetailsMenuItem);

        menuBar.add(EditMenu);

        reportsMenu.setBorder(null);
        reportsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        reportsMenu.setText("Reports      ");
        reportsMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        employeeOfTheMonthMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        employeeOfTheMonthMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        employeeOfTheMonthMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/administrator.png"))); // NOI18N
        employeeOfTheMonthMenuItem.setText("Employee Of The Month");
        employeeOfTheMonthMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeOfTheMonthMenuItemActionPerformed(evt);
            }
        });
        reportsMenu.add(employeeOfTheMonthMenuItem);

        getTheTopXPopularFlightsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        getTheTopXPopularFlightsMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getTheTopXPopularFlightsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/air_tickets.gif"))); // NOI18N
        getTheTopXPopularFlightsMenuItem.setText("Top Popular Flights");
        getTheTopXPopularFlightsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getTheTopXPopularFlightsMenuItemActionPerformed(evt);
            }
        });
        reportsMenu.add(getTheTopXPopularFlightsMenuItem);

        getTheMostProfitableOrderMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        getTheMostProfitableOrderMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getTheMostProfitableOrderMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PartnerOne_icon-rebates_tcm_148_1424746.png"))); // NOI18N
        getTheMostProfitableOrderMenuItem.setText("The Most Profitable Order");
        getTheMostProfitableOrderMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getTheMostProfitableOrderMenuItemActionPerformed(evt);
            }
        });
        reportsMenu.add(getTheMostProfitableOrderMenuItem);

        getAllThisSummerWorkEmployeesSortedBySeniorityMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        getAllThisSummerWorkEmployeesSortedBySeniorityMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getAllThisSummerWorkEmployeesSortedBySeniorityMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Folder-Summer-icon.png"))); // NOI18N
        getAllThisSummerWorkEmployeesSortedBySeniorityMenuItem.setText("This Summer Employees");
        getAllThisSummerWorkEmployeesSortedBySeniorityMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAllThisSummerWorkEmployeesSortedBySeniorityMenuItemActionPerformed(evt);
            }
        });
        reportsMenu.add(getAllThisSummerWorkEmployeesSortedBySeniorityMenuItem);

        getAllSuperAgentsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        getAllSuperAgentsMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getAllSuperAgentsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/depositphotos_6207720-Super-man-icon.jpg"))); // NOI18N
        getAllSuperAgentsMenuItem.setText("All Super Agents");
        getAllSuperAgentsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAllSuperAgentsMenuItemActionPerformed(evt);
            }
        });
        reportsMenu.add(getAllSuperAgentsMenuItem);

        getAllOrdersOfMostProfitableCustomerMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        getAllOrdersOfMostProfitableCustomerMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getAllOrdersOfMostProfitableCustomerMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dollar.jpg"))); // NOI18N
        getAllOrdersOfMostProfitableCustomerMenuItem.setText("All Orders Of Most Profitable Customer");
        getAllOrdersOfMostProfitableCustomerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAllOrdersOfMostProfitableCustomerMenuItemActionPerformed(evt);
            }
        });
        reportsMenu.add(getAllOrdersOfMostProfitableCustomerMenuItem);

        getAllSummerFlightsSortedByNumberOfStopsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        getAllSummerFlightsSortedByNumberOfStopsMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getAllSummerFlightsSortedByNumberOfStopsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon-stop-256.png"))); // NOI18N
        getAllSummerFlightsSortedByNumberOfStopsMenuItem.setText("All Summer Flights Stops");
        getAllSummerFlightsSortedByNumberOfStopsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAllSummerFlightsSortedByNumberOfStopsMenuItemActionPerformed(evt);
            }
        });
        reportsMenu.add(getAllSummerFlightsSortedByNumberOfStopsMenuItem);

        UsersMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        UsersMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UsersMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        UsersMenuItem.setText("Display Users ");
        UsersMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsersMenuItemActionPerformed(evt);
            }
        });
        reportsMenu.add(UsersMenuItem);

        getAllThisSummerFlightsByLocationMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        getAllThisSummerFlightsByLocationMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getAllThisSummerFlightsByLocationMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/map_marker-512.png"))); // NOI18N
        getAllThisSummerFlightsByLocationMenuItem.setText("All Summer Flights By Location");
        getAllThisSummerFlightsByLocationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAllThisSummerFlightsByLocationMenuItemActionPerformed(evt);
            }
        });
        reportsMenu.add(getAllThisSummerFlightsByLocationMenuItem);

        getPotentialCustomersForAgentsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        getPotentialCustomersForAgentsMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getPotentialCustomersForAgentsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customers_customer_user_male_man_people_light.png"))); // NOI18N
        getPotentialCustomersForAgentsMenuItem.setText("Potential Customers For Agents");
        getPotentialCustomersForAgentsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPotentialCustomersForAgentsMenuItemActionPerformed(evt);
            }
        });
        reportsMenu.add(getPotentialCustomersForAgentsMenuItem);

        getPotentialCustomersForBranchMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        getPotentialCustomersForBranchMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getPotentialCustomersForBranchMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customers.png"))); // NOI18N
        getPotentialCustomersForBranchMenuItem.setText("Potential Customers For Branch");
        getPotentialCustomersForBranchMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPotentialCustomersForBranchMenuItemActionPerformed(evt);
            }
        });
        reportsMenu.add(getPotentialCustomersForBranchMenuItem);

        getBranchesAgentsSortedByRatingMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        getBranchesAgentsSortedByRatingMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getBranchesAgentsSortedByRatingMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rehr_affiliates_main.png"))); // NOI18N
        getBranchesAgentsSortedByRatingMenuItem.setText("Branches Agents ");
        getBranchesAgentsSortedByRatingMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBranchesAgentsSortedByRatingMenuItemActionPerformed(evt);
            }
        });
        reportsMenu.add(getBranchesAgentsSortedByRatingMenuItem);

        findTheBestFlightBackMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        findTheBestFlightBackMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        findTheBestFlightBackMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plane_travel_flighplane_icon.png"))); // NOI18N
        findTheBestFlightBackMenuItem.setText("Find The Best Flight Back");
        findTheBestFlightBackMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findTheBestFlightBackMenuItemActionPerformed(evt);
            }
        });
        reportsMenu.add(findTheBestFlightBackMenuItem);

        CustomerOrdersMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        CustomerOrdersMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CustomerOrdersMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customerdt.png"))); // NOI18N
        CustomerOrdersMenuItem.setText("Customer Orders");
        CustomerOrdersMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerOrdersMenuItemActionPerformed(evt);
            }
        });
        reportsMenu.add(CustomerOrdersMenuItem);

        menuBar.add(reportsMenu);

        AboutMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Help-icon.png"))); // NOI18N
        AboutMenu.setText("Help   ");
        AboutMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        AboutUsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        AboutUsMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AboutUsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info.png"))); // NOI18N
        AboutUsMenuItem.setText("About Us");
        AboutUsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutUsMenuItemActionPerformed(evt);
            }
        });
        AboutMenu.add(AboutUsMenuItem);

        officialSiteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        officialSiteMenuItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        officialSiteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/interneticon.png"))); // NOI18N
        officialSiteMenuItem.setText("Official Site");
        officialSiteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                officialSiteMenuItemActionPerformed(evt);
            }
        });
        AboutMenu.add(officialSiteMenuItem);

        menuBar.add(AboutMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1182, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myDesktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void branchMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchMenuItemActionPerformed
        AddBranch frmAddBranch = new AddBranch(view, myDesktopPane);
        myDesktopPane.add(frmAddBranch);
        frmAddBranch.show();
    }//GEN-LAST:event_branchMenuItemActionPerformed

    private void StepinToFlightMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StepinToFlightMenuItemActionPerformed
        AddStepINToFlight frmStepinToFlight = new AddStepINToFlight(view, myDesktopPane);
        myDesktopPane.add(frmStepinToFlight);
        frmStepinToFlight.show(); 
    }//GEN-LAST:event_StepinToFlightMenuItemActionPerformed

    private void customerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerMenuItemActionPerformed
        addCustomer frmAddCustomer = new addCustomer(view, myDesktopPane);
        myDesktopPane.add(frmAddCustomer);
        frmAddCustomer.show(); 
    }//GEN-LAST:event_customerMenuItemActionPerformed

    private void flightMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightMenuItemActionPerformed
        addFlight frmAddFlight = new addFlight(view, myDesktopPane);
        myDesktopPane.add(frmAddFlight);
        frmAddFlight.show();
        flightsTable();
    }//GEN-LAST:event_flightMenuItemActionPerformed

    private void agentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentMenuItemActionPerformed
        addAgent frmAddAgent = new addAgent(view, myDesktopPane);
        myDesktopPane.add(frmAddAgent);
        frmAddAgent.show(); 
    }//GEN-LAST:event_agentMenuItemActionPerformed

    private void flightAttendantMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightAttendantMenuItemActionPerformed
        addFlightAttendant frmAddFlightAttendant = new addFlightAttendant(view, myDesktopPane);
        myDesktopPane.add(frmAddFlightAttendant);
        frmAddFlightAttendant.show(); 
    }//GEN-LAST:event_flightAttendantMenuItemActionPerformed

    private void pilotMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilotMenuItemActionPerformed
        addPilot frmAddPilot = new addPilot(view, myDesktopPane);
        myDesktopPane.add(frmAddPilot);
        frmAddPilot.show(); 
    }//GEN-LAST:event_pilotMenuItemActionPerformed

    private void AgentToBranchMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgentToBranchMenuItemActionPerformed
        ConnectAgentToBranch frmConnectAgentToBranch = new ConnectAgentToBranch(view, myDesktopPane);
        myDesktopPane.add(frmConnectAgentToBranch);
        frmConnectAgentToBranch.show();
    }//GEN-LAST:event_AgentToBranchMenuItemActionPerformed

    private void addPilotOrFlightAttendantToFlightMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPilotOrFlightAttendantToFlightMenuItemActionPerformed
        addPilotOrFlightAttendantToFlight frmAddPilotOrFlightAttendantToFlight = new addPilotOrFlightAttendantToFlight(view, myDesktopPane);
        myDesktopPane.add(frmAddPilotOrFlightAttendantToFlight);
        frmAddPilotOrFlightAttendantToFlight.show();
    }//GEN-LAST:event_addPilotOrFlightAttendantToFlightMenuItemActionPerformed

    private void addFlightToOrderMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlightToOrderMenuItemActionPerformed
        addFlightToOrder frmAddflightToOrder = new addFlightToOrder(view, myDesktopPane);
        myDesktopPane.add(frmAddflightToOrder);
        frmAddflightToOrder.show();
    }//GEN-LAST:event_addFlightToOrderMenuItemActionPerformed

    private void addFlightTicketToFlightOrderMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlightTicketToFlightOrderMenuItemActionPerformed
        addFlightTicketToFlightOrder frmAddFlightTicketToFlightOrder = new addFlightTicketToFlightOrder(view, myDesktopPane);
        myDesktopPane.add(frmAddFlightTicketToFlightOrder);
        frmAddFlightTicketToFlightOrder.show();
    }//GEN-LAST:event_addFlightTicketToFlightOrderMenuItemActionPerformed

    private void changeCustomerAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeCustomerAddressActionPerformed
        changeCustomerAddress frmChangeCustomerAddress = new changeCustomerAddress(view, myDesktopPane, UserType);
        myDesktopPane.add(frmChangeCustomerAddress);
        frmChangeCustomerAddress.show();
    }//GEN-LAST:event_changeCustomerAddressActionPerformed

    private void CustomerPayingOrderMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerPayingOrderMenuItemActionPerformed
        associateCustomerPayingOrder frmCustomerPayingOrder = new associateCustomerPayingOrder(view, myDesktopPane);
        myDesktopPane.add(frmCustomerPayingOrder);
        frmCustomerPayingOrder.show();
    }//GEN-LAST:event_CustomerPayingOrderMenuItemActionPerformed

    @SuppressWarnings("unused")
	private void LogOutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutMenuItemActionPerformed
        SoundClass sound = new SoundClass("/sounds/exitSound.wav");
        int logOut = JOptionPane.showConfirmDialog(null, "Are you sure you want to logOut?" , "Logout", JOptionPane.YES_NO_OPTION);
        if(logOut == JOptionPane.YES_OPTION){
            SoundClass logoutSound = new SoundClass("/sounds/logOff.wav");
            try {
                view.executeSysExit(true);
            } catch (IOException ex) {
                System.out.printf(ex.getMessage());
            }
            dispose();
            LoginFrame newLogin = new LoginFrame(view);
          
        }
    }//GEN-LAST:event_LogOutMenuItemActionPerformed

    @SuppressWarnings("unused")
	private void ExitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMenuItemActionPerformed
        SoundClass sound = new SoundClass("/sounds/exitSound.wav");
        int question = JOptionPane.showConfirmDialog(null, "Save changes before exit?" , "Save", JOptionPane.YES_NO_CANCEL_OPTION);
        if(question == JOptionPane.NO_OPTION)
         System.exit(0);
        if(question == JOptionPane.YES_OPTION)
            try {
                    view.executeSysExit(false);
        } catch (IOException ex) {
            System.out.printf(ex.getMessage());  
        }
    }//GEN-LAST:event_ExitMenuItemActionPerformed

    private void employeeOfTheMonthMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeOfTheMonthMenuItemActionPerformed
        employeeOfTheMonth frmEmployeeOfTheMonth = new employeeOfTheMonth(view, myDesktopPane);
        myDesktopPane.add(frmEmployeeOfTheMonth);
        frmEmployeeOfTheMonth.show();
    }//GEN-LAST:event_employeeOfTheMonthMenuItemActionPerformed

    private void getTheTopXPopularFlightsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getTheTopXPopularFlightsMenuItemActionPerformed
        getTheTopXPopularFlights frmTopXPopularFlights = new getTheTopXPopularFlights(view, myDesktopPane);
        myDesktopPane.add(frmTopXPopularFlights);
        frmTopXPopularFlights.show();
    }//GEN-LAST:event_getTheTopXPopularFlightsMenuItemActionPerformed

    private void getTheMostProfitableOrderMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getTheMostProfitableOrderMenuItemActionPerformed
        getTheMostProfitableOrder frmTheMostProfitableOrder = new getTheMostProfitableOrder(view, myDesktopPane);
        myDesktopPane.add(frmTheMostProfitableOrder);
        frmTheMostProfitableOrder.show();
    }//GEN-LAST:event_getTheMostProfitableOrderMenuItemActionPerformed

    private void getAllThisSummerWorkEmployeesSortedBySeniorityMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAllThisSummerWorkEmployeesSortedBySeniorityMenuItemActionPerformed
        getAllThisSummerWorkEmployeesSortedBySeniority frnAllThisSummerWorkEmployeesSortedBySeniority = new getAllThisSummerWorkEmployeesSortedBySeniority(view, myDesktopPane);
        myDesktopPane.add(frnAllThisSummerWorkEmployeesSortedBySeniority);
        frnAllThisSummerWorkEmployeesSortedBySeniority.show();
    }//GEN-LAST:event_getAllThisSummerWorkEmployeesSortedBySeniorityMenuItemActionPerformed

    private void getAllSuperAgentsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAllSuperAgentsMenuItemActionPerformed
        getAllSuperAgents frnAllSuperAgents = new getAllSuperAgents(view, myDesktopPane);
        myDesktopPane.add(frnAllSuperAgents);
        frnAllSuperAgents.show();
    }//GEN-LAST:event_getAllSuperAgentsMenuItemActionPerformed

    @SuppressWarnings("unused")
	private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
                   SoundClass sound = new SoundClass("/sounds/exitSound.wav");  // sound when the button clicked
            int question = JOptionPane.showConfirmDialog(null, "Save changes before exit?", "Save", JOptionPane.YES_NO_CANCEL_OPTION);
            if (question == JOptionPane.NO_OPTION) { // if user clicked NO, exit
                System.exit(0);
            }
            if (question == JOptionPane.YES_OPTION) { // if clicked YES, try to save his data
                try {
                    view.executeSysExit(false);
                } catch (IOException ex) {
                }
            }
    }//GEN-LAST:event_formWindowClosing

    private void getAllOrdersOfMostProfitableCustomerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAllOrdersOfMostProfitableCustomerMenuItemActionPerformed
        getAllOrdersOfMostProfitableCustomer frmOrdersOfMostProfitableCustomer = new getAllOrdersOfMostProfitableCustomer(view, myDesktopPane);
        myDesktopPane.add(frmOrdersOfMostProfitableCustomer);
        frmOrdersOfMostProfitableCustomer.show();
    }//GEN-LAST:event_getAllOrdersOfMostProfitableCustomerMenuItemActionPerformed

    private void removeBranchMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBranchMenuItemActionPerformed
        removeBranch frmRemoveBranch = new removeBranch(view, myDesktopPane);
        myDesktopPane.add(frmRemoveBranch);
        frmRemoveBranch.show();
    }//GEN-LAST:event_removeBranchMenuItemActionPerformed

    private void removeStepInFromeFlightMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStepInFromeFlightMenuItemActionPerformed
        removeStepInFromeFlight frmRemovestepInFromeFlight = new removeStepInFromeFlight(view, myDesktopPane);
        myDesktopPane.add(frmRemovestepInFromeFlight);
        frmRemovestepInFromeFlight.show();
    }//GEN-LAST:event_removeStepInFromeFlightMenuItemActionPerformed

    private void removeEmployeeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEmployeeMenuItemActionPerformed
        removeEmployee frmRemoveEmployee = new removeEmployee(view, myDesktopPane);
        myDesktopPane.add(frmRemoveEmployee);
        frmRemoveEmployee.show();
    }//GEN-LAST:event_removeEmployeeMenuItemActionPerformed

    @SuppressWarnings("unused")
	private void AboutUsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutUsMenuItemActionPerformed
        AboutFrame frmAbout = new AboutFrame();
    }//GEN-LAST:event_AboutUsMenuItemActionPerformed

    private void removeCustomerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCustomerMenuItemActionPerformed
        removeCustomer frmRemoveCustomer = new removeCustomer(view, myDesktopPane);
        myDesktopPane.add(frmRemoveCustomer);
        frmRemoveCustomer.show();
    }//GEN-LAST:event_removeCustomerMenuItemActionPerformed

    private void removeFlightMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFlightMenuItemActionPerformed
        removeFlight frmRemoveFlight = new removeFlight(view, myDesktopPane);
        myDesktopPane.add(frmRemoveFlight);
        frmRemoveFlight.show();
    }//GEN-LAST:event_removeFlightMenuItemActionPerformed

    private void getAllSummerFlightsSortedByNumberOfStopsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAllSummerFlightsSortedByNumberOfStopsMenuItemActionPerformed
        getAllSummerFlightsSortedByNumberOfStops frmAllSummerFlightsSortedByNumberOfStops = new getAllSummerFlightsSortedByNumberOfStops(view, myDesktopPane);
        myDesktopPane.add(frmAllSummerFlightsSortedByNumberOfStops);
        frmAllSummerFlightsSortedByNumberOfStops.show();
    }//GEN-LAST:event_getAllSummerFlightsSortedByNumberOfStopsMenuItemActionPerformed

    private void UsersMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsersMenuItemActionPerformed
        DisplayUsers frmDisplayUsers = new DisplayUsers(view, myDesktopPane);
        myDesktopPane.add(frmDisplayUsers);
        frmDisplayUsers.show();
    }//GEN-LAST:event_UsersMenuItemActionPerformed

    private void getAllThisSummerFlightsByLocationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAllThisSummerFlightsByLocationMenuItemActionPerformed
        getAllThisSummerFlightsByLocation frmAllThisSummerFlightsByLocation = new getAllThisSummerFlightsByLocation(view, myDesktopPane);
        myDesktopPane.add(frmAllThisSummerFlightsByLocation);
        frmAllThisSummerFlightsByLocation.show();
    }//GEN-LAST:event_getAllThisSummerFlightsByLocationMenuItemActionPerformed

    private void getPotentialCustomersForAgentsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPotentialCustomersForAgentsMenuItemActionPerformed
        getPotentialCustomersForAgents frmPotentialCustomersForAgents = new getPotentialCustomersForAgents(view, myDesktopPane);
        myDesktopPane.add(frmPotentialCustomersForAgents);
        frmPotentialCustomersForAgents.show();
    }//GEN-LAST:event_getPotentialCustomersForAgentsMenuItemActionPerformed

    private void getPotentialCustomersForBranchMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPotentialCustomersForBranchMenuItemActionPerformed
        getPotentialCustomersForBranch frmPotentialCustomersForBranch = new getPotentialCustomersForBranch(view, myDesktopPane);
        myDesktopPane.add(frmPotentialCustomersForBranch);
        frmPotentialCustomersForBranch.show();
    }//GEN-LAST:event_getPotentialCustomersForBranchMenuItemActionPerformed

    private void getBranchesAgentsSortedByRatingMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getBranchesAgentsSortedByRatingMenuItemActionPerformed
        getBranchesAgentsSortedByRating frmBranchesAgentsSortedByRating = new getBranchesAgentsSortedByRating(view, myDesktopPane);
        myDesktopPane.add(frmBranchesAgentsSortedByRating);
        frmBranchesAgentsSortedByRating.show();
    }//GEN-LAST:event_getBranchesAgentsSortedByRatingMenuItemActionPerformed

    private void findTheBestFlightBackMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findTheBestFlightBackMenuItemActionPerformed
        findTheBestFlightBack frmBestFlightBack = new findTheBestFlightBack(view, myDesktopPane);
        myDesktopPane.add(frmBestFlightBack);
        frmBestFlightBack.show();
    }//GEN-LAST:event_findTheBestFlightBackMenuItemActionPerformed

    private void editBranchDetailsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBranchDetailsMenuItemActionPerformed
        editBranchDetails frmBranchDetails = new editBranchDetails(view, myDesktopPane);
        myDesktopPane.add(frmBranchDetails);
        frmBranchDetails.show();
    }//GEN-LAST:event_editBranchDetailsMenuItemActionPerformed

    private void editCustomerDetailsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCustomerDetailsMenuItemActionPerformed
        editCustomerDetails frmCustomerDetails = new editCustomerDetails(view, myDesktopPane);
        myDesktopPane.add(frmCustomerDetails);
        frmCustomerDetails.show();
    }//GEN-LAST:event_editCustomerDetailsMenuItemActionPerformed

    private void editFlightDetailsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editFlightDetailsMenuItemActionPerformed
        editFlightDetails frmEditFlightDetails = new editFlightDetails(view, myDesktopPane);
        myDesktopPane.add(frmEditFlightDetails);
        frmEditFlightDetails.show();
    }//GEN-LAST:event_editFlightDetailsMenuItemActionPerformed

    private void editFlightAttendantDetailsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editFlightAttendantDetailsMenuItemActionPerformed
        editFlightAttendantDetails frmEditFlightAttendantDetails = new editFlightAttendantDetails(view, myDesktopPane);
        myDesktopPane.add(frmEditFlightAttendantDetails);
        frmEditFlightAttendantDetails.show();
    }//GEN-LAST:event_editFlightAttendantDetailsMenuItemActionPerformed

    private void editAgentDetailsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAgentDetailsMenuItemActionPerformed
        editAgentDetails frmEditAgentDetails = new editAgentDetails(view, myDesktopPane);
        myDesktopPane.add(frmEditAgentDetails);
        frmEditAgentDetails.show();
    }//GEN-LAST:event_editAgentDetailsMenuItemActionPerformed

    private void editPilotDetailsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPilotDetailsMenuItemActionPerformed
        editPilotDetails frmEditPilotDetails = new editPilotDetails(view, myDesktopPane);
        myDesktopPane.add(frmEditPilotDetails);
        frmEditPilotDetails.show();
    }//GEN-LAST:event_editPilotDetailsMenuItemActionPerformed

    private void cancelOrderMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrderMenuItemActionPerformed
        cancelOrder frmCancelOrder = new cancelOrder(view, myDesktopPane);
        myDesktopPane.add(frmCancelOrder);
        frmCancelOrder.show();
    }//GEN-LAST:event_cancelOrderMenuItemActionPerformed

    private void tbFlightsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFlightsMousePressed
        try{
            Flight flight = view.getFlights().get(Integer.parseInt(tbFlights.getModel().getValueAt(tbFlights.getSelectedRow(), 0).toString()));
            ShowChoice ev = new ShowChoice(this, rootPaneCheckingEnabled, myDesktopPane, flight);
            ev.setVisible(true);
            
        }catch (Exception e){
            view.sound("/sounds/errorSound.wav");
            JOptionPane.showMessageDialog(null, "Sorry flight details are not available!", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }
    }//GEN-LAST:event_tbFlightsMousePressed

    @SuppressWarnings("unused")
	private void officialSiteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_officialSiteMenuItemActionPerformed
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://www.ifly.com/"));
        } catch (IOException e) {
            e.getMessage();
            SoundClass sound = new SoundClass("/sounds/errorSound.wav");
            JOptionPane.showMessageDialog(null, "The Link is broken", "Link Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_officialSiteMenuItemActionPerformed

    private void tbBranchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBranchMousePressed
        try{
            Branch branch = view.getBranches().get(Integer.parseInt(tbBranch.getModel().getValueAt(tbBranch.getSelectedRow(), 1).toString()));
            ShowChoice ev = new ShowChoice(this, rootPaneCheckingEnabled, myDesktopPane, branch);
            ev.setVisible(true);
        }catch (Exception e){
            view.sound("/sounds/errorSound.wav");
            JOptionPane.showMessageDialog(null, "Sorry branch details are not available!", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }
    }//GEN-LAST:event_tbBranchMousePressed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        flightsTable();
        branchTable();
    }//GEN-LAST:event_formWindowGainedFocus

    private void CustomerOrdersMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerOrdersMenuItemActionPerformed
        CustomerOrders frmCustomerOrders = new CustomerOrders(view, myDesktopPane, UserType);
        myDesktopPane.add(frmCustomerOrders);
        frmCustomerOrders.show();
    }//GEN-LAST:event_CustomerOrdersMenuItemActionPerformed


//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DesktopFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DesktopFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DesktopFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DesktopFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DesktopFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AboutMenu;
    private javax.swing.JMenuItem AboutUsMenuItem;
    private javax.swing.JMenuItem AgentToBranchMenuItem;
    private javax.swing.JMenuItem CustomerOrdersMenuItem;
    private javax.swing.JMenuItem CustomerPayingOrderMenuItem;
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenuItem ExitMenuItem;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenuItem LogOutMenuItem;
    private javax.swing.JMenuItem StepinToFlightMenuItem;
    private javax.swing.JMenuItem UsersMenuItem;
    private javax.swing.JMenuItem addFlightTicketToFlightOrderMenuItem;
    private javax.swing.JMenuItem addFlightToOrderMenuItem;
    private javax.swing.JMenu addMenu;
    private javax.swing.JMenuItem addPilotOrFlightAttendantToFlightMenuItem;
    private javax.swing.JMenuItem agentMenuItem;
    private javax.swing.JMenuItem branchMenuItem;
    private javax.swing.JMenuItem cancelOrderMenuItem;
    private javax.swing.JMenuItem changeCustomerAddress;
    private javax.swing.JMenu connectMenu;
    private javax.swing.JMenuItem customerMenuItem;
    private javax.swing.JMenuItem editAgentDetailsMenuItem;
    private javax.swing.JMenuItem editBranchDetailsMenuItem;
    private javax.swing.JMenuItem editCustomerDetailsMenuItem;
    private javax.swing.JMenuItem editFlightAttendantDetailsMenuItem;
    private javax.swing.JMenuItem editFlightDetailsMenuItem;
    private javax.swing.JMenuItem editPilotDetailsMenuItem;
    private javax.swing.JMenuItem employeeOfTheMonthMenuItem;
    private javax.swing.JMenuItem findTheBestFlightBackMenuItem;
    private javax.swing.JMenuItem flightAttendantMenuItem;
    private javax.swing.JMenuItem flightMenuItem;
    private javax.swing.JMenuItem getAllOrdersOfMostProfitableCustomerMenuItem;
    private javax.swing.JMenuItem getAllSummerFlightsSortedByNumberOfStopsMenuItem;
    private javax.swing.JMenuItem getAllSuperAgentsMenuItem;
    private javax.swing.JMenuItem getAllThisSummerFlightsByLocationMenuItem;
    private javax.swing.JMenuItem getAllThisSummerWorkEmployeesSortedBySeniorityMenuItem;
    private javax.swing.JMenuItem getBranchesAgentsSortedByRatingMenuItem;
    private javax.swing.JMenuItem getPotentialCustomersForAgentsMenuItem;
    private javax.swing.JMenuItem getPotentialCustomersForBranchMenuItem;
    private javax.swing.JMenuItem getTheMostProfitableOrderMenuItem;
    private javax.swing.JMenuItem getTheTopXPopularFlightsMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuBar menuBar;
    private view.MyDesktopPane myDesktopPane;
    private javax.swing.JMenuItem officialSiteMenuItem;
    private javax.swing.JMenuItem pilotMenuItem;
    private javax.swing.JMenuItem removeBranchMenuItem;
    private javax.swing.JMenuItem removeCustomerMenuItem;
    private javax.swing.JMenuItem removeEmployeeMenuItem;
    private javax.swing.JMenuItem removeFlightMenuItem;
    private javax.swing.JMenu removeMenu;
    private javax.swing.JMenuItem removeStepInFromeFlightMenuItem;
    private javax.swing.JMenu reportsMenu;
    private javax.swing.JTextField taDateAndTime;
    private javax.swing.JTextArea taLogName;
    private javax.swing.JTable tbBranch;
    private javax.swing.JTable tbFlights;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/adminIcon.png")));
    }
}
