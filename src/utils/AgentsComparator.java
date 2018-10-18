package utils;

import java.util.Comparator;

import core.Agent;

/**
 * Class AgentsComparator ~ use for sorting agents by their rating.<br>
 * If there are two agents with the same rating, the sorting criteria is
 * number of assignment each of them need to do on this summer.
 * @author Aviad Ben Hayun
 */
public class AgentsComparator implements Comparator<Agent> {

	@Override
	public int compare(Agent agent1, Agent agent2) {
		Double agent1Rating = agent1.calcRating();
		Double agent2Rating = agent2.calcRating();
		
		if(agent1Rating.compareTo(agent2Rating) == 0)
			return agent1.getNumberOfThisYearSummerAssignments() - agent2.getNumberOfThisYearSummerAssignments();
		else
			return agent1Rating.compareTo(agent2Rating);
	}
	
} // ~ END OF AgentsComparator
