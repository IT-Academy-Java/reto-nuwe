package com.backend.hackaton.controller;

import com.backend.hackaton.entity.User;
import com.backend.hackaton.entity.UserGithub;
import com.backend.hackaton.service.impl.UserGithubServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping()
public class UserGithubController{

  @Autowired
  UserGithubServiceImpl userGithubService;

  @GetMapping(("/user/{username}/github"))
  public UserGithub getGithubUserByUsername(@PathVariable("username") String username) throws JsonProcessingException {
    return userGithubService.getUserGithub(username);
  }

  @PostMapping("/github/{username}")
  public ResponseEntity<UserGithub> save(@PathVariable("username") String username) throws JsonProcessingException {
    UserGithub userGithub = getGithubUserByUsername(username);
    return new ResponseEntity<>(userGithubService.save(userGithub), HttpStatus.CREATED);
  }

}
