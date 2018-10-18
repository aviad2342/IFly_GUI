/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;
//***************************************** Imports *********************************************
import javax.swing.JOptionPane;

import view.SoundClass;

/**
 *
 * @author Aviad
 */
@SuppressWarnings("serial")
public class DigitException extends Exception {
//***************************************** Constructor *********************************************

    @SuppressWarnings("unused")
	public DigitException() {
        SoundClass sound = new SoundClass("/sounds/errorSound.wav"); // error sound
        JOptionPane.showMessageDialog(null, "The customer's passport number is less then 8 digits", "Digit Error", JOptionPane.ERROR_MESSAGE);
    }
}