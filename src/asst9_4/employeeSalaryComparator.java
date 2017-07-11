package asst9_4;

import java.util.Comparator;

public class employeeSalaryComparator implements Comparator<employee> {

	// This compares employees based on salaries
	@Override
	//Method to compare two objects.
	public int compare(employee o1, employee o2) {
				if (o1.getSalary() >= o2.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}

}
