package com.backend.hackaton.entity;

import org.springframework.data.annotation.Id;

public class UserGithub {

  @Id
  private int id;
  private String login;
  private String html_url;
  private String repos_url;
  private String url;

  public UserGithub() {
  }

  public UserGithub(int id, String login, String html_url, String repos_url, String url) {
    this.id = id;
    this.login = login;
    this.html_url = html_url;
    this.repos_url = repos_url;
    this.url = url;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getHtml_url() {
    return html_url;
  }

  public void setHtml_url(String html_url) {
    this.html_url = html_url;
  }

  public String getRepos_url() {
    return repos_url;
  }

  public void setRepos_url(String repos_url) {
    this.repos_url = repos_url;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
