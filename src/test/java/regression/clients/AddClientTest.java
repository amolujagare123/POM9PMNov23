package regression.clients;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import pages.Menu;
import pages.clients.AddClient;
import testUtil.DoLogin;

import java.io.IOException;

import static util.ConfigReader.*;

public class AddClientTest extends DoLogin {

    @Test
    public void addClientTest()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);
        // Sample data for each field
        String name = "John";
        String surname = "Doe";
        String language = "TC9876";
        String address1 = "123 Main St";
        String address2 = "Apt 456";
        String city = "Cityville";
        String state = "State";
        String zip = "12345";
        String country = "India";
        String gender = "Male";
        String birthDate = "05/09/1985";
        String phone = "123-456-7890";
        String fax = "987-654-3210";
        String mobile = "555-555-5555";
        String email = "john.doe@example.com";
        String web = "https://example.com";
        String vatId = "VAT12345";
        String taxCode = "TC9876";





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


}
