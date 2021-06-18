package com.backend.hackaton.service;

import com.backend.hackaton.entity.UserGithub;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface IUserGithubService {

  UserGithub getUserGithub(String username) throws JsonProcessingException;
  UserGithub save(UserGithub userGithub);

}
