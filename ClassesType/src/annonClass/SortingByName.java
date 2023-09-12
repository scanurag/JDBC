package annonClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingByName {

	public static void main(String[] args) {
		List<Person> list=new ArrayList<>();
		list.add(new Person(1,"legain","lee@gami,.com"));
		list.add(new Person(2,"Nirani","nir@gami,.com"));
		list.add(new Person(3,"Lily","lil@gami,.com"));
		list.add(new Person(4,"Wel","wel@gami,.com"));
		list.add(new Person(5,"Ram","ram@gami,.com"));
		list.add(new Person(6,"ayush","syush@gamil.cim"));
		Collections.sort(list,new Helper());
		
		for(Person n:list) {
			System.out.println(n);
		}
		System.out.println("********************");
		Collections.sort(list,new SortByEmail());


		for(Person n:list) {
			System.out.println(n);
		}
	}

}
