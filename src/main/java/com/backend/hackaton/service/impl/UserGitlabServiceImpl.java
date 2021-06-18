package com.backend.hackaton.service.impl;

import com.backend.hackaton.entity.UserGitlab;
import com.backend.hackaton.repository.IUserGitlabRepository;
import com.backend.hackaton.service.IUserGitlabService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.backend.hackaton.util.Util.stringToUserGitlb;

@Service
public class UserGitlabServiceImpl implements IUserGitlabService {

  @Autowired
  RestTemplate restTemplate;

  @Autowired
  private IUserGitlabRepository userGitlabRepository;

  @Override
  public UserGitlab getUserGitlab(String username) throws JsonProcessingException {
    String url = "https://gitlab.com/api/v4/users?username=" + username;
    String result = restTemplate.getForObject(url, String.class);

    return stringToUserGitlb(result);
  }

  @Override
  public UserGitlab save(UserGitlab userGitlab) {
    return userGitlabRepository.save(userGitlab);
  }

}
