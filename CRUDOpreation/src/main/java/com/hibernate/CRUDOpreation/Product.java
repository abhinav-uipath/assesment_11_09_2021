package com.hibernate.CRUDOpreation;

public class Product {

	private int productId;
	private String productCategory;
	private String productDescription;
	private String productManufacturer;
	private String productName;
	private int productPrice;
	private int productUnit;
	
	public Product(){
		
	}

	public Product(String productCategory, String productDescription, String productManufacturer,
			String productName, int productPrice, int productUnit) {
		super();
		//ProductId = productId;
		this.productCategory = productCategory;
		this.productDescription = productDescription;
		this.productManufacturer = productManufacturer;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productUnit = productUnit;
	}	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
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

	public int getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(int productUnit) {
		this.productUnit = productUnit;
	}

}
