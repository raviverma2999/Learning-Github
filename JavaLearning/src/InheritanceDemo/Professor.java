package InheritanceDemo;

public class Professor extends Person {
	
	int salary;
	int experience;
	
	public void PrintProfessor() {
		
		System.out.println("Salary " + salary);
		System.out.println("Experience " + experience);
		System.out.println("Name " + name);
		System.out.println("Age "+ age);
		System.out.println("Address " + address);
	}
	
public Professor (String name , int age , String address , int salary , int experience) {
		
		super(name ,age ,address);
		this.salary = salary;
		this.experience= experience;
	}
}