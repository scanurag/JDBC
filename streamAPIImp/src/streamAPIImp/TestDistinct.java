package streamAPIImp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestDistinct {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(13);
		l.add(4);
		l.add(17);
		l.add(12);
		l.add(13);
		
		List<Integer> list =l.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(l);
		System.out.println(list);
	}
}
