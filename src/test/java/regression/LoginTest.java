package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.Login;
import testUtil.OpenUrl;

import java.io.IOException;

import static util.ConfigReader.*;

public class LoginTest extends OpenUrl {

    @Test
    public void loginTest() throws IOException {
        Login login = new Login(driver);
        login.setTxtUsername(getUsername());
        login.setTxtPassword(getPassword());
        login.clickBtnLogin();
    }

    @Test
    public void loginTest2() throws IOException {
         Login login = new Login(driver);
        login.setTxtUsername("ddsds@gmail.com");
        login.setTxtPassword("dsdsd");
        login.clickBtnLogin();
    }
}
