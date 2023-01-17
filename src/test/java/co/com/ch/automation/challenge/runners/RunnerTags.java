
package co.com.ch.automation.challenge.runners;




import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/TestCases.feature",

        tags = "@stories",
        glue = "co.com.ch.automation.challenge.stepDefinitions",

        snippets = CucumberOptions.SnippetType.CAMELCASE )

public class RunnerTags {
}