package memberInnerClass;

public class OuterClass {
	static int a=10;
	
	static
	{
		System.out.println(a);
	}

	private  void method() {
		System.out.println("outerclass method executed");
	}
	//we can access private method of outer class in inner class because inner class is a member of outer class
	public class InnerClass {
		public void innerMethod() {
			method();
			System.out.println("innerclass method executed");
		}
	}
}
