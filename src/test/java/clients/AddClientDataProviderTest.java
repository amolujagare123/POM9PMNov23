package clients;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Login;
import pages.Menu;
import pages.clients.AddClient;

import java.io.IOException;

import static util.ConfigReader.*;

public class AddClientDataProviderTest {
    WebDriver driver ;
    @BeforeClass
    public void doLogin() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getUrl());

        Login login = new Login(driver);

        login.setTxtUsername(getUsername());
        login.setTxtPassword(getPassword());
        login.clickBtnLogin();
    }

    @Test (dataProvider = "getData")
    public void addClientTest(String name, String surname, String language, String address1, String address2, String city, String state, String zip, String country, String gender, String birthDate, String phone, String fax, String mobile, String email, String web, String vatId, String taxCode)
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();
        AddClient addClient = new AddClient(driver);




        // Fill in the client information form
        addClient.enterClientName(name);
        addClient.enterClientSurname(surname);
        addClient.setLanguage(language);
        addClient.enterClientAddress1(address1);
        addClient.enterClientAddress2(address2);
        addClient.enterClientCity(city);
        addClient.enterClientState(state);
        addClient.enterClientZip(zip);
        addClient.setCountry(country);
        addClient.setGender(gender);
        addClient.setBirthDate(birthDate);
        addClient.enterClientPhone(phone);
        addClient.enterClientFax(fax);
        addClient.enterClientMobile(mobile);
        addClient.enterClientEmail(email);
        addClient.enterClientWeb(web);
        addClient.enterClientVatId(vatId);
        addClient.enterClientTaxCode(taxCode);
        addClient.clickSaveButton();


    }

    @DataProvider
    public Object[][] getData()
    {

    }
}
