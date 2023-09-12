package lambdaImp;

public class Testlambda {
public static void main(String[] args) {
	int a=10;
	int b=10;
	int c=20;
	DataConvertor dc=(e1,e2,e3)->{return e1+e2+e3+"";};
	System.out.println(dc.convertor(a, b, c));
}
}
