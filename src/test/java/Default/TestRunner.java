package Default;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//Created by Priyanka Lokesh

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/Login.feature", glue = {"Testing.Definitions"})
public class TestRunner {


}
