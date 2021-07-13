package config;

public class TestWebConfig implements WebConfig {

    public String getBaseUrl() {
        return "https://test.github.com";
    }

    public String getUsername() {
        return "testuser";
    }

    public String getPassword() {
        return "testpassword";
    }
}
