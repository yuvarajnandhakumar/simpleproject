package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\projecttelecom.feature",
glue="org.stepdefinition",
monochrome=true, 
dryRun=false,
tags=("@secondsce"),
plugin={"html:target//cucumberreport","json:target//module1.json"})

public class TestRunner {

}
