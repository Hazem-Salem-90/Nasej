package Internal_Test_User;

import Internal_Page_User.Licenses_Accept_Page;
import data.JsonDataReader;
import Tests_User.testbase;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class Licenses_Accept_Test extends testbase {
    Licenses_Accept_Page Licenses_obj;

    @Test
    //@Description("Start screen login")
    public void Licenses_Acceptance() throws InterruptedException,IOException, ParseException {


        Licenses_obj=new Licenses_Accept_Page(driver);

        Licenses_obj.Open_Tasks();
        Licenses_obj.SearchOpen_Task();
        Licenses_obj.Accept_Task();

    }


}
