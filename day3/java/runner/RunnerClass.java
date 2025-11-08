package runner;

import base.BaseClass;
import hookimplementation.HooksImplementation;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features ="src/main/java/feature/Lead.feature", glue ={"stepdefination","hookimplementation"},
tags = "@CreateLead or @EditLead or @DeleteLead"
,publish =true)

public class RunnerClass extends BaseClass{
	

}
