package in.scsvmv.retail;

public class LineItem {

	private String itemName;

	private double price;

	private double quantity;
	private static int invoiceCount=0;
	public LineItem()
	{
		invoiceCount = invoiceCount + 1;
		price = 0;
		quantity = 0;
		
	}
	public static int getInvoiceCount() {
		return invoiceCount;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
	
}