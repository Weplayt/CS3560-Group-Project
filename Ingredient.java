public class Ingredient
{
	private int ingredientID; //The unique ID of the ingredient
	private String name; // Name of the ingredient
	private String description; // Short description of the ingredient
	private int totalQuantity; // Amount of this ingredient that we have (Units?)

	// Constructor for Ingredient
	public Ingredient(String _name, String _description, int _totalQuantity)
	{
		name = _name;
		description = _description;
		totalQuantity = _totalQuantity;
	} 


}