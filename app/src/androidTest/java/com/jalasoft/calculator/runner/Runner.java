package com.jalasoft.calculator.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "com/jalasoft/resources/features",
        glue = {"com.jalasoft"}
)

public class Runner extends AbstractTestNGCucumberTests {
}