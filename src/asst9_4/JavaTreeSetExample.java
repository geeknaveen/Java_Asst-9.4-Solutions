package asst9_4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class JavaTreeSetExample {

	public static void main(String[] args) 
	{
		//Putting Custom Objects in Sorted Order
		Set<employee> employeeSet = new TreeSet<employee>();	
		populateemployee(employeeSet);
		
		for(@SuppressWarnings("unused") employee employee : employeeSet){
			//System.out.println(employee.getname());
		}
		
		//Iterating over TreeSet using Iterator
		System.out.println("\n***** Employees sorted by Name ******");
		Iterator<employee> iterator = employeeSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		Set<employee> employeeSetBasedOnSalary = new TreeSet<employee>(new employeeSalaryComparator());
		populateemployee(employeeSetBasedOnSalary);
		System.out.println("\n**** Employees sorted by Salary ****");
		System.out.println(employeeSetBasedOnSalary.toString());
		
		Set<employee> desgnemployee = new TreeSet<employee>(new DesignationComparator());
		populateemployee(desgnemployee);
		System.out.println("\n**** Employees sorted by Designation ****");
		System.out.println(desgnemployee.toString());
		
			}

	private static void populateemployee(Set<employee> employeeSet) {
		employeeSet.add(new employee("Peter", "Analyst",10000));
		employeeSet.add(new employee("Samuel", "Developer",150000));
		employeeSet.add(new employee("Alice", "Tester",12000));
		employeeSet.add(new employee("Jane", "Designer",140000));
			}
}
