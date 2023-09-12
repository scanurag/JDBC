package MethodRef;
import java.util.ArrayList;
import streamAPIImp.Person;
import java.util.List;
import java.util.stream.Collectors;
public class Text {
public static void main(String[] args) {
	List<Person> list = new ArrayList<>();
	list.add(new Person(1, "legain", "lee@gami,.com"));
	list.add(new Person(2, "Nirani", "nir@gami,.com"));
	list.add(new Person(3, "legain", "lil@gami,.com"));
	list.add(new Person(4, "Wel", "wel@gami,.com"));
	list.add(new Person(5, "R", "ram@gami,.com"));
	list.add(new Person(6, "ayush", "syush@gamil.com"));
	list.add(new Person(6, "ayush", "syush@gamil.com"));
	List<String> list2=list.stream().map(MethodRefClass::opret).collect(Collectors.toList());
	list2.forEach(System.out::println);
}
}

