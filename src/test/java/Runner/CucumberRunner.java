package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="//src//test//resources//Feature_File//",
        glue={"Step_Defination"},

        tags = {"@test"},
        plugin = {"pretty","junit:target//cucumber-reports//Cucumber.xml"},
//        publish = true,
        monochrome = true
)
public class CucumberRunner {



}
