package assesment;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class NameOfStates {
	
	 public static void main(String[] args) throws IOException {
		
		 Set<String> stateSet = new LinkedHashSet<String>();
		 
		BufferedReader b1 = null;
		 
         try 
         {
        	 b1 = new BufferedReader(new FileReader("D:/states.txt"));
        	 String storeValue = b1.readLine();
        	 
        	 while(storeValue!=null) {
        		stateSet.add(storeValue);
        		storeValue = b1.readLine();
        	 }
        	 System.out.println("Total number of states : " +stateSet.size());
        	 System.out.println("Removing Delhi  : "+stateSet.remove("Delhi"));
        	 System.out.println("After removing the Delhi : "+stateSet);
        	 
        	 System.out.print("State which starts with k : ");
 			for(String state:  stateSet) {
 				if(state.charAt(0)=='K' || state.charAt(0)=='k') {
 					System.out.print(state+"  ");
 				}
 			}
 				//Sorting state in another set
 				List<String> stateList=new ArrayList<String>(stateSet);
 				Collections.sort(stateList);
 				Set<String> statesort=new LinkedHashSet<>(stateList);
 				System.out.println("\nStates in sorted order : "+statesort);
         }
 			
 			finally {
 				try {
					b1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
         }
	
         }
}