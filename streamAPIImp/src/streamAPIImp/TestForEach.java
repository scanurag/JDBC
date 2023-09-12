package streamAPIImp;

import java.util.ArrayList;
import java.util.List;

public class TestForEach {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(13);
		l.add(4);
		l.add(17);
		
//		List<Integer> list2=l.stream().filter(e-> e%2==0).collect(Collectors.toList());
//		Consumer<Integer> c= e-> System.out.println(e*e);
//		
//		list2.forEach(c);
		l.forEach(e -> {if(e%2==0){
			System.out.println(e*e);
		}
		});
		
	}
}
