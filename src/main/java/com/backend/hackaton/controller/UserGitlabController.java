package com.backend.hackaton.controller;

import com.backend.hackaton.entity.UserGitlab;
import com.backend.hackaton.service.impl.UserGitlabServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserGitlabController {

  @Autowired
  UserGitlabServiceImpl userGitlabService;

  @GetMapping(("/{username}/gitlab"))
  public UserGitlab getGitlabUserByUsername(@PathVariable("username") String username) throws JsonProcessingException {
    return userGitlabService.getUserGitlab(username);
  }

}
