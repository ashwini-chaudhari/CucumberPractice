package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Feature/login.feature" , 
glue="StepDefination" , 
monochrome= true,
dryRun=false,
plugin= {"pretty","html:target/report1.html"})

public class TestRunner {

}
