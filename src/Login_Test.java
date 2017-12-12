import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Test {

	public static void main(String[] args) {
		ATUTestRecorder recorder = new ATUTestRecorder("");
		recorder.start();
		String expectedTitle = "app.clicksurv";
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://app.clicksurv.com/");
		
		String actualTitle = driver.getTitle();
		
		System.out.println("actualTitle : "+ actualTitle);
	
		if(actualTitle.equals(expectedTitle)) {
			System.out.println(("Test case passed"));
			}else {
				System.out.println("Test case failed");
			}
		driver.quit();
		
		
	}

}
