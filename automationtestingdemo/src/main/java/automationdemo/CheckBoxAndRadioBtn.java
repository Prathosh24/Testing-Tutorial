
 package automationdemo;
 
 import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
  org.openqa.selenium.WebElement; import org.openqa.selenium.edge.EdgeDriver;
  import org.openqa.selenium.interactions.Actions;
  
  import io.github.bonigarcia.wdm.WebDriverManager;
  
  public class CheckBoxAndRadioBtn {
  
  public static WebElement we;
  
  public static void main(String[] args) { // TODO Auto-generated method stub
  String Disabled="yes"; WebDriverManager.edgedriver().setup(); WebDriver
  wdc=new EdgeDriver(); wdc.manage().window().maximize();
  wdc.get("https://www.irctc.co.in/nget/train-search");
 if(Disabled.equals("yes")) { we= wdc.findElement(By.
  xpath("//label[text()='Person With Disability Concession']")); Actions ac=new
  Actions(wdc); ac.click(we).perform();
  
  
 
  }
  
  }
  
  } 

