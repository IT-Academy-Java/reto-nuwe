package com.backend.hackaton.service.impl;

import com.backend.hackaton.entity.GithubUser;
import com.backend.hackaton.repository.IGithubUserRepository;
import com.backend.hackaton.service.IGithubUserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class GithubServiceImpl implements IGithubUserService {

  @Autowired
  private IGithubUserRepository githubUserRepository;

  @Autowired
  RestTemplate restTemplate;


  @Override
  public GithubUser getGithubUser(String username) throws JsonProcessingException {
    GithubUser user = new GithubUser();
    //String githubApiUrl = "https://api.github.com/users/" + username;
    String githubApiUrl = "https://gitlab.com/api/v4/users?username=elenapiaggio";

    ResponseEntity<String> response = restTemplate.getForEntity(githubApiUrl, String.class);

    String repo = response.getBody();
    repo = repo.replace("{", "");
    repo = repo.replace("}", "");

    System.out.println("actual repo:\n" + repo);
    Map<String, String> map = Arrays.stream(repo.split(","))
      .map(s -> s.split(":"))
      .collect(Collectors.toMap(s -> s[0].replace("\"", ""), s -> s[1].replace("\"", "")));

    System.out.println(Collections.singletonList(map.get("name")));
    System.out.println(Collections.singletonList(map));

    if (response.getStatusCode() == HttpStatus.OK) {
      user.setId(map.get("id"));
      user.setUsername(map.get("login"));
      user.setUrl(map.get("url"));
      user.setRepositories(map.get("repos_url"));
    }
    return user;
  }

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
}
