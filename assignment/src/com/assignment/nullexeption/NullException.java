package com.assignment.nullexeption;

public class NullException {
	public static void main(String[] args)
    {

        // Create a String of size 5
        String[] a = new String[5];

        // The String is empty
        // So a[1] will have null at present
        
        String upcase = a[1].toUpperCase();    //code to uppercase a[1] but it is null

        System.out.print(upcase);
    }
}
