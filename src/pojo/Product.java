package pojo;

public class Product {
	
	String productid;
	String productName;
	int productPrice;
	
	public Product() {
		
	}

	public Product(String productid, String productName, int productPrice) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
	

}
