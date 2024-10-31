public class Batch
{
	private int batchNumber; // Key attribute used to identify the batch
	private int quantity; // Number of products in this batch
	private String expirationDate; // Date of expiration of ALL products in this batch (MM/DD/YYYY)


	// Updates this batch's quantity after using "amount" number of items
	private void updateBatch(int amount)
	{
		// if quantity - amount < 0, we don't have enough products in this batch, search for other batches with this item
		// quantity = quantity - amount
		// if quantity = 0, remove/ notify to remove batch
	}


}