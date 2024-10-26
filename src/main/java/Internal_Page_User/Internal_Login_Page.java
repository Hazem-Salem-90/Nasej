package Internal_Page_User;

import Page_User.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Internal_Login_Page extends BasePage {


    //WebDriver driver;
    public Internal_Login_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(how=How.XPATH, using="//*[@id=\"collapseOne\"]/div/div[2]/button") public WebElement login_btn;
    @FindBy(how=How.XPATH, using="//*[@id=\"collapseOne\"]/div/div[1]/div[1]/div/app-input-text/input") public WebElement Usedusername;
    @FindBy(how=How.XPATH, using="//*[@id=\"collapseOne\"]/div/div[1]/div[2]/div/app-input-text/input") public WebElement Usedpassword;


    public void User_Login(String username, String password) throws InterruptedException {


        //Thread.sleep(2000);

        //Thread.sleep(2000);


        // Insert username and password through Nafath then login
        setTextElementText(Usedusername,username);
        setTextElementText(Usedpassword,password);
        clickElement(login_btn);



    }




}
