package finalProject.stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import finalProject.hooks.Hooks;

public class HomePage {
    Hooks hooks = new Hooks();


    @Given("Open Homepage")
    public void openHomepage() {
        hooks.openHomepage1alv();
    }


    @And("Close page")
    public void closePage() {
        hooks.closePage1alv();
    }
}


