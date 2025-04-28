import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.LoginPage;
import Pages.ProductPage;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Disabled;

public class ProductsTest {
    @Disabled
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
    @Disabled
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
    @Disabled
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
    @Disabled
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
    @Disabled
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

}
