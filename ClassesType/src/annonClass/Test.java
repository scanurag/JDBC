package annonClass;
import java.util.ArrayList;
import java.util.List;
public class Test {

	public static void main(String[] args) {
		
		List<Customer> list=new ArrayList<>();
		DataHandler dh=new DataHandler();
		list.add(new Customer(101,"subi",12,"subham8221"));
		list.add(new Customer(101,"rakesh",13,"subham8221"));
		list.add(new Customer(101,"harshad",14,"subham8221"));
		list.add(new Customer(101,"gill",17,"subham8221"));
		list.add(new Customer(101,"eskpt",18,"subham8221"));
		
		dh.sortByName(list);
		System.out.println("*****************************");
		dh.sortByAge(list);
		}
	
}
