package com.backend.hackaton.service;

import com.backend.hackaton.entity.GithubUser;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface IGithubUserService {

  GithubUser getGithubUser(String id) throws JsonProcessingException;
}
