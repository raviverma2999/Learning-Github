package LinkedHashSetDemoNew;

import java.util.Objects;

public class Employee {


		    @Override
	public int hashCode() {
		return Objects.hash(eID, eName, salary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eID == other.eID && Objects.equals(eName, other.eName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}


			private int eID;
		    private String eName;
		    private double salary;

		  
		    public Employee(int eID, String eName, double salary) {
		        this.eID = eID;
		        this.eName = eName;
		        this.salary = salary;
		    }

		

}
