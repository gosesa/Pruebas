package co.com.pruebas.banistmo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/pruebaBanistmo.feature",
        tags = "@stories",
        glue = "co.com.pruebas.banistmo.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
