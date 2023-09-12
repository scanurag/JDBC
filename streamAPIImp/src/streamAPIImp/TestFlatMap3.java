package streamAPIImp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFlatMap3 {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "legain", "lee@gami,.com"));
		list.add(new Person(2, "nirani", "nir@gami,.com"));
		list.add(new Person(3, "legain", "lil@gami,.com"));
		list.add(new Person(4, "wel", "wel@gami,.com"));
		list.add(new Person(5, "r", "ram@gami,.com"));
		list.add(new Person(6, "ayush", "syush@gamil.com"));
		list.add(new Person(6, "ayush", "syush@gamil.com"));
		
		Function<Person, Stream<Person>> fun=new Function<Person, Stream<Person>>() {
			@Override
			public Stream<Person> apply(Person e){
				Person p1=new Person(e.getId(),e.getName().toUpperCase(),e.getEmail());
				Person p2=new Person(e.getId(),e.getName(),e.getEmail().toUpperCase());
				p1.setName(p1.getName().toUpperCase());
				p2.setEmail(p2.getEmail().toUpperCase());
				return Stream.of(p1,p2);
				
			}
		};
		List<Person> list2=list.stream().flatMap(fun).collect(Collectors.toList());
		list2.forEach(e->System.out.println(e));
	}

}
