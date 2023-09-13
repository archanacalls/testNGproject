package Demo1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test1 {

	@Test
	public void method1() {
		System.out.println("Hi");
	}
		@Test
		public void method2() {
			System.out.println("Hello");
		}
		
		@Test(dependsOnMethods="method1")
		public void method3() {
			System.out.println("How r u?");
		}
		
}



