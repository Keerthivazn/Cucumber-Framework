package org.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@C:\\Users\\KEERTHIVENKAT\\eclipse-workspace\\Cucumber\\src\\test\\resources\\failed.txt",
glue="org.stepdefinition",monochrome=true)
public class ReRunner {

	
}
