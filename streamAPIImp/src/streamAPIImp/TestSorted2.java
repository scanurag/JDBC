package streamAPIImp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class TestSorted2 {
public static void main(String[] args) {
	List<Person> list = new ArrayList<>();
	list.add(new Person(1, "Legain", "lee@gami,.com"));
	list.add(new Person(2, "Nirani", "nir@gami,.com"));
	list.add(new Person(3, "Lily", "lil@gami,.com"));
	list.add(new Person(4, "Wel", "wel@gami,.com"));
	list.add(new Person(5, "R", "ram@gami,.com"));
	list.add(new Person(6, "Ayush", "syush@gamil.com"));
	
	List<Person> l =list.stream().sorted((e1,e2) -> {return e1.getName().compareTo(e1.getName());}).collect(Collectors.toList());
	Consumer<Person> con= System.out::println;
	l.forEach(con);
}
}
