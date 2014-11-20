package in.scsvmv.retail;

import java.util.Set;

/**
 * InvoiceValidator validates all input passed to the Class Invoice
 * @author ccna
 */

public class InvoiceValidator {
	
	/**
	 * Validate Method is used to perform all the validation
	 * @param invoice
	 * @throws ValidationException 
	 */
	
	public void  validate(Invoice invoice) throws ValidationException
	{
		validateInvoiceNumber(invoice);
		validateLineItemAvailability(invoice);
		validateLineItems(invoice);
	}
	
	/**
	 * Validates the invoice number
	 * @param invoice
	 * @throws ValidationException 
	 */
	
	private void  validateInvoiceNumber(Invoice invoice) throws ValidationException
	{
	
		
		if(invoice.getInvoiceNo() < 1)
		{
			throw new ValidationException("Invalid invoice number. Invoice Number should be greater than 0!");
		}
		
	}
	
	private void validateLineItems(Invoice invoice) throws ValidationException
	{
		LineItemValidator validator = new LineItemValidator();
		
		Set<LineItem> items = invoice.getSetLineItems();
		for(LineItem item:items)
		{
			validator.validate(item);
		}
	}
	private void validateLineItemAvailability(Invoice invoice)
	{
		
	}


}
