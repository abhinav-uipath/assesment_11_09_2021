package assesment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMain {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Number Of Students");
		int n = sc.nextInt();
		
		System.out.println("Enter the Marks");
		
		ArrayList<Integer> list = new ArrayList<Integer>(n);
		// adding the marks into list
		for(int i=0;i<n;i++)
			list.add(sc.nextInt());
	
		// for highest marks
		int max = Collections.max(list);
		System.out.println("Student Highest Marks " +max);
		
		// for average marks
		int sum = 0;
		for (Integer i : list) {
			sum = sum + i;
	}
		double average = (sum*1.0)/n;
		System.out.println("student Average Marks " +average);
		
		// getting the marks of 3rd student
		System.out.println("3rd Student List " +list.get(2));
		
		// sorted list
		Collections.sort(list);
		int c = 1;
		System.out.print("sorted Marks : " );
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(c+"-"+itr.next()+" ");
			c++;
		
		}
			
		sc.close();
	}
		
	
}