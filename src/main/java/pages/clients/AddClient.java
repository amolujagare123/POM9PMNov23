package pages.clients;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClient {
    private WebDriver driver;

    // Define WebElements using the given XPaths
    @FindBy(xpath = "//input[@id='client_name']")
    private WebElement clientNameInput;

    @FindBy(xpath = "//input[@id='client_surname']")
    private WebElement clientSurnameInput;

    @FindBy(xpath = "//input[@id='client_address_1']")
    private WebElement clientAddress1Input;

    @FindBy(xpath = "//input[@id='client_address_2']")
    private WebElement clientAddress2Input;

    @FindBy(xpath = "//input[@id='client_city']")
    private WebElement clientCityInput;

    @FindBy(xpath = "//input[@id='client_state']")
    private WebElement clientStateInput;

    @FindBy(xpath = "//input[@id='client_zip']")
    private WebElement clientZipInput;

    @FindBy(xpath = "//input[@id='client_phone']")
    private WebElement clientPhoneInput;

    @FindBy(xpath = "//input[@id='client_fax']")
    private WebElement clientFaxInput;

    @FindBy(xpath = "//input[@id='client_mobile']")
    private WebElement clientMobileInput;

    @FindBy(xpath = "//input[@id='client_email']")
    private WebElement clientEmailInput;

    @FindBy(xpath = "//input[@id='client_web']")
    private WebElement clientWebInput;

    @FindBy(xpath = "//input[@id='client_vat_id']")
    private WebElement clientVatIdInput;

    @FindBy(xpath = "//input[@id='client_tax_code']")
    private WebElement clientTaxCodeInput;

    @FindBy(xpath = "//span[@id='select2-client_language-container']")
    WebElement containerLanguage;
    @FindBy(xpath = "//input[@role='searchbox']")
    WebElement searchbox;

    public void setLanguage(String language)
    {
        containerLanguage.click();
        searchbox.sendKeys(language);
        searchbox.sendKeys(Keys.ENTER);
    }


    @FindBy(xpath = "//span[@id='select2-client_country-container']")
    WebElement countryContainer;

    public void setCountry(String country)
    {
        countryContainer.click();
        searchbox.sendKeys(country);
        //searchbox.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//li[normalize-space()='"+country+"']")).click();
    }

    @FindBy(xpath = "//span[@id='select2-client_gender-container']")
    WebElement genderContainer;
    public void setGender(String gender)
    {
        genderContainer.click();
        driver.findElement(By.xpath("//li[normalize-space()='"+gender+"']")).click();
    }

    @FindBy(xpath = "//input[@id='client_birthdate']")
    WebElement clientBirthDate;

    public void setBirthDate(String birthDate)
    {
       // clientBirthDate.sendKeys(birthDate);
        System.out.println(birthDate);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','"+birthDate+"')",clientBirthDate);

    }
    @FindBy(xpath = "//button[@id='btn-submit']")
    WebElement save;
    public void clickSaveButton()
    {
        save.click();
    }
    public AddClient(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterClientName(String name) {
        clientNameInput.sendKeys(name);
    }
    public void enterClientSurname(String surname) {
        clientSurnameInput.sendKeys(surname);
    }

    public void enterClientAddress1(String address1) {
        clientAddress1Input.sendKeys(address1);
    }

    public void enterClientAddress2(String address2) {
        clientAddress2Input.sendKeys(address2);
    }

    public void enterClientCity(String city) {
        clientCityInput.sendKeys(city);
    }

    public void enterClientState(String state) {
        clientStateInput.sendKeys(state);
    }

    public void enterClientZip(String zip) {
        clientZipInput.sendKeys(zip);
    }

    public void enterClientPhone(String phone) {
        clientPhoneInput.sendKeys(phone);
    }

    public void enterClientFax(String fax) {
        clientFaxInput.sendKeys(fax);
    }

    public void enterClientMobile(String mobile) {
        clientMobileInput.sendKeys(mobile);
    }

    public void enterClientEmail(String email) {
        clientEmailInput.sendKeys(email);
    }

    public void enterClientWeb(String web) {
        clientWebInput.sendKeys(web);
    }

    public void enterClientVatId(String vatId) {
        clientVatIdInput.sendKeys(vatId);
    }

    public void enterClientTaxCode(String taxCode) {
        clientTaxCodeInput.sendKeys(taxCode);
    }
}
