package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductPage {
	
	private WebDriver driver;
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By addToCart = By.cssSelector(".add-to-cart");
	private By viewProduct = By.cssSelector("[style='color: brown;']");

}