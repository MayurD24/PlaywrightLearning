package factory;

import com.microsoft.playwright.*;

public class PlaywrightFactory {

    private Playwright playwright;
    private Browser browser;
    private BrowserContext context;
    private Page page;

    public void initBrowser(){
        playwright = Playwright.create();
        browser = playwright.chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false));

        context = browser.newContext();
        page = context.newPage();
    }

    public Page getPage(){
        return page;
    }

    public void closeBrowser(){
        context.close();
        browser.close();
        playwright.close();
    }
}