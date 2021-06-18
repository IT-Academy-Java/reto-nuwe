package com.backend.hackaton.entity;

import org.springframework.data.annotation.Id;

public class UserGitlab {

  @Id
  private int id;
  private String name;
  private String username;
  private String state;
  private String web_url;

  public UserGitlab() {
  }

  public UserGitlab(int id, String name, String username, String state, String web_url) {
    this.id = id;
    this.name = name;
    this.username = username;
    this.state = state;
    this.web_url = web_url;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getWeb_url() {
    return web_url;
  }

  public void setWeb_url(String web_url) {
    this.web_url = web_url;
  }
}
