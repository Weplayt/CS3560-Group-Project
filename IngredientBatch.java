public class IngredientBatch extends Batch 
{

    private int ingredientID; //wait are these like actual unique ints or like internal ints that represents indexes 
    private String dateAdded; // (MM/DD/YYYY)
    private String expirationDate; // (MM/DD/YYYY)
    //TODO: Ingredeints in batch var

    //Constructor for IngredientBatch
    public IngredientBatch(String _dateAdded, String _expirationDate)
    {
        dateAdded = _dateAdded;
        expirationDate = _expirationDate;
    }

}