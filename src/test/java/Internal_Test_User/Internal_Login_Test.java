package Internal_Test_User;

import Internal_Page_User.Internal_Login_Page;
import Tests_User.testbase;
import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class Internal_Login_Test extends testbase {
    Internal_Login_Page internal_login_obj;
    JsonDataReader jsonReader;

    @Test
    //@Description("Start screen login")
    public void UserCanLogin() throws InterruptedException,IOException, ParseException {


        internal_login_obj=new Internal_Login_Page(driver);
///////////////
        jsonReader = new JsonDataReader();
        jsonReader.jsonreader();
///////////////
        internal_login_obj.User_Login(jsonReader.InternalUserName,jsonReader.InternalPassword);
    }


}
