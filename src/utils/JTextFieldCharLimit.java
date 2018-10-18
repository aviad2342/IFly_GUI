/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * @author Aviad
 */
@SuppressWarnings("serial")
public class JTextFieldCharLimit extends PlainDocument{
    
    /**the limit of text*/
    private int limit;
    
    //***************************************** Constructors ******************************************
    public JTextFieldCharLimit(int limitation){
        this.limit = limitation;
    }
    //***************************************** Override Method ******************************************
    @Override
    public void insertString(int offset, String str, AttributeSet set ) throws BadLocationException{
        if(str == null)
            return;
        else if ((getLength()+str.length()) <= limit)
            super.insertString(offset, str, set);
    }
    
    
}
