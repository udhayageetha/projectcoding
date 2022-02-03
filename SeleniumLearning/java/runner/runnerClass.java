package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/test/java/features", glue = "steps", monochrome = true, dryRun = false, snippets = SnippetType.CAMELCASE, 
publish = true,tags= "@Regression or @Smoke")
public class runnerClass extends AbstractTestNGCucumberTests {

}
