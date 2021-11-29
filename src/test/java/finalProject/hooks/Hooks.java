package finalProject.hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.Before;


import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    @Before
    public void openHomepage1alv() {
        Configuration.holdBrowserOpen = true;
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1920x1080";
        open("https://www.1a.lv/");
    }
    @After
    public void closePage1alv() {
        Selenide.closeWindow();

    }
}
