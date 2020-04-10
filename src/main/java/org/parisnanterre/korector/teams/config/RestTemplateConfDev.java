package org.parisnanterre.korector.teams.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Profile("dev")
public class RestTemplateConfDev {
    @Bean("ribbon-template")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
