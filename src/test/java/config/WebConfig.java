package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/${localOrRemote}Web.properties"
})
public interface WebConfig extends Config {

    @Key("browser.name")
    String browserName();

    @Key("browser.version")
    String browserVersion();

    @Key("remote")
    Boolean remote();

    @Key("selenide.url")
    String selenideUrl();

    @Key("selenide.login")
    String selenideLogin();

    @Key("selenide.password")
    String selenidePassword();
}