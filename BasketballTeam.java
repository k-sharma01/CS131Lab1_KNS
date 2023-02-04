/**
 * This is a class representing a basketball team
 * @author Kirin Sharma
 * @version 1.0
 * Lab 1
 * CS 131 Spring 2023
 */

public class BasketballTeam extends SportsTeam {

	private int fieldGoals; // number of field goals made
	private int fieldGoalsAttempted; // number of field goals attempted
	private int freeThrows; // number of free throws made
	private int freeThrowsAttempted; // number of free throws attempted
	
	/**
	 * Empty argument constructor sets all String fields to "" and all int fields to 0
	 */
	public BasketballTeam()
	{
		super();
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
	} // end default constructor
	
	/**
	 * Preferred constructor allows caller to pass values in for some instance variables
	 * @param teamName
	 * @param teamMascot
	 * @param headCoach
	 */
	public BasketballTeam(String teamName, String teamMascot, String headCoach)
	{
		super(teamName, teamMascot, headCoach);
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
	} // end preferred constructor
	
	/**
	 * Calculates the field goal percentage of a team
	 * @return
	 */
	public double fieldGoalPercentage()
	{
		return (fieldGoals / (double) fieldGoalsAttempted);
	} // end fieldGoalPercentage
	
	/**
	 * Calculates the free throw percentage of a team
	 * @return
	 */
	public double freeThrowPercentage()
	{
		return (freeThrows / (double) freeThrowsAttempted);
	} // end freeThrowPercentage
	
	/**
	 * Setter for the int values in the object
	 * @param numWins
	 * @param numLosses
	 * @param fgs
	 * @param fgas
	 * @param fts
	 * @param ftas
	 */
	public void setStats(int numWins, int numLosses, int fgs, int fgas, int fts, int ftas)
	{
		wins = numWins;
		losses = numLosses;
		fieldGoals = fgs;
		fieldGoalsAttempted = fgas;
		freeThrows = fts;
		freeThrowsAttempted = ftas;
	} // end setStats

	@Override
	/**
	 * Returns array of stats for a basketball team
	 */
	public double[] getStats() 
	{
		double [] stats = new double[3];
		stats[0] = getWinPercentage();
		stats[1] = fieldGoalPercentage();
		stats[2] = 	freeThrowPercentage();
		return stats;
	} // end freeThrowPercentage
	
} // end class
