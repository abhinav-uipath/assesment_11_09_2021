package service;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.CRUDOpreation.Customer;
import com.hibernate.CRUDOpreation.Product;

import hibernate.util.HibernateUtil;
public class ProductService {


		static SessionFactory sessionFactoryObj;
		static Session sessionObj;

		//////////////// POST request//////////////////////////////////////////

		/* Method to CREATE an employee in the database business logic */
		public Integer addProduct(String productCategory, String productDescription , String productManufacturer,
						String productName, int productPrice, int productUnit) {

			Transaction tx = null;
			Integer productID = null;

			try {

				sessionObj = HibernateUtil.buildSessionFactory().openSession();
				tx = sessionObj.beginTransaction();

				Product product = new Product (productCategory,productDescription,productManufacturer,productName,productPrice, productUnit);
				
				// created the object of employee class
				productID = (Integer) sessionObj.save(product); // save the object or insert the recording

				tx.commit();// explictiy call the commit esure that auto commite should be false
			} catch (HibernateException e) {
				if (tx != null)
					tx.rollback();
				e.printStackTrace();
			} finally {
				sessionObj.close();
			}
			return productID;
		}

		//////////////// GET request//////////////////////////////////////////

		// list

		/* Method to CREATE an employee in the database business logic */
		public void ListAllProduct() {
			System.out.println(" *************from inside  ListAllProduct()**********************  ");
			Transaction tx = null;
			try {

				sessionObj = HibernateUtil.buildSessionFactory().openSession();
				tx = sessionObj.beginTransaction();
				// retrive logic
				List products = sessionObj.createQuery("From Product").list(); // select * from employee: "Employee refer
																					// Employee class
				Iterator iterator = products.iterator();
				while (iterator.hasNext()) {
					Product product1 = (Product) iterator.next();
					System.out.println("Product  Category " + product1.getProductCategory());
					System.out.println("Product  Description" + product1.getProductDescription());
					System.out.println("Product  Manufacturer " + product1.getProductManufacturer());
					System.out.println("Product  Name "+product1.getProductName());
					System.out.println("Product  Price "+product1.getProductPrice());
					System.out.println("Product  Unit  "+product1.getProductUnit());
					
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
	public void updateProductDetails(Integer ProductID, String ProductCategory ) {
			System.out.println(" *************from inside  updateProductDetails()**********************  ");
			Transaction tx = null;
			try {

				sessionObj = HibernateUtil.buildSessionFactory().openSession();
				tx = sessionObj.beginTransaction();
				// update logic

				Product product = (Product) sessionObj.get(Product.class, ProductID);

				product.setProductCategory(ProductCategory);
				

				sessionObj.update(product);// hibernate will form update query automatically

				System.out.println("update sucessfully..."+product.getProductId()+" "+product.getProductName());

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
		public void deleteProductDetailsById(Integer ProductId, String ProductName) {
			System.out.println(" *************from inside  deleteCustomerDetailsById()**********************  ");
			Transaction tx = null;
			try {

				sessionObj = HibernateUtil.buildSessionFactory().openSession();
				tx = sessionObj.beginTransaction();
	//update logic

				Product product = (Product) sessionObj.get(Product.class, ProductId);

				product.setProductName(ProductName);
				

				sessionObj.delete(product);// hibernate will form delete query automatically

				System.out.println("deleted sucessfully..."+product.getProductId());

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
