package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


 
	@RunWith(Cucumber.class)
	@CucumberOptions(
				features="featurefile"
				,glue= {"stepDefination"},tags="@searchproduct"
			
			)
	
	public class RegisterRunner{
	
	
    }
