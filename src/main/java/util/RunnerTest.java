package util;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/resources/features/"},
		glue = {"steps", "util"},
		tags = "@api"
		)
public class RunnerTest {

}



