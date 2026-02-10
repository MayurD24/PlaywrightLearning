package hooks;

import factory.PlaywrightFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Hooks {

    private PlaywrightFactory factory;

    @BeforeClass
    public void setUp(){
        factory = new PlaywrightFactory();
        factory.initBrowser();
    }

    @AfterClass
    public void tearDown(){
        factory.closeBrowser();
    }
}