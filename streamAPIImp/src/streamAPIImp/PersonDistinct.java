package streamAPIImp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonDistinct {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "legain", "lee@gami,.com"));
		list.add(new Person(2, "Nirani", "nir@gami,.com"));
		list.add(new Person(3, "legain", "lil@gami,.com"));
		list.add(new Person(4, "Wel", "wel@gami,.com"));
		list.add(new Person(5, "R", "ram@gami,.com"));
		list.add(new Person(6, "ayush", "syush@gamil.com"));
		list.add(new Person(6, "ayush", "syush@gamil.com"));
		
		List<Person> lis=list.stream().distinct().collect(Collectors.toList());
		System.out.println(lis);
	}
}
