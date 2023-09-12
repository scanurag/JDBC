package annonClass;
public class Person {
	private int id;
	private String name;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String e) {
		email=e;
	}
	public Person(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
}

