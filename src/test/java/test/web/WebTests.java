package test.web;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class WebTests extends TestBase {

    @Test
    public void openGitHub() {
        open("https://github.com/");
        sleep(2000);
    }
}
