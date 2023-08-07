package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\javva\\Downloads\\Git repository\\CucumberPractice\\src\\test\\java\\features",
        glue = "StepDefinitions"
)
public class JunitTestRunner
{

}
