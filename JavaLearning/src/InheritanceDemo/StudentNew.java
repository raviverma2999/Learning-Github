package InheritanceDemo;

public class StudentNew extends Person

{
	
	String courseName;
	int fee;
	
	public void PrintStudent() {
		
		System.out.println(courseName);
		System.out.println(fee);
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		
	}

	
	public StudentNew(String name ,int age , String address , String courseName , int fee) 
	{
		super(name ,age ,address);
		this.courseName = courseName ;
		this.fee = fee ;
	}
	
}

