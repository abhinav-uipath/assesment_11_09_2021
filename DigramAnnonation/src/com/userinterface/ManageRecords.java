package com.userinterface;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.id.IntegralDataTypeHolder;

import com.hibernate.services.CustomerServices;
import com.hibernate.services.ProductServices;

public class ManageRecords {

	public static void main(String args[]) {
		
		/*-----------------------------------------Product Crud Operation-----------------------------------------------*/
		ProductServices productServices=new ProductServices();
		
		Integer product1=productServices.addProduct("Cloths", "XXL", "Coat", 420, 3);
		
		List<Integer> listProduct=new ArrayList<>();
		listProduct.add(product1);
		if(listProduct.size()!=0) {
			System.out.println("Record is inserted");
		}
		else
		{
			System.out.println("Record is not inserted");
		}
		
		/*List of product records in databse*/
		try {
			productServices.listOfAllProducts();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		/*Update product records in database*/
		try {
		productServices.updateProductDetails(2, 600);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/* delete product records in database by id */
		try {
			productServices.deleteProductById(2);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		/*------------------------------------------End of product crud operation-------------------------------------*/
		
		/*------------------------------------------Customer crud operation-------------------------------------------*/
		CustomerServices customerServices=new CustomerServices();
		
		Integer customer1=customerServices.addCustomer("Abhinav", "sharma", "123456789");
		Integer customer2=customerServices.addCustomer("Aman", "Sharma", "123456789");
		List<Integer> listOfCustomer=new ArrayList<>();
		listOfCustomer.add(customer1);
		listOfCustomer.add(customer2);
		if(listOfCustomer.size()!=0) {
			System.out.println("Record is inserted ");
		}
		else {
			System.out.println("Record is not inserted ");
		}
		
		/*List of all customer*/
		try {
			customerServices.listOfAllCustomers();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/*Update customer record in database*/
		try {
			customerServices.updateCustomerDetails(8, "123456789");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/*Delete customer record in database by id*/
		try {
			customerServices.deleteCustomerById(6);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}