/*Write a program using streams
1. To add five Employee objects into an ArrayList,
2. Filter the Employee objects whose location is Pune,
3. Store them in a separate ArrayList and print their details.

  */




package streams;

public class StreamEmployee {
	 private String name;
	    private String location;
	    private Integer salary;

	    public StreamEmployee(String name, String location, Integer salary) {
	        super();
	        this.name = name;
	        this.location = location;
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {

	        return "name: "+ this.name +" | location: "+ this.location +" | salary: "+this.salary;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }

	    public Integer getSalary() {
	        return salary;
	    }

	    public void setSalary(Integer salary) {
	        this.salary = salary;
	    }
	}

