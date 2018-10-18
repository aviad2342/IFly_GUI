/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import exceptions.NotInTheSystemYestException;
import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import utils.InputTestsStaticClass;

/**
 *
 * @author Aviad
 */
@SuppressWarnings("serial")
public class removeEmployee extends javax.swing.JInternalFrame {
    //***************************************** Variables *********************************************
    /**view field*/
    private ViewLogic view;
    /**MyDesktopPane field*/
    private MyDesktopPane myDesk;
    //**************************************** Constructor ********************************************
    /**
     * Creates new form removeEmployee
     * @param view
     * @param myDesk
     */
    public removeEmployee(ViewLogic view, MyDesktopPane myDesk) {
        this.view = view;
        this.myDesk = myDesk;
        setTitle("Remove Employee"); //the title of the frame
        Dimension desktopSize = this.myDesk.getSize();   // the size of the desktopPane
        initComponents();
        setLocation(((desktopSize.width-this.getSize().width) / 2) , ((desktopSize.height-this.getSize().height) / 2));    // centering the frame on screen
        cbPilots.setVisible(false);
        cbFlightAttendants.setVisible(false);
        cbAgents.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        rbAgent = new javax.swing.JRadioButton();
        rbPilot = new javax.swing.JRadioButton();
        rbFlightAttendant = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        cbAgents = new javax.swing.JComboBox();
        cbPilots = new javax.swing.JComboBox();
        cbFlightAttendants = new javax.swing.JComboBox();
        btnRemove = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taEmployeeName = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(102, 102, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove_business_user.png"))); // NOI18N

        rbAgent.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup.add(rbAgent);
        rbAgent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbAgent.setForeground(new java.awt.Color(0, 0, 51));
        rbAgent.setText("Agent");
        rbAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAgentActionPerformed(evt);
            }
        });

        rbPilot.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup.add(rbPilot);
        rbPilot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbPilot.setForeground(new java.awt.Color(0, 0, 51));
        rbPilot.setText("Pilot");
        rbPilot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPilotActionPerformed(evt);
            }
        });

        rbFlightAttendant.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup.add(rbFlightAttendant);
        rbFlightAttendant.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbFlightAttendant.setForeground(new java.awt.Color(0, 0, 51));
        rbFlightAttendant.setText("FlightAttendant");
        rbFlightAttendant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFlightAttendantActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Employee Number:");

        cbAgents.setModel(new DefaultComboBoxModel(view.getAllAgents()));
        cbAgents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAgentsActionPerformed(evt);
            }
        });

        cbPilots.setModel(new DefaultComboBoxModel(view.getAllPilots()));
        cbPilots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPilotsActionPerformed(evt);
            }
        });

        cbFlightAttendants.setModel(new DefaultComboBoxModel(view.getAllFlightAttendant()));
        cbFlightAttendants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFlightAttendantsActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemove.setText("OK");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        taEmployeeName.setEditable(false);
        taEmployeeName.setBackground(new java.awt.Color(153, 153, 153));
        taEmployeeName.setColumns(20);
        taEmployeeName.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        taEmployeeName.setRows(5);
        jScrollPane1.setViewportView(taEmployeeName);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(rbAgent)
                        .addGap(37, 37, 37)
                        .addComponent(rbPilot))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(38, 38, 38)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbAgents, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbFlightAttendants, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbPilots, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rbFlightAttendant)))))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbAgent)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbFlightAttendant)
                        .addComponent(rbPilot)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(cbAgents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFlightAttendants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPilots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove)
                    .addComponent(btnCancel))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPilotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPilotsActionPerformed
        taEmployeeName.setText("Employee Name: "+view.getEmployees().get((Integer)cbPilots.getSelectedItem()).getFirstName()+" "+view.getEmployees().get((Integer)cbPilots.getSelectedItem()).getLastName());
    }//GEN-LAST:event_cbPilotsActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int response;
        if(rbAgent.isSelected()){
             response = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove "+view.getEmployees().get((Integer)cbAgents.getSelectedItem()).getFirstName()+" "+view.getEmployees().get((Integer)cbAgents.getSelectedItem()).getLastName()+" from IFly ", "Add Error", JOptionPane.YES_NO_OPTION);
        }else if(rbPilot.isSelected()) {
              response = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove "+view.getEmployees().get((Integer)cbPilots.getSelectedItem()).getFirstName()+" "+view.getEmployees().get((Integer)cbPilots.getSelectedItem()).getLastName()+" from IFly ", "Add Error", JOptionPane.YES_NO_OPTION);
        }else if(rbFlightAttendant.isSelected()){
              response = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove "+view.getEmployees().get((Integer)cbFlightAttendants.getSelectedItem()).getFirstName()+" "+view.getEmployees().get((Integer)cbFlightAttendants.getSelectedItem()).getLastName()+" from IFly ", "Add Error", JOptionPane.YES_NO_OPTION);                           
        }else {
            response = JOptionPane.YES_OPTION;
        }
                if (response == JOptionPane.YES_OPTION) {
                    view.removeEmployee(cbAgents, cbPilots, cbFlightAttendants, rbAgent, rbPilot, rbFlightAttendant, this);
                } else {
                    dispose();
                }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void rbAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAgentActionPerformed
        cbPilots.setVisible(false);
        cbFlightAttendants.setVisible(false);
        cbAgents.setVisible(true);
        try{
           InputTestsStaticClass.notInSystem(cbAgents, "Flights");
        }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            rbAgent.setEnabled(false);
          }
    }//GEN-LAST:event_rbAgentActionPerformed

    private void rbPilotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPilotActionPerformed
        cbPilots.setVisible(true);
        cbFlightAttendants.setVisible(false);
        cbAgents.setVisible(false);
        try{
           InputTestsStaticClass.notInSystem(cbPilots, "pilots");
        }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            rbPilot.setEnabled(false);
          }
    }//GEN-LAST:event_rbPilotActionPerformed

    private void rbFlightAttendantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFlightAttendantActionPerformed
        cbPilots.setVisible(false);
        cbFlightAttendants.setVisible(true);
        cbAgents.setVisible(false);
        try{
           InputTestsStaticClass.notInSystem(cbFlightAttendants, "flightAttendans");
        }catch (NotInTheSystemYestException ex) {
            ex.getStackTrace();
            rbFlightAttendant.setEnabled(false);
          }
    }//GEN-LAST:event_rbFlightAttendantActionPerformed

    private void cbAgentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAgentsActionPerformed
        taEmployeeName.setText("Employee Name: "+view.getEmployees().get((Integer)cbAgents.getSelectedItem()).getFirstName()+" "+view.getEmployees().get((Integer)cbAgents.getSelectedItem()).getLastName());
    }//GEN-LAST:event_cbAgentsActionPerformed

    private void cbFlightAttendantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFlightAttendantsActionPerformed
        taEmployeeName.setText("Employee Name: "+view.getEmployees().get((Integer)cbFlightAttendants.getSelectedItem()).getFirstName()+" "+view.getEmployees().get((Integer)cbFlightAttendants.getSelectedItem()).getLastName());
    }//GEN-LAST:event_cbFlightAttendantsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRemove;
    private javax.swing.ButtonGroup buttonGroup;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox cbAgents;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox cbFlightAttendants;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox cbPilots;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbAgent;
    private javax.swing.JRadioButton rbFlightAttendant;
    private javax.swing.JRadioButton rbPilot;
    private javax.swing.JTextArea taEmployeeName;
    // End of variables declaration//GEN-END:variables
}
