package streamAPIImp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilter2 {

	public static void main(String[] args) {

		List<Integer> l=new ArrayList<>();
		l.add(25);
		l.add(12);
		l.add(5);
		l.add(50);
		l.add(20);
		l.add(3);
		l.add(4);
		
		List<Integer> list2=l.stream().filter(t -> t%2==0).collect(Collectors.toList());
//		System.out.println(list2);
		list2.forEach(e-> System.out.println(e));
		
	}

}
