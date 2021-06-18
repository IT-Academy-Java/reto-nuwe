package com.backend.hackaton.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "country")
public class Country {

  @Id
  private String id;

  private String name;
  private String alpha2Code;
  private String alpha3Code;
  private String[] callingCodes;

  public Country() {
  }

  public Country(String id, String name, String alpha2Code, String alpha3Code, String[] callingCodes) {
    this.id = id;
    this.name = name;
    this.alpha2Code = alpha2Code;
    this.alpha3Code = alpha3Code;
    this.callingCodes = callingCodes;
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

  public String getAlpha2Code() {
    return alpha2Code;
  }

  public void setAlpha2Code(String alpha2Code) {
    this.alpha2Code = alpha2Code;
  }

  public String getAlpha3Code() {
    return alpha3Code;
  }

  public void setAlpha3Code(String alpha3Code) {
    this.alpha3Code = alpha3Code;
  }

  public String[] getCallingCodes() {
    return callingCodes;
  }

  public void setCallingCodes(String[] callingCodes) {
    this.callingCodes = callingCodes;
  }
}
