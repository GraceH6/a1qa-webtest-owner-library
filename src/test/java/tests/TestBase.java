package tests;

import com.codeborne.selenide.Configuration;
import config.WebTestConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        WebTestConfig config = ConfigFactory.create(WebTestConfig.class, System.getProperties());

        Configuration.browser = config.getBrowser();
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browserVersion = config.getBrowserVersion();

        if (config.getRemoteWebDriver())
            Configuration.remote = config.gerRemoteUrl();
    }
}
