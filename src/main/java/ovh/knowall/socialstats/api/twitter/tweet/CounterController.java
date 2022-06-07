package ovh.knowall.socialstats.api.twitter.tweet;

import lombok.NonNull;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ovh.knowall.socialstats.api.twitter.TokenConfiguration;

/**
 * @author michal_majewski
 */
@RestController
@RequestMapping("/api/counter/tweets")
final class CounterController {

    private final TokenConfiguration tokenConfig;

    CounterController(final TokenConfiguration tokenConfig) {
        this.tokenConfig = tokenConfig;
    }

    @GetMapping
    ResponseEntity<String> tokenValue(@RequestParam @NonNull String topic) {
        var httpHeader = new HttpHeaders();
        httpHeader.add("Authorization", "Bearer " + tokenConfig.getValue());

        final var httpRequest = new HttpEntity<String>(httpHeader);

        return new RestTemplate().exchange("https://api.twitter.com/2/tweets/counts/recent?start_time=2022-06-05T0:00:00.000Z&end_time=2022-06-05T23:59:59.999Z&query=" + topic, HttpMethod.GET, httpRequest, String.class);
    }
}
