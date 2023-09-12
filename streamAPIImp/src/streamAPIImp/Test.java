package streamAPIImp;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person(4, "Legain", "lee@gami,.com"));
		list.add(new Person(2, "Narayan", "nir@gami,.com"));
		list.add(new Person(5, "Lily", "lil@gami,.com"));
		list.add(new Person(1, "Wel", "wel@gami,.com"));
		list.add(new Person(3, "R", "ram@gami,.com"));
		list.add(new Person(6, "Ayush", "syush@gamil.com"));
		
		PersonDataHandler pdh =new PersonDataHandler();
		List<Person> l= pdh.sortByName(list);
		System.out.println(l);
		
		List<Person>l1=pdh.sortById(list);
		System.out.println(l1);
		
		List<Person> l2= pdh.sortByLength(list);
		System.out.println(l2);
	}

}
