package asst9_4;

import java.util.Comparator;

public class DesignationComparator implements Comparator<employee> {
	// override compare() method to provide the sorting logic on user defined objects.
	@Override
  public int compare(employee e1, employee e2) 
	{
		// This compares employees based on designation
      return e1.getdesignation().compareTo(e2.getdesignation());
  }

}
