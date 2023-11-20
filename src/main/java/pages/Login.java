package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    /*WebDriver driver;
    WebElement element  = driver.findElement(By.xpath("//input[@name='email']"));*/

    @FindBy (xpath = "//input[@name='email']")
    public WebElement txtUsername;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement txtPassword;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement btnLogin;

    @FindBy (xpath = "//a[@class='btn btn-default']")
    public WebElement btnForgotPassword;

    @FindBy(xpath = "//label[@for='email']")
    public WebElement lblEmail;

    @FindBy(xpath = "//label[@for='password']")
    public WebElement lblPassword;

    @FindBy(xpath = "//img[@class='login-logo img-responsive']")
    public WebElement logoIcon;

    WebDriver driver;
    public Login(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setTxtUsername(String username)
    {
        txtUsername.sendKeys(username);
    }

    public void setTxtPassword(String password)
    {
        txtPassword.sendKeys(password);
    }

    public void clickBtnLogin()
    {
        btnLogin.click();
    }

    public void clickForgotPassword()
    {
        btnForgotPassword.click();
    }
}
