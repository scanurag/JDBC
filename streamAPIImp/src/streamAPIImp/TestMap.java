package streamAPIImp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestMap {
public static void main(String[] args) {
	List<Integer> l = new ArrayList<>();
	l.add(12);
	l.add(13);
	l.add(4);
	l.add(17);
//	System.out.println(l.stream().map(e->e*e).collect(Collectors.toList()));
	Function<Integer, String> fun=new Function<Integer, String>() {
		@Override
		public String apply(Integer t) {
			return t*t+"";
		}
	};
	List<String> l1=l.stream().map(fun).collect(Collectors.toList());
	System.out.println(l1);
//	System.out.println(list);
	
//	l.stream().map(e->e*e).forEach(e->System.out.print(e));
}
}
