import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/job/git_html_demo/ws/index.html");
    String h1_content = driver.findElement(By.tagName("h1")).getAttribute("innerHTML");
    if(h1_content == "This is a sample page!"){
      System.out.println("it is correct !");
    }else{
      System.out.println("not correct.....");
    }
  }
}
