package com.example.demo;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.example.demo.command.Dummy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@ContextConfiguration(classes = DemoApplication.class/*, loader = SpringApplicationContextLoader.class*/)
public class MyStepdefs {
    
    @Autowired
    private Dummy dummy;
    
    @Given("^(\\d+) integers$")
    public void integers(int arg0) {
    }
    
    @When("^added$")
    public void added() {
    }
    
    @Then("^sum is returned$")
    public void sumIsReturned() {
        assertThat(dummy.square(2), is(4));
    }
}
