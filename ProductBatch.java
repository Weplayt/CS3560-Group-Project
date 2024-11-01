public class ProductBatch extends Batch 
{

    private int productID; //reference to the product 
    private String dateAdded; // (MM/DD/YYYY)
    private String expirationDate; // (MM/DD/YYYY)
    //TODO: Porducts in batch var

    //Create a new batch, with given productID
    public ProductBatch(String _dateAdded, String _expirationDate)
    {
        dateAdded = _dateAdded;
        expirationDate = _expirationDate;
    }

}