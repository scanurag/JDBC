package annonClass;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataHandler  {

	void sortByName(List<Customer> cus) {
		Comparator<Customer> com=new Comparator<Customer>() 
		{
			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		};
		Collections.sort(cus,com);
		for(Customer n:cus) {
			System.out.println(n);
		}
	}
	void sortByAge(List<Customer> cus) {
		Comparator<Customer> com=new Comparator<Customer>() 
		{
			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getAge()-o2.getAge();
			}
		};
		Collections.sort(cus,com);
		for(Customer n:cus) {
			System.out.println(n);
		}
	}
}
