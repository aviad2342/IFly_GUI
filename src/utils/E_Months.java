/**
 * Class Months ~ represent the year Months
 * @author Aviad
 */

package utils;

/**
 *
 * @author Aviad
 */
public enum E_Months {
	//-------------------------------------------------------------Values---------------------------------------------------------------------
	January(1), February(2) , March(3) , April(4) , May(5) , June(6) , July(7) , August(8) , September(9) , October(10) , November(11) , December(12);
	 
	//-------------------------------------------------------------Class Members----------------------------------------------------------------
	private final int month;
	
	//-------------------------------------------------------------Constructor------------------------------------------------------------------
	E_Months(int month){
		this.month = month;
	}
	
	//-------------------------------------------------------------Methods----------------------------------------------------------------------
	public int getMonth() { 
		return month; 
	}

}// ~ END OF Class ClassType
