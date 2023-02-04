/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author Kirin Sharma
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter {
	
	private boolean active; // holds whether the NPC is active or not
	private String intelligenceType; // holds the intelligence type of the NPC
	
	/**
	 * Default constructor calls super constructor and initializes active and intelligenceType
	 */
	public NonPlayerCharacter()
	{
		super();
		setActive(false);
		setIntelligenceType("AVERAGE");
	} // end default constructor
	
	/**
	 * Full argument constructor allows caller to pass in values for id, personality,
	 * active, and intelligenceType
	 * @param id
	 * @param personality
	 * @param active
	 * @param intelligenceType
	 */
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType)
	{
		super(id, personality);
		setActive(active);
		setIntelligenceType(intelligenceType);
	} // end full-argument constructor
	
	/**
	 * Getter for active
	 * @return
	 */
	public boolean getActive()
	{
		return active;
	} // end getActive
	
	/**
	 * Setter for active
	 * @param isActive
	 */
	public void setActive(boolean isActive)
	{
		active = isActive;
	} // end setActive
	
	/**
	 * Getter for intelligenceType
	 * @return
	 */
	public String getIntelligenceType()
	{
		return intelligenceType;
	} // end getIntelligenceType
	
	/**
	 * Setter for intelligenceType
	 * @param intelligenceLevel
	 */
	public void setIntelligenceType(String intelligenceLevel)
	{
		intelligenceType = intelligenceLevel;
	} // end setIntelligenceType
	
	/**
	 * Returns the structure of the object in a formatted representation
	 * @return
	 */
	public String reportStructure()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Active: " + getActive() + "\n");
		sb.append("Intelligence: " + getIntelligenceType() + "\n");
		sb.append("==================================\n");
		return super.reportStructure() + sb.toString();
	} // end reportStructure
	
	/**
	 * Creates a string introducing the npc as its uniqueID
	 * @return
	 */
	public String introduce()
	{
		return ("Hello, my name is " + getUniqueID() + ".");
	} // end introduce
	
	/**
	 * Returns a random exclamation from a list of strings
	 * @return
	 */
	public String exclaim()
	{
		String[] exclamations = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
		int index = (int) (Math.random() * 5);
		return exclamations[index];
	} // end exclaim

} //end class
