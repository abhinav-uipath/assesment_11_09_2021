package streams;

import java.util.ArrayList;
import java.util.List;

public class ManageEmployee {

	public static void main(String a[]) {

		List<StreamEmployee> empList = new ArrayList<>();
		empList.add(new StreamEmployee("Abhinav", "delhi", 900));
		empList.add(new StreamEmployee("Aman", "mumbai", 65000));
		empList.add(new StreamEmployee("Yashika", "gurgaon", 12500));
		empList.add(new StreamEmployee("Avinash", "delhi", 19000));

		// find employees whose job location is pune
		empList.stream().filter(emp -> emp.getLocation() == "delhi").forEach(System.out::println);
	}
}
