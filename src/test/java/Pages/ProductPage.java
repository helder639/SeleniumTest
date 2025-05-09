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
	private By productsButton = By.cssSelector("[href='/products']");
	private By quantity = By.cssSelector("[name='quantity']");
	private By addedMessage = By.cssSelector(".modal-title");
	private By productsAdded = By.cssSelector("[alt='Product Image']");
	private By addP19 = By.cssSelector("[data-product-id='19']");
	private By addP12 = By.cssSelector("[data-product-id='12']");
	private By addP1 = By.cssSelector("[data-product-id='1']");
	private By addP2 = By.cssSelector("[data-product-id='2']");
	private By addP3 = By.cssSelector("[data-product-id='3']");
	private By addP4 = By.cssSelector("[data-product-id='4']");
	private By addP41 = By.cssSelector("[data-product-id='41']");
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
	private By download = By.cssSelector(".btn");
	private By orderMessage = By.cssSelector("[data-qa='order-placed']");
	private By continueButton = By.cssSelector("[data-qa='continue-button']");
	private By womanPage = By.cssSelector("[href='#Women']");
	private By categDress = By.cssSelector("[href='/category_products/1']");
	private By categTops = By.cssSelector("[href='/category_products/2']");
	private By categSaree = By.cssSelector("[href='/category_products/7']");
	private By viewWomanProduct = By.cssSelector("[href='/product_details/4']");
	private By addButtonInView = By.cssSelector("[type='button']");
	private By dressView = By.cssSelector("[href='/product_details/8']");
	private By menPage = By.cssSelector("[href='#Men']");
	private By categTshirt = By.cssSelector("[href='/category_products/3']");
	private By categJeans = By.cssSelector("[href='/category_products/6']");
	private By addP31 = By.cssSelector("[data-product-id='31']");
	private By viewMenProductTshirt = By.cssSelector("[href='/product_details/43']");
	private By addP33 = By.cssSelector("[data-product-id='33']");
	private By addP35 = By.cssSelector("[data-product-id='35']");
	private By addP37 = By.cssSelector("[data-product-id='37']");
	private By kidsPage = By.cssSelector("[href='#Kids']");
	private By categKDress = By.cssSelector("[href='/category_products/4']");
	private By categTS = By.cssSelector("[href='/category_products/5']");
	private By addP16 = By.cssSelector("[data-product-id='16']");
	private By addP22 = By.cssSelector("[data-product-id='22']");
	private By addP13 = By.cssSelector("[data-product-id='13']");
	private By viewKidsProduct = By.cssSelector("[href='/product_details/15']");
	private By poloButton = By.cssSelector("[href='/brand_products/Polo']");
	private By hmButton = By.cssSelector("[href='/brand_products/H&M']");
	private By madameButton = By.cssSelector("[href='/brand_products/Madame']");
	private By harbourButton = By.cssSelector("[href='/brand_products/Mast & Harbour']");
	private By babyhugButton = By.cssSelector("[href='/brand_products/Babyhug']");
	private By allenButton = By.cssSelector("[href='/brand_products/Allen Solly Junior']");
	private By kookieButton = By.cssSelector("[href='/brand_products/Kookie Kids']");
	private By bibaButton = By.cssSelector("[href='/brand_products/Biba']");
	private By productsBrand = By.cssSelector(".product-overlay");
	

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
		driver.findElements(productsAdded);
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
		WebElement firstButton = driver.findElement(download);
		firstButton.click();
		driver.findElement(continueButton).click();
		
	}

	public void selectWomenPage(){
		driver.findElement(womanPage).click();
		WebElement element = driver.findElement(categDress);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		driver.findElement(addP3).click();
		driver.findElement(addedMessage).isDisplayed();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton.click();
		driver.findElement(addP4).click();
		driver.findElement(addedMessage).isDisplayed();
		WebDriverWait wait0 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton0 = wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton0.click();
		driver.findElement(viewWomanProduct).click();
		driver.findElement(quantity).sendKeys("2");
		driver.findElement(addButtonInView).click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton1.click();
		driver.findElement(womanPage).click();
		WebElement element1 = driver.findElement(categTops);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);
		driver.findElement(addP1).click();
		driver.findElement(dressView).click();
		driver.findElement(addButtonInView).click();
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton2.click();
		driver.findElement(womanPage).click();
		WebElement element2 = driver.findElement(categSaree);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element2);
		driver.findElement(addP41).click();
		driver.findElement(addedMessage).isDisplayed();
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton3 = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton3.click();
	}

	public void selectMenPage(){
		driver.findElement(menPage).click();
		WebElement element = driver.findElement(categTshirt);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		driver.findElement(addP2).click();
		driver.findElement(addedMessage).isDisplayed();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton.click();
		driver.findElement(addP31).click();
		driver.findElement(addedMessage).isDisplayed();
		WebDriverWait wait0 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton0 = wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton0.click();
		driver.findElement(viewMenProductTshirt).click();
		driver.findElement(quantity).clear();
		driver.findElement(quantity).sendKeys("2");
		driver.findElement(addButtonInView).click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton1.click();
		driver.findElement(menPage).click();
		WebElement element1 = driver.findElement(categJeans);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);
		driver.findElement(addP33).click();
		driver.findElement(addedMessage).isDisplayed();
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton2.click();
		driver.findElement(addP35).click();
		driver.findElement(addedMessage).isDisplayed();
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton3 = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton3.click();
		driver.findElement(addP37).click();
		driver.findElement(addedMessage).isDisplayed();
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton4 = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton4.click();
	}

	public void selectKidsPage(){
		driver.findElement(kidsPage);
		WebElement element = driver.findElement(categKDress);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		driver.findElement(addP16).click();
		driver.findElement(addedMessage).isDisplayed();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton.click();
		driver.findElement(addP22).click();
		driver.findElement(addedMessage).isDisplayed();
		WebDriverWait wait0 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton0 = wait0.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton0.click();
		WebElement element0 = driver.findElement(categTS);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element0);
		driver.findElement(addP13).click();
		driver.findElement(addedMessage).isDisplayed();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton1.click();
		driver.findElement(viewKidsProduct).click();
		driver.findElement(quantity).clear();
		driver.findElement(quantity).sendKeys("3");
		driver.findElement(addButtonInView).click();
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement specificButton2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue Shopping']")));
		specificButton2.click();
	}

	public void brandPolo(){
		driver.findElement(poloButton).click();
		driver.getPageSource().contains("Brand - Polo Products");
		List<WebElement> elementos = driver.findElements(productsBrand);
		boolean algumVisivel = false;
		for (WebElement elemento : elementos) {
			if (elemento.isDisplayed()) {
				algumVisivel = true;
				break;
			}
		}
		if (algumVisivel) {
			System.out.println("Produtos Polo visiveis na página");
		} else {
			System.out.println("Nenhum elemento está visível");
		}	
	}

	public void brandHM(){
		driver.findElement(hmButton).click();
		driver.getPageSource().contains("Brand - H&M Products");
		List<WebElement> elementos = driver.findElements(productsBrand);
		boolean algumVisivel = false;
		for (WebElement elemento : elementos){
			if(elemento.isDisplayed()){
				algumVisivel =true;
				break;
			}
		}
		if(algumVisivel){
			System.out.println("Produtos H&M visiveis na página");
		}else {
			System.out.println("Nenhum produto está visível");
		}
	}

	public void brandMadame(){
		driver.findElement(madameButton).click();
		driver.getPageSource().contains("Brand - Madame Products");
		List<WebElement> elementos = driver.findElements(productsBrand);
		boolean algumVisivel = false;
		for (WebElement elemento : elementos){
			if(elemento.isDisplayed()){
				algumVisivel =true;
				break;
			}
		}
		if(algumVisivel){
			System.out.println("Produtos Madame visiveis na página");
		}else {
			System.out.println("Nenhum produto está visível");
		}
	}

	public void brandHarbour(){
		driver.findElement(harbourButton).click();
		driver.getPageSource().contains("Brand - Mast & Harbour Products");
		List<WebElement> elementos = driver.findElements(productsBrand);
		boolean algumVisivel = false;
		for (WebElement elemento : elementos){
			if(elemento.isDisplayed()){
				algumVisivel =true;
				break;
			}
		}
		if(algumVisivel){
			System.out.println("Produtos Mast & Harbour visiveis na página");
		}else {
			System.out.println("Nenhum produto está visível");
		}
	}

	public void brandBabyHug(){
		driver.findElement(babyhugButton).click();
		driver.getPageSource().contains("Brand - Babyhug Products");
		List<WebElement> elementos = driver.findElements(productsBrand);
		boolean algumVisivel = false;
		for (WebElement elemento : elementos){
			if(elemento.isDisplayed()){
				algumVisivel =true;
				break;
			}
		}
		if(algumVisivel){
			System.out.println("Produtos Babyhug visiveis na página");
		}else {
			System.out.println("Nenhum produto está visível");
		}
	}

	public void brandAllen(){
		driver.findElement(allenButton).click();
		driver.getPageSource().contains("Brand - Allen Solly Junior Products");
		List<WebElement> elementos = driver.findElements(productsBrand);
		boolean algumVisivel = false;
		for (WebElement elemento : elementos){
			if(elemento.isDisplayed()){
				algumVisivel =true;
				break;
			}
		}
		if(algumVisivel){
			System.out.println("Produtos Allen Solly Junior visiveis na página");
		}else {
			System.out.println("Nenhum produto está visível");
		}
	}

	public void brandKookie(){
		driver.findElement(kookieButton).click();
		driver.getPageSource().contains("Brand - Kookie Kids Products");
		List<WebElement> elementos = driver.findElements(productsBrand);
		boolean algumVisivel = false;
		for (WebElement elemento : elementos){
			if(elemento.isDisplayed()){
				algumVisivel =true;
				break;
			}
		}
		if(algumVisivel){
			System.out.println("Produtos Kookie Kids visiveis na página");
		}else {
			System.out.println("Nenhum produto está visível");
		}
	}

	public void brandBiba(){
		driver.findElement(bibaButton).click();
		driver.getPageSource().contains("Brand - Biba Products");
		List<WebElement> elementos = driver.findElements(productsBrand);
		boolean algumVisivel = false;
		for (WebElement elemento : elementos){
			if(elemento.isDisplayed()){
				algumVisivel =true;
				break;
			}
		}
		if(algumVisivel){
			System.out.println("Produtos Biba visiveis na página");
		}else {
			System.out.println("Nenhum produto está visível");
		}
	}
}

