package ovh.knowall.socialstats.api.twitter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author michal_majewski
 */
@Configuration
@ConfigurationProperties("token")
public class TokenConfiguration {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }
}
