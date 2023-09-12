package streamAPIImp;

import java.util.List;
import java.util.stream.Collectors;

public class TestFlatMap2 {

	public static void main(String[] args) {

		List<Integer> a1 = List.of(1, 2, 3, 4);
		List<Integer> a2 = List.of(5, 6, 7, 8);
		List<Integer> a3 = List.of(9, 10, 11, 12);
		List<List<Integer>> list = List.of(a1, a2, a3);
		System.out.println(list);
		List<Integer> list2 = list.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
		System.out.println(list2);
	}

}
