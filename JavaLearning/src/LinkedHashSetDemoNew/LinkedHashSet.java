package LinkedHashSetDemoNew;
import java.util.HashSet;
public class LinkedHashSet {
	
	public static void main(String[] args) {
		
		LinkedHashSet employees = new LinkedHashSet();

		Employee employee = new Employee(123, "Ravi", 10000.0);
		Employee employee1 = new Employee(1234, "Ajay", 20000.0);
		Employee employee2 = new Employee(1235, "Amit", 30000.0);
		
		Employee employee3=employee2;
		Employee employee4=new Employee(1235, "Amit", 30000.0);
		
		
		System.out.println(employee3.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee4.hashCode());
	}

}
