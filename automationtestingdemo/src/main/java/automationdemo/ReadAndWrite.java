package automationdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadAndWrite {

	public static void main(String[] args) throws IOException {

		Properties pr = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\prath\\Documents\\shiash\\New folder\\automationtesting\\src\\test\\resources\\Properties\\demodata.properties");
		pr.load(fis);
		System.out.println(pr.getProperty("RollNo"));
		System.out.println(pr.getProperty("College"));

		
		  System.out.println(pr.getProperty("Name")); 
		  System.out.println(pr.getProperty("Course"));
		 
		  
		  
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\prath\\Documents\\shiash\\New folder\\automationtesting\\src\\test\\resources\\Properties\\demodata.properties");
		pr.setProperty("Name", "Prathosh");
		pr.setProperty("Course", "Java");
		pr.store(fos, "for testing");

	}

}
