package com.chetan.GithubApiIntegration.service;

import com.chetan.GithubApiIntegration.config.GithubConfig;
import com.chetan.GithubApiIntegration.dto.IssueRequestDto;
import com.chetan.GithubApiIntegration.dto.RepoInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GithubServiceImpl implements GithubService {

    @Autowired
    private GithubConfig config;

    private final RestTemplate restTemplate = new RestTemplate();

    private HttpHeaders createHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + config.getToken());
        headers.set("Accept", "application/vnd.github.v3+json");
        return headers;
    }

    @Override
    public Object getGithubProfileAndRepos() {
        String url = config.getApiUrl() + "/user";
        HttpEntity<String> entity = new HttpEntity<>(createHeaders());

        ResponseEntity<Object> response = restTemplate.exchange(url, HttpMethod.GET, entity, Object.class);
        return response.getBody();
    }

    @Override
    public RepoInfoDto getRepoInfo(String repoName) {
        String url = config.getApiUrl() + "/repos/" + config.getUsername() + "/" + repoName;
        HttpEntity<String> entity = new HttpEntity<>(createHeaders());

        ResponseEntity<RepoInfoDto> response = restTemplate.exchange(url, HttpMethod.GET, entity, RepoInfoDto.class);
        return response.getBody();
    }

    @Override
    public String createIssue(String repoName, IssueRequestDto issueRequestDto) {
        String url = config.getApiUrl() + "/repos/" + config.getUsername() + "/" + repoName + "/issues";

        HttpEntity<IssueRequestDto> entity = new HttpEntity<>(issueRequestDto, createHeaders());
        ResponseEntity<Object> response = restTemplate.exchange(url, HttpMethod.POST, entity, Object.class);

        return "Issue created successfully!";
    }
}