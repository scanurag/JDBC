package memberInnerClass;

public class Test {

	public static void main(String[] args) {
		OuterClass o=new OuterClass();
		
		OuterClass.InnerClass i=o.new InnerClass();
		i.innerMethod();
	
	
	}
}
