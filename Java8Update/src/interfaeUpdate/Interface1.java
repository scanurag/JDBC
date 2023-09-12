package interfaeUpdate;

public interface Interface1 {
	default void m1() {
		System.out.println("hi");
	}
	default void m2() {
		System.out.println("second default() in interface");
	}
	default int sum(int a,int b) {
		return a+b;

	}
	
}
