package automationtesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@Test(dataProvider="ds1")
	public void test1(String username,String password,String result) {
		System.out.println(username +"="+password+"="+result);
	}
	@DataProvider()
	public Object[][] dataSet() {
		Object[][] obj=new Object[4][2];
		obj[0][0]="user1";
		obj[0][1]="pass1";
		obj[1][0]="user2";
		obj[1][1]="pass2";
		obj[2][0]="user3";
		obj[2][1]="pass3";
		obj[3][0]="user4";
		obj[3][1]="pass4";
		return obj;
	}
	@DataProvider(name="ds1")
	public Object[][] dataSet1(){
		return new Object[][] {
			{"user1","pass1","result1"},
			{"user2","pass2","result2"},
			{"user3","pass3","result3"}
		};
	}
}
