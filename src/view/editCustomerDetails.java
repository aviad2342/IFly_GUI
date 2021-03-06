/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import core.Customer;

import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Aviad
 */
@SuppressWarnings("serial")
public class editCustomerDetails extends javax.swing.JInternalFrame {
    //***************************************** Variables *********************************************
    /**view field*/
    private ViewLogic view;
    /**MyDesktopPane field*/
    private MyDesktopPane myDesk;
    //**************************************** Constructor ********************************************
    /**
     * Creates new form editCustomerDetails
     * @param view
     * @param myDesk
     */
    public editCustomerDetails(ViewLogic view, MyDesktopPane myDesk) {
        this.view = view;
        this.myDesk = myDesk;
        setTitle("Edit Customer Details"); //the title of the frame
        Dimension desktopSize = this.myDesk.getSize();   // the size of the desktopPane
        initComponents();
        setLocation(((desktopSize.width-this.getSize().width) / 2) , ((desktopSize.height-this.getSize().height) / 2));    // centering the frame on screen
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        calDate = new com.toedter.calendar.JDateChooser();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        txtPhoneNumber2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPhoneNumber1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbCity = new javax.swing.JComboBox();
        txtStreet = new javax.swing.JTextField();
        txtHouseNumber = new javax.swing.JTextField();
        txtPhoneNum1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbPassNumber = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(102, 102, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customerdt.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("City:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("Street:");

        txtEmail.setText("http:\\\\");

            jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel10.setForeground(new java.awt.Color(0, 0, 51));
            jLabel10.setText("HouseNumber:");

            btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            btnAdd.setText("OK");
            btnAdd.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnAddActionPerformed(evt);
                }
            });

            jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel9.setForeground(new java.awt.Color(0, 0, 51));
            jLabel9.setText("Country:");

            btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            btnCancel.setText("Cancel");
            btnCancel.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnCancelActionPerformed(evt);
                }
            });

            jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(0, 0, 51));
            jLabel6.setText("Password:");

            jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(0, 0, 51));
            jLabel5.setText("Birth Date:");

            jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(0, 0, 51));
            jLabel8.setText("Address:");

            jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(0, 0, 51));
            jLabel7.setText("E-mail Address:");

            jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(0, 0, 51));
            jLabel1.setText("Passport Number:");

            jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 0, 51));
            jLabel2.setText("Balance:");

            txtPhoneNumber1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            txtPhoneNumber1.setForeground(new java.awt.Color(0, 0, 51));
            txtPhoneNumber1.setText("Phone Number 1:");

            jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(0, 0, 51));
            jLabel3.setText("First Name:");

            jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(0, 0, 51));
            jLabel4.setText("Last Name:");

            cbCity.setModel(new DefaultComboBoxModel(utils.E_Cities.values()));
            cbCity.setToolTipText("Choose  city");
            cbCity.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

            jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            jLabel14.setForeground(new java.awt.Color(0, 0, 51));
            jLabel14.setText("Phone Number 2:");

            cbPassNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            cbPassNumber.setModel(new DefaultComboBoxModel(view.getCustomers().keySet().toArray())
            );
            cbPassNumber.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cbPassNumberActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(267, 267, 267)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addGap(55, 55, 55)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(calDate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cbPassNumber, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtBalance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel11))
                                            .addGap(62, 62, 62)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtStreet, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                                .addComponent(txtCountry)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(116, 116, 116)
                                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(txtPhoneNumber1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtPhoneNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel14))))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPhoneNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(45, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbPassNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(11, 11, 11))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(calDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addComponent(jLabel8)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(cbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel10)
                        .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPhoneNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(txtPhoneNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPhoneNumber1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd)
                        .addComponent(btnCancel))
                    .addGap(27, 27, 27))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(cbPassNumber.getItemCount() > 0 ){
        view.editCustomerDetails(cbPassNumber, txtBalance, txtFirstName, txtLastName, calDate, txtPassword, txtEmail, txtCountry, cbCity, txtStreet, txtHouseNumber, txtPhoneNum1, txtPhoneNumber2, this);
        }else {
            view.sound("/sounds/errorSound.wav");
            JOptionPane.showMessageDialog(null, "Sorry no customers found!", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
            dispose();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cbPassNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPassNumberActionPerformed
        if(cbPassNumber.getSelectedItem()!= null ){
            String customerNumber = (String)cbPassNumber.getSelectedItem();
            Customer customer = view.getCustomers().get(customerNumber);
            txtBalance.setText(String.valueOf(customer.getBalance()));
            txtFirstName.setText(customer.getFirstName());
            txtLastName.setText(customer.getLastName());
            calDate.setDate(customer.getBirthDate());
            txtPassword.setText(customer.getPassword());
            txtEmail.setText(customer.getEmail().toString());
            txtCountry.setText(customer.getCustomerAddress().getCountry()); 
            cbCity.setSelectedIndex(customer.getCustomerAddress().getCity().ordinal());
            txtStreet.setText(customer.getCustomerAddress().getStreet());
            txtHouseNumber.setText(String.valueOf(customer.getCustomerAddress().getHouseNumber()));
            txtPhoneNum1.setText(customer.getCustomerAddress().getPhoneNumber()[0]);
            if(customer.getCustomerAddress().getPhoneNumber()[1] != null){
            txtPhoneNumber2.setText(customer.getCustomerAddress().getPhoneNumber()[1]);
            }
        }else {
            view.sound("/sounds/errorSound.wav");
            JOptionPane.showMessageDialog(null, "You must choose a customer number", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }
    }//GEN-LAST:event_cbPassNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private com.toedter.calendar.JDateChooser calDate;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox cbCity;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox cbPassNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHouseNumber;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNum1;
    private javax.swing.JLabel txtPhoneNumber1;
    private javax.swing.JTextField txtPhoneNumber2;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables
}
