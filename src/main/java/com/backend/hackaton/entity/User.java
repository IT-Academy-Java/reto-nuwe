package com.backend.hackaton.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

  @Id
  private String id;
  private String name;
  private String username;
  private String email;
  private Boolean emailVerified;
  private String password;
  private String gitlabUserId;
  private String countryId;

  public User() {
  }

  public User(String id, String name, String username, String email, String password, String gitlabUserId, String countryId) {
    this.id = id;
    this.name = name;
    this.username = username;
    this.password = password;
    this.gitlabUserId = gitlabUserId;
    this.countryId = countryId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Boolean getEmailVerified() {
    return emailVerified;
  }

  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getGitlabUserId() {
    return gitlabUserId;
  }

  public void setGitlabUserId(String gitlabUserId) {
    this.gitlabUserId = gitlabUserId;
  }

  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }

  @Override
  public String toString() {
    return "User{" +
      "id='" + id + '\'' +
      ", name='" + name + '\'' +
      ", username='" + username + '\'' +
      ", email='" + email + '\'' +
      ", emailVerified=" + emailVerified +
      ", password='" + password + '\'' +
      ", gitlabUserId='" + gitlabUserId + '\'' +
      ", countryId='" + countryId + '\'' +
      '}';
  }

}
