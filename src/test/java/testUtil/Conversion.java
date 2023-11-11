package testUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {

    public static String convertCountry(String shortCode)
    {
        String convertedCountry="";

        switch (shortCode)
        {
            case "IN":
                convertedCountry = "India";
                break;
            case "US":
                convertedCountry = "United States";
                break;
            case "CA":
                convertedCountry = "Canada";
                break;
            case "FR":
                convertedCountry = "France";
                break;
            case "GB":
                convertedCountry = "United Kingdom";
                break;
            case "DE":
                convertedCountry = "Germany";
                break;
            case "JP":
                convertedCountry = "Japan";
                break;
            case "BR":
                convertedCountry = "Brazil";
                break;
            case "AU":
                convertedCountry = "Australia";
                break;
            case "CN":
                convertedCountry = "China";
                break;
        }

        return convertedCountry;
    }

    public static String getGender(String genderID)
    {
        String gender="";

        switch (genderID)
        {
            case "0" : gender="Male";break;
            case "1" : gender="Female";break;
            case "2" : gender="Other";break;
        }

        return gender;
    }

    /*   Expected :21/11/2023 - excel --> dd/MM/yyyy
        Actual   :2023-11-21 - DB
        */

    public static String convertDate(String dbDateStr) throws ParseException // yyyy-MM-dd
    {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dbDateStr);

        return  new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
}
