package test.web;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebConfig;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;


public class TestBase {
    public static WebConfig webConfig = ConfigFactory.create(WebConfig.class);

    @BeforeAll
    static void setup() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.startMaximized = true;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;

        if(webConfig.remote()) {
            String login = webConfig.selenideLogin();
            String password = webConfig.selenidePassword();
            String url = webConfig.selenideUrl();
            Configuration.remote = String.format("https://%s:%s@%s/wd/hub/", login, password, url);
        }
    }

    /*@AfterEach
    void afterEach() {
        AllureAttachments.addScreenshotAs("Last screenshot");
        AllureAttachments.addPageSource();
        AllureAttachments.addBrowserConsoleLogs();

        if(webConfig.urlSelenide() != null) {
            AllureAttachments.addVideo();
        }

        closeWebDriver();
    }*/
}
