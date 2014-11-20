package in.scsvmv.retail;

import java.util.HashSet;
import java.util.Set;

/**
 * Class Invoice has a set of LineItems*/

public class Invoice { 
	private int invoiceNo;
	
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	private Set<LineItem> setLineItems = new HashSet<LineItem>();
	
	

//Method to add lineItem to the set	
	public void addLineItem(LineItem lineItem){
		if(lineItem != null) {
		setLineItems.add(lineItem);
		}
	}
//Method to remove lineItem from the set
	public void removeLineItem(LineItem lineItem){
		setLineItems.remove(lineItem);	
	}
//Method to get Invoice Number	
	public int getInvoiceNo() {
		return invoiceNo;
	}
//returns the set of lineItems	
	public Set<LineItem> getSetLineItems() {
		
		return setLineItems;
	}
//	
	public void setSetLineItems(Set<LineItem> setLineItems) {
		this.setLineItems = setLineItems;
	}
	public void printInvoice(LineItem item)
	{
		try
		{
			InvoiceValidator validator = new InvoiceValidator();
			validator.validate(this);
			System.out.println(item.getItemName()+"\t"+ item.getQuantity()+"\t"+ item.getPrice());
		}
		catch(ValidationException e)
		{
			System.err.println(e);
		}
		
	}
}