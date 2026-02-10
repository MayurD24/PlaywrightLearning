package hooks;

import factory.PlaywrightFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    private PlaywrightFactory factory;

    @Before
    public void setUp(){
        factory = new PlaywrightFactory();
        factory.initBrowser();
    }

    @After
    public void tearDown(){
        factory.closeBrowser();
    }
}