package com.cucumber.Runner;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "@Reports1/FailedScenario.txt", glue = {"com\\cumber\\StepDefinition","hooks"}, monochrome = true, dryRun = false, strict = true,
plugin={"json:Reportjson/reports.json","com.cucumber.listener.ExtentCucumberFormatter:Reports/CucumberReports.html","rerun:Reports1/FailedScenario.txt"})

public class TestRunner {

}