package com.chetan.GithubApiIntegration.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import lombok.Getter;

@Configuration
@Getter
public class GithubConfig {

    @Value("${GITHUB_API_TOKEN:${github.api.token}}")
    private String token;

    @Value("${GITHUB_API_URL:${github.api.url}}")
    private String apiUrl;

    @Value("${GITHUB_USERNAME:${github.username}}")
    private String username;
}