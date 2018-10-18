/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import utils.Constants.*;  
/**
 * @author Aviad
 */
@SuppressWarnings("serial")
public class Users implements  java.io.Serializable{
    /**User's name*/
    protected String userName;
    /**User's password*/
    protected String password;
    /**User's type*/
    protected typeOfUser type;
    
    //***************************************** Constructors ******************************************
    public Users(String name , String pass , typeOfUser type){
        this.userName = name;
        this.password = pass;
        this.type = type;
    }
    //***************************************** Getters & Setters *************************************
    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the type
     */
    public typeOfUser getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(typeOfUser type) {
        this.type = type;
    }
    
    
    
}
