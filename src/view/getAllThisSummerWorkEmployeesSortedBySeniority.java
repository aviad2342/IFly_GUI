/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import core.Agent;
import core.Employee;
import core.FlightAttendant;
import core.Pilot;

import java.awt.Dimension;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import utils.TableColumnAdjuster;

/**
 *
 * @author Aviad
 */
@SuppressWarnings("serial")
public class getAllThisSummerWorkEmployeesSortedBySeniority extends javax.swing.JInternalFrame {
    //***************************************** Variables *********************************************
    /**view field*/
    private ViewLogic view;
    /**MyDesktopPane field*/
    private MyDesktopPane myDesk;
    //**************************************** Constructor ********************************************
    /**
     * Creates new form getAllThisSummerWorkEmployeesSortedBySeniority
     * @param view
     * @param myDesk
     */
    public getAllThisSummerWorkEmployeesSortedBySeniority(ViewLogic view, MyDesktopPane myDesk) {
        this.view = view;
        this.myDesk = myDesk;
        setTitle("This Summer Employees"); //the title of the frame
        Dimension desktopSize = myDesk.getSize();   // the size of the desktopPane
        initComponents();
        setLocation(((desktopSize.width-this.getSize().width) / 2) , ((desktopSize.height-this.getSize().height) / 2));    // centering the frame on screen
        updateTables();
    }

    private void updateTables() {
       if(!view.getAllThisSummerWorkEmployeesSortedBySeniority().isEmpty()){
           DefaultTableModel modle = new DefaultTableModel(new String[]{"Employee Type", "Employee Number", "First Name", "Last Name", "Birth Date", "Start Working Date", "Password", "Is Herald/License Type/Number Of Orders"},0);
           tabAllSummerEmployees.setModel(modle);
           tabAllSummerEmployees.setShowGrid(true);
        view.sound("/sounds/okSound.wav");    
        for(Employee e : view.getAllThisSummerWorkEmployeesSortedBySeniority()){
            if(e instanceof Pilot){
                modle.addRow(new Object[]{e.getClass().getSimpleName(), e.getEmployeeNumber(), e.getFirstName(), e.getLastName(), e.getBirthDate(),e.getStartWorkingDate(), e.getPassword(),"License Type: "+((Pilot)e).getLicenseType().toString()});
            }
            if(e instanceof FlightAttendant){
                modle.addRow(new Object[]{e.getClass().getSimpleName(), e.getEmployeeNumber(), e.getFirstName(), e.getLastName(), e.getBirthDate(),e.getStartWorkingDate(), e.getPassword(),"Is Herald: "+((FlightAttendant)e).isHerald()});
            }
            if(e instanceof Agent){
                modle.addRow(new Object[]{e.getClass().getSimpleName(), e.getEmployeeNumber(), e.getFirstName(), e.getLastName(), e.getBirthDate(),e.getStartWorkingDate(), e.getPassword(),"Number Of Orders: "+((Agent)e).getOrders().size()});
            } 
        }
        TableColumnAdjuster tca = new TableColumnAdjuster(tabAllSummerEmployees);
        tca.adjustColumns(); 
       }  else {
            view.sound("/sounds/errorSound.wav"); 
            JOptionPane.showMessageDialog(null, "Sorry no Employees was found ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
            dispose();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabAllSummerEmployees = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rehr_affiliates_main.png"))); // NOI18N

        tabAllSummerEmployees.setBackground(new java.awt.Color(102, 102, 102));
        tabAllSummerEmployees.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabAllSummerEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emploee Type", "Emploee Number", "First Name", "Last Name", "Birth Date", "Start Working Date", "Password", "Is Herald / License Type/Number Of Orders"
            }
        ) {
            @SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            @SuppressWarnings("rawtypes")
			public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabAllSummerEmployees.setToolTipText("Press to watch employee details");
        tabAllSummerEmployees.setAutoscrolls(false);
        tabAllSummerEmployees.setCellSelectionEnabled(true);
        tabAllSummerEmployees.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabAllSummerEmployees.setGridColor(new java.awt.Color(0, 0, 0));
        tabAllSummerEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabAllSummerEmployeesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabAllSummerEmployees);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rewarding-employees-ethical-behavior.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1141, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabAllSummerEmployeesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAllSummerEmployeesMousePressed
          try{
              Employee employee = view.getEmployees().get(Integer.parseInt(tabAllSummerEmployees.getModel().getValueAt(tabAllSummerEmployees.getSelectedRow(), 1).toString()));
              
              ShowChoice ev = new ShowChoice(null, closable, myDesk, employee);
              ev.setVisible(true);

          }catch (Exception e){
              view.sound("/sounds/errorSound.wav");
            JOptionPane.showMessageDialog(null, "Sorry this employee details are not available!", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
          }
    }//GEN-LAST:event_tabAllSummerEmployeesMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabAllSummerEmployees;
    // End of variables declaration//GEN-END:variables
}