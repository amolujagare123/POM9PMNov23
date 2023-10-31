import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ForgotPassword;
import pages.Login;

import java.io.IOException;

import static util.ConfigReader.getUrl;

public class ForgotPasswordTest {

    @Test
    public void loginTest() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getUrl());

        Login login = new Login(driver);
        login.clickForgotPassword();

        ForgotPassword forgotPassword = new ForgotPassword(driver);
        forgotPassword.setTxtEmail("amol@gmail.com");
        forgotPassword.clickReset();



    }


}
