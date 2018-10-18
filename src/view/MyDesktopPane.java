/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import  java.awt.Graphics;
import  java.awt.Image;

import  javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

 
/**
 * this class set the desktop pane
 * @author Aviad
 */

@SuppressWarnings("serial")
public class MyDesktopPane extends JDesktopPane implements java.io.Serializable{
    
    //***************************************** Variables *********************************************
    

	/**image variable*/
    private Image image;

    //***************************************** Constructor *********************************************
    public MyDesktopPane() {
    }

    //***************************************** Override Method *********************************************
    @ Override
    protected void paintComponent(Graphics g) {
        try {
            image = new javax.swing.ImageIcon(getClass().getResource("/images/BlackWood.jpg")).getImage();  // get the wallapaper image

            if (g != null) {
                g.drawImage(image,
                        (this.getSize().width - image.getWidth(null)) / 2, // set the frame at the center of the screen
                        (this.getSize().height - image.getHeight(null)) / 2,
                        null);
            }
        } catch (NullPointerException npe) {
            npe.getStackTrace();
            JOptionPane.showMessageDialog(null, "Can't find file!! Continue without the original background" , "Error Background" , JOptionPane.ERROR_MESSAGE);
        }
    }
}
