package co.uk.next.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/co/uk/next/features"},
        glue = {"co/uk/next/hooks", "co/uk/next/stepDefinitions"},
        plugin = {"pretty","json:target/pretty.json",
        "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"
        }
)
public class TestRunner {
}
