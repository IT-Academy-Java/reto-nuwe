package com.backend.hackaton.controller;

import com.backend.hackaton.entity.GithubUser;
import com.backend.hackaton.service.impl.GithubServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class GithubUserController {

  @Autowired
  GithubServiceImpl githubService;

  @GetMapping(("/{username}/githubss"))
  public GithubUser getGithubUserByUsername(@PathVariable("username") String username) throws JsonProcessingException {
    return githubService.getGithubUser(username);
  }
}
