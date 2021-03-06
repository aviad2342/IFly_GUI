/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.Dimension;

/**
 *
 * @author Aviad
 */
@SuppressWarnings("serial")
public class getAllOrdersOfMostProfitableCustomer extends javax.swing.JInternalFrame {
    //***************************************** Variables *********************************************
    /**view field*/
    private ViewLogic view;
    /**MyDesktopPane field*/
    private MyDesktopPane myDesk;
    //**************************************** Constructor ********************************************
    /**
     * Creates new form getAllOrdersOfMostProfitableCustomer
     * @param view
     * @param myDesk
     */
    public getAllOrdersOfMostProfitableCustomer(ViewLogic view, MyDesktopPane myDesk) {
        this.view = view;
        this.myDesk = myDesk;
        setTitle("Orders Of The Most Profitable Customer"); //the title of the frame
        Dimension desktopSize = this.myDesk.getSize();   // the size of the desktopPane
        initComponents();
        setLocation(((desktopSize.width-this.getSize().width) / 2) , ((desktopSize.height-this.getSize().height) / 2));    // centering the frame on screen
        execute();
    }
    /**
     * initiate Orders Of The Most Profitable Customer
     */
    private void execute(){
        this.view.getAllOrdersOfMostProfitableCustomer(taAllOrdersOfMostProfitableCustomer, this);
        jScrollPane1.setOpaque(false);  // make the background transparent
        jScrollPane1.getViewport().setOpaque(false);
        taAllOrdersOfMostProfitableCustomer.setOpaque(false); 
        taAllOrdersOfMostProfitableCustomer.setCaretPosition(0);
    }
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taAllOrdersOfMostProfitableCustomer = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/22-512.png"))); // NOI18N

        taAllOrdersOfMostProfitableCustomer.setEditable(false);
        taAllOrdersOfMostProfitableCustomer.setBackground(new java.awt.Color(102, 102, 102));
        taAllOrdersOfMostProfitableCustomer.setColumns(20);
        taAllOrdersOfMostProfitableCustomer.setRows(5);
        taAllOrdersOfMostProfitableCustomer.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "All Orders Of Most Profitable Customer", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Agency FB", 1, 36), new java.awt.Color(0, 0, 51))); // NOI18N
        jScrollPane1.setViewportView(taAllOrdersOfMostProfitableCustomer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taAllOrdersOfMostProfitableCustomer;
    // End of variables declaration//GEN-END:variables
}
