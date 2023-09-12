package annonClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class SortingByEmail {
	
	public static void main(String[] args) {
		
		List<Person> list=new ArrayList<>();
		list.add(new Person(1,"legain","bee@gami,.com"));
		list.add(new Person(2,"Nirani","cir@gami,.com"));
		list.add(new Person(3,"Lily","eil@gami,.com"));
		list.add(new Person(4,"Wel","ael@gami,.com"));
		list.add(new Person(5,"Ram","dam@gami,.com"));
		list.add(new Person(6,"ayush","fyush@gamil.cim"));
		
		Comparator<Person> com=new Comparator<Person>() 
		{
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getEmail().compareTo(o2.getEmail());
			}
		};
		
		Collections.sort(list,com);
		for(Person p: list) {
			System.out.println(p);
		}
			
	}

}
