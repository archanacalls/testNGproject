package Demo.TestNGDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	@Test
	public void method1() {
		SoftAssert sa=new SoftAssert();
		sa.assertAll();
	}

}
