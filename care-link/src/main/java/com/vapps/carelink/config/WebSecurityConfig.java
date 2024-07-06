package com.vapps.carelink.config;

import com.vapps.security.config.URLConfig;
import com.vapps.security.config.WebSecurityConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebSecurityConfig {

    @Bean
    public WebSecurityConfiguration webSecurityConfiguration() {
        List<URLConfig> urlConfigs = new ArrayList<>();
        urlConfigs.add(new URLConfig("/api/user", List.of(), List.of(), HttpMethod.POST));
        return new WebSecurityConfiguration(urlConfigs);
    }
}
