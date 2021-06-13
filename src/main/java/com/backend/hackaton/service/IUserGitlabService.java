package com.backend.hackaton.service;

import com.backend.hackaton.entity.UserGitlab;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface IUserGitlabService {

  UserGitlab getUserGitlab(String id) throws JsonProcessingException;

}
