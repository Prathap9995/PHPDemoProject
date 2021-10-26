package CuCRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Prathap\\eclipse-workspace\\Prathap\\Prathap.java\\CoreJava\\PHPDemp\\src\\test\\java\\CucFeature\\Feature.feature",
		glue = {"StepDefPHP"}
		
		
		)

public class RunPHP {

}
