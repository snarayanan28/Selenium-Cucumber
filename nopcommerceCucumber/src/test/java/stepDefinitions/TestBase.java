package stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

import java.util.Properties;

public class TestBase	{
    public WebDriver driver;
    public LoginPage login;
    public AddcustomerPage addCust;
    public SearchCustomerPage searchCust;
    public static Logger logger;
    Properties configProp;

    //Created for generating random string for Unique email
    public static String randomString() {
        String getRandomStr = RandomStringUtils.randomAlphabetic(5);
        return (getRandomStr);
    }
}
