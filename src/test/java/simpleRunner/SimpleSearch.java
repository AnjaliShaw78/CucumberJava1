package simpleRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="C:\\Users\\beati\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\CucumberTestNG2\\src\\test\\resources\\simple\\Simpleform.feature",
glue = "simpleSteps")
public class SimpleSearch extends AbstractTestNGCucumberTests{

}
