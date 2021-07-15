package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/localWeb.properties",
        "classpath:config/remoteWeb.properties"
})
public interface WebConfig extends Config {

    @Key("browser")
    String browser();

    @Key("browser.version")
    String browserVersion();

    @Key("remote")
    Boolean remote();

    @Key("urlSelenide")
    String urlSelenide();

    @Key("loginSelenide")
    String loginSelenide();

    @Key("passwordSelenide")
    String passwordSelenide();
}