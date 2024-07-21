package Run;

import org.junit.runner.RunWith;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		tags="@Paiment",
		features="src/test/features/gestionCompte",
		glue = {"Hooks","StepDefinition"},
		
		publish = true,
plugin= {"pretty", "html:target/cucumber.html" ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

}
		
		
		
		)

public class Runner {
	
}
