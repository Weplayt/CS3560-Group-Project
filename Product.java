public class Product
{
	private int productID; // The given ID reference to the product
	private String name; // The display name of the product
	private String description; // Short description of the product
	private int calories; // specified calories the product has
	private int standardPrice; // the base price of the product

	// Constructor for Product
	public Product(String _name, String _description, int _calories, int _standardPrice)
	{
		name = _name;
		description = _description;
		calories = _calories;
		standardPrice = _standardPrice;
	}

}