package lambdaImp;

@FunctionalInterface
public interface DataConvertor {
	public boolean equals(Object o);

	public String convertor(int a, int b, int c);
}
