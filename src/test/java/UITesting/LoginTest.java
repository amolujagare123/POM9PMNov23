package UITesting;

import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import testUtil.OpenUrl;

import static testUtil.UI.UITest.*;

public class LoginTest extends OpenUrl {

    Login login;
    @BeforeClass
    public void setLogin()
    {
         login = new Login(driver);
    }

   /* @Test
    public void txtUsernameCheckVisibility()
    {
        boolean expected = true;
        boolean actual = false;
        try {
             actual = login.txtUsername.isDisplayed();
        }
        catch (Exception e)
        {

        }
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);
        Assert.assertEquals(actual,expected,
                "username text box is not displayed");
    }*/

    @Test
    public void txtUsernameCheckVisibility()
    {
        boolean expected = true;
        boolean actual = checkVisibility(login.txtUsername);
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);
        Assert.assertEquals(actual,expected,
                "username text box is not displayed");
    }

    @Test
    public void txtPasswordCheckVisibility()
    {
        boolean expected = true;
        boolean actual = checkVisibility(login.txtPassword);
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);
        Assert.assertEquals(actual,expected,
                "username text box is not displayed");
    }

    @Test
    public void logoCheckVisibility()
    {
        boolean expected = true;
        boolean actual = checkVisibility(login.logoIcon);
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);
        Assert.assertEquals(actual,expected,
                "username text box is not displayed");
    }

    @Test
    public void txtUsernameCheckEnability()
    {
        boolean expected = true;
        boolean actual = checkEnability(login.txtUsername);
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);
        Assert.assertEquals(actual,expected,
                "username text box is not Enabled");
    }

    @Test
    public void lblEmailSpellCheck()
    {
        String expected = "Email";
        String actual = checkText(login.lblEmail);
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);
        Assert.assertEquals(actual,expected,
                "incorrect Spelling");
    }


    @Test
    public void txtPasswordWatermarkCheck()
    {
        String expected = "Password";
        String actual = checkWatermark(login.txtPassword);
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);
        Assert.assertEquals(actual,expected,
                "incorrect watermark");
    }

    @Test
    public void lblEmailFontSizeCheck()
    {
        String expected = "14px";
        String actual = checkCSSValue(login.lblEmail,"font-size");
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);
        Assert.assertEquals(actual,expected,
                "incorrect font size");
    }

    @Test
    public void lblEmailFontFamilyCheck()
    {
        String expected = "-apple-system, system-ui, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif";
        String actual = checkCSSValue(login.lblEmail,"font-family");
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);
        Assert.assertEquals(actual,expected,
                "incorrect font family");
    }

    @Test
    public void btnLoginColorCheck()
    {
        String expected = "#2C8EDD";
        String rgbaColor = checkCSSValue(login.btnLogin,"background-color");

        String actual = Color.fromString(rgbaColor).asHex().toUpperCase();
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);
        Assert.assertEquals(actual,expected,
                "incorrect Color");
    }

}
