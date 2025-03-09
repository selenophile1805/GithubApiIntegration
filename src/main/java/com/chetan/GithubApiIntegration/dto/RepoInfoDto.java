package com.chetan.GithubApiIntegration.dto;

import lombok.Data;

@Data
public class RepoInfoDto {
    private String name;
    private String description;
    private String htmlUrl;
    private int stars;
    private int forks;
}