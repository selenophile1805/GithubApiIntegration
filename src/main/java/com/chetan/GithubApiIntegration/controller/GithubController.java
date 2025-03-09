package com.chetan.GithubApiIntegration.controller;

import com.chetan.GithubApiIntegration.dto.IssueRequestDto;
import com.chetan.GithubApiIntegration.dto.RepoInfoDto;
import com.chetan.GithubApiIntegration.service.GithubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/github")
public class GithubController {

    @Autowired
    private GithubService githubService;

    @GetMapping
    public ResponseEntity<Object> getGithubProfileAndRepos() {
        return ResponseEntity.ok(githubService.getGithubProfileAndRepos());
    }

    @GetMapping("/{repoName}")
    public ResponseEntity<RepoInfoDto> getRepoInfo(@PathVariable String repoName) {
        return ResponseEntity.ok(githubService.getRepoInfo(repoName));
    }

    @PostMapping("/{repoName}/issues")
    public ResponseEntity<String> createIssue(@PathVariable String repoName, @RequestBody IssueRequestDto issueRequestDto) {
        return ResponseEntity.ok(githubService.createIssue(repoName, issueRequestDto));
    }
}