package usinglambdainprimenumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

interface Prime{
	void checkPrime(List<Integer> number);
}
public class PrimeNumber {

	public static void main(String args[])throws IOException {
		
		List<Integer> listOfNumber=new ArrayList<Integer>();
		
		//adding ranraom values to list
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 25 random numbers : ");
	    for(int i=0;i<25;i++) {
	    	listOfNumber.add(Integer.parseInt(bufferedReader.readLine()));
	    }
	    System.out.println("All the prime numbers are");
	    Prime prime=(numbers)->{
	    	for(int j=0;j<25;j++) {
	    		int flag=0;
	    		for(int i=2;i<=listOfNumber.get(j)/2;i++) {
		    		if((listOfNumber.get(j)%i)==0) {
		    		  flag=1;
		    		  break;
		    		}
		    		
	    	     }
	    		if(flag==0) {
	    			System.out.println(listOfNumber.get(j)+" is prime number");	
	    		}
	    	}
	    };
	    prime.checkPrime(listOfNumber);
	    
	}
}