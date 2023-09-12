package streamAPIImp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestSorted {
public static void main(String[] args) {
	List<Integer> l = new ArrayList<>();
	l.add(12);
	l.add(13);
	l.add(4);
	l.add(17);
	
	List<Integer> l1=l.stream().sorted().collect(Collectors.toList());
	System.out.println(l1);
}
}
