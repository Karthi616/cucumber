package com.cucumber.Runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumbe.org.Cucumbe.Bc1;
import com.cucumber.helper.FileReadManager;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@ExtendedCucumberOptions(retryCount=2)
@CucumberOptions(features = "src\\test\\java\\com\\cucumber\\Muke.feature", glue = {"com\\cumber\\StepDefinition","hooks"}, monochrome = true, dryRun = false, strict = true,
plugin={"json:Reportjson/reports.json","com.cucumber.listener.ExtentCucumberFormatter:Reports/CucumberReports.html","rerun:Reports1/FailedScenario.txt"})

public class Runner {
	public static WebDriver driver1;

	@BeforeClass
	public static void setup() throws IOException {
		String browserName = FileReadManager.getInstance().getCrInstance().getbrowserName();
		driver1 = Bc1.browserLaunch(browserName);
		//driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@AfterClass
	public static void tearDown() {
		driver1.quit();

	}
}
