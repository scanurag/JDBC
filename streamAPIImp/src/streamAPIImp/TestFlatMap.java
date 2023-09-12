package streamAPIImp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFlatMap {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		list.add(25);
		list.add(12);
		list.add(5);
		list.add(50);
		list.add(20);
		list.add(3);
		list.add(4);
		
		List<Integer> list2=list.stream().flatMap(e->Stream.of((e*e),(e*2))).collect(Collectors.toList());
		System.out.println(list2);
	}

}
