package test.web;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static config.Project.webConfig;

public class TestBase {

    @BeforeAll
    static void setup() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.startMaximized = true;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;

        Configuration.browser = webConfig.browser();
        Configuration.browserVersion = webConfig.browserVersion();

        if(webConfig.urlSelenide() != null) {
            String login = webConfig.loginSelenide();
            String password = webConfig.passwordSelenide();
            String url = webConfig.urlSelenide();
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
