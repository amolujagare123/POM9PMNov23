package testUtil.UI;

import org.openqa.selenium.WebElement;

public class UITest {

    public static boolean checkVisibility(WebElement element)
    {

        boolean actual = false;
        try {
            actual = element.isDisplayed();
        }
        catch (Exception e)
        {

        }
        return actual;
    }

    public static boolean checkEnability(WebElement element)
    {

        boolean actual = false;
        try {
            actual = element.isEnabled();
        }
        catch (Exception e)
        {

        }
        return actual;
    }

    public static String checkText(WebElement element)
    {

        String actual = "";
        try {
            actual = element.getText();
        }
        catch (Exception e)
        {

        }
        return actual;
    }

    public static String checkWatermark(WebElement element)
    {

        String actual = "";
        try {
            actual = element.getAttribute("placeholder");
        }
        catch (Exception e)
        {

        }
        return actual;
    }

    public static String checkCSSValue(WebElement element,String cssElemnt)
    {

        String actual = "";
        try {
            actual = element.getCssValue(cssElemnt);
        }
        catch (Exception e)
        {

        }
        return actual;
    }
}
