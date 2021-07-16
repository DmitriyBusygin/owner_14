package test.api;

import config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class ApiTest {
    public static ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class);

    @Test
    public void testApi(){
        System.out.println("url: " + apiConfig.url());
        System.out.println("token: " + apiConfig.token());
    }
}
