package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductPage {
	
	private WebDriver driver;
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	private By homeButton = By.cssSelector("[style='color: orange;']");
	private By menuButton = By.cssSelector("[src='/static/images/home/logo.png']");
	private By productsButton = By.cssSelector("[href='/products']");
	private By quantity = By.cssSelector("[name='quantity']");
	private By addedMessage = By.cssSelector(".modal-title");
	private By productsAdded = By.cssSelector("[alt='Product Image']");
	private By addP19 = By.cssSelector("[data-product-id='19']");
	private By addP12 = By.cssSelector("[data-product-id='12']");
	private By addP1 = By.cssSelector("[data-product-id='1']");
	private By addP2 = By.cssSelector("[data-product-id='2']");
	private By addP3 = By.cssSelector("[data-product-id='3']");
	private By checkoutButton = By.cssSelector(".check_out");
	private By delevery = By.cssSelector("#address_delivery");
	private By billingAddress = By.cssSelector("#address_invoice");
	private By orderComment = By.cssSelector("[name='message']");
	private By placeOrder = By.cssSelector("[href='/payment']");
	private By cardName = By.cssSelector("[data-qa='name-on-card']");
	private By cardNumber = By.cssSelector("[data-qa='card-number']");
	private By cvc = By.cssSelector("[data-qa='cvc']");
	private By expiryMonth = By.cssSelector("[data-qa='expiry-month']");
	private By expiryYear = By.cssSelector("[data-qa='expiry-year']");
	private By payButton = By.cssSelector("[data-qa='pay-button']");
	private By download = By.cssSelector("[href='/download_invoice/1900']");
	private By orderMessage = By.cssSelector("[data-qa='order-placed']");
	private By continueButton = By.cssSelector("[data-qa='continue-button']");

	public void justViewProduct(){
		WebElement viewProduct1 = driver.findElement(By.xpath("(//a[text()='View Product'])[1]"));
		viewProduct1.click();
		driver.findElement(productsButton).click();
		WebElement viewProduct6 = driver.findElement(By.xpath("(//a[text()='View Product'])[6]"));
		viewProduct6.click();
		driver.findElement(quantity).clear();
		driver.findElement(quantity).sendKeys("3");
		driver.findElement(homeButton).click();
	}

	public void addProductToCart(){
		WebElement addProduct1 = driver.findElement(By.xpath("(//a[text()='Add to cart'])[1]"));
		addProduct1.click();
		driver.findElement(addedMessage).isDisplayed();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton.click();
		driver.findElement(addP19).click();
		driver.findElement(addedMessage).isDisplayed();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton1.click();
		driver.findElement(addP12).click();
		driver.findElement(addedMessage).isDisplayed();
		WebElement specificButtoncart2 = driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]"));
		specificButtoncart2.click();
		List<WebElement> imagElements = driver.findElements(productsAdded);
	}

	public void selectSomeProdutcs(){
		driver.findElement(addP1).click();
		driver.findElement(addedMessage).isDisplayed();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton.click();
		driver.findElement(addP2).click();
		driver.findElement(addedMessage).isDisplayed();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton1.click();
		driver.findElement(addP3).click();
		driver.findElement(addedMessage).isDisplayed();
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton2.click();
	}

	public void buyNoLogin(){
		WebElement specificButtoncart1 = driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")); 
		specificButtoncart1.click();
		List<WebElement> imagElements = driver.findElements(productsAdded);
		driver.findElement(checkoutButton).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue On Cart']")));
		specificButton.click();
		driver.findElement(checkoutButton).click();
		WebElement specificButtoncart2 = driver.findElement(By.xpath("(//a[@href='/login'])[2]")); 
		specificButtoncart2.click();
		
	}
	
	public void payment(){
		driver.findElement(cardName).sendKeys("BatCartão");
		driver.findElement(cardNumber).sendKeys("123412341543212424");
		driver.findElement(cvc).sendKeys("412341234");
		driver.findElement(expiryMonth).sendKeys("08");
		driver.findElement(expiryYear).sendKeys("3000");
		driver.findElement(payButton).click();
	}

	public void buyWithLogin() {
		WebElement specificButtoncart1 = driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")); 
		specificButtoncart1.click();
		driver.findElements(productsAdded);
		driver.findElement(checkoutButton).click();
		driver.findElement(delevery).isDisplayed();
		driver.findElement(billingAddress).isDisplayed();
		driver.findElements(productsAdded);
		driver.findElement(orderComment).sendKeys("Falar com o Alfred no interfone do Portão principal 12#");
		driver.findElement(placeOrder).click();
	}

	public void confirmPurchase(){
		driver.findElement(orderMessage).isDisplayed();
		driver.findElement(download).click();
		driver.findElement(continueButton).click();
		
	}


}

