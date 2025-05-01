import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.LoginPage;
import Pages.ProductPage;
import org.junit.jupiter.api.Disabled;

public class ProductsTest {
    
    @Test
    public void testViewProduct() {
        WebDriverManager.chromedriver().setup();
        System.out.println("Abrindo navegador...");
        ChromeDriver driver = new ChromeDriver();
        try {
            ProductPage productPage = new ProductPage(driver);
            driver.get("https://automationexercise.com/");
            productPage.justViewProduct();
          
        } finally {
            driver.quit();
        }
    }
    
    @Test
    public void testaddToCart() {
        WebDriverManager.chromedriver().setup();
        System.out.println("Abrindo navegador...");
        ChromeDriver driver = new ChromeDriver();
        try {
            ProductPage productPage = new ProductPage(driver);
            driver.get("https://automationexercise.com/");
            productPage.addProductToCart();
            
        } finally {
            driver.quit();
        }
    }
    
    @Test
    public void testBuyWithoutLogin(){
        WebDriverManager.chromedriver().setup();
        System.out.println("Abrindo navegador...");
        ChromeDriver driver = new ChromeDriver();
        try {
            ProductPage productPage = new ProductPage(driver);
            LoginPage loginPage = new LoginPage(driver);
            driver.get("https://automationexercise.com/");
            productPage.selectSomeProdutcs();
            productPage.buyNoLogin();
            loginPage.sucessLogin();
            productPage.buyWithLogin();
            productPage.payment();
            productPage.confirmPurchase();
            
        } finally {
            driver.quit();
        }
    }
    @Disabled
    @Test
    public void testBuyLoginOn(){
        WebDriverManager.chromedriver().setup();
        System.out.println("Abrindo navegador...");
        ChromeDriver driver = new ChromeDriver();
        try {
            ProductPage productPage = new ProductPage(driver);
            LoginPage loginPage = new LoginPage(driver);
            driver.get("https://automationexercise.com/");
            loginPage.sucessLogin();
            productPage.selectSomeProdutcs();
            productPage.buyWithLogin();
            productPage.payment();
            productPage.confirmPurchase();
            
        } finally {
            driver.quit();
        }
    }
    
    @Test
    public void testBuyWomenPage(){
        WebDriverManager.chromedriver().setup();
        System.out.println("Abrindo navegador...");
        ChromeDriver driver = new ChromeDriver();
        try {
            ProductPage productPage = new ProductPage(driver);
            LoginPage loginPage = new LoginPage(driver);
            driver.get("https://automationexercise.com/");
            loginPage.sucessLogin();
            productPage.selectWomenPage();
            productPage.buyWithLogin();
            productPage.payment();
            productPage.confirmPurchase();
            
        } finally {
            driver.quit();
        }
    }
    
    @Test
    public void testBuyMenPage(){
        WebDriverManager.chromedriver().setup();
        System.out.println("Abrindo navegador...");
        ChromeDriver driver = new ChromeDriver();
        try {
            ProductPage productPage = new ProductPage(driver);
            LoginPage loginPage = new LoginPage(driver);
            driver.get("https://automationexercise.com/");
            loginPage.sucessLogin();
            productPage.selectMenPage();
            productPage.buyWithLogin();
            productPage.payment();
            productPage.confirmPurchase();
            
        } finally {
            driver.quit();
        }
    }
    
    @Test
    public void testBuyKidsPage(){
        WebDriverManager.chromedriver().setup();
        System.out.println("Abrindo navegador...");
        ChromeDriver driver = new ChromeDriver();
        try {
            ProductPage productPage = new ProductPage(driver);
            LoginPage loginPage = new LoginPage(driver);
            driver.get("https://automationexercise.com/");
            loginPage.sucessLogin();
            productPage.selectKidsPage();
            productPage.buyWithLogin();
            productPage.payment();
            productPage.confirmPurchase();
            
        } finally {
            driver.quit();
        }
    }
    
    @Test
    public void testBrandsProducts(){
        WebDriverManager.chromedriver().setup();
        System.out.println("Abrindo navegador...");
        ChromeDriver driver = new ChromeDriver();
        try {
            ProductPage productPage = new ProductPage(driver);
            driver.get("https://automationexercise.com/");
            productPage.brandPolo();
            productPage.brandHM();
            productPage.brandMadame();
            productPage.brandHarbour();
            productPage.brandBabyHug();
            productPage.brandAllen();
            productPage.brandKookie();
            productPage.brandBiba();
            
        } finally {
            driver.quit();
        }
    }
}
