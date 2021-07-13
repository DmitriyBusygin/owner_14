import com.codeborne.selenide.Configuration;
import config.ProductionWebConfig;
import config.WebConfig;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubTest {

    private WebConfig config = new ProductionWebConfig();

    @Test
    public void authByUserNameAndPassword() {
        Configuration.baseUrl = config.getBaseUrl();
        open("/login");
        $("#login_field").sendKeys(config.getUsername());
        $("#password").sendKeys(config.getPassword());
    }
}
