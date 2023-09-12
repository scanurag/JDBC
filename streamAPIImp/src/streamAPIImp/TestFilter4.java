package streamAPIImp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class TestFilter4 {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "legain", "lee@gami,.com"));
		list.add(new Person(2, "Nirani", "nir@gami,.com"));
		list.add(new Person(3, "Lily", "lil@gami,.com"));
		list.add(new Person(4, "Wel", "wel@gami,.com"));
		list.add(new Person(5, "R", "ram@gami,.com"));
		list.add(new Person(6, "ayush", "syush@gamil.com"));
		
		List<Person>l=list.stream().filter(e -> e.getId()%2==0).collect(Collectors.toList());
//		System.out.println(l);
		Consumer<Person> c= e-> System.out.println(e);
//		l.forEach(e-> System.out.println(e));
		l.forEach(c);
	}

}
