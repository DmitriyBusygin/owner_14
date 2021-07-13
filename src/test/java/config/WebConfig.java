package config;

import org.aeonbits.owner.Config;

public interface WebConfig extends Config {

    @Key("site.base.url")
    String getBaseUrl();

    @Key("github.username")
    String getUsername();

    @Key("github.password")
    String getPassword();

}
