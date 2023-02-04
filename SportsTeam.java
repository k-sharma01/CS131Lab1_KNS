/**
 * This is an abstract class representing a sports team
 * @author Kirin Sharma
 * @version 1.0
 * Lab 1
 * CS 131 Spring 2023
 */

public abstract class SportsTeam {

	//instance variables - visibility is protected so subclasses can manipulate the data directly.
	protected String teamName; // stores the name of the team
	protected String teamMascot; // stores the team mascot
	protected String headCoach; // stores the name of the head coach
	protected int wins; // stores number of wins
	protected int losses; // stores number of losses

	/**
	 * Default constructor initializes all string variables to empty strings and ints to 0
	 */
	public SportsTeam()
	{
		teamName = "";
		teamMascot = "";
		headCoach = "";
		wins = 0;
		losses = 0;
	} // end empty-argument constructor
	
	/**
	 * Preferred constructor allows caller to pass values into some instance variables
	 * @param team
	 * @param mascot
	 * @param coach
	 */
	public SportsTeam(String team, String mascot, String coach)
	{
		teamName = team;
		teamMascot = mascot;
		headCoach = coach;
		wins = 0;
		losses = 0;
	} // end preferred constructor
	
	/**
	 * Calculates the win percentage of the current team
	 * @return
	 */
	public double getWinPercentage()
	{
		return ((double) wins / (wins + losses));
	} // end getWinPercentage
	
	/**
	 * Abstract method that will return an array of doubles representing the stats of a team
	 * @return
	 */
	public abstract double[] getStats(); 
	
} // end class
