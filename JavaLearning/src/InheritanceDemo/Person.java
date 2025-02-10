package InheritanceDemo;

public class Person {
	
	String name;
	int age;
	String address;
	
	public void print() {
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
	}
	
	
	public Person(String name, int age, String address) {
	
	this.name= name;
	this.age= age;
	this.address= address;
	
	}

}
