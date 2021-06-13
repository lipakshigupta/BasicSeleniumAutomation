package Step_Defination;

import Pages.SignUp_Action;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SignUp_StepDefination {
    WebDriver driver = null;
    SignUp_Action coj = new SignUp_Action(driver);

    @Given("^User navigate to  application (.*)$")
    public void navigate_to_application(String Url) throws Throwable {
        System.setProperty("webdriver.chrome.driver",
                SignUp_StepDefination.class.getClassLoader().getResource("chromedriver_win32").getPath()
                +"//chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(Url);
        driver.manage().window().maximize();
        System.out.println("I am at the LogIn Page");
    }

    @When("^User Enter UserName (.*)$")
    public void Enter_UserName(String usrname) throws Throwable {
        SignUp_Action coj = new SignUp_Action(driver);
        coj.enter_UserName(usrname);
        System.out.println("UserName");
    }

    @When("^User Enter Mobile Number (.*)$")
    public void Enter_Mobile_Number(String PhnNumber) throws Throwable {
        SignUp_Action coj = new SignUp_Action(driver);
        coj.enter_PhoneNumber(PhnNumber);
        System.out.println("MobileNumber");
    }

    @When("^User Enter Password (.*)$")
    public void Enter_Password(String Pwd) throws Throwable {
        System.out.println("Password");
    }

    @When("^User Accept Term and conditions$")
    public void Accept_Term_and_conditions() throws Throwable {
        System.out.println("TermAndCondition");
    }

    @Then("^Navigate to Next page$")
    public void Navigate_to_Next_page() throws Throwable {
        System.out.println("NextPage");
    }
    @Given("^User$")
    public void User() throws Throwable {
        driver = new FirefoxDriver();
        driver.navigate().to("https://kuchtoh.com/auth/register");
        System.out.println("I am at the LogIn Page");
    }

    }
