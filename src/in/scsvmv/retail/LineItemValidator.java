package in.scsvmv.retail;

public class LineItemValidator {
	
	
	public void validate(LineItem lineItem) throws ValidationException
	{
		ValidateLineItemAvailable(lineItem);
		ValidateLineItemNullFound(lineItem);
	}
	
	/**
	 * Validates if at least one Line item is present in the invoice 
	 * @param invoice
	 * @throws ValidationException 
	 */
	
	private void validateLineItemAvailablity(LineItem lineItem) throws ValidationException
	{
		if(LineItem.getInvoiceCount()==0)
		{
			throw new ValidationException("No Item Present in Invoice!");
		}
	}
	
	/**
	 * Validates Null Input
	 * @param invoice
	 * @throws ValidationException
	 */
	
	private void ValidateLineItemNullFound(LineItem lineItem) throws ValidationException
	{
		if((lineItem.getItemName() == null) || (lineItem.getQuantity() == 0) || (lineItem.getPrice() == 0) )
		{
			throw new ValidationException("Null Exception Found!");
		}
	}

}
