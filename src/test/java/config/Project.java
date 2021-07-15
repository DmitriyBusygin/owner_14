package config;

import org.aeonbits.owner.ConfigFactory;

public class Project {
    public static WebConfig webConfig = ConfigFactory.create(WebConfig.class);
}
