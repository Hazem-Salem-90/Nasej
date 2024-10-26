package Internal_Page_User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductsSolutions_Accept_Page extends Internal_BasePage {


    //WebDriver driver;
    public ProductsSolutions_Accept_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(how=How.XPATH, using="//*[@id=\"layoutMain\"]/app-header/header/div[1]/div/div/div[1]/div[2]/a") public WebElement Tasks_icon;
    @FindBy(how=How.XPATH, using="//*[@id=\"layoutMain\"]/div/div/app-user-frame/app-dashboard/app-inbox/div[2]/div/div/div/h2/button") public WebElement Search_tab;
    @FindBy(how=How.XPATH, using="//*[@id=\"collapseOne\"]/div/div[1]/div[1]/div/input") public WebElement RequestNum_Field;
    @FindBy(how=How.XPATH, using="//*[@id=\"collapseOne\"]/div/div[2]/button") public WebElement Search_btn;
    @FindBy(how=How.XPATH, using="//*[@id=\"mainDataTable\"]/tbody/tr/td[1]") public WebElement OpenNeededRequest;
    @FindBy(how=How.XPATH, using="//*[@id=\"visitRequestAccordion2\"]/app-decision-wraper-component/div/div[2]/div[1]/div[1]/label") public WebElement AcceptRadio_btn;
    @FindBy(how=How.XPATH, using="//*[@id=\"visitRequestAccordion2\"]/app-decision-wraper-component/div/div[2]/div[5]/button") public WebElement Send_btn;
    @FindBy(how=How.XPATH, using="/html/body/div/div/div[6]/button[1]") public WebElement Yes_btn;
    @FindBy(how=How.XPATH, using="/html/body/div/div/div[6]/button[1]") public WebElement Ok_btn;


    public void Open_Tasks() throws InterruptedException {
        clickElement(Tasks_icon);
    }

    public void SearchOpen_Task() throws InterruptedException {
        String CopyFirstRequestNum = driver.findElement(By.xpath("//*[@id=\"mainDataTable\"]/tbody/tr[1]/td[1]/span/a")).getText();

        clickElement(Search_tab);
        RequestNum_Field.sendKeys(CopyFirstRequestNum);
        //RequestNum_Field.sendKeys("RNP_0000000267");
        clickElement(Search_btn);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(500);
        clickOnEmptySpace(driver); // Call your method here

        clickElement(OpenNeededRequest);

    }

    public void Accept_Task() throws InterruptedException {
        clickElement(AcceptRadio_btn);
        clickElement(Send_btn);
        clickElement(Yes_btn);
        clickElement(Ok_btn);
    }




}
