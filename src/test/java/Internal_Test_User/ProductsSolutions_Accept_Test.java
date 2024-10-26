package Internal_Test_User;

import Internal_Page_User.ProductsSolutions_Accept_Page;
import Tests_User.testbase;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class ProductsSolutions_Accept_Test extends testbase {
    ProductsSolutions_Accept_Page ProductsSolutions_obj;

    @Test
    //@Description("Start screen login")
    public void Licenses_Acceptance() throws InterruptedException {


        ProductsSolutions_obj=new ProductsSolutions_Accept_Page(driver);

        ProductsSolutions_obj.Open_Tasks();
        ProductsSolutions_obj.SearchOpen_Task();
        ProductsSolutions_obj.Accept_Task();

    }


}
