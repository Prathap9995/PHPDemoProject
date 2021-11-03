package com.prathap.phpproject.PHPRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/com/prathap/phpproject/PHPFeature/phpfeature.feature, LoginFeature.feature",
		glue = {"com.prathap.phpproject.PHPStepDefination"},
		plugin = {"pretty", "html:target/report.html"},
	monochrome = true
		)

public class phpRunner {

}


//package name :- com.Maveric.projectname.phpdemo
// In feature relative path
//In glue package name