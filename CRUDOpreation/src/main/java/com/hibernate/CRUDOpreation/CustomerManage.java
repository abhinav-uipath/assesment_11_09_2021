package com.hibernate.CRUDOpreation;

import java.util.ArrayList;
import java.util.List;

import service.CustomerService;
import service.ProductService;

public class CustomerManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerService customerservice = new CustomerService();
		/* Add few Customer records in database */
		Integer cuservice1 = customerservice.addCustomer("Abhinav", "Sharma", "8449602979", 10, 20, 30, 40);

		List<Integer> listinfo = new ArrayList<Integer>();
		listinfo.add(cuservice1);

		if (listinfo.size() != 0) {
			System.out.println("*************************************Inserted******************************");
		} else {
			System.out.println("##############not Inserted########################");

		}

		/* list employee records in database */
		try {
			customerservice.ListAllCustomer();
		} catch (Exception e) {

			e.printStackTrace();
		}

		/* update employee records in database */
	/*	try {
			customerservice.updateCustomerDetails(1, "mno", "pqr");
		} catch (Exception e) {

			e.printStackTrace();
		}

		// delete employee records in database by id 
		try {
			customerservice.deleteCustomerDetailsById(1, "abc");
		} catch (Exception e) {

			e.printStackTrace();
		}*/
		
		
	}}