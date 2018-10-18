package controller;

import view.LoadScreen;

/**
 * The Main Class -The program runner 
 * @author Aviad Ben Hayun
 */
@SuppressWarnings("serial")
public class MainClass implements java.io.Serializable{
	
        private static IFly iFlyController;
       
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
       LoadScreen loadScreen = new LoadScreen(); // create new splash screen
	   iFlyController = IFly.getInstance();
           iFlyController.addUser("admin","123");  // for the checkers
	}
	
}// ~ END OF Class MainClass
