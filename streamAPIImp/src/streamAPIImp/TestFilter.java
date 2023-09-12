package streamAPIImp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFilter {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(25);
		l.add(12);
		l.add(5);
		l.add(50);
		l.add(20);
		l.add(3);
		l.add(4);
		
		Stream<Integer> st=l.stream();
		
		Predicate<Integer> pre=new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t%2==0;
			}
		};
		Stream<Integer> st2=st.filter(pre);
		List<Integer> list2=st2.collect(Collectors.toList());
	
		System.out.println(list2);
	}
	
}
