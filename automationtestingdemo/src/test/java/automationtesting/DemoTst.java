package automationtesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DemoTst {
	@Test
	public static void test7() {
		System.out.println(" a");
		
	}
	@Test(enabled=false)

	public static void test8() {
		System.out.println(" b");
		
	}
	@Test
	
	public static void test9() {
		System.out.println(" c");
		
	}
}
