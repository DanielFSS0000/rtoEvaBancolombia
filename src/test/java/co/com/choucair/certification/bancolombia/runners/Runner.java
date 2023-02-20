package co.com.choucair.certification.bancolombia.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/evalart_hu.feature",
        tags = "@scenario",
        glue = "stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class Runner {
}
