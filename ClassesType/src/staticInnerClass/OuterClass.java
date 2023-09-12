package staticInnerClass;

public class OuterClass {
	
	public static String message="message from outer class";
	
	public static void outer() {
		System.out.println("outer () in outer class");
	}
	
	public static class InnerClass{
		public static void inn() {
			System.out.println("inn() from inner class");
			
		}
		public void nonStatic() {
			System.out.println("non static inner()");
		}
	}
}
