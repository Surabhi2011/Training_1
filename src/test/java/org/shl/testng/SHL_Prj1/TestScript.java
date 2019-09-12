package org.shl.testng.SHL_Prj1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import utilities.Constants;
import utilities.Launcher;

public class TestScript {
    Launcher Launch=new Launcher();
    WebDriver Driver;
  @BeforeMethod
  public void Launch_Browser() throws Exception 
  {
      Launch.launchBrowser("Chrome");
      Driver=Launch.Go_To_Url(Constants.URL);
      
  }
  
  @Test
  public void Login()
  {
	  
	  System.out.println("First Branch");
      
  }
  
  @AfterMethod
  public void Close_Browser()
  {
      Driver.quit();
  }
}
