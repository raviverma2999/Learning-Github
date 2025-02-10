package xmlDemo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class RunTestcaseswithXMLfile {
	
	@Ignore
	@Test (priority= 1)
	public void a() {

		System.out.println("This is Test case a");

	}

	@Test (priority=2)
	public void b() {

		System.out.println("This is Test case b");

	}
    
	@Test (priority= 3)
	public void c() {

		System.out.println("This is Test case c");

	}

	@Test (priority= 4)
	public void d() {

		System.out.println("This is Test case d");		
		

	}
	
	@Test (priority= 5)
	public void e() {

		System.out.println("This is Test case e");
		
		

	}


}
