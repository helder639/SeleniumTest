import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.LoginPage;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;

public class LoginTest {
    @Disabled
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
            String expectedMessage = "Conta criada com sucesso!";
            String actualMessage = driver.getPageSource();

            assertTrue(actualMessage.contains(expectedMessage), "Conta não foi criada com sucesso!");
        } finally {
            driver.quit();
        }
    }
    @Disabled
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
            String expectedMessage = "O usuário não conseguiu avançar sem preencher as informções";
            String actualMessage = driver.getPageSource();

            assertTrue(actualMessage.contains(expectedMessage), "Erro esperado não foi exibido!");
        } finally {
            driver.quit();
        }
    }
    @Disabled
    @Test
    public void testUserLogin() { //pode aparecer erro mas está funcionando, repita o código
        WebDriverManager.chromedriver().setup();
        System.out.println("Abrindo navegador...");
        ChromeDriver driver = new ChromeDriver();

        try {
            LoginPage loginPage = new LoginPage(driver);

            driver.get("https://automationexercise.com/");
            loginPage.sucessLogin();
            String expectedMessage = "O usuário efetuou seu login com sucesso";
            String actualMessage = driver.getPageSource();
            System.out.println("test");
            assertTrue(actualMessage.contains(expectedMessage), "Login não foi realizado com sucesso!");
        } finally {
            driver.quit();
        }
    }
}