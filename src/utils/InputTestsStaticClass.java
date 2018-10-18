package utils;

import exceptions.*;

import javax.swing.JComboBox;

/**
 * @author Aviad
 */
public class InputTestsStaticClass {

    /**
     * method for checking empty text fields. the method throw exceptions if any of textFields are empty.
     * @param fields
     * @throws MissingDataException
     */
    public static void checkEmptyTextFields(String... fields) throws MissingDataException {
        for (String s : fields) { // for over all the fields we got
            if (s.length() == Constants.LOWEST_VALUE){ // check if the string length is 0.
                throw new MissingDataException();
            }
        }
    }

    /**
     * method for checking text input. the method throw exceptions if the text contains numbers.
     * @param text
     * @throws IntegersTestException
     */
    public static void integerTest(String text, String label) throws IntegersTestException {

        char[] chars = text.toCharArray();  // initialize chars array

        for (char c : chars) {
            if (Character.isDigit(c)) {  // check if char is digit
                throw new IntegersTestException(label);
            }
        }
    }

    /**
     * method for checking text input. the method throw exceptions if the text contains spaces.
     * @param text
     * @throws SpacesException
     */
    public static void spacesTest(String text, String label) throws SpacesException {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == " ".charAt(0)) {  // check if the string have spaces
                throw new SpacesException(label);
            }
        }
    }

    /**
     * method for checking text input. the method throw exceptions if the text starts with space.
     * @param text
     * @throws SpaceStartException
     */
    public static void spaceInStartTest(String text, String label) throws SpaceStartException {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(0) == " ".charAt(0)) {
                throw new SpaceStartException(label);
            }
        }
    }

    /**
     * method for checking text input. the method throw exceptions if the text contains letters.
     * @param text
     * @throws LettersTestException
     */
    public static void lettersTest(String text, String label) throws LettersTestException {
        char[] chars = text.toCharArray(); // initialize chars array.
        for (char c : chars) {
            if (Character.isLetter(c)) { //// check if char is letter
                throw new LettersTestException(label);
            }
        }
    }
    /**
     * method for checking the Passport Number length.
     * @param text
     * @throws DigitException
     */
    public static void digitTest(String text) throws DigitException {
        if (text.length() != Constants.PASSPORT_NUMBER_SIZE) {
            throw new DigitException();
        }
    }
    
    /**
     * method for checking if ComboBox values exists in the system. the method throw exceptions if the ComboBox have no items.
     * @param comboBox
     * @param label 
     * @throws NotInTheSystemYestException
     */
    @SuppressWarnings("rawtypes")
	public static void notInSystem(JComboBox comboBox, String label) throws NotInTheSystemYestException {
          if(comboBox.getItemCount() == 0){
                throw new NotInTheSystemYestException(label);
            }
        
    }
}