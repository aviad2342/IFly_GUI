package core;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Class Branch ~ represent a single branch of the company
 * @author Aviad Ben Hayun
 */
@SuppressWarnings("serial")
public class Branch implements java.io.Serializable{

	//-------------------------------Class Members------------------------------
	/**
	 * Branch's number - the key
	 */
	private Integer branchNumber;
	/**
	 * Branch's name
	 */
	private String branchName;
	/**
	 * All branch's orders
	 */
	private Set<Agent> agents;
	/**
	 * Branch's address
	 */
	private Address branchAddress;
	
	//-------------------------------Constructors-----------------------------
	/**
	 * Full Constructor ~ use for initial all fields
	 * 
	 * @param branchNumber
	 * @param branchName
	 * @param branchAddress
	 */
	public Branch(Integer branchNumber, String branchName, Address branchAddress) {
		super();
		this.branchNumber = branchNumber;
		this.branchName = branchName;
		this.agents = new HashSet<Agent>();
		this.branchAddress = branchAddress;
	}
	
	/**
	 * Partial Constructor ~ use for initial key fields
	 * 
	 * @param branchNumber
	 */
	public Branch(Integer branchNumber) {
		super();
		this.branchNumber = branchNumber;
	}
	
	//-------------------------------Getters And Setters------------------------------
	/**
	 * @return the branchNumber
	 */
	public long getbranchNumber() {
		return branchNumber;
	}

	/**
	 * @param branchNumber the branchNumber to set
	 */
	public void setbranchNumber(Integer branchNumber) {
		this.branchNumber = branchNumber;
	}

	/**
	 * @return the branchName
	 */
	public String getbranchName() {
		return branchName;
	}

	/**
	 * @param branchName the branchName to set
	 */
	public void setbranchName(String branchName) {
		this.branchName = branchName;
	}

	/**
	 * @return the orders
	 */
	public Set<Agent> getAgents() {
		return Collections.unmodifiableSet(agents);
	}

	/**
	 * @return the branchAddress
	 */
	public Address getBranchAddress() {
		return branchAddress;
	}

	/**
	 * @param branchAddress the branchAddress to set
	 */
	public void setBranchAddress(Address branchAddress) {
		this.branchAddress = branchAddress;
	}
	
	//-------------------------------More Methods------------------------------
	/**
	 * The role of this method is to add a new
	 * agent to the agents set
	 * @param agent
	 * @return true if the agent added successfully or false otherwise
	 */
	public boolean addAgent(Agent agent){
		if(agent != null && agents != null)
			if(!agents.contains(agent))
				return agents.add(agent);
		return false;
	}// ~ END OF addAgent
	
	/**
	 * The role of this method is to remove
	 * an agent from the agents set
	 * @param agent
	 * @return true if the agent removed successfuly or false otherwise
	 */
	public boolean removeAgent(Agent agent){
		if(agent != null && agents != null)
			if(agents.contains(agent))
				return agents.remove(agent);
		return false;
	}// ~ END OF removeAgent
	
	
	//-------------------------------hashCode equals & toString------------------------------
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Branch [branchNumber=" + branchNumber + ", branchName="
				+ branchName + ", agents=" + agents + ", branchAddress="
				+ branchAddress + "]";
	}
        /**
         * This method return a custom String to fit program display 
         * @return String
         */
        public String theString() {
            int i = 1;
            String branchAgent = "";
		for(Agent agent : agents){
			branchAgent += i+"."+ agent.toString() + "\n";
                        i++;
                }
		return "******************************** Branch **************************************\n"
                        + "Branch Number: " + branchNumber + ", Branch Name: "+ branchName + "\nAgents:\n" + branchAgent +"Branch Address: "
				+ branchAddress.theString() +"\n" ;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (branchNumber ^ (branchNumber >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Branch other = (Branch) obj;
		if (branchNumber != other.branchNumber)
			return false;
		return true;
	}
	
}// ~ END OF Class Branch
