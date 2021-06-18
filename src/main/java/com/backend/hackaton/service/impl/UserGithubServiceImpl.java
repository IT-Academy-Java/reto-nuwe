package com.backend.hackaton.service.impl;

import com.backend.hackaton.entity.UserGithub;
import com.backend.hackaton.repository.IUserGithubRepository;
import com.backend.hackaton.service.IUserGithubService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserGithubServiceImpl implements IUserGithubService {

  @Autowired
  RestTemplate restTemplate;

  @Autowired
  private IUserGithubRepository userGithubRepository;

  @Override
  public UserGithub getUserGithub(String username) throws JsonProcessingException {

    String githubApiUrl = "https://api.github.com/users/" + username;
    UserGithub user = restTemplate
      .getForObject(githubApiUrl,  UserGithub.class);
    return user;
  }

  @Override
  public UserGithub save(UserGithub userGithub) {
    return userGithubRepository.save(userGithub);
  }


}
