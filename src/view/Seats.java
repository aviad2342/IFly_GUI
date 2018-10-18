/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import core.FlightOrder;
import core.FlightOrder.FlightTicket;

import java.awt.Toolkit;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import utils.E_ClassType;

/**
 *
 * @author Aviad
 */
@SuppressWarnings("serial")
public class Seats extends javax.swing.JDialog {
    //***************************************** Variables *********************************************
    /**view field*/
    private ViewLogic view;
    /**MyDesktopPane field*/
    @SuppressWarnings("unused")
	private MyDesktopPane myDesk;
    /**Buttons map*/
    HashMap<Integer,JButton> buttons = new HashMap<>();
    /**Seat number field*/
    private int seat;
    /**Row number field*/
    private int row;
    /**E_ClassType field*/
    private E_ClassType type;
    /**Flg field*/
    private int flg = 0;
    //**************************************** Constructor ********************************************
    /**
     * Creates new form Seats
     * @param parent 
     * @param modal 
     * @param myDesk 
     * @param view 
     * @param flightNumber
     */
    public Seats(java.awt.Frame parent, boolean modal,MyDesktopPane myDesk, ViewLogic view, int flightNumber) {
        super(parent, modal);
        this.view = view;
        this.myDesk = myDesk;
        setTitle("Select Seat"); //the title of the frame
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/seaticon.png")));
        initComponents();
        setLocation(465 ,260); // set the Location on screen
        // add Buttons to the Buttons map
       buttons.put(1, Button1);
       buttons.put(2, Button2);
       buttons.put(3, Button3);
       buttons.put(4, Button4);
       buttons.put(5, Button5);
       buttons.put(6, Button6);
       buttons.put(7, Button7);
       buttons.put(8, Button8);
       buttons.put(9, Button9);
       buttons.put(10, Button10);
       buttons.put(11, Button11);
       buttons.put(12, Button12);
       buttons.put(13, Button13);
       buttons.put(14, Button14);
       buttons.put(15, Button15);
       buttons.put(16, Button16);
       buttons.put(17, Button17);
       buttons.put(18, Button18);
       buttons.put(19, Button19);
       buttons.put(20, Button20);
       buttons.put(21, Button21);
       buttons.put(22, Button22);
       buttons.put(23, Button23);
       buttons.put(24, Button24);
       buttons.put(25, Button25);
       buttons.put(26, Button26);
       buttons.put(27, Button27);
       buttons.put(28, Button28);
       buttons.put(29, Button29);
       buttons.put(30, Button30);
       buttons.put(31, Button31);
       buttons.put(32, Button32);
       buttons.put(33, Button33);
       buttons.put(34, Button34);
       buttons.put(35, Button35);
       buttons.put(36, Button36);
       buttons.put(37, Button37);
       buttons.put(38, Button38);
       buttons.put(39, Button39);
       buttons.put(40, Button40);
       buttons.put(41, Button41);
       buttons.put(42, Button42);
       buttons.put(43, Button43);
       buttons.put(44, Button44);
       buttons.put(45, Button45);
       buttons.put(46, Button46);
       buttons.put(47, Button47);
       buttons.put(48, Button48);
       buttons.put(49, Button49);
       buttons.put(50, Button50);
       buttons.put(51, Button51);
       buttons.put(52, Button52);
       buttons.put(53, Button53);
       buttons.put(54, Button54);
       buttons.put(55, Button55);
       buttons.put(56, Button56);
       buttons.put(57, Button57);
       buttons.put(58, Button58);
       buttons.put(59, Button59);
       buttons.put(60, Button60);
       buttons.put(61, Button61);
       buttons.put(62, Button62);
       buttons.put(63, Button63);
       buttons.put(64, Button64);
       buttons.put(65, Button65);
       buttons.put(66, Button66);
       buttons.put(67, Button67);
       buttons.put(68, Button68);
       buttons.put(69, Button69);
       buttons.put(70, Button70);
       buttons.put(71, Button71);
       buttons.put(72, Button72);
       buttons.put(73, Button73);
       buttons.put(74, Button74);
       buttons.put(75, Button75);
       buttons.put(76, Button76);
       buttons.put(77, Button77);
       buttons.put(78, Button78);
       buttons.put(79, Button79);
       buttons.put(80, Button80);
       buttons.put(81, Button81);
       buttons.put(82, Button82);
       buttons.put(83, Button83);
       buttons.put(84, Button84);
       buttons.put(85, Button85);
       buttons.put(86, Button86);
       buttons.put(87, Button87);
       buttons.put(88, Button88);
       buttons.put(89, Button89);
       buttons.put(90, Button90);
       buttons.put(91, Button91);
       buttons.put(92, Button92);
       buttons.put(93, Button93);
       buttons.put(94, Button94);
       buttons.put(95, Button95);
       buttons.put(96, Button96);
       buttons.put(97, Button97);
       buttons.put(98, Button98);
       buttons.put(99, Button99);
       buttons.put(100, Button100);
       buttons.put(101, Button101);
       buttons.put(102, Button102);
       buttons.put(103, Button103);
       buttons.put(104, Button104);
       buttons.put(105, Button105);
       buttons.put(106, Button106);
       buttons.put(107, Button107);
       buttons.put(108, Button108);
       buttons.put(109, Button109);
       buttons.put(110, Button110);
       buttons.put(111, Button111);
       buttons.put(112, Button112);
       buttons.put(113, Button113);
       buttons.put(114, Button114);
       buttons.put(115, Button115);
       buttons.put(116, Button116);
       buttons.put(117, Button117);
       buttons.put(118, Button118);
       buttons.put(119, Button119);
       buttons.put(120, Button120);
       buttons.put(121, Button121);
       buttons.put(122, Button122);
       buttons.put(123, Button123);
       buttons.put(124, Button124);
       buttons.put(125, Button125);
       buttons.put(126, Button126);
       buttons.put(127, Button127);
       buttons.put(128, Button128);
       buttons.put(129, Button129);
       buttons.put(130, Button130);
       buttons.put(131, Button131);
       buttons.put(132, Button132);
       buttons.put(133, Button133);
       buttons.put(134, Button134);
       buttons.put(135, Button135);
       buttons.put(136, Button136);
       buttons.put(137, Button137);
       buttons.put(138, Button138);
       buttons.put(139, Button139);
       buttons.put(140, Button140);
       buttons.put(141, Button141);
       buttons.put(142, Button142);
       buttons.put(143, Button143);
       buttons.put(144, Button144);
       buttons.put(145, Button145);
       buttons.put(146, Button146);
       buttons.put(147, Button147);
       buttons.put(148, Button148);
       buttons.put(149, Button149);
       buttons.put(150, Button150);
       buttons.put(151, Button151);
       buttons.put(152, Button152);
       buttons.put(153, Button153);
       buttons.put(154, Button154);
       buttons.put(155, Button155);
       buttons.put(156, Button156);
       buttons.put(157, Button157);
       buttons.put(158, Button158);
       buttons.put(159, Button159);
       buttons.put(160, Button160);
       buttons.put(161, Button161);
       buttons.put(162, Button162);
       buttons.put(163, Button163);
       buttons.put(164, Button164);
       buttons.put(165, Button165);
       buttons.put(166, Button166);
       buttons.put(167, Button167);
       buttons.put(168, Button168);
       buttons.put(169, Button169);
       buttons.put(170, Button170);
       buttons.put(171, Button171);
       buttons.put(172, Button172);
       buttons.put(173, Button173);
       buttons.put(174, Button174);
       buttons.put(175, Button175);
       buttons.put(176, Button176);
       buttons.put(177, Button177);
       buttons.put(178, Button178);
       buttons.put(179, Button179);
       buttons.put(180, Button180);
       buttons.put(181, Button181);
       buttons.put(182, Button182);
       buttons.put(183, Button183);
       buttons.put(184, Button184);
       buttons.put(185, Button185);
       buttons.put(186, Button186);
       buttons.put(187, Button187);
       buttons.put(188, Button188);
       buttons.put(189, Button189);
       buttons.put(190, Button190);
       buttons.put(191, Button191);
       buttons.put(192, Button192);
       buttons.put(193, Button193);
       buttons.put(194, Button194);
       buttons.put(195, Button195);
       buttons.put(196, Button196);
       buttons.put(197, Button197);
       buttons.put(198, Button198);
       buttons.put(199, Button199);
       buttons.put(200, Button200);

       //set the number of available seat in first class
       if(view.getFlights().get(flightNumber).getAirplane().getNumberOfSeatsFirstClass()< 48){
           int seatDisabledF =  view.getFlights().get(flightNumber).getAirplane().getNumberOfSeatsFirstClass();
       for(int s = 48; s > seatDisabledF ; s--){
           buttons.get(s).setEnabled(false);
        }
       }
       //set the number of available seat in business class
       if(view.getFlights().get(flightNumber).getAirplane().getNumberOfSeatsBusinessClass() < 72){
           int seatDisabledB = view.getFlights().get(flightNumber).getAirplane().getNumberOfSeatsBusinessClass();
       for(int j = 120 ; j > seatDisabledB+48; j--){
           buttons.get(j).setEnabled(false);
        }
       }
       //set the number of available seat in tourists class
       if(view.getFlights().get(flightNumber).getAirplane().getNumberOfSeatsTouristsClass() < 80){
           int seatDisabledC =  view.getFlights().get(flightNumber).getAirplane().getNumberOfSeatsTouristsClass();
       for(int k = 200 ; k > seatDisabledC+120; k--){
           buttons.get(k).setEnabled(false);
        }
       }
       //set the icon for not available seats
        for(FlightOrder o : view.getFlights().get(flightNumber).getFlightOrders()){
            for(FlightTicket t : o.getTickets()){
                int notAvailableSeats = ((t.getRow()-1)*8)+t.getSeat();
                if(buttons.containsKey(notAvailableSeats))
                    buttons.get(notAvailableSeats).setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png"))); 
                    buttons.get(notAvailableSeats).setName("taken");
            }
        }
    }
    /**
     * Seat number getter
     * @return seat
     */
    public int getSeat(){
        return this.seat;
    }
    /**
     * Row number getter
     * @return row
     */
    public int getRow(){
        return this.row;
    }
    /**
     * Class type getter
     * @return type
     */
    public E_ClassType getClassType(){
        return this.type;
    }
    /**
     * flg getter
     * @return flg
     */
    public int getFlg(){
        return this.flg;
    }
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button8 = new javax.swing.JButton();
        Button37 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button32 = new javax.swing.JButton();
        Button26 = new javax.swing.JButton();
        Button10 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button53 = new javax.swing.JButton();
        Button16 = new javax.swing.JButton();
        Button15 = new javax.swing.JButton();
        Button30 = new javax.swing.JButton();
        Button14 = new javax.swing.JButton();
        Button13 = new javax.swing.JButton();
        Button12 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button54 = new javax.swing.JButton();
        Button11 = new javax.swing.JButton();
        Button18 = new javax.swing.JButton();
        Button17 = new javax.swing.JButton();
        Button19 = new javax.swing.JButton();
        Button20 = new javax.swing.JButton();
        Button21 = new javax.swing.JButton();
        Button22 = new javax.swing.JButton();
        Button52 = new javax.swing.JButton();
        Button23 = new javax.swing.JButton();
        Button24 = new javax.swing.JButton();
        Button31 = new javax.swing.JButton();
        Button29 = new javax.swing.JButton();
        Button28 = new javax.swing.JButton();
        Button25 = new javax.swing.JButton();
        Button27 = new javax.swing.JButton();
        Button51 = new javax.swing.JButton();
        Button34 = new javax.swing.JButton();
        Button35 = new javax.swing.JButton();
        Button39 = new javax.swing.JButton();
        Button40 = new javax.swing.JButton();
        Button43 = new javax.swing.JButton();
        Button44 = new javax.swing.JButton();
        Button50 = new javax.swing.JButton();
        Button38 = new javax.swing.JButton();
        Button36 = new javax.swing.JButton();
        Button45 = new javax.swing.JButton();
        Button46 = new javax.swing.JButton();
        Button47 = new javax.swing.JButton();
        Button42 = new javax.swing.JButton();
        Button188 = new javax.swing.JButton();
        Button190 = new javax.swing.JButton();
        Button200 = new javax.swing.JButton();
        Button189 = new javax.swing.JButton();
        Button49 = new javax.swing.JButton();
        Button55 = new javax.swing.JButton();
        Button192 = new javax.swing.JButton();
        Button48 = new javax.swing.JButton();
        Button199 = new javax.swing.JButton();
        Button191 = new javax.swing.JButton();
        Button57 = new javax.swing.JButton();
        Button187 = new javax.swing.JButton();
        Button61 = new javax.swing.JButton();
        Button33 = new javax.swing.JButton();
        Button56 = new javax.swing.JButton();
        Button58 = new javax.swing.JButton();
        Button41 = new javax.swing.JButton();
        Button60 = new javax.swing.JButton();
        Button63 = new javax.swing.JButton();
        Button59 = new javax.swing.JButton();
        Button64 = new javax.swing.JButton();
        Button62 = new javax.swing.JButton();
        Button66 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button67 = new javax.swing.JButton();
        Button68 = new javax.swing.JButton();
        Button69 = new javax.swing.JButton();
        Button70 = new javax.swing.JButton();
        Button71 = new javax.swing.JButton();
        Button72 = new javax.swing.JButton();
        Button73 = new javax.swing.JButton();
        Button74 = new javax.swing.JButton();
        Button76 = new javax.swing.JButton();
        Button65 = new javax.swing.JButton();
        Button77 = new javax.swing.JButton();
        Button78 = new javax.swing.JButton();
        Button79 = new javax.swing.JButton();
        Button80 = new javax.swing.JButton();
        Button81 = new javax.swing.JButton();
        Button82 = new javax.swing.JButton();
        Button83 = new javax.swing.JButton();
        Button84 = new javax.swing.JButton();
        Button85 = new javax.swing.JButton();
        Button86 = new javax.swing.JButton();
        Button87 = new javax.swing.JButton();
        Button88 = new javax.swing.JButton();
        Button89 = new javax.swing.JButton();
        Button90 = new javax.swing.JButton();
        Button91 = new javax.swing.JButton();
        Button92 = new javax.swing.JButton();
        Button93 = new javax.swing.JButton();
        Button94 = new javax.swing.JButton();
        Button95 = new javax.swing.JButton();
        Button96 = new javax.swing.JButton();
        Button97 = new javax.swing.JButton();
        Button98 = new javax.swing.JButton();
        Button99 = new javax.swing.JButton();
        Button100 = new javax.swing.JButton();
        Button101 = new javax.swing.JButton();
        Button102 = new javax.swing.JButton();
        Button103 = new javax.swing.JButton();
        Button104 = new javax.swing.JButton();
        Button75 = new javax.swing.JButton();
        Button120 = new javax.swing.JButton();
        Button119 = new javax.swing.JButton();
        Button118 = new javax.swing.JButton();
        Button117 = new javax.swing.JButton();
        Button116 = new javax.swing.JButton();
        Button115 = new javax.swing.JButton();
        Button114 = new javax.swing.JButton();
        Button113 = new javax.swing.JButton();
        Button112 = new javax.swing.JButton();
        Button111 = new javax.swing.JButton();
        Button110 = new javax.swing.JButton();
        Button109 = new javax.swing.JButton();
        Button108 = new javax.swing.JButton();
        Button107 = new javax.swing.JButton();
        Button106 = new javax.swing.JButton();
        Button105 = new javax.swing.JButton();
        Button122 = new javax.swing.JButton();
        Button121 = new javax.swing.JButton();
        Button198 = new javax.swing.JButton();
        Button197 = new javax.swing.JButton();
        Button196 = new javax.swing.JButton();
        Button195 = new javax.swing.JButton();
        Button194 = new javax.swing.JButton();
        Button193 = new javax.swing.JButton();
        Button130 = new javax.swing.JButton();
        Button129 = new javax.swing.JButton();
        Button128 = new javax.swing.JButton();
        Button127 = new javax.swing.JButton();
        Button126 = new javax.swing.JButton();
        Button125 = new javax.swing.JButton();
        Button124 = new javax.swing.JButton();
        Button123 = new javax.swing.JButton();
        Button138 = new javax.swing.JButton();
        Button137 = new javax.swing.JButton();
        Button136 = new javax.swing.JButton();
        Button135 = new javax.swing.JButton();
        Button134 = new javax.swing.JButton();
        Button133 = new javax.swing.JButton();
        Button132 = new javax.swing.JButton();
        Button131 = new javax.swing.JButton();
        Button146 = new javax.swing.JButton();
        Button145 = new javax.swing.JButton();
        Button144 = new javax.swing.JButton();
        Button143 = new javax.swing.JButton();
        Button142 = new javax.swing.JButton();
        Button141 = new javax.swing.JButton();
        Button140 = new javax.swing.JButton();
        Button139 = new javax.swing.JButton();
        Button170 = new javax.swing.JButton();
        Button169 = new javax.swing.JButton();
        Button168 = new javax.swing.JButton();
        Button167 = new javax.swing.JButton();
        Button166 = new javax.swing.JButton();
        Button165 = new javax.swing.JButton();
        Button164 = new javax.swing.JButton();
        Button163 = new javax.swing.JButton();
        Button178 = new javax.swing.JButton();
        Button177 = new javax.swing.JButton();
        Button176 = new javax.swing.JButton();
        Button175 = new javax.swing.JButton();
        Button174 = new javax.swing.JButton();
        Button173 = new javax.swing.JButton();
        Button172 = new javax.swing.JButton();
        Button171 = new javax.swing.JButton();
        Button154 = new javax.swing.JButton();
        Button153 = new javax.swing.JButton();
        Button152 = new javax.swing.JButton();
        Button151 = new javax.swing.JButton();
        Button150 = new javax.swing.JButton();
        Button149 = new javax.swing.JButton();
        Button148 = new javax.swing.JButton();
        Button147 = new javax.swing.JButton();
        Button162 = new javax.swing.JButton();
        Button161 = new javax.swing.JButton();
        Button160 = new javax.swing.JButton();
        Button159 = new javax.swing.JButton();
        Button158 = new javax.swing.JButton();
        Button157 = new javax.swing.JButton();
        Button156 = new javax.swing.JButton();
        Button155 = new javax.swing.JButton();
        Button186 = new javax.swing.JButton();
        Button185 = new javax.swing.JButton();
        Button184 = new javax.swing.JButton();
        Button183 = new javax.swing.JButton();
        Button182 = new javax.swing.JButton();
        Button181 = new javax.swing.JButton();
        Button180 = new javax.swing.JButton();
        Button179 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1030, 560));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        Button8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button8.setToolTipText("First class seat");
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });
        getContentPane().add(Button8);
        Button8.setBounds(50, 420, 20, 20);

        Button37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button37.setToolTipText("First class seat");
        Button37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button37ActionPerformed(evt);
            }
        });
        getContentPane().add(Button37);
        Button37.setBounds(210, 330, 20, 20);

        Button7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button7.setToolTipText("First class seat");
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });
        getContentPane().add(Button7);
        Button7.setBounds(50, 390, 20, 20);

        Button6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button6.setToolTipText("First class seat");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });
        getContentPane().add(Button6);
        Button6.setBounds(50, 360, 20, 20);

        Button5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button5.setToolTipText("First class seat");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });
        getContentPane().add(Button5);
        Button5.setBounds(50, 330, 20, 20);

        Button32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button32.setToolTipText("First class seat");
        Button32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button32ActionPerformed(evt);
            }
        });
        getContentPane().add(Button32);
        Button32.setBounds(170, 420, 20, 20);

        Button26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button26.setToolTipText("First class seat");
        Button26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button26ActionPerformed(evt);
            }
        });
        getContentPane().add(Button26);
        Button26.setBounds(170, 240, 20, 20);

        Button10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button10.setToolTipText("First class seat");
        Button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button10ActionPerformed(evt);
            }
        });
        getContentPane().add(Button10);
        Button10.setBounds(90, 240, 20, 20);

        Button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button4.setToolTipText("First class seat");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        getContentPane().add(Button4);
        Button4.setBounds(50, 300, 20, 20);

        Button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button3.setToolTipText("First class seat");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });
        getContentPane().add(Button3);
        Button3.setBounds(50, 270, 20, 20);

        Button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button2.setToolTipText("First class seat");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });
        getContentPane().add(Button2);
        Button2.setBounds(50, 240, 20, 20);

        Button53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button53.setToolTipText("Business class seat");
        Button53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button53ActionPerformed(evt);
            }
        });
        getContentPane().add(Button53);
        Button53.setBounds(330, 330, 20, 20);

        Button16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button16.setToolTipText("First class seat");
        Button16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button16ActionPerformed(evt);
            }
        });
        getContentPane().add(Button16);
        Button16.setBounds(90, 420, 20, 20);

        Button15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button15.setToolTipText("First class seat");
        Button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button15ActionPerformed(evt);
            }
        });
        getContentPane().add(Button15);
        Button15.setBounds(90, 390, 20, 20);

        Button30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button30.setToolTipText("First class seat");
        Button30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button30ActionPerformed(evt);
            }
        });
        getContentPane().add(Button30);
        Button30.setBounds(170, 360, 20, 20);

        Button14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button14.setToolTipText("First class seat");
        Button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button14ActionPerformed(evt);
            }
        });
        getContentPane().add(Button14);
        Button14.setBounds(90, 360, 20, 20);

        Button13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button13.setToolTipText("First class seat");
        Button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button13ActionPerformed(evt);
            }
        });
        getContentPane().add(Button13);
        Button13.setBounds(90, 330, 20, 20);

        Button12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button12.setToolTipText("First class seat");
        Button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button12ActionPerformed(evt);
            }
        });
        getContentPane().add(Button12);
        Button12.setBounds(90, 300, 20, 20);

        Button9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button9.setToolTipText("First class seat");
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });
        getContentPane().add(Button9);
        Button9.setBounds(90, 210, 20, 20);

        Button54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button54.setToolTipText("Business class seat");
        Button54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button54ActionPerformed(evt);
            }
        });
        getContentPane().add(Button54);
        Button54.setBounds(330, 360, 20, 20);

        Button11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button11.setToolTipText("First class seat");
        Button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button11ActionPerformed(evt);
            }
        });
        getContentPane().add(Button11);
        Button11.setBounds(90, 270, 20, 20);

        Button18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button18.setToolTipText("First class seat");
        Button18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button18ActionPerformed(evt);
            }
        });
        getContentPane().add(Button18);
        Button18.setBounds(130, 240, 20, 20);

        Button17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button17.setToolTipText("First class seat");
        Button17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button17ActionPerformed(evt);
            }
        });
        getContentPane().add(Button17);
        Button17.setBounds(130, 210, 20, 20);

        Button19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button19.setToolTipText("First class seat");
        Button19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button19ActionPerformed(evt);
            }
        });
        getContentPane().add(Button19);
        Button19.setBounds(130, 270, 20, 20);

        Button20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button20.setToolTipText("First class seat");
        Button20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button20ActionPerformed(evt);
            }
        });
        getContentPane().add(Button20);
        Button20.setBounds(130, 300, 20, 20);

        Button21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button21.setToolTipText("First class seat");
        Button21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button21ActionPerformed(evt);
            }
        });
        getContentPane().add(Button21);
        Button21.setBounds(130, 330, 20, 20);

        Button22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button22.setToolTipText("First class seat");
        Button22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button22ActionPerformed(evt);
            }
        });
        getContentPane().add(Button22);
        Button22.setBounds(130, 360, 20, 20);

        Button52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button52.setToolTipText("Business class seat");
        Button52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button52ActionPerformed(evt);
            }
        });
        getContentPane().add(Button52);
        Button52.setBounds(330, 300, 20, 20);

        Button23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button23.setToolTipText("First class seat");
        Button23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button23ActionPerformed(evt);
            }
        });
        getContentPane().add(Button23);
        Button23.setBounds(130, 390, 20, 20);

        Button24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button24.setToolTipText("First class seat");
        Button24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button24ActionPerformed(evt);
            }
        });
        getContentPane().add(Button24);
        Button24.setBounds(130, 420, 20, 20);

        Button31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button31.setToolTipText("First class seat");
        Button31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button31ActionPerformed(evt);
            }
        });
        getContentPane().add(Button31);
        Button31.setBounds(170, 390, 20, 20);

        Button29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button29.setToolTipText("First class seat");
        Button29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button29ActionPerformed(evt);
            }
        });
        getContentPane().add(Button29);
        Button29.setBounds(170, 330, 20, 20);

        Button28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button28.setToolTipText("First class seat");
        Button28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button28ActionPerformed(evt);
            }
        });
        getContentPane().add(Button28);
        Button28.setBounds(170, 300, 20, 20);

        Button25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button25.setToolTipText("First class seat");
        Button25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button25ActionPerformed(evt);
            }
        });
        getContentPane().add(Button25);
        Button25.setBounds(170, 210, 20, 20);

        Button27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button27.setToolTipText("First class seat");
        Button27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button27ActionPerformed(evt);
            }
        });
        getContentPane().add(Button27);
        Button27.setBounds(170, 270, 20, 20);

        Button51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button51.setToolTipText("Business class seat");
        Button51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button51ActionPerformed(evt);
            }
        });
        getContentPane().add(Button51);
        Button51.setBounds(330, 270, 20, 20);

        Button34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button34.setToolTipText("First class seat");
        Button34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button34ActionPerformed(evt);
            }
        });
        getContentPane().add(Button34);
        Button34.setBounds(210, 240, 20, 20);

        Button35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button35.setToolTipText("First class seat");
        Button35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button35ActionPerformed(evt);
            }
        });
        getContentPane().add(Button35);
        Button35.setBounds(210, 270, 20, 20);

        Button39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button39.setToolTipText("First class seat");
        Button39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button39ActionPerformed(evt);
            }
        });
        getContentPane().add(Button39);
        Button39.setBounds(210, 390, 20, 20);

        Button40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button40.setToolTipText("First class seat");
        Button40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button40ActionPerformed(evt);
            }
        });
        getContentPane().add(Button40);
        Button40.setBounds(210, 420, 20, 20);

        Button43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button43.setToolTipText("First class seat");
        Button43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button43ActionPerformed(evt);
            }
        });
        getContentPane().add(Button43);
        Button43.setBounds(250, 270, 20, 20);

        Button44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button44.setToolTipText("First class seat");
        Button44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button44ActionPerformed(evt);
            }
        });
        getContentPane().add(Button44);
        Button44.setBounds(250, 300, 20, 20);

        Button50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button50.setToolTipText("Business class seat");
        Button50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button50ActionPerformed(evt);
            }
        });
        getContentPane().add(Button50);
        Button50.setBounds(330, 240, 20, 20);

        Button38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button38.setToolTipText("First class seat");
        Button38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button38ActionPerformed(evt);
            }
        });
        getContentPane().add(Button38);
        Button38.setBounds(210, 360, 20, 20);

        Button36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button36.setToolTipText("First class seat");
        Button36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button36ActionPerformed(evt);
            }
        });
        getContentPane().add(Button36);
        Button36.setBounds(210, 300, 20, 20);

        Button45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button45.setToolTipText("First class seat");
        Button45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button45ActionPerformed(evt);
            }
        });
        getContentPane().add(Button45);
        Button45.setBounds(250, 330, 20, 20);

        Button46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button46.setToolTipText("First class seat");
        Button46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button46ActionPerformed(evt);
            }
        });
        getContentPane().add(Button46);
        Button46.setBounds(250, 360, 20, 20);

        Button47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button47.setToolTipText("First class seat");
        Button47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button47ActionPerformed(evt);
            }
        });
        getContentPane().add(Button47);
        Button47.setBounds(250, 390, 20, 20);

        Button42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button42.setToolTipText("First class seat");
        Button42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button42ActionPerformed(evt);
            }
        });
        getContentPane().add(Button42);
        Button42.setBounds(250, 240, 20, 20);

        Button188.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button188.setToolTipText("Tourists class seat");
        Button188.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button188ActionPerformed(evt);
            }
        });
        getContentPane().add(Button188);
        Button188.setBounds(870, 300, 20, 20);

        Button190.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button190.setToolTipText("Tourists class seat");
        Button190.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button190ActionPerformed(evt);
            }
        });
        getContentPane().add(Button190);
        Button190.setBounds(870, 360, 20, 20);

        Button200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button200.setToolTipText("Tourists class seat");
        Button200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button200ActionPerformed(evt);
            }
        });
        getContentPane().add(Button200);
        Button200.setBounds(900, 420, 20, 20);

        Button189.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button189.setToolTipText("Tourists class seat");
        Button189.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button189ActionPerformed(evt);
            }
        });
        getContentPane().add(Button189);
        Button189.setBounds(870, 330, 20, 20);

        Button49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button49.setToolTipText("Business class seat");
        Button49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button49ActionPerformed(evt);
            }
        });
        getContentPane().add(Button49);
        Button49.setBounds(330, 210, 20, 20);

        Button55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button55.setToolTipText("Business class seat");
        Button55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button55ActionPerformed(evt);
            }
        });
        getContentPane().add(Button55);
        Button55.setBounds(330, 390, 20, 20);

        Button192.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button192.setToolTipText("Tourists class seat");
        Button192.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button192ActionPerformed(evt);
            }
        });
        getContentPane().add(Button192);
        Button192.setBounds(870, 420, 20, 20);

        Button48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button48.setToolTipText("First class seat");
        Button48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button48ActionPerformed(evt);
            }
        });
        getContentPane().add(Button48);
        Button48.setBounds(250, 420, 20, 20);

        Button199.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button199.setToolTipText("Tourists class seat");
        Button199.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button199ActionPerformed(evt);
            }
        });
        getContentPane().add(Button199);
        Button199.setBounds(900, 390, 20, 20);

        Button191.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button191.setToolTipText("Tourists class seat");
        Button191.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button191ActionPerformed(evt);
            }
        });
        getContentPane().add(Button191);
        Button191.setBounds(870, 390, 20, 20);

        Button57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button57.setToolTipText("Business class seat");
        Button57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button57ActionPerformed(evt);
            }
        });
        getContentPane().add(Button57);
        Button57.setBounds(360, 210, 20, 20);

        Button187.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button187.setToolTipText("Tourists class seat");
        Button187.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button187ActionPerformed(evt);
            }
        });
        getContentPane().add(Button187);
        Button187.setBounds(870, 270, 20, 20);

        Button61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button61.setToolTipText("Business class seat");
        Button61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button61ActionPerformed(evt);
            }
        });
        getContentPane().add(Button61);
        Button61.setBounds(360, 330, 20, 20);

        Button33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button33.setToolTipText("First class seat");
        Button33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button33ActionPerformed(evt);
            }
        });
        getContentPane().add(Button33);
        Button33.setBounds(210, 210, 20, 20);

        Button56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button56.setToolTipText("Business class seat");
        Button56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button56ActionPerformed(evt);
            }
        });
        getContentPane().add(Button56);
        Button56.setBounds(330, 420, 20, 20);

        Button58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button58.setToolTipText("Business class seat");
        Button58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button58ActionPerformed(evt);
            }
        });
        getContentPane().add(Button58);
        Button58.setBounds(360, 240, 20, 20);

        Button41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button41.setToolTipText("First class seat");
        Button41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button41ActionPerformed(evt);
            }
        });
        getContentPane().add(Button41);
        Button41.setBounds(250, 210, 20, 20);

        Button60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button60.setToolTipText("Business class seat");
        Button60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button60ActionPerformed(evt);
            }
        });
        getContentPane().add(Button60);
        Button60.setBounds(360, 300, 20, 20);

        Button63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button63.setToolTipText("Business class seat");
        Button63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button63ActionPerformed(evt);
            }
        });
        getContentPane().add(Button63);
        Button63.setBounds(360, 390, 20, 20);

        Button59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button59.setToolTipText("Business class seat");
        Button59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button59ActionPerformed(evt);
            }
        });
        getContentPane().add(Button59);
        Button59.setBounds(360, 270, 20, 20);

        Button64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button64.setToolTipText("Business class seat");
        Button64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button64ActionPerformed(evt);
            }
        });
        getContentPane().add(Button64);
        Button64.setBounds(360, 420, 20, 20);

        Button62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button62.setToolTipText("Business class seat");
        Button62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button62ActionPerformed(evt);
            }
        });
        getContentPane().add(Button62);
        Button62.setBounds(360, 360, 20, 20);

        Button66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button66.setToolTipText("Business class seat");
        Button66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button66ActionPerformed(evt);
            }
        });
        getContentPane().add(Button66);
        Button66.setBounds(390, 240, 20, 20);

        Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button1.setToolTipText("First class seat");
        Button1.setName(""); // NOI18N
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        getContentPane().add(Button1);
        Button1.setBounds(50, 210, 20, 20);

        Button67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button67.setToolTipText("Business class seat");
        Button67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button67ActionPerformed(evt);
            }
        });
        getContentPane().add(Button67);
        Button67.setBounds(390, 270, 20, 20);

        Button68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button68.setToolTipText("Business class seat");
        Button68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button68ActionPerformed(evt);
            }
        });
        getContentPane().add(Button68);
        Button68.setBounds(390, 300, 20, 20);

        Button69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button69.setToolTipText("Business class seat");
        Button69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button69ActionPerformed(evt);
            }
        });
        getContentPane().add(Button69);
        Button69.setBounds(390, 330, 20, 20);

        Button70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button70.setToolTipText("Business class seat");
        Button70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button70ActionPerformed(evt);
            }
        });
        getContentPane().add(Button70);
        Button70.setBounds(390, 360, 20, 20);

        Button71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button71.setToolTipText("Business class seat");
        Button71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button71ActionPerformed(evt);
            }
        });
        getContentPane().add(Button71);
        Button71.setBounds(390, 390, 20, 20);

        Button72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button72.setToolTipText("Business class seat");
        Button72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button72ActionPerformed(evt);
            }
        });
        getContentPane().add(Button72);
        Button72.setBounds(390, 420, 20, 20);

        Button73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button73.setToolTipText("Business class seat");
        Button73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button73ActionPerformed(evt);
            }
        });
        getContentPane().add(Button73);
        Button73.setBounds(420, 210, 20, 20);

        Button74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button74.setToolTipText("Business class seat");
        Button74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button74ActionPerformed(evt);
            }
        });
        getContentPane().add(Button74);
        Button74.setBounds(420, 240, 20, 20);

        Button76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button76.setToolTipText("Business class seat");
        Button76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button76ActionPerformed(evt);
            }
        });
        getContentPane().add(Button76);
        Button76.setBounds(420, 300, 20, 20);

        Button65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button65.setToolTipText("Business class seat");
        Button65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button65ActionPerformed(evt);
            }
        });
        getContentPane().add(Button65);
        Button65.setBounds(390, 210, 20, 20);

        Button77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button77.setToolTipText("Business class seat");
        Button77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button77ActionPerformed(evt);
            }
        });
        getContentPane().add(Button77);
        Button77.setBounds(420, 330, 20, 20);

        Button78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button78.setToolTipText("Business class seat");
        Button78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button78ActionPerformed(evt);
            }
        });
        getContentPane().add(Button78);
        Button78.setBounds(420, 360, 20, 20);

        Button79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button79.setToolTipText("Business class seat");
        Button79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button79ActionPerformed(evt);
            }
        });
        getContentPane().add(Button79);
        Button79.setBounds(420, 390, 20, 20);

        Button80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button80.setToolTipText("Business class seat");
        Button80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button80ActionPerformed(evt);
            }
        });
        getContentPane().add(Button80);
        Button80.setBounds(420, 420, 20, 20);

        Button81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button81.setToolTipText("Business class seat");
        Button81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button81ActionPerformed(evt);
            }
        });
        getContentPane().add(Button81);
        Button81.setBounds(450, 210, 20, 20);

        Button82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button82.setToolTipText("Business class seat");
        Button82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button82ActionPerformed(evt);
            }
        });
        getContentPane().add(Button82);
        Button82.setBounds(450, 240, 20, 20);

        Button83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button83.setToolTipText("Business class seat");
        Button83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button83ActionPerformed(evt);
            }
        });
        getContentPane().add(Button83);
        Button83.setBounds(450, 270, 20, 20);

        Button84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button84.setToolTipText("Business class seat");
        Button84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button84ActionPerformed(evt);
            }
        });
        getContentPane().add(Button84);
        Button84.setBounds(450, 300, 20, 20);

        Button85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button85.setToolTipText("Business class seat");
        Button85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button85ActionPerformed(evt);
            }
        });
        getContentPane().add(Button85);
        Button85.setBounds(450, 330, 20, 20);

        Button86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button86.setToolTipText("Business class seat");
        Button86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button86ActionPerformed(evt);
            }
        });
        getContentPane().add(Button86);
        Button86.setBounds(450, 360, 20, 20);

        Button87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button87.setToolTipText("Business class seat");
        Button87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button87ActionPerformed(evt);
            }
        });
        getContentPane().add(Button87);
        Button87.setBounds(450, 390, 20, 20);

        Button88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button88.setToolTipText("Business class seat");
        Button88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button88ActionPerformed(evt);
            }
        });
        getContentPane().add(Button88);
        Button88.setBounds(450, 420, 20, 20);

        Button89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button89.setToolTipText("Business class seat");
        Button89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button89ActionPerformed(evt);
            }
        });
        getContentPane().add(Button89);
        Button89.setBounds(480, 210, 20, 20);

        Button90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button90.setToolTipText("Business class seat");
        Button90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button90ActionPerformed(evt);
            }
        });
        getContentPane().add(Button90);
        Button90.setBounds(480, 240, 20, 20);

        Button91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button91.setToolTipText("Business class seat");
        Button91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button91ActionPerformed(evt);
            }
        });
        getContentPane().add(Button91);
        Button91.setBounds(480, 270, 20, 20);

        Button92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button92.setToolTipText("Business class seat");
        Button92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button92ActionPerformed(evt);
            }
        });
        getContentPane().add(Button92);
        Button92.setBounds(480, 300, 20, 20);

        Button93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button93.setToolTipText("Business class seat");
        Button93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button93ActionPerformed(evt);
            }
        });
        getContentPane().add(Button93);
        Button93.setBounds(480, 330, 20, 20);

        Button94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button94.setToolTipText("Business class seat");
        Button94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button94ActionPerformed(evt);
            }
        });
        getContentPane().add(Button94);
        Button94.setBounds(480, 360, 20, 20);

        Button95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button95.setToolTipText("Business class seat");
        Button95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button95ActionPerformed(evt);
            }
        });
        getContentPane().add(Button95);
        Button95.setBounds(480, 390, 20, 20);

        Button96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button96.setToolTipText("Business class seat");
        Button96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button96ActionPerformed(evt);
            }
        });
        getContentPane().add(Button96);
        Button96.setBounds(480, 420, 20, 20);

        Button97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button97.setToolTipText("Business class seat");
        Button97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button97ActionPerformed(evt);
            }
        });
        getContentPane().add(Button97);
        Button97.setBounds(510, 210, 20, 20);

        Button98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button98.setToolTipText("Business class seat");
        Button98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button98ActionPerformed(evt);
            }
        });
        getContentPane().add(Button98);
        Button98.setBounds(510, 240, 20, 20);

        Button99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button99.setToolTipText("Business class seat");
        Button99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button99ActionPerformed(evt);
            }
        });
        getContentPane().add(Button99);
        Button99.setBounds(510, 270, 20, 20);

        Button100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button100.setToolTipText("Business class seat");
        Button100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button100ActionPerformed(evt);
            }
        });
        getContentPane().add(Button100);
        Button100.setBounds(510, 300, 20, 20);

        Button101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button101.setToolTipText("Business class seat");
        Button101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button101ActionPerformed(evt);
            }
        });
        getContentPane().add(Button101);
        Button101.setBounds(510, 330, 20, 20);

        Button102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button102.setToolTipText("Business class seat");
        Button102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button102ActionPerformed(evt);
            }
        });
        getContentPane().add(Button102);
        Button102.setBounds(510, 360, 20, 20);

        Button103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button103.setToolTipText("Business class seat");
        Button103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button103ActionPerformed(evt);
            }
        });
        getContentPane().add(Button103);
        Button103.setBounds(510, 390, 20, 20);

        Button104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button104.setToolTipText("Business class seat");
        Button104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button104ActionPerformed(evt);
            }
        });
        getContentPane().add(Button104);
        Button104.setBounds(510, 420, 20, 20);

        Button75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button75.setToolTipText("Business class seat");
        Button75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button75ActionPerformed(evt);
            }
        });
        getContentPane().add(Button75);
        Button75.setBounds(420, 270, 20, 20);

        Button120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button120.setToolTipText("Business class seat");
        Button120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button120ActionPerformed(evt);
            }
        });
        getContentPane().add(Button120);
        Button120.setBounds(570, 420, 20, 20);

        Button119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button119.setToolTipText("Business class seat");
        Button119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button119ActionPerformed(evt);
            }
        });
        getContentPane().add(Button119);
        Button119.setBounds(570, 390, 20, 20);

        Button118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button118.setToolTipText("Business class seat");
        Button118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button118ActionPerformed(evt);
            }
        });
        getContentPane().add(Button118);
        Button118.setBounds(570, 360, 20, 20);

        Button117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button117.setToolTipText("Business class seat");
        Button117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button117ActionPerformed(evt);
            }
        });
        getContentPane().add(Button117);
        Button117.setBounds(570, 330, 20, 20);

        Button116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button116.setToolTipText("Business class seat");
        Button116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button116ActionPerformed(evt);
            }
        });
        getContentPane().add(Button116);
        Button116.setBounds(570, 300, 20, 20);

        Button115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button115.setToolTipText("Business class seat");
        Button115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button115ActionPerformed(evt);
            }
        });
        getContentPane().add(Button115);
        Button115.setBounds(570, 270, 20, 20);

        Button114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button114.setToolTipText("Business class seat");
        Button114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button114ActionPerformed(evt);
            }
        });
        getContentPane().add(Button114);
        Button114.setBounds(570, 240, 20, 20);

        Button113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button113.setToolTipText("Business class seat");
        Button113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button113ActionPerformed(evt);
            }
        });
        getContentPane().add(Button113);
        Button113.setBounds(570, 210, 20, 20);

        Button112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button112.setToolTipText("Business class seat");
        Button112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button112ActionPerformed(evt);
            }
        });
        getContentPane().add(Button112);
        Button112.setBounds(540, 420, 20, 20);

        Button111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button111.setToolTipText("Business class seat");
        Button111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button111ActionPerformed(evt);
            }
        });
        getContentPane().add(Button111);
        Button111.setBounds(540, 390, 20, 20);

        Button110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button110.setToolTipText("Business class seat");
        Button110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button110ActionPerformed(evt);
            }
        });
        getContentPane().add(Button110);
        Button110.setBounds(540, 360, 20, 20);

        Button109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button109.setToolTipText("Business class seat");
        Button109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button109ActionPerformed(evt);
            }
        });
        getContentPane().add(Button109);
        Button109.setBounds(540, 330, 20, 20);

        Button108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button108.setToolTipText("Business class seat");
        Button108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button108ActionPerformed(evt);
            }
        });
        getContentPane().add(Button108);
        Button108.setBounds(540, 300, 20, 20);

        Button107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button107.setToolTipText("Business class seat");
        Button107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button107ActionPerformed(evt);
            }
        });
        getContentPane().add(Button107);
        Button107.setBounds(540, 270, 20, 20);

        Button106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button106.setToolTipText("Business class seat");
        Button106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button106ActionPerformed(evt);
            }
        });
        getContentPane().add(Button106);
        Button106.setBounds(540, 240, 20, 20);

        Button105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button105.setToolTipText("Business class seat");
        Button105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button105ActionPerformed(evt);
            }
        });
        getContentPane().add(Button105);
        Button105.setBounds(540, 210, 20, 20);

        Button122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button122.setToolTipText("Tourists class seat");
        Button122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button122ActionPerformed(evt);
            }
        });
        getContentPane().add(Button122);
        Button122.setBounds(630, 240, 20, 20);

        Button121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button121.setToolTipText("Tourists class seat");
        Button121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button121ActionPerformed(evt);
            }
        });
        getContentPane().add(Button121);
        Button121.setBounds(630, 210, 20, 20);

        Button198.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button198.setToolTipText("Tourists class seat");
        Button198.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button198ActionPerformed(evt);
            }
        });
        getContentPane().add(Button198);
        Button198.setBounds(900, 360, 20, 20);

        Button197.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button197.setToolTipText("Tourists class seat");
        Button197.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button197ActionPerformed(evt);
            }
        });
        getContentPane().add(Button197);
        Button197.setBounds(900, 330, 20, 20);

        Button196.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button196.setToolTipText("Tourists class seat");
        Button196.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button196ActionPerformed(evt);
            }
        });
        getContentPane().add(Button196);
        Button196.setBounds(900, 300, 20, 20);

        Button195.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button195.setToolTipText("Tourists class seat");
        Button195.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button195ActionPerformed(evt);
            }
        });
        getContentPane().add(Button195);
        Button195.setBounds(900, 270, 20, 20);

        Button194.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button194.setToolTipText("Tourists class seat");
        Button194.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button194ActionPerformed(evt);
            }
        });
        getContentPane().add(Button194);
        Button194.setBounds(900, 240, 20, 20);

        Button193.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button193.setToolTipText("Tourists class seat");
        Button193.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button193ActionPerformed(evt);
            }
        });
        getContentPane().add(Button193);
        Button193.setBounds(900, 210, 20, 20);

        Button130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button130.setToolTipText("Tourists class seat");
        Button130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button130ActionPerformed(evt);
            }
        });
        getContentPane().add(Button130);
        Button130.setBounds(660, 240, 20, 20);

        Button129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button129.setToolTipText("Tourists class seat");
        Button129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button129ActionPerformed(evt);
            }
        });
        getContentPane().add(Button129);
        Button129.setBounds(660, 210, 20, 20);

        Button128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button128.setToolTipText("Tourists class seat");
        Button128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button128ActionPerformed(evt);
            }
        });
        getContentPane().add(Button128);
        Button128.setBounds(630, 420, 20, 20);

        Button127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button127.setToolTipText("Tourists class seat");
        Button127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button127ActionPerformed(evt);
            }
        });
        getContentPane().add(Button127);
        Button127.setBounds(630, 390, 20, 20);

        Button126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button126.setToolTipText("Tourists class seat");
        Button126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button126ActionPerformed(evt);
            }
        });
        getContentPane().add(Button126);
        Button126.setBounds(630, 360, 20, 20);

        Button125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button125.setToolTipText("Tourists class seat");
        Button125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button125ActionPerformed(evt);
            }
        });
        getContentPane().add(Button125);
        Button125.setBounds(630, 330, 20, 20);

        Button124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button124.setToolTipText("Tourists class seat");
        Button124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button124ActionPerformed(evt);
            }
        });
        getContentPane().add(Button124);
        Button124.setBounds(630, 300, 20, 20);

        Button123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button123.setToolTipText("Tourists class seat");
        Button123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button123ActionPerformed(evt);
            }
        });
        getContentPane().add(Button123);
        Button123.setBounds(630, 270, 20, 20);

        Button138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button138.setToolTipText("Tourists class seat");
        Button138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button138ActionPerformed(evt);
            }
        });
        getContentPane().add(Button138);
        Button138.setBounds(690, 240, 20, 20);

        Button137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button137.setToolTipText("Tourists class seat");
        Button137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button137ActionPerformed(evt);
            }
        });
        getContentPane().add(Button137);
        Button137.setBounds(690, 210, 20, 20);

        Button136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button136.setToolTipText("Tourists class seat");
        Button136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button136ActionPerformed(evt);
            }
        });
        getContentPane().add(Button136);
        Button136.setBounds(660, 420, 20, 20);

        Button135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button135.setToolTipText("Tourists class seat");
        Button135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button135ActionPerformed(evt);
            }
        });
        getContentPane().add(Button135);
        Button135.setBounds(660, 390, 20, 20);

        Button134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button134.setToolTipText("Tourists class seat");
        Button134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button134ActionPerformed(evt);
            }
        });
        getContentPane().add(Button134);
        Button134.setBounds(660, 360, 20, 20);

        Button133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button133.setToolTipText("Tourists class seat");
        Button133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button133ActionPerformed(evt);
            }
        });
        getContentPane().add(Button133);
        Button133.setBounds(660, 330, 20, 20);

        Button132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button132.setToolTipText("Tourists class seat");
        Button132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button132ActionPerformed(evt);
            }
        });
        getContentPane().add(Button132);
        Button132.setBounds(660, 300, 20, 20);

        Button131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button131.setToolTipText("Tourists class seat");
        Button131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button131ActionPerformed(evt);
            }
        });
        getContentPane().add(Button131);
        Button131.setBounds(660, 270, 20, 20);

        Button146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button146.setToolTipText("Tourists class seat");
        Button146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button146ActionPerformed(evt);
            }
        });
        getContentPane().add(Button146);
        Button146.setBounds(720, 240, 20, 20);

        Button145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button145.setToolTipText("Tourists class seat");
        Button145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button145ActionPerformed(evt);
            }
        });
        getContentPane().add(Button145);
        Button145.setBounds(720, 210, 20, 20);

        Button144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button144.setToolTipText("Tourists class seat");
        Button144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button144ActionPerformed(evt);
            }
        });
        getContentPane().add(Button144);
        Button144.setBounds(690, 420, 20, 20);

        Button143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button143.setToolTipText("Tourists class seat");
        Button143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button143ActionPerformed(evt);
            }
        });
        getContentPane().add(Button143);
        Button143.setBounds(690, 390, 20, 20);

        Button142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button142.setToolTipText("Tourists class seat");
        Button142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button142ActionPerformed(evt);
            }
        });
        getContentPane().add(Button142);
        Button142.setBounds(690, 360, 20, 20);

        Button141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button141.setToolTipText("Tourists class seat");
        Button141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button141ActionPerformed(evt);
            }
        });
        getContentPane().add(Button141);
        Button141.setBounds(690, 330, 20, 20);

        Button140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button140.setToolTipText("Tourists class seat");
        Button140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button140ActionPerformed(evt);
            }
        });
        getContentPane().add(Button140);
        Button140.setBounds(690, 300, 20, 20);

        Button139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button139.setToolTipText("Tourists class seat");
        Button139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button139ActionPerformed(evt);
            }
        });
        getContentPane().add(Button139);
        Button139.setBounds(690, 270, 20, 20);

        Button170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button170.setToolTipText("Tourists class seat");
        Button170.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button170ActionPerformed(evt);
            }
        });
        getContentPane().add(Button170);
        Button170.setBounds(810, 240, 20, 20);

        Button169.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button169.setToolTipText("Tourists class seat");
        Button169.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button169ActionPerformed(evt);
            }
        });
        getContentPane().add(Button169);
        Button169.setBounds(810, 210, 20, 20);

        Button168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button168.setToolTipText("Tourists class seat");
        Button168.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button168ActionPerformed(evt);
            }
        });
        getContentPane().add(Button168);
        Button168.setBounds(780, 420, 20, 20);

        Button167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button167.setToolTipText("Tourists class seat");
        Button167.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button167ActionPerformed(evt);
            }
        });
        getContentPane().add(Button167);
        Button167.setBounds(780, 390, 20, 20);

        Button166.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button166.setToolTipText("Tourists class seat");
        Button166.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button166ActionPerformed(evt);
            }
        });
        getContentPane().add(Button166);
        Button166.setBounds(780, 360, 20, 20);

        Button165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button165.setToolTipText("Tourists class seat");
        Button165.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button165ActionPerformed(evt);
            }
        });
        getContentPane().add(Button165);
        Button165.setBounds(780, 330, 20, 20);

        Button164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button164.setToolTipText("Tourists class seat");
        Button164.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button164ActionPerformed(evt);
            }
        });
        getContentPane().add(Button164);
        Button164.setBounds(780, 300, 20, 20);

        Button163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button163.setToolTipText("Tourists class seat");
        Button163.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button163ActionPerformed(evt);
            }
        });
        getContentPane().add(Button163);
        Button163.setBounds(780, 270, 20, 20);

        Button178.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button178.setToolTipText("Tourists class seat");
        Button178.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button178ActionPerformed(evt);
            }
        });
        getContentPane().add(Button178);
        Button178.setBounds(840, 240, 20, 20);

        Button177.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button177.setToolTipText("Tourists class seat");
        Button177.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button177ActionPerformed(evt);
            }
        });
        getContentPane().add(Button177);
        Button177.setBounds(840, 210, 20, 20);

        Button176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button176.setToolTipText("Tourists class seat");
        Button176.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button176ActionPerformed(evt);
            }
        });
        getContentPane().add(Button176);
        Button176.setBounds(810, 420, 20, 20);

        Button175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button175.setToolTipText("Tourists class seat");
        Button175.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button175ActionPerformed(evt);
            }
        });
        getContentPane().add(Button175);
        Button175.setBounds(810, 390, 20, 20);

        Button174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button174.setToolTipText("Tourists class seat");
        Button174.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button174ActionPerformed(evt);
            }
        });
        getContentPane().add(Button174);
        Button174.setBounds(810, 360, 20, 20);

        Button173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button173.setToolTipText("Tourists class seat");
        Button173.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button173ActionPerformed(evt);
            }
        });
        getContentPane().add(Button173);
        Button173.setBounds(810, 330, 20, 20);

        Button172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button172.setToolTipText("Tourists class seat");
        Button172.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button172ActionPerformed(evt);
            }
        });
        getContentPane().add(Button172);
        Button172.setBounds(810, 300, 20, 20);

        Button171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button171.setToolTipText("Tourists class seat");
        Button171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button171ActionPerformed(evt);
            }
        });
        getContentPane().add(Button171);
        Button171.setBounds(810, 270, 20, 20);

        Button154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button154.setToolTipText("Tourists class seat");
        Button154.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button154ActionPerformed(evt);
            }
        });
        getContentPane().add(Button154);
        Button154.setBounds(750, 240, 20, 20);

        Button153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button153.setToolTipText("Tourists class seat");
        Button153.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button153ActionPerformed(evt);
            }
        });
        getContentPane().add(Button153);
        Button153.setBounds(750, 210, 20, 20);

        Button152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button152.setToolTipText("Tourists class seat");
        Button152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button152ActionPerformed(evt);
            }
        });
        getContentPane().add(Button152);
        Button152.setBounds(720, 420, 20, 20);

        Button151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button151.setToolTipText("Tourists class seat");
        Button151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button151ActionPerformed(evt);
            }
        });
        getContentPane().add(Button151);
        Button151.setBounds(720, 390, 20, 20);

        Button150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button150.setToolTipText("Tourists class seat");
        Button150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button150ActionPerformed(evt);
            }
        });
        getContentPane().add(Button150);
        Button150.setBounds(720, 360, 20, 20);

        Button149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button149.setToolTipText("Tourists class seat");
        Button149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button149ActionPerformed(evt);
            }
        });
        getContentPane().add(Button149);
        Button149.setBounds(720, 330, 20, 20);

        Button148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button148.setToolTipText("Tourists class seat");
        Button148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button148ActionPerformed(evt);
            }
        });
        getContentPane().add(Button148);
        Button148.setBounds(720, 300, 20, 20);

        Button147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button147.setToolTipText("Tourists class seat");
        Button147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button147ActionPerformed(evt);
            }
        });
        getContentPane().add(Button147);
        Button147.setBounds(720, 270, 20, 20);

        Button162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button162.setToolTipText("Tourists class seat");
        Button162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button162ActionPerformed(evt);
            }
        });
        getContentPane().add(Button162);
        Button162.setBounds(780, 240, 20, 20);

        Button161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button161.setToolTipText("Tourists class seat");
        Button161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button161ActionPerformed(evt);
            }
        });
        getContentPane().add(Button161);
        Button161.setBounds(780, 210, 20, 20);

        Button160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button160.setToolTipText("Tourists class seat");
        Button160.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button160ActionPerformed(evt);
            }
        });
        getContentPane().add(Button160);
        Button160.setBounds(750, 420, 20, 20);

        Button159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button159.setToolTipText("Tourists class seat");
        Button159.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button159ActionPerformed(evt);
            }
        });
        getContentPane().add(Button159);
        Button159.setBounds(750, 390, 20, 20);

        Button158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button158.setToolTipText("Tourists class seat");
        Button158.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button158ActionPerformed(evt);
            }
        });
        getContentPane().add(Button158);
        Button158.setBounds(750, 360, 20, 20);

        Button157.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button157.setToolTipText("Tourists class seat");
        Button157.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button157ActionPerformed(evt);
            }
        });
        getContentPane().add(Button157);
        Button157.setBounds(750, 330, 20, 20);

        Button156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button156.setToolTipText("Tourists class seat");
        Button156.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button156ActionPerformed(evt);
            }
        });
        getContentPane().add(Button156);
        Button156.setBounds(750, 300, 20, 20);

        Button155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button155.setToolTipText("Tourists class seat");
        Button155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button155ActionPerformed(evt);
            }
        });
        getContentPane().add(Button155);
        Button155.setBounds(750, 270, 20, 20);

        Button186.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button186.setToolTipText("Tourists class seat");
        Button186.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button186ActionPerformed(evt);
            }
        });
        getContentPane().add(Button186);
        Button186.setBounds(870, 240, 20, 20);

        Button185.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button185.setToolTipText("Tourists class seat");
        Button185.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button185ActionPerformed(evt);
            }
        });
        getContentPane().add(Button185);
        Button185.setBounds(870, 210, 20, 20);

        Button184.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button184.setToolTipText("Tourists class seat");
        Button184.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button184ActionPerformed(evt);
            }
        });
        getContentPane().add(Button184);
        Button184.setBounds(840, 420, 20, 20);

        Button183.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button183.setToolTipText("Tourists class seat");
        Button183.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button183ActionPerformed(evt);
            }
        });
        getContentPane().add(Button183);
        Button183.setBounds(840, 390, 20, 20);

        Button182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button182.setToolTipText("Tourists class seat");
        Button182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button182ActionPerformed(evt);
            }
        });
        getContentPane().add(Button182);
        Button182.setBounds(840, 360, 20, 20);

        Button181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button181.setToolTipText("Tourists class seat");
        Button181.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button181ActionPerformed(evt);
            }
        });
        getContentPane().add(Button181);
        Button181.setBounds(840, 330, 20, 20);

        Button180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button180.setToolTipText("Tourists class seat");
        Button180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button180ActionPerformed(evt);
            }
        });
        getContentPane().add(Button180);
        Button180.setBounds(840, 300, 20, 20);

        Button179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerSeat.png"))); // NOI18N
        Button179.setToolTipText("Tourists class seat");
        Button179.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button179ActionPerformed(evt);
            }
        });
        getContentPane().add(Button179);
        Button179.setBounds(840, 270, 20, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText(" 2");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 240, 20, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText(" 3");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 270, 20, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText(" 4");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 300, 20, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText(" 1");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 210, 20, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText(" 5");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 330, 20, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText(" 6");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 360, 20, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText(" 8");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 420, 20, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText(" 7");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 390, 20, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("07 08  09 10  11  12 13  14  15       16 17  18  19 20  21 22  23  24 25 ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(330, 470, 620, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("07 08  09 10  11  12 13  14  15       16 17  18  19 20  21 22  23  24 25 ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(330, 160, 620, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Business Class", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 190, 280, 260);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Tourists Class", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(620, 190, 310, 260);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true)), "First Class", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(40, 190, 240, 260);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seaTmapToChoose.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1020, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//**************************************** Buttons Action Performed ********************************************
    private void Button193ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button193ActionPerformed
        if(Button193.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button193.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 25;
        seat = 1;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button193ActionPerformed

    private void Button155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button155ActionPerformed
        if(Button155.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 20;
        seat = 3;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button155ActionPerformed
//  First Class Seats
    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        if(Button1.getName() != null){
           view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 1;
        seat = 1;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        if(Button2.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 1;
        seat = 2;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        if(Button3.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 1;
        seat = 3;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        if(Button4.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 1;
        seat = 4;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        if(Button5.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 1;
        seat = 5;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        if(Button6.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 1;
        seat = 6;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        if(Button7.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 1;
        seat = 7;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        if(Button8.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 1;
        seat = 8;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        if(Button9.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 2;
        seat = 1;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button9ActionPerformed

    private void Button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button10ActionPerformed
        if(Button10.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 2;
        seat = 2;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button10ActionPerformed

    private void Button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button11ActionPerformed
        if(Button11.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 2;
        seat = 3;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button11ActionPerformed

    private void Button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button12ActionPerformed
        if(Button12.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 2;
        seat = 4;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button12ActionPerformed

    private void Button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button13ActionPerformed
        if(Button13.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 2;
        seat = 5;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button13ActionPerformed

    private void Button14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button14ActionPerformed
        if(Button14.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 2;
        seat = 6;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button14ActionPerformed

    private void Button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button15ActionPerformed
        if(Button15.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 2;
        seat = 7;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button15ActionPerformed

    private void Button16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button16ActionPerformed
        if(Button16.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 2;
        seat = 8;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button16ActionPerformed

    private void Button17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button17ActionPerformed
        if(Button17.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 3;
        seat = 1;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button17ActionPerformed

    private void Button18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button18ActionPerformed
        if(Button18.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 3;
        seat = 2;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button18ActionPerformed

    private void Button19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button19ActionPerformed
        if(Button19.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 3;
        seat = 3;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button19ActionPerformed

    private void Button20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button20ActionPerformed
        if(Button20.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 3;
        seat = 4;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button20ActionPerformed

    private void Button21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button21ActionPerformed
        if(Button21.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 3;
        seat = 5;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button21ActionPerformed

    private void Button22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button22ActionPerformed
        if(Button22.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 3;
        seat = 6;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button22ActionPerformed

    private void Button23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button23ActionPerformed
        if(Button23.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 3;
        seat = 7;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button23ActionPerformed

    private void Button24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button24ActionPerformed
        if(Button24.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 3;
        seat = 8;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button24ActionPerformed

    private void Button25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button25ActionPerformed
        if(Button25.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 4;
        seat = 1;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button25ActionPerformed

    private void Button26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button26ActionPerformed
        if(Button26.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 4;
        seat = 2;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button26ActionPerformed

    private void Button27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button27ActionPerformed
        if(Button27.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 4;
        seat = 3;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button27ActionPerformed

    private void Button28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button28ActionPerformed
        if(Button28.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 4;
        seat = 4;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button28ActionPerformed

    private void Button29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button29ActionPerformed
        if(Button29.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 4;
        seat = 5;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button29ActionPerformed

    private void Button30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button30ActionPerformed
        if(Button30.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 4;
        seat = 6;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button30ActionPerformed

    private void Button31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button31ActionPerformed
        if(Button31.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 4;
        seat = 7;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button31ActionPerformed

    private void Button32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button32ActionPerformed
        if(Button32.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 4;
        seat = 8;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button32ActionPerformed

    private void Button33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button33ActionPerformed
        if(Button33.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 5;
        seat = 1;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button33ActionPerformed

    private void Button34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button34ActionPerformed
        if(Button34.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 5;
        seat = 2;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button34ActionPerformed

    private void Button35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button35ActionPerformed
       if(Button35.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 5;
        seat = 3;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button35ActionPerformed

    private void Button36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button36ActionPerformed
        if(Button36.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 5;
        seat = 4;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button36ActionPerformed

    private void Button37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button37ActionPerformed
        if(Button37.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 5;
        seat = 5;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button37ActionPerformed

    private void Button38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button38ActionPerformed
        if(Button38.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 5;
        seat = 6;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button38ActionPerformed

    private void Button39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button39ActionPerformed
        if(Button39.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 5;
        seat = 7;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button39ActionPerformed

    private void Button40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button40ActionPerformed
        if(Button40.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 5;
        seat = 8;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button40ActionPerformed

    private void Button41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button41ActionPerformed
        if(Button41.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 6;
        seat = 1;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button41ActionPerformed

    private void Button42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button42ActionPerformed
        if(Button42.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 6;
        seat = 2;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button42ActionPerformed

    private void Button43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button43ActionPerformed
        if(Button43.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 6;
        seat = 3;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button43ActionPerformed

    private void Button44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button44ActionPerformed
        if(Button44.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 6;
        seat = 4;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button44ActionPerformed

    private void Button45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button45ActionPerformed
        if(Button45.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 6;
        seat = 5;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button45ActionPerformed

    private void Button46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button46ActionPerformed
        if(Button46.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 6;
        seat = 6;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button46ActionPerformed

    private void Button47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button47ActionPerformed
        if(Button47.getName() != null){
           view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 6;
        seat = 7;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button47ActionPerformed

    private void Button48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button48ActionPerformed
        if(Button48.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in first class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 6;
        seat = 8;
        type = E_ClassType.First;
        dispose();
        }
    }//GEN-LAST:event_Button48ActionPerformed
//  Business Class Seats
    private void Button49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button49ActionPerformed
        if(Button49.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 7;
        seat = 1;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button49ActionPerformed

    private void Button50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button50ActionPerformed
        if(Button50.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 7;
        seat = 2;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button50ActionPerformed

    private void Button51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button51ActionPerformed
        if(Button51.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 7;
        seat = 3;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button51ActionPerformed

    private void Button52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button52ActionPerformed
        if(Button52.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 7;
        seat = 4;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button52ActionPerformed

    private void Button53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button53ActionPerformed
        if(Button53.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 7;
        seat = 5;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button53ActionPerformed

    private void Button54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button54ActionPerformed
        if(Button54.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 7;
        seat = 6;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button54ActionPerformed

    private void Button55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button55ActionPerformed
       if(Button55.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 7;
        seat = 7;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button55ActionPerformed

    private void Button56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button56ActionPerformed
        if(Button56.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 7;
        seat = 8;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button56ActionPerformed

    private void Button57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button57ActionPerformed
        if(Button57.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 8;
        seat = 1;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button57ActionPerformed

    private void Button58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button58ActionPerformed
        if(Button58.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 8;
        seat = 2;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button58ActionPerformed

    private void Button59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button59ActionPerformed
        if(Button59.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 8;
        seat = 3;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button59ActionPerformed

    private void Button60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button60ActionPerformed
        if(Button60.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 8;
        seat = 4;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button60ActionPerformed

    private void Button61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button61ActionPerformed
        if(Button61.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 8;
        seat = 5;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button61ActionPerformed

    private void Button62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button62ActionPerformed
        if(Button62.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 8;
        seat = 6;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button62ActionPerformed

    private void Button63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button63ActionPerformed
        if(Button63.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 8;
        seat = 7;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button63ActionPerformed

    private void Button64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button64ActionPerformed
        if(Button64.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 8;
        seat = 8;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button64ActionPerformed

    private void Button65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button65ActionPerformed
        if(Button65.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 9;
        seat = 1;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button65ActionPerformed

    private void Button66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button66ActionPerformed
        if(Button66.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 9;
        seat = 2;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button66ActionPerformed

    private void Button67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button67ActionPerformed
        if(Button67.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 9;
        seat = 3;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button67ActionPerformed

    private void Button68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button68ActionPerformed
        if(Button68.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 9;
        seat = 4;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button68ActionPerformed

    private void Button69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button69ActionPerformed
        if(Button69.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 9;
        seat = 5;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button69ActionPerformed

    private void Button70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button70ActionPerformed
        if(Button70.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 9;
        seat = 6;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button70ActionPerformed

    private void Button71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button71ActionPerformed
        if(Button71.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 9;
        seat = 7;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button71ActionPerformed

    private void Button72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button72ActionPerformed
        if(Button72.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 9;
        seat = 8;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button72ActionPerformed

    private void Button73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button73ActionPerformed
        if(Button73.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 10;
        seat = 1;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button73ActionPerformed

    private void Button74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button74ActionPerformed
        if(Button74.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 10;
        seat = 2;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button74ActionPerformed

    private void Button75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button75ActionPerformed
        if(Button75.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 10;
        seat = 3;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button75ActionPerformed

    private void Button76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button76ActionPerformed
        if(Button76.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 10;
        seat = 4;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button76ActionPerformed

    private void Button77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button77ActionPerformed
        if(Button77.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 10;
        seat = 5;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button77ActionPerformed

    private void Button78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button78ActionPerformed
        if(Button78.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 10;
        seat = 6;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button78ActionPerformed

    private void Button79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button79ActionPerformed
        if(Button79.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 10;
        seat = 7;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button79ActionPerformed

    private void Button80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button80ActionPerformed
        if(Button80.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 10;
        seat = 8;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button80ActionPerformed

    private void Button81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button81ActionPerformed
        if(Button81.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 11;
        seat = 1;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button81ActionPerformed

    private void Button82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button82ActionPerformed
        if(Button82.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 11;
        seat = 2;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button82ActionPerformed

    private void Button83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button83ActionPerformed
        if(Button83.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 11;
        seat = 3;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button83ActionPerformed

    private void Button84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button84ActionPerformed
        if(Button84.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 11;
        seat = 4;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button84ActionPerformed

    private void Button85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button85ActionPerformed
        if(Button85.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 11;
        seat = 5;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button85ActionPerformed

    private void Button86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button86ActionPerformed
        if(Button86.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 11;
        seat = 6;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button86ActionPerformed

    private void Button87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button87ActionPerformed
        if(Button87.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 11;
        seat = 7;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button87ActionPerformed

    private void Button88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button88ActionPerformed
        if(Button88.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 11;
        seat = 8;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button88ActionPerformed

    private void Button89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button89ActionPerformed
        if(Button89.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 12;
        seat = 1;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button89ActionPerformed

    private void Button90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button90ActionPerformed
        if(Button90.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 12;
        seat = 2;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button90ActionPerformed

    private void Button91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button91ActionPerformed
        if(Button91.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 12;
        seat = 3;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button91ActionPerformed

    private void Button92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button92ActionPerformed
        if(Button92.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 12;
        seat = 4;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button92ActionPerformed

    private void Button93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button93ActionPerformed
        if(Button93.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 12;
        seat = 5;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button93ActionPerformed

    private void Button94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button94ActionPerformed
        if(Button94.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 12;
        seat = 6;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button94ActionPerformed

    private void Button95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button95ActionPerformed
        if(Button95.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 12;
        seat = 7;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button95ActionPerformed

    private void Button96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button96ActionPerformed
        if(Button96.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 12;
        seat = 8;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button96ActionPerformed

    private void Button97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button97ActionPerformed
        if(Button97.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 13;
        seat = 1;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button97ActionPerformed

    private void Button98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button98ActionPerformed
        if(Button98.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 13;
        seat = 2;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button98ActionPerformed

    private void Button99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button99ActionPerformed
        if(Button99.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 13;
        seat = 3;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button99ActionPerformed

    private void Button100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button100ActionPerformed
        if(Button100.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 13;
        seat = 4;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button100ActionPerformed

    private void Button101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button101ActionPerformed
        if(Button101.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 13;
        seat = 5;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button101ActionPerformed

    private void Button102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button102ActionPerformed
       if(Button102.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 13;
        seat = 6;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button102ActionPerformed

    private void Button103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button103ActionPerformed
        if(Button103.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 13;
        seat = 7;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button103ActionPerformed

    private void Button104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button104ActionPerformed
        if(Button104.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 13;
        seat = 8;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button104ActionPerformed

    private void Button105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button105ActionPerformed
        if(Button105.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 14;
        seat = 1;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button105ActionPerformed

    private void Button106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button106ActionPerformed
        if(Button106.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 14;
        seat = 2;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button106ActionPerformed

    private void Button107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button107ActionPerformed
        if(Button107.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 14;
        seat = 3;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button107ActionPerformed

    private void Button108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button108ActionPerformed
        if(Button108.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 14;
        seat = 4;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button108ActionPerformed

    private void Button109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button109ActionPerformed
        if(Button109.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 14;
        seat = 5;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button109ActionPerformed

    private void Button110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button110ActionPerformed
        if(Button110.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 14;
        seat = 6;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button110ActionPerformed

    private void Button111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button111ActionPerformed
        if(Button111.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 14;
        seat = 7;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button111ActionPerformed

    private void Button112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button112ActionPerformed
        if(Button112.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 14;
        seat = 8;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button112ActionPerformed

    private void Button113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button113ActionPerformed
        if(Button113.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 15;
        seat = 1;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button113ActionPerformed

    private void Button114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button114ActionPerformed
        if(Button114.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 15;
        seat = 2;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button114ActionPerformed

    private void Button115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button115ActionPerformed
       if(Button115.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 15;
        seat = 3;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button115ActionPerformed

    private void Button116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button116ActionPerformed
        if(Button116.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 15;
        seat = 4;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button116ActionPerformed

    private void Button117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button117ActionPerformed
        if(Button117.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 15;
        seat = 5;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button117ActionPerformed

    private void Button118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button118ActionPerformed
        if(Button118.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 15;
        seat = 6;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button118ActionPerformed

    private void Button119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button119ActionPerformed
        if(Button119.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 15;
        seat = 7;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button119ActionPerformed

    private void Button120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button120ActionPerformed
        if(Button120.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in business class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 15;
        seat = 8;
        type = E_ClassType.Business;
        dispose();
        }
    }//GEN-LAST:event_Button120ActionPerformed
// Tourists Class Seats
    private void Button121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button121ActionPerformed
        if(Button121.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 16;
        seat = 1;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button121ActionPerformed

    private void Button122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button122ActionPerformed
        if(Button122.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 16;
        seat = 2;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button122ActionPerformed

    private void Button123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button123ActionPerformed
        if(Button123.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 16;
        seat = 3;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button123ActionPerformed

    private void Button124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button124ActionPerformed
        if(Button124.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 16;
        seat = 4;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button124ActionPerformed

    private void Button125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button125ActionPerformed
        if(Button125.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 16;
        seat = 5;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button125ActionPerformed

    private void Button126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button126ActionPerformed
        if(Button126.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 16;
        seat = 6;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button126ActionPerformed

    private void Button127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button127ActionPerformed
        if(Button127.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 16;
        seat = 7;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button127ActionPerformed

    private void Button128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button128ActionPerformed
        if(Button48.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 16;
        seat = 8;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button128ActionPerformed

    private void Button129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button129ActionPerformed
        if(Button129.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 17;
        seat = 1;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button129ActionPerformed

    private void Button130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button130ActionPerformed
        if(Button130.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 17;
        seat = 2;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button130ActionPerformed

    private void Button131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button131ActionPerformed
        if(Button131.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 17;
        seat = 3;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button131ActionPerformed

    private void Button132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button132ActionPerformed
        if(Button132.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 17;
        seat = 4;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button132ActionPerformed

    private void Button133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button133ActionPerformed
        if(Button133.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 17;
        seat = 5;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button133ActionPerformed

    private void Button134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button134ActionPerformed
        if(Button134.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 17;
        seat = 6;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button134ActionPerformed

    private void Button135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button135ActionPerformed
        if(Button135.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 17;
        seat = 7;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button135ActionPerformed

    private void Button136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button136ActionPerformed
        if(Button136.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 17;
        seat = 8;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button136ActionPerformed

    private void Button137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button137ActionPerformed
        if(Button137.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 18;
        seat = 1;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button137ActionPerformed

    private void Button138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button138ActionPerformed
        if(Button138.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 18;
        seat = 2;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button138ActionPerformed

    private void Button139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button139ActionPerformed
        if(Button139.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 18;
        seat = 3;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button139ActionPerformed

    private void Button140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button140ActionPerformed
        if(Button140.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 18;
        seat = 4;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button140ActionPerformed

    private void Button141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button141ActionPerformed
        if(Button141.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 18;
        seat = 5;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button141ActionPerformed

    private void Button142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button142ActionPerformed
        if(Button142.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 18;
        seat = 6;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button142ActionPerformed

    private void Button143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button143ActionPerformed
        if(Button143.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 18;
        seat = 7;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button143ActionPerformed

    private void Button144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button144ActionPerformed
        if(Button144.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 18;
        seat = 8;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button144ActionPerformed

    private void Button145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button145ActionPerformed
        if(Button145.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 19;
        seat = 1;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button145ActionPerformed

    private void Button146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button146ActionPerformed
        if(Button146.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 19;
        seat = 2;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button146ActionPerformed

    private void Button147ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button147ActionPerformed
        if(Button147.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 19;
        seat = 3;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button147ActionPerformed

    private void Button148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button148ActionPerformed
        if(Button148.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 19;
        seat = 4;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button148ActionPerformed

    private void Button149ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button149ActionPerformed
        if(Button149.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 19;
        seat = 5;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button149ActionPerformed

    private void Button150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button150ActionPerformed
        if(Button150.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 19;
        seat = 6;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button150ActionPerformed

    private void Button151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button151ActionPerformed
        if(Button151.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 19;
        seat = 7;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button151ActionPerformed

    private void Button152ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button152ActionPerformed
        if(Button152.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 19;
        seat = 8;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button152ActionPerformed

    private void Button153ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button153ActionPerformed
        if(Button153.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 20;
        seat = 1;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button153ActionPerformed

    private void Button154ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button154ActionPerformed
        if(Button154.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 20;
        seat = 2;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button154ActionPerformed

    private void Button156ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button156ActionPerformed
        if(Button156.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 20;
        seat = 4;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button156ActionPerformed

    private void Button157ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button157ActionPerformed
        if(Button157.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button157.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 20;
        seat = 5;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button157ActionPerformed

    private void Button158ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button158ActionPerformed
        if(Button158.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 20;
        seat = 6;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button158ActionPerformed

    private void Button159ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button159ActionPerformed
        if(Button159.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 20;
        seat = 7;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button159ActionPerformed

    private void Button160ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button160ActionPerformed
       if(Button160.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 20;
        seat = 8;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button160ActionPerformed

    private void Button161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button161ActionPerformed
        if(Button161.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 21;
        seat = 1;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button161ActionPerformed

    private void Button162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button162ActionPerformed
        if(Button162.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 21;
        seat = 2;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button162ActionPerformed

    private void Button163ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button163ActionPerformed
        if(Button163.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 21;
        seat = 3;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button163ActionPerformed

    private void Button164ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button164ActionPerformed
        if(Button164.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 21;
        seat = 4;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button164ActionPerformed

    private void Button165ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button165ActionPerformed
        if(Button165.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 21;
        seat = 5;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button165ActionPerformed

    private void Button166ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button166ActionPerformed
        if(Button166.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button166.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 21;
        seat = 6;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button166ActionPerformed

    private void Button167ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button167ActionPerformed
        if(Button167.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 21;
        seat = 7;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button167ActionPerformed

    private void Button168ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button168ActionPerformed
        if(Button168.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 21;
        seat = 8;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button168ActionPerformed

    private void Button169ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button169ActionPerformed
        if(Button169.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button169.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 22;
        seat = 1;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button169ActionPerformed

    private void Button170ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button170ActionPerformed
        if(Button170.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 22;
        seat = 2;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button170ActionPerformed

    private void Button171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button171ActionPerformed
        if(Button171.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 22;
        seat = 3;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button171ActionPerformed

    private void Button172ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button172ActionPerformed
        if(Button172.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 22;
        seat = 4;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button172ActionPerformed

    private void Button173ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button173ActionPerformed
        if(Button173.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 22;
        seat = 5;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button173ActionPerformed

    private void Button174ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button174ActionPerformed
        if(Button174.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 22;
        seat = 6;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button174ActionPerformed

    private void Button175ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button175ActionPerformed
        if(Button175.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 22;
        seat = 7;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button175ActionPerformed

    private void Button176ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button176ActionPerformed
        if(Button48.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 22;
        seat = 8;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button176ActionPerformed

    private void Button177ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button177ActionPerformed
        if(Button177.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button177.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 23;
        seat = 1;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button177ActionPerformed

    private void Button178ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button178ActionPerformed
        if(Button178.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button178.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 23;
        seat = 2;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button178ActionPerformed

    private void Button179ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button179ActionPerformed
        if(Button179.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 23;
        seat = 3;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button179ActionPerformed

    private void Button180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button180ActionPerformed
        if(Button180.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 23;
        seat = 4;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button180ActionPerformed

    private void Button181ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button181ActionPerformed
        if(Button181.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 23;
        seat = 5;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button181ActionPerformed

    private void Button182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button182ActionPerformed
       if(Button182.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 23;
        seat = 6;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button182ActionPerformed

    private void Button183ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button183ActionPerformed
        if(Button183.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button183.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 23;
        seat = 7;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button183ActionPerformed

    private void Button184ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button184ActionPerformed
        if(Button184.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button184.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 23;
        seat = 8;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button184ActionPerformed

    private void Button185ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button185ActionPerformed
        if(Button185.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button185.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 24;
        seat = 1;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button185ActionPerformed

    private void Button186ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button186ActionPerformed
        if(Button186.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button186.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 24;
        seat = 2;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button186ActionPerformed

    private void Button187ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button187ActionPerformed
        if(Button187.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button187.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 24;
        seat = 3;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button187ActionPerformed

    private void Button188ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button188ActionPerformed
        if(Button188.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button188.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 24;
        seat = 4;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button188ActionPerformed

    private void Button189ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button189ActionPerformed
        if(Button189.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button189.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 24;
        seat = 5;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button189ActionPerformed

    private void Button190ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button190ActionPerformed
        if(Button190.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button190.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 24;
        seat = 6;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button190ActionPerformed

    private void Button191ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button191ActionPerformed
        if(Button191.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button191.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 24;
        seat = 7;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button191ActionPerformed

    private void Button192ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button192ActionPerformed
        if(Button192.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button192.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 24;
        seat = 8;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button192ActionPerformed

    private void Button194ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button194ActionPerformed
        if(Button194.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button194.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 25;
        seat = 2;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button194ActionPerformed

    private void Button195ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button195ActionPerformed
        if(Button195.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button195.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 25;
        seat = 3;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button195ActionPerformed

    private void Button196ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button196ActionPerformed
        if(Button196.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button196.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 25;
        seat = 4;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button196ActionPerformed

    private void Button197ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button197ActionPerformed
        if(Button197.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button197.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 25;
        seat = 5;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button197ActionPerformed

    private void Button198ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button198ActionPerformed
        if(Button198.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button198.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 25;
        seat = 6;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button198ActionPerformed

    private void Button199ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button199ActionPerformed
        if(Button199.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button199.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 25;
        seat = 7;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button199ActionPerformed

    private void Button200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button200ActionPerformed
        if(Button200.getName() != null){
            view.sound("/sounds/errorSound.wav"); 
           JOptionPane.showMessageDialog(null, "Sorry this seat is already taken", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/symbolError.png"));
        }else{
        view.sound("/sounds/okSound.wav");
        Button200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengerRedSeat.png")));
        JOptionPane.showMessageDialog(null, "You choose a seat in tourists class ", "Added Message", JOptionPane.PLAIN_MESSAGE, view.icon("/images/succeedIcon.png"));
        row = 25;
        seat = 8;
        type = E_ClassType.Tourists;
        dispose();
        }
    }//GEN-LAST:event_Button200ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        view.sound("/sounds/errorSound.wav");
                int response = JOptionPane.showConfirmDialog(null, "You dident choose a seat! \nwould you like to try again?", "Add Error", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    
                } else {
                    flg=1;
                    dispose();
                }
    }//GEN-LAST:event_formWindowClosing

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(Seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Seats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Seats dialog = new Seats(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button10;
    private javax.swing.JButton Button100;
    private javax.swing.JButton Button101;
    private javax.swing.JButton Button102;
    private javax.swing.JButton Button103;
    private javax.swing.JButton Button104;
    private javax.swing.JButton Button105;
    private javax.swing.JButton Button106;
    private javax.swing.JButton Button107;
    private javax.swing.JButton Button108;
    private javax.swing.JButton Button109;
    private javax.swing.JButton Button11;
    private javax.swing.JButton Button110;
    private javax.swing.JButton Button111;
    private javax.swing.JButton Button112;
    private javax.swing.JButton Button113;
    private javax.swing.JButton Button114;
    private javax.swing.JButton Button115;
    private javax.swing.JButton Button116;
    private javax.swing.JButton Button117;
    private javax.swing.JButton Button118;
    private javax.swing.JButton Button119;
    private javax.swing.JButton Button12;
    private javax.swing.JButton Button120;
    private javax.swing.JButton Button121;
    private javax.swing.JButton Button122;
    private javax.swing.JButton Button123;
    private javax.swing.JButton Button124;
    private javax.swing.JButton Button125;
    private javax.swing.JButton Button126;
    private javax.swing.JButton Button127;
    private javax.swing.JButton Button128;
    private javax.swing.JButton Button129;
    private javax.swing.JButton Button13;
    private javax.swing.JButton Button130;
    private javax.swing.JButton Button131;
    private javax.swing.JButton Button132;
    private javax.swing.JButton Button133;
    private javax.swing.JButton Button134;
    private javax.swing.JButton Button135;
    private javax.swing.JButton Button136;
    private javax.swing.JButton Button137;
    private javax.swing.JButton Button138;
    private javax.swing.JButton Button139;
    private javax.swing.JButton Button14;
    private javax.swing.JButton Button140;
    private javax.swing.JButton Button141;
    private javax.swing.JButton Button142;
    private javax.swing.JButton Button143;
    private javax.swing.JButton Button144;
    private javax.swing.JButton Button145;
    private javax.swing.JButton Button146;
    private javax.swing.JButton Button147;
    private javax.swing.JButton Button148;
    private javax.swing.JButton Button149;
    private javax.swing.JButton Button15;
    private javax.swing.JButton Button150;
    private javax.swing.JButton Button151;
    private javax.swing.JButton Button152;
    private javax.swing.JButton Button153;
    private javax.swing.JButton Button154;
    private javax.swing.JButton Button155;
    private javax.swing.JButton Button156;
    private javax.swing.JButton Button157;
    private javax.swing.JButton Button158;
    private javax.swing.JButton Button159;
    private javax.swing.JButton Button16;
    private javax.swing.JButton Button160;
    private javax.swing.JButton Button161;
    private javax.swing.JButton Button162;
    private javax.swing.JButton Button163;
    private javax.swing.JButton Button164;
    private javax.swing.JButton Button165;
    private javax.swing.JButton Button166;
    private javax.swing.JButton Button167;
    private javax.swing.JButton Button168;
    private javax.swing.JButton Button169;
    private javax.swing.JButton Button17;
    private javax.swing.JButton Button170;
    private javax.swing.JButton Button171;
    private javax.swing.JButton Button172;
    private javax.swing.JButton Button173;
    private javax.swing.JButton Button174;
    private javax.swing.JButton Button175;
    private javax.swing.JButton Button176;
    private javax.swing.JButton Button177;
    private javax.swing.JButton Button178;
    private javax.swing.JButton Button179;
    private javax.swing.JButton Button18;
    private javax.swing.JButton Button180;
    private javax.swing.JButton Button181;
    private javax.swing.JButton Button182;
    private javax.swing.JButton Button183;
    private javax.swing.JButton Button184;
    private javax.swing.JButton Button185;
    private javax.swing.JButton Button186;
    private javax.swing.JButton Button187;
    private javax.swing.JButton Button188;
    private javax.swing.JButton Button189;
    private javax.swing.JButton Button19;
    private javax.swing.JButton Button190;
    private javax.swing.JButton Button191;
    private javax.swing.JButton Button192;
    private javax.swing.JButton Button193;
    private javax.swing.JButton Button194;
    private javax.swing.JButton Button195;
    private javax.swing.JButton Button196;
    private javax.swing.JButton Button197;
    private javax.swing.JButton Button198;
    private javax.swing.JButton Button199;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button20;
    private javax.swing.JButton Button200;
    private javax.swing.JButton Button21;
    private javax.swing.JButton Button22;
    private javax.swing.JButton Button23;
    private javax.swing.JButton Button24;
    private javax.swing.JButton Button25;
    private javax.swing.JButton Button26;
    private javax.swing.JButton Button27;
    private javax.swing.JButton Button28;
    private javax.swing.JButton Button29;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button30;
    private javax.swing.JButton Button31;
    private javax.swing.JButton Button32;
    private javax.swing.JButton Button33;
    private javax.swing.JButton Button34;
    private javax.swing.JButton Button35;
    private javax.swing.JButton Button36;
    private javax.swing.JButton Button37;
    private javax.swing.JButton Button38;
    private javax.swing.JButton Button39;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button40;
    private javax.swing.JButton Button41;
    private javax.swing.JButton Button42;
    private javax.swing.JButton Button43;
    private javax.swing.JButton Button44;
    private javax.swing.JButton Button45;
    private javax.swing.JButton Button46;
    private javax.swing.JButton Button47;
    private javax.swing.JButton Button48;
    private javax.swing.JButton Button49;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button50;
    private javax.swing.JButton Button51;
    private javax.swing.JButton Button52;
    private javax.swing.JButton Button53;
    private javax.swing.JButton Button54;
    private javax.swing.JButton Button55;
    private javax.swing.JButton Button56;
    private javax.swing.JButton Button57;
    private javax.swing.JButton Button58;
    private javax.swing.JButton Button59;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button60;
    private javax.swing.JButton Button61;
    private javax.swing.JButton Button62;
    private javax.swing.JButton Button63;
    private javax.swing.JButton Button64;
    private javax.swing.JButton Button65;
    private javax.swing.JButton Button66;
    private javax.swing.JButton Button67;
    private javax.swing.JButton Button68;
    private javax.swing.JButton Button69;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button70;
    private javax.swing.JButton Button71;
    private javax.swing.JButton Button72;
    private javax.swing.JButton Button73;
    private javax.swing.JButton Button74;
    private javax.swing.JButton Button75;
    private javax.swing.JButton Button76;
    private javax.swing.JButton Button77;
    private javax.swing.JButton Button78;
    private javax.swing.JButton Button79;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button80;
    private javax.swing.JButton Button81;
    private javax.swing.JButton Button82;
    private javax.swing.JButton Button83;
    private javax.swing.JButton Button84;
    private javax.swing.JButton Button85;
    private javax.swing.JButton Button86;
    private javax.swing.JButton Button87;
    private javax.swing.JButton Button88;
    private javax.swing.JButton Button89;
    private javax.swing.JButton Button9;
    private javax.swing.JButton Button90;
    private javax.swing.JButton Button91;
    private javax.swing.JButton Button92;
    private javax.swing.JButton Button93;
    private javax.swing.JButton Button94;
    private javax.swing.JButton Button95;
    private javax.swing.JButton Button96;
    private javax.swing.JButton Button97;
    private javax.swing.JButton Button98;
    private javax.swing.JButton Button99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables



}
