public class Supplier
{
	private int supplierID; //unique ID of supplier
	private String name; // Name of the supplier
	private String phoneNumber; // Number of the supplier (Contact person?)
	private String email; // Email of the supplier (Contact person?)
	// TODO: INGREDIENTS SOLD FIELD

	// Constructor for Supplier
	public Supplier(String _name, String _phoneNumber, String _email)
	{
		name = _name;
		phtonNumber = _phoneNumber;
		email = _email;
	}
}