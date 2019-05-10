package com.joseGC.cucussured;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"pretty", "html:build/reports/tests/functionalTest/cucumber-html-report"},
        monochrome = true)
public class CucumberTest {
}