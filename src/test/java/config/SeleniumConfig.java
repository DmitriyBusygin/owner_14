package config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface SeleniumConfig extends Config {

    @Key("webdriver.remote.url")
    URL getRemoteUrl();

    @Key("webdriver.remote")
    boolean isRemote();
}
