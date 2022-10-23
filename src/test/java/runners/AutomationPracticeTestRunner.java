package runners;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        plugin = {"json:target/results/automationpractice/cucumber-report.json",  "html:target/results/automationpractice"},
        features = "src/test/resources/features",
        glue = "steps",
        tags = {"@automationpractice"}

)
public class AutomationPracticeTestRunner extends BaseTestRunner{

}
