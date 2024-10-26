package Page_User;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.By;


public class Login_Page extends BasePage {


    //WebDriver driver;
    public Login_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(how=How.XPATH, using="//*[@id=\"layoutMain\"]/div/div/app-login/div/button") public WebElement login_btn;
    @FindBy(how=How.ID, using="j_username") public WebElement Usedusername;
    @FindBy(how=How.ID, using="j_password") public WebElement Usedpassword;
    @FindBy(how=How.XPATH, using="//*[@id=\"pl1\"]/div/div/div/div/div[1]/form/div[4]/button") public WebElement submit_btn;
    @FindBy(how=How.ID, using="proceed-button") public WebElement proceed_btn;

    @FindBy(xpath = "//*[@id=\"layoutMain\"]/div/div/app-portal-home/div/div[1]")

    public WebElement platform_btn;

    public void User_Login(String username, String password) throws InterruptedException {


        //Thread.sleep(2000);

        //Thread.sleep(2000);
        clickElement(login_btn);

        // Insert username and password through Nafath then login
        setTextElementText(Usedusername,username);
        setTextElementText(Usedpassword,password);
        clickElement(submit_btn);
        Thread.sleep(2000);
        clickElement(proceed_btn);


        clickElement(platform_btn);

    }




}
