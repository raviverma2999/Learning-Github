package groupDemo;

import org.testng.annotations.Test;

public class GroupRunOfTestCases {
	
	
    @Test (groups={"login", "sanity"})
	public void login_1() {

		System.out.println("Login Test case 1");
	}

    
    @Test (groups="login")
	public void login_2() {

		System.out.println("Login Test case 2");
	}

    
    @Test (groups="Reset Password")
	public void resetPassword_1() {

		System.out.println("Reset Password Test case 1");
	}

    
    @Test (groups={"Reset Password","sanity"})
	public void resetPassword_2() {

		System.out.println("Reset Password Test case 2");
	}

}
