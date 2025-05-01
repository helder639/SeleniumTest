/*import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.LoginPage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;

public class LoginTest {
    @Order(2)
    @Test
    public void testUserSignUp() {
        WebDriverManager.chromedriver().setup();
        System.out.println("Abrindo navegador...");
        ChromeDriver driver = new ChromeDriver();

        try {
            LoginPage loginPage = new LoginPage(driver);

            driver.get("https://automationexercise.com/");
            loginPage.singUpNewUser("Batman", "batemail@shadow.com");
            loginPage.accountInformation();
            loginPage.messageAccountCreated();
        } finally {
            driver.quit();
        }
    }
    @Order(1)
    @Test
    public void testErrorSignUp() {
        WebDriverManager.chromedriver().setup();
        System.out.println("Abrindo navegador...");
        ChromeDriver driver = new ChromeDriver();

        try {
            LoginPage loginPage = new LoginPage(driver);

            driver.get("https://automationexercise.com/");
            loginPage.allErrorSingUp();
            loginPage.errorLoginNull();
            loginPage.errorLoginOnlymail();
            loginPage.errorLoginOnlyPassword();
            loginPage.errorLoginEmailAndPasswordWrong();
            loginPage.errorLoginPasswordWrong();
            loginPage.errorLoginEmailWrong();
        } finally {
            driver.quit();
        }
    }
    @Order(3)
    @Test
    public void testUserLogin() { //pode aparecer erro mas está funcionando, repita o código
        WebDriverManager.chromedriver().setup();
        System.out.println("Abrindo navegador...");
        ChromeDriver driver = new ChromeDriver();

        try {
            LoginPage loginPage = new LoginPage(driver);

            driver.get("https://automationexercise.com/");
            loginPage.sucessLogin();
        } finally {
            driver.quit();
        }
    }
    @Order(4)
    @Test
    public void testDeleteAccount(){
        WebDriverManager.chromedriver().setup();
        System.out.println("Abrindo navegador...");
        ChromeDriver driver = new ChromeDriver();
        try {
            
            LoginPage loginPage = new LoginPage(driver);
            driver.get("https://automationexercise.com/");
            loginPage.sucessLogin();
            loginPage.delete();
        } finally {
            driver.quit();
        }
    }
}*/