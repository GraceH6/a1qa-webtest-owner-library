package config;

import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:${env}.properties"
})

public interface WebTestConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("https://a1qa.com/")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("remoteWebDriver")
    @DefaultValue("false")
    Boolean getRemoteWebDriver();

    @Key("remoteUrl")
    String gerRemoteUrl();
}
