package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReportGeneration;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.stepdefinition",
monochrome=true,dryRun=false,strict=false,snippets=SnippetType.CAMELCASE,
plugin={"html:target","junit:JUnitReport//report.xml","json:JsonReport//report.json","rerun:src/test/resources\\failed.txt"})

public class Runner {

	@AfterClass
	public static void jvmReport() {
		//classname.methodname
		JVMReportGeneration.jvm("C:\\Users\\KEERTHIVENKAT\\eclipse-workspace\\Cucumber\\JsonReport\\report.json");
	}
	
}
