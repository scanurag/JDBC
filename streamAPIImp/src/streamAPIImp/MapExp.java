package streamAPIImp;

import java.util.Arrays;
import java.util.List;

public class MapExp {
public static void main(String[] args) {
	List<Integer> num=Arrays.asList(6,4,5,1,2,9);
	num.stream().filter(n->n%2==1).sorted().map(n->n*2).forEach(n->System.out.println(n));
}
}
   