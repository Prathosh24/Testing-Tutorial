package automationtesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotationDemo {
	
	  @Test(priority=1,description="This is for smoke testing") public static void
	  test1() { System.out.println("Test case1"); }
	 
	  @Test(enabled=false) public static void test21() {
	  System.out.println("Test case2"); }
	 
	@Test(priority=2)
	public static void test() {
		System.out.println("Test  running");
		
		
	}
	@Test
	public static void testt() {
		System.out.println("Test1  running");
	}
	@BeforeSuite
	public static void test11() {
		System.out.println("Test case1 before suite");
		
	}
	
	@BeforeTest
	public static void test2() {
		System.out.println("Test case2 before test");
		
	}
	
	@BeforeClass
	public static void test3() {
		System.out.println("Test case3 before class");
		
	}
	
		
	
	
	@BeforeMethod
	public static void test4() {
		System.out.println("Test case4 before method");
		
	}
	
	@AfterSuite
	public static void test5() {
		System.out.println("Test case5 after suite");
		
	}
	
	@AfterTest
	public static void test6() {
		System.out.println("Test case6 after test");
		
	}

	@AfterClass
	public static void test7() {
		System.out.println("Test case7 after class");
		
	}
	
	@AfterMethod
	public static void test8() {
		System.out.println("Test case8 after method");
		
	}
	
}
