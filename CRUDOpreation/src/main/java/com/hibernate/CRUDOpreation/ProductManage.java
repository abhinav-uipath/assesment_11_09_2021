package com.hibernate.CRUDOpreation;

import java.util.ArrayList;
import java.util.List;

import service.ProductService;

public class ProductManage {
	
	public static void main(String arg[]) {
	ProductService productservice = new ProductService();
	/* Add few product records in database */
	Integer proservice = productservice.addProduct("electronic", "phone", "Abc", "mobilephone", 1499, 1);

	List<Integer> productlistinfo = new ArrayList<Integer>();
	productlistinfo.add(proservice);
	{

	if(productlistinfo.size()!=0)
	{
		System.out.println("*************************************Inserted******************************");
	}else
	{
		System.out.println("##############not Inserted########################");

	}

	/* list Product records in database */
	try
	{
		productservice.ListAllProduct();
	}catch(
	Exception e)
	{

		e.printStackTrace();
	}

	/*
	 * update employee records in database try {
	 * productservice.updateProductDetails(1, "jkl"); } catch (Exception e) {
	 * 
	 * e.printStackTrace(); }
	 * 
	 * // delete employee records in database by id try {
	 * productservice.deleteProductDetailsById(1, "a"); } catch (Exception e) {
	 * 
	 * e.printStackTrace(); }
	 */

}

}}
