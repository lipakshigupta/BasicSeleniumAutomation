package Pages;

import org.openqa.selenium.By;

public class  SignUp {

    protected By getUserName() {
        return userName;
    }
    protected By getPassword() {
        return Pwd;
    }
    protected By getPhoneNumber() {
        return PhnNumber;
    }

    By userName = By.name("full name");
    By PhnNumber = By.name("phone number");
    By Pwd = By.name("password");


}
