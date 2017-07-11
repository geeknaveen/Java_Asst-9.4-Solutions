/*Create a class called Employee with attributes: name, designation, 
and salary. Insert employee objects into the TreeSet where default 
natural sorting order is ascending order of salaries. If two 
employees have the same salary then consider alphabetical orders 
of their names, and Write a comparator class to define customized 
sorting which is the alphabetical order of employee names. If two 
employees have the same name then consider designation for 
comparison. */

package asst9_4;

public class employee implements Comparable<employee>   //Class declaration. 

{
	private String name;	 //String to store name of Employee.
	private String designation;
	private int salary;

	public employee(String name, String designation, int salary) {
		super();
		//Initializing instance variable of class by parameters passed in the constructor.
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	//Method to return the information of employee as a String.
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getdesignation() {
		return designation;
	}

	public void setdesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	//returning information as a String.
	public String toString() {
		return name + " " + designation + " " + salary;
	}

	@Override
	public int compareTo(employee o) {
		return this.name.compareTo(o.name);
	}
}
