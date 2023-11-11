package DbTesting;

import com.beust.ah.A;
import com.mysql.cj.jdbc.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Login;
import pages.Menu;
import pages.clients.AddClient;
import testUtil.DoLogin;

import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;

import static testUtil.Conversion.*;
import static util.ConfigReader.*;
import static util.ForDataProvider.readDataFromExcel;

public class AddClientDataProviderTest2 extends DoLogin {


    @Test (dataProvider = "getData")
    public void addClientTest(String name, String surname, String language,
                              String address1, String address2, String city,
                              String state, String zip, String country,
                              String gender, String birthDate, String phone,
                              String fax, String mobile, String email,
                              String web, String vatId, String taxCode) throws ClassNotFoundException, SQLException, ParseException {
        Menu menu = new Menu(driver);
        menu.clickAddClient();
        AddClient addClient = new AddClient(driver);

        ArrayList<String> expected = new ArrayList<>();
        expected.add(name);
        expected.add(surname);
        expected.add(language.toLowerCase());
        expected.add(address1);
        expected.add(address2);
        expected.add(city);
        expected.add(state);
        expected.add(zip);
        expected.add(country);
        expected.add(gender);
        expected.add(birthDate);
        expected.add(phone);
        expected.add(fax);
        expected.add(mobile);
        expected.add(email);
        expected.add(web);
        expected.add(vatId);
        expected.add(taxCode);


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


        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ip",
                "root","root");

        Statement st = con.createStatement();

        String sql = "SELECT * FROM ip.ip_clients where client_name = '"+name+"'";

        ResultSet rs = st.executeQuery(sql);

        ArrayList<String> actual = new ArrayList<>();

        while (rs.next())
        {
            actual.add(rs.getString("client_name"));
            actual.add(rs.getString("client_surname"));
            actual.add(rs.getString("client_language"));
            actual.add(rs.getString("client_address_1"));
            actual.add(rs.getString("client_address_2"));
            actual.add(rs.getString("client_city"));
            actual.add(rs.getString("client_state"));
            actual.add(rs.getString("client_zip"));

            String countryShortCode = rs.getString("client_country");
            String fullFormCountry = convertCountry(countryShortCode);

            actual.add(fullFormCountry);


            actual.add(getGender(rs.getString("client_gender")));

            actual.add(convertDate(rs.getString("client_birthDate")));

            actual.add(rs.getString("client_phone"));
            actual.add(rs.getString("client_fax"));
            actual.add(rs.getString("client_mobile"));
            actual.add(rs.getString("client_email"));
            actual.add(rs.getString("client_web"));
            actual.add(rs.getString("client_vat_id"));
            actual.add(rs.getString("client_tax_code"));

        }

        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        Assert.assertEquals(actual,expected,"data mismatch");

    }

    @DataProvider
    public Object[][] getData() throws IOException {
        return readDataFromExcel("Data/invoicePlane.xlsx","db Testing");
    }
}
