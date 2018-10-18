/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import core.Flight;

import java.awt.Dimension;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Aviad
 */
@SuppressWarnings("serial")
public class editFlightDetails extends javax.swing.JInternalFrame {
    //***************************************** Variables *********************************************
    /**view field*/
    private ViewLogic view;
    /**MyDesktopPane field*/
    private MyDesktopPane myDesk;
    //**************************************** Constructor ********************************************
    /**
     * Creates new form editFlightDetails
     * @param view
     * @param myDesk
     */
    public editFlightDetails(ViewLogic view, MyDesktopPane myDesk) {
        this.view = view;
        this.myDesk = myDesk;
        setTitle("Edit Flight Details"); //the title of the frame
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

        txtAirplaneNumber = new javax.swing.JTextField();
        FirstClassSeatsNumber = new javax.swing.JTextField();
        BusinessSeatsNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Airport = new javax.swing.JLabel();
        cbArrivalAirport = new javax.swing.JComboBox();
        cbDepartureAirport = new javax.swing.JComboBox();
        txtFlightCost = new javax.swing.JTextField();
        btnAddFlight = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TouristsClassSeatsNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbFlightNumber = new javax.swing.JComboBox();
        DateTimeDeparture = new com.toedter.calendar.JDateChooser();
        DateTimeArrival = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(102, 102, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/air_tickets.gif"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Arrival At:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Airplane:");

        Airport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Airport.setForeground(new java.awt.Color(0, 0, 51));
        Airport.setText("Departure From:");

        cbArrivalAirport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbArrivalAirport.setModel(new DefaultComboBoxModel(utils.E_Airports.values()));

        cbDepartureAirport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbDepartureAirport.setModel(new DefaultComboBoxModel(utils.E_Airports.values()));

        btnAddFlight.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddFlight.setText("OK");
        btnAddFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFlightActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("Number Of Seats In Tourists Class:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Departure Data And Time: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Number Of Seats In Business Class:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Flight Number:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Number Of Seats In First Class:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Flight Cost:");

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Airplane Number:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Arrival Date And Time:");

        cbFlightNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbFlightNumber.setModel(new DefaultComboBoxModel(view.getFlights().keySet().toArray())
        );
        cbFlightNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFlightNumberActionPerformed(evt);
            }
        });

        DateTimeDeparture.setDateFormatString("dd/MM/yyyy HH:mm:ss");

        DateTimeArrival.setDateFormatString("dd/MM/yyyy HH:mm:ss");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Airport)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FirstClassSeatsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAirplaneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BusinessSeatsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TouristsClassSeatsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbArrivalAirport, javax.swing.GroupLayout.Alignment.LEADING, 0, 109, Short.MAX_VALUE)
                                .addComponent(cbDepartureAirport, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFlightCost, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(cbFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateTimeDeparture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DateTimeArrival, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateTimeDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateTimeArrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFlightCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Airport)
                    .addComponent(cbDepartureAirport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbArrivalAirport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtAirplaneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(BusinessSeatsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(FirstClassSeatsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(TouristsClassSeatsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 106, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddFlight)
                            .addComponent(btnCancel))
                        .addGap(35, 35, 35))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFlightActionPerformed

        if(cbFlightNumber.getItemCount() <= 0 ){
            view.sound("/sounds/errorSound.wav");
            JOptionPane.showMessageDialog(null, "Sorry no flights found!", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
            dispose();
        }else if(DateTimeArrival.getDate().before(DateTimeDeparture.getDate())){
            view.sound("/sounds/errorSound.wav");
            JOptionPane.showMessageDialog(null, "The arrival date cant be before departure date please try again!", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
            DateTimeArrival.setDate(DateTimeDeparture.getDate());
        }else if(cbDepartureAirport.getSelectedItem().equals(cbArrivalAirport.getSelectedItem())){
            view.sound("/sounds/errorSound.wav");
            JOptionPane.showMessageDialog(null, "The departure airport and destination airport cant be the same!\nPleas try again", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
             view.editFlightDetails(cbFlightNumber, DateTimeDeparture, DateTimeArrival, txtFlightCost, cbDepartureAirport, cbArrivalAirport, txtAirplaneNumber, BusinessSeatsNumber, FirstClassSeatsNumber, TouristsClassSeatsNumber, this);
        }
    }//GEN-LAST:event_btnAddFlightActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cbFlightNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFlightNumberActionPerformed
        if(cbFlightNumber.getSelectedItem() != null){
            int flightNumber = (Integer)cbFlightNumber.getSelectedItem();
            Flight flight = view.getFlights().get(flightNumber);
            DateTimeDeparture.setDate(flight.getFlightDateAndTimeSource());
            DateTimeArrival.setDate(flight.getFlightDateAndTimeDestination());
            txtFlightCost.setText(String.valueOf(flight.getFlightCost()));
            cbDepartureAirport.setSelectedIndex(flight.getSource().ordinal());
            cbArrivalAirport.setSelectedIndex(flight.getDestination().ordinal());
            txtAirplaneNumber.setText(String.valueOf(flight.getAirplane().getAirplaneNumber()));
            BusinessSeatsNumber.setText(String.valueOf(flight.getAirplane().getNumberOfSeatsBusinessClass()));
            FirstClassSeatsNumber.setText(String.valueOf(flight.getAirplane().getNumberOfSeatsFirstClass()));
            TouristsClassSeatsNumber.setText(String.valueOf(flight.getAirplane().getNumberOfSeatsTouristsClass()));
        }else {
            view.sound("/sounds/errorSound.wav");
            JOptionPane.showMessageDialog(null, "You must choose a flight number", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }
    }//GEN-LAST:event_cbFlightNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Airport;
    private javax.swing.JTextField BusinessSeatsNumber;
    private com.toedter.calendar.JDateChooser DateTimeArrival;
    private com.toedter.calendar.JDateChooser DateTimeDeparture;
    private javax.swing.JTextField FirstClassSeatsNumber;
    private javax.swing.JTextField TouristsClassSeatsNumber;
    private javax.swing.JButton btnAddFlight;
    private javax.swing.JButton btnCancel;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox cbArrivalAirport;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox cbDepartureAirport;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox cbFlightNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAirplaneNumber;
    private javax.swing.JTextField txtFlightCost;
    // End of variables declaration//GEN-END:variables
}