package service;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.CRUDOpreation.Customer;

import hibernate.util.HibernateUtil;

public class CustomerService {
	static SessionFactory sessionFactoryObj;
	static Session sessionObj;

	//////////////// POST request//////////////////////////////////////////

	/* Method to CREATE an employee in the database business logic */
	public Integer addCustomer(String firstName, String lastName, String customerPhone, int shippingAddressId,
			int billingAddressId, int userId, int cartId) {

		Transaction tx = null;
		Integer customerID = null;

		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();

			Customer customer = new Customer (firstName,lastName,customerPhone,shippingAddressId,billingAddressId, userId, cartId);
			
			// created the object of employee class
			customerID = (Integer) sessionObj.save(customer); // save the object or insert the recording

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
		return customerID;
	}

	//////////////// GET request//////////////////////////////////////////

	// list

	/* Method to CREATE an employee in the database business logic */
	public void ListAllCustomer() {
		System.out.println(" *************from inside  ListAllCustomer()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			// retrive logic
			List customers = sessionObj.createQuery("From Customer").list(); // select * from employee: "Employee refer
																				// Employee class
			Iterator iterator = customers.iterator();
			while (iterator.hasNext()) {
				Customer customer1 = (Customer) iterator.next();
				System.out.println("fist  name  " + customer1.getFirstName());
				System.out.println("last  name  " + customer1.getLastName());
				System.out.println("Customer  Phone Number " + customer1.getCustomerPhone());
				System.out.println("Shipping  Address  ID "+customer1.getShippingAddressId());
				System.out.println("Billing  Address  ID "+customer1.getBillingAddressId());
				System.out.println("User  ID  "+customer1.getUserId());
				System.out.println("Cart  ID "+customer1.getCartId());
				
			}

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
	}

// update

////////////////PUT request   id//////////////////////////////////////////

	/* Method to update an customer in the database business logic */
	public void updateCustomerDetails(Integer CustomerID, String FirstName ,String LastName) {
		System.out.println(" *************from inside  updateEmployeeDetails()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			// update logic

			Customer customer = (Customer) sessionObj.get(Customer.class, CustomerID);

			customer.setFirstName(FirstName);
			customer.setLastName(LastName);

			sessionObj.update(customer);// hibernate will form update query automatically

			System.out.println("update sucessfully..."+customer.getCustomerId()+" "+customer.getCustomerPhone());

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}

	}

// delete

////////////////PUT request   id//////////////////////////////////////////

	/* Method to update an employee in the database business logic */
	public void deleteCustomerDetailsById(Integer CustomerId, String FirstName) {
		System.out.println(" *************from inside  deleteCustomerDetailsById()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
//update logic

			Customer customer = (Customer) sessionObj.get(Customer.class, CustomerId);

		customer.setFirstName(FirstName);

			sessionObj.delete(customer);// hibernate will form delete query automatically

			System.out.println("deleted sucessfully..."+customer.getCustomerId());

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}

	

}
}
