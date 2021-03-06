
public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String cpf;
		
	public Person (String fName, String lName, int age, String cpf) {
		this.firstName = fName;
		this.lastName = lName;
		this.age = age;
		this.cpf = cpf;
	}
	
	@Override
	public boolean equals(Object obj){
		if (this == obj)	return true;
		if (obj == null)	return false;
		if (obj.getClass() != getClass())	return false;
		Person other = (Person) obj;
		return (firstName.equals(other.firstName)) && (lastName.equals(other.lastName))
				&& (age == other.age) && (cpf.equals(other.cpf));
	}
}
