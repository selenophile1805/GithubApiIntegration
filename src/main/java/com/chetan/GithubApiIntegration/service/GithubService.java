package com.chetan.GithubApiIntegration.service;

import com.chetan.GithubApiIntegration.dto.IssueRequestDto;
import com.chetan.GithubApiIntegration.dto.RepoInfoDto;

public interface GithubService {

    /**
     * Fetches the authenticated GitHub user's profile and repositories.
     * @return User profile and repositories as an Object.
     */
    Object getGithubProfileAndRepos();

    /**
     * Retrieves information about a specific repository.
     * @param repoName The name of the repository.
     * @return Repository information as RepoInfoDto.
     */
    RepoInfoDto getRepoInfo(String repoName);

    /**
     * Creates an issue in a specified GitHub repository.
     * @param repoName The name of the repository.
     * @param issueRequestDto The issue details (title, body).
     * @return A confirmation message.
     */
    String createIssue(String repoName, IssueRequestDto issueRequestDto);
}