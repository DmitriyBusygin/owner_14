
package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/driver.properties",
})
public interface ApiConfig extends  Config{

    @Key("url")
    String url();

    @Key("token")
    String token();
}
