package com.hibernate.CRUDOpreation;

public class Customer {
	
	private int customerId;
	private String firstName;
	private String lastName;
	private String customerPhone;
	private int shippingAddressId;
	private int billingAddressId;
	private int userId;
	private int cartId;

	public Customer() {

	}

	public Customer(String firstName, String lastName, String customerPhone, int shippingAddressId,
			int billingAddressId, int userId, int cartId) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;
		this.customerPhone = customerPhone;
		this.shippingAddressId = shippingAddressId;
		this.billingAddressId = billingAddressId;
		this.userId = userId;
		this.cartId = cartId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public int getShippingAddressId() {
		return shippingAddressId;
	}

	public void setShippingAddressId(int shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}

	public int getBillingAddressId() {
		return billingAddressId;
	}

	public void setBillingAddressId(int billingAddressId) {
		this.billingAddressId = billingAddressId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
}
