package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="C:\\Users\\javva\\Downloads\\Git repository\\CucumberPractice\\src\\test\\java\\features",
        glue = "StepDefinitions"

)
public class TestNgTestRunner extends AbstractTestNGCucumberTests {
}
