package interfaeUpdate;

public class ImpClass implements Interface1,Interface2 {

	public static void main(String[] args) {
		ImpClass in2 = new ImpClass();
		in2.m1();
		in2.m2();
		System.out.println(in2.equals(in2));
	}

	@Override
	public void m2() {
		Interface1.super.m2();
		Interface2.super.m2();
		System.out.println("Welcome");
	}

}
