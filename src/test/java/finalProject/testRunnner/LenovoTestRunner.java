package finalProject.testRunnner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = {"C:\\Users\\User\\IdeaProjects\\build.grandle\\src\\test\\resources\\features"},
        glue = {"finalProject.stepDefinition"},
        tags = {"@WIP"})
public class LenovoTestRunner {
}
