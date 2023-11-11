package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {

   /* @FindBy(xpath = "//a[normalize-space()='Dashboard']")
    WebElement dashboard;
    @FindBy(xpath = "//span[normalize-space()='Clients']")
    WebElement regression.clients;
    @FindBy(xpath = "//a[contains(text(),'Add Client')]")
    WebElement addClient;
    @FindBy(xpath = "//a[normalize-space()='View Clients']")
    WebElement viewClients;
    @FindBy(xpath = "//span[normalize-space()='Quotes']")
    WebElement quotes;
    @FindBy(xpath = "//a[@class='create-quote']")
    WebElement createQuote;
    @FindBy(xpath = "//a[normalize-space()='View Quotes']")
    WebElement viewQuotes;*/

     WebDriver driver;

    @FindBy(xpath = "//a[normalize-space()='Dashboard']")
    private WebElement dashboard;

    @FindBy(xpath = "//span[normalize-space()='Clients']")
    private WebElement clients;

    @FindBy(xpath = "//a[normalize-space()='Add Client']")
    private WebElement addClient;

    @FindBy(xpath = "//a[normalize-space()='View Clients']")
    private WebElement viewClients;

    @FindBy(xpath = "//span[normalize-space()='Quotes']")
    private WebElement quotes;

    @FindBy(xpath = "//a[@class='create-quote']")
    private WebElement createQuote;

    @FindBy(xpath = "//a[normalize-space()='View Quotes']")
    private WebElement viewQuotes;

    @FindBy(xpath = "//span[normalize-space()='Invoices']")
    private WebElement invoices;

    @FindBy(xpath = "//a[normalize-space()='Create Invoice']")
    private WebElement createInvoice;

   public Menu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickDashboardLink() {
        dashboard.click();
    }

    public void clickAddClient() {
        clients.click();
        addClient.click();
    }

    public void clickViewClient() {
        clients.click();
        viewClients.click();
    }




    public void clickCreateQuoteLink() {
        quotes.click();
        createQuote.click();
    }

    public void clickViewQuotesLink() {
        quotes.click();
        viewQuotes.click();
    }


}
