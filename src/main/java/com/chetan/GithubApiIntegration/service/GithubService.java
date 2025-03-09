package com.chetan.GithubApiIntegration.service;

import com.chetan.GithubApiIntegration.dto.IssueRequestDto;
import com.chetan.GithubApiIntegration.dto.RepoInfoDto;

public interface GithubService {

  
    Object getGithubProfileAndRepos();

    
    RepoInfoDto getRepoInfo(String repoName);

  
    String createIssue(String repoName, IssueRequestDto issueRequestDto);
}
