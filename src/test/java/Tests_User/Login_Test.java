package Tests_User;

import Page_User.Login_Page;
import data.JsonDataReader;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class Login_Test extends testbase {

    Login_Page login_obj;
    JsonDataReader jsonReader;

    @Test
    //@Description("Start screen login")
    public void UserCanLogin() throws InterruptedException,IOException, ParseException {


        login_obj=new Login_Page(driver);
///////////////
        jsonReader = new JsonDataReader();
        jsonReader.jsonreader();
///////////////
        login_obj.User_Login(jsonReader.userName,jsonReader.Password);
    }


}
