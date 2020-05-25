package runnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features=".//Features//Login.feature",
        glue="stepDefinitions",
        //tags={"@sanity"},
        monochrome=true,
        dryRun=false,
        strict=true,
        plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"})
public class TestRunner {
	
}
