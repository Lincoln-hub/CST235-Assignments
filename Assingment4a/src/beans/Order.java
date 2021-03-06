package beans;

public class Order {
	
	//declaring variables
	String orderNumber ="";
	String productName ="";
	float price= 0;
	int quantity = 0;
	
	//parameterized constructor
	public Order(String orderNumber, String productName, float price, int quantity) 
	{
		this.orderNumber =orderNumber;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	//getter for orderNumber
	public String getOrderNumber() {
		return orderNumber;
	}

	//setter for orderNumber
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	//getter for productName
	public String getProductName() {
		return productName;
	}

	//setter for productName
	public void setProductName(String productName) {
		this.productName = productName;
	}

	//getter for price
	public float getPrice() {
		return price;
	}

	//setter for orderNumber
	public void setPrice(float price) {
		this.price = price;
	}

	//getter for quantity
	public int getQuantity() {
		return quantity;
	}

	//setter for quantity
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
		
}
