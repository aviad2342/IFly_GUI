package utils;

/**
 * Interface Rating ~ for calculatin rating or score of
 * an Agents and Customers
 * @author Aviad Ben Hayun
 */
public interface Rating {

	/**
	 * @return the entity's primary key
	 */
	public int getPrimaryKey();
	
	/**
	 * Calculate the rating of this entity
	 */
	public double calcRating();
	
}// ~ END OF Interface Rating
