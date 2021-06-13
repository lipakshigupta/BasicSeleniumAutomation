package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import Pages/SignUp.java;

public class SignUp_Action extends SignUp {
    WebDriver driver= null;
    SignUp obj = new SignUp();

    public SignUp_Action(WebDriver driver) {
         this.driver = driver;
    }

    public void enter_UserName(String userName){
        By userName_xpath = getUserName();
        driver.findElement(userName_xpath).sendKeys(userName);

    }
    public void enter_PhoneNumber(String PhnNumber){
        By PhnNumber_xpath = getPhoneNumber();
        driver.findElement(PhnNumber_xpath).sendKeys(PhnNumber);

    }
    public void enter_Password(String userName){
        SignUp obj = new SignUp();
        By userName_xpath = getUserName();
        driver.findElement(userName_xpath).sendKeys(userName);

    }
    public void AcceptTermCondition(){



    }

}
