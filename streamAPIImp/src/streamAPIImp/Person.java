package streamAPIImp;

import java.util.Objects;

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
	
	
	@Override
	public int hashCode() {
		return Objects.hash(email, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name);
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String e) {
		email=e;
	}
	public int getId() {
		return id;
	}
	public void setEmail(int e) {
		id =e;
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

