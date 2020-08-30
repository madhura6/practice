import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);
	
		WebElement sourceElement = driver.findElement(By.id("id"));
		WebElement targetelement = driver.findElement(By.id("id2"));
		
	    action.dragAndDrop(sourceElement,targetelement).build().perform();
		//abc
		
	   // WebDriverWait wait = new WebDriverWait();
	//    Element.wait((expectedCondition,time)By.id(""));
		
	}

}
