import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)//(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login/log.feature", glue= "steps/LoginSteps.java")
public class LoginWithValidCredentials {

}
