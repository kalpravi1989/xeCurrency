package xeCurrency_pro;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = { "pretty", "html:target/html", "json:target/report.json" })
public class RunnerTest {

}
