package in.scsvmv.test;

import in.scsvmv.retail.Invoice;
import in.scsvmv.retail.LineItem;
import in.scsvmv.retail.ValidationException;

public class InvoiceTest {
	/**
	 * @param args
	 * @throws ValidationException
	 */

	public static void main(String[] args) throws ValidationException {

		Invoice invoice = new Invoice();
		LineItem item = new LineItem();
		invoice.setInvoiceNo(1);
		item.setItemName("sugar");
		item.setPrice(100);
		item.setQuantity(2);
		invoice.addLineItem(item);
		
		invoice.printInvoice(item);
	}
}
