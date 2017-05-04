package GitMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class GiMav {
  WebDriver driver=new FirefoxDriver();
  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforetest");
  }
  @Test
  public void f() {
	  driver.get("http://www.bbc.co.uk/");
  }
  @AfterTest
  public void afterTest() {
  System.out.println("before closing");
  driver.close();
  }
  

}
