package com.backend.hackaton.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "githubUser")
public class GithubUser {

  @Id
  private String id;
  private String username;
  private String url;
  private String repositories;
  private String repositoriesURL;

  public GithubUser() {
  }

  public GithubUser(String id, String username, String url, String repositories, String repositoriesURL) {
    this.id = id;
    this.username = username;
    this.url = url;
    this.repositories = repositories;
    this.repositoriesURL = repositoriesURL;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getRepositories() {
    return repositories;
  }

  public void setRepositories(String repositories) {
    this.repositories = repositories;
  }

  public String getRepositoriesURL() {
    return repositoriesURL;
  }

  public void setRepositoriesURL(String repositoriesURL) {
    this.repositoriesURL = repositoriesURL;
  }
}
