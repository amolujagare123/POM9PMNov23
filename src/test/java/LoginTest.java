import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.Login;

import java.io.IOException;

import static util.ConfigReader.*;

public class LoginTest {

    @Test
    public void loginTest() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getUrl());

        Login login = new Login(driver);

        login.setTxtUsername(getUsername());
        login.setTxtPassword(getPassword());
        login.clickBtnLogin();
    }

    @Test
    public void loginTest2() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getUrl());

        Login login = new Login(driver);

        login.setTxtUsername("ddsds@gmail.com");
        login.setTxtPassword("dsdsd");
        login.clickBtnLogin();
    }
}
