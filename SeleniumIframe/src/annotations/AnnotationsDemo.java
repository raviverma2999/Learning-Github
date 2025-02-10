package annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo {

	@BeforeMethod
	public void login() {

		System.out.println("Login is done");
	}

	@AfterMethod
	public void logout() {

		System.out.println("Logout is done");
	}

	@Test
	public void productAddToCart() {

		System.out.println("Product is added to the Cart");
	}

	@Test
	public void remove() {

		System.out.println("Product is removed from the cart");
	}

}
