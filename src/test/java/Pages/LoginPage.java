package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By loginButton = By.cssSelector("[href='/login']");
	private By usernameField = By.cssSelector("[data-qa='signup-name']");
	private By emailField = By.cssSelector("[data-qa='signup-email']");
	private By singUpButton = By.cssSelector("[data-qa='signup-button']");
	private By title = By.cssSelector("[name='title']");
	private By passwordField = By.cssSelector("[data-qa='password']");
	private By dayField = By.cssSelector("[data-qa='days']");
	private By monthField = By.cssSelector("[data-qa='months']");
	private By yearField = By.cssSelector("[data-qa='years']");
	private By firstName = By.cssSelector("[data-qa='first_name']");
	private By lastName = By.cssSelector("[data-qa='last_name']");
	private By company = By.cssSelector("[data-qa='company']");
	private By address1 = By.cssSelector("[data-qa='address']");
	private By address2 = By.cssSelector("[data-qa='address2']");
	private By country = By.cssSelector("[data-qa='country']");
	private By state = By.cssSelector("[data-qa='state']");
	private By city = By.cssSelector("[data-qa='city']");
	private By zip = By.cssSelector("[data-qa='zipcode']");
	private By number = By.cssSelector("[data-qa='mobile_number']");
	private By creatAccountButton = By.cssSelector("[data-qa='create-account']");
	private By confirmMessage = By.cssSelector("[data-qa='account-created']");
	private By textMessage = By.cssSelector("[style='font-size: 20px; font-family: garamond;']");
	private By continueButton = By.cssSelector("[data-qa='continue-button']");
	private By emailLogin = By.cssSelector("[data-qa='login-email']");
	private By password = By.cssSelector("[data-qa='login-password']");
	private By confirmLogin = By.cssSelector("[data-qa='login-button']");
	private By alertMessage = By.cssSelector("[style='color: red;']");
	private By deleteAccount = By.cssSelector("[href='/delete_account']");
	private By fundo = By.cssSelector("#slider-carousel");
	private By messageDelete = By.cssSelector("[data-qa='account-deleted']");
	
	public void singUpNewUser(String username, String email) {
		driver.findElement(loginButton).click();
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(singUpButton).click();
	}
	
	public void accountInformation() {
	    List<WebElement> titles = driver.findElements(title);
	    if (!titles.isEmpty()) {
	        titles.get(0).click();
	    } else {
	        System.out.println("Nenhuma opção de título encontrada!");
	    }
	    driver.findElement(passwordField).sendKeys("CoringaVacilão");
	    driver.findElement(dayField).sendKeys("16");
	    WebElement dropdownElementmonth = driver.findElement(monthField);
        Select dropdownmonth = new Select(dropdownElementmonth);
        dropdownmonth.selectByVisibleText("September");
        driver.findElement(yearField).sendKeys("1972");
	    driver.findElement(firstName).sendKeys("Segredo po");
	    driver.findElement(lastName).sendKeys("Dica é Wanne");
	    driver.findElement(company).sendKeys("WANNE");
	    driver.findElement(address1).sendKeys("Rua.Wanne");
	    driver.findElement(address2).sendKeys("Mansão");
	    WebElement dropdownElementCountry = driver.findElement(country);
	    Select dropdowncountry = new Select(dropdownElementCountry);
	    dropdowncountry.selectByVisibleText("United States"); // ou selectByindex(3)
	    driver.findElement(state).sendKeys("DC");
	    driver.findElement(city).sendKeys("Gotham");
	    driver.findElement(zip).sendKeys("01983241902841");
	    driver.findElement(number).sendKeys("0123481823423");
	    driver.findElement(creatAccountButton).click();
	}
	
	public void messageAccountCreated() {
		driver.findElement(confirmMessage).isDisplayed();
		driver.findElement(textMessage).isDisplayed();
		driver.findElement(continueButton).click();
	}
	
	public void allErrorSingUp() {
		driver.findElement(loginButton).click();
		driver.findElement(singUpButton).click();
		driver.findElement(usernameField).sendKeys("1234123412");
		driver.findElement(emailField).sendKeys("123412");
		driver.findElement(emailField).clear();
		driver.findElement(emailField).sendKeys("123412@1");
		driver.findElement(singUpButton).click();
		driver.findElement(creatAccountButton).click();
		driver.findElement(passwordField).sendKeys("1");
		driver.findElement(creatAccountButton).click();
		driver.findElement(firstName).sendKeys("1");
		driver.findElement(creatAccountButton).click();
	    driver.findElement(lastName).sendKeys("1");
	    driver.findElement(creatAccountButton).click();
	    driver.findElement(address1).sendKeys("1");
	    driver.findElement(creatAccountButton).click();
	    driver.findElement(state).sendKeys("1");
	    driver.findElement(creatAccountButton).click();
	    driver.findElement(city).sendKeys("1");
	    driver.findElement(creatAccountButton).click();
	    driver.findElement(zip).sendKeys("1");
	    driver.findElement(creatAccountButton).click();
	    driver.findElement(number).sendKeys("a");
	}
	
	public void errorLoginNull() {
		driver.findElement(loginButton).click();
		driver.findElement(confirmLogin).click();
	}
	
	public void errorLoginOnlymail() {
		driver.findElement(emailLogin).sendKeys("369");
		driver.findElement(confirmLogin).click();
		driver.findElement(emailLogin).sendKeys("369@3");
		driver.findElement(confirmLogin).click();
	}
	
	public void errorLoginOnlyPassword() {
		driver.findElement(emailLogin).clear();
		driver.findElement(password).sendKeys("3");
		driver.findElement(confirmLogin).click();
	}
	
	public void errorLoginEmailAndPasswordWrong() {
		driver.findElement(emailLogin).sendKeys("369@3");
		driver.findElement(password).sendKeys("3");
		driver.findElement(confirmLogin).click();
		driver.findElement(alertMessage).isDisplayed();
	}
	
	public void errorLoginPasswordWrong(){
		driver.findElement(emailLogin).clear();
		driver.findElement(emailLogin).sendKeys("batemail@shadow.com");
		driver.findElement(confirmLogin).click();
		driver.findElement(alertMessage).isDisplayed();
	}
	
	public void errorLoginEmailWrong() {
		driver.findElement(emailLogin).clear();
		driver.findElement(emailLogin).sendKeys("369@3");
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys("CoringaVacilão");
		driver.findElement(confirmLogin).click();
		driver.findElement(alertMessage).isDisplayed();
	}
	
	public void sucessLogin() {
		driver.findElement(loginButton).click();
		driver.findElement(emailLogin).sendKeys("batemail@shadow.com");
		driver.findElement(password).sendKeys("CoringaVacilão");
		driver.findElement(confirmLogin).click();
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(fundo).isDisplayed();
	}

	public void delete(){
		driver.findElement(deleteAccount).click();
		driver.findElement(messageDelete).isDisplayed();
		driver.findElement(continueButton);
	}

}