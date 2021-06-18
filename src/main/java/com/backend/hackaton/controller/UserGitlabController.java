package com.backend.hackaton.controller;

import com.backend.hackaton.entity.UserGitlab;
import com.backend.hackaton.service.impl.UserGitlabServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class UserGitlabController {

  @Autowired
  UserGitlabServiceImpl userGitlabService;

  @GetMapping(("user/{username}/gitlab"))
  public UserGitlab getGitlabUserByUsername(@PathVariable("username") String username) throws JsonProcessingException {
    return userGitlabService.getUserGitlab(username);
  }

  @PostMapping("/gitlab/{username}")
  public ResponseEntity<UserGitlab> save(@PathVariable("username") String username) throws JsonProcessingException {
    UserGitlab userGitlab = getGitlabUserByUsername(username);
    return new ResponseEntity<>(userGitlabService.save(userGitlab), HttpStatus.CREATED);
  }

}
