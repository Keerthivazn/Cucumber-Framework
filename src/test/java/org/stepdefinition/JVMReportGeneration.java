package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public  class JVMReportGeneration {

	public static void jvm(String pathname) {
	
		File f = new File("C:\\Users\\KEERTHIVENKAT\\eclipse-workspace\\Cucumber\\JVMReport");
		
		Configuration c = new Configuration(f, "images//png");
		c.addClassifications("OS", "Windows");
		c.addClassifications("Version", "10");
		c.addClassifications("Browsername", "Chrome");
		c.addClassifications("Browversion", "108.25.89");
		
		List<String> li = new ArrayList<String>();
		li.add(pathname);
		
		ReportBuilder rb = new ReportBuilder(li, c);
		rb.generateReports();
	}
}
