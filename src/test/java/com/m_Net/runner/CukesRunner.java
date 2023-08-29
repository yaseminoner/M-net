package com.m_Net.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
        },
        features="src/test/resources/features",
        glue="com/m_Net/stepDefs",
        dryRun = false,
        tags="@smoke",
        publish = true
)
public class CukesRunner {


}
