package com.backend.hackaton.controller;

import com.backend.hackaton.entity.UserGithub;
import com.backend.hackaton.service.impl.UserGithubServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserGithubController{

  @Autowired
  UserGithubServiceImpl userGithubService;

  @GetMapping(("/{username}/github"))
  public UserGithub getGithubUserByUsername(@PathVariable("username") String username) throws JsonProcessingException {
    return userGithubService.getUserGithub(username);
  }

}
