package com.backend.hackaton.util;

import com.backend.hackaton.entity.UserGitlab;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Util {

  public static UserGitlab stringToUserGitlb(String string) {
    string = string.replace("[", "").replace("]", "")
      .replace("{", "").replace("}", "");

    Map<String, String> map = Arrays.stream(string.split(","))
      .map(s -> s.split(":"))
      .collect(Collectors.toMap(s -> s[0].replace("\"", ""), s -> s[1].replace("\"", "")));

    return mapToUserGitLab(map);
  }

  public static UserGitlab mapToUserGitLab(Map<String, String> map) {
    UserGitlab user = new UserGitlab();
    user.setUsername(map.get("username"));
    user.setId(Integer.parseInt(map.get("id")));
    user.setName(map.get("name"));
    user.setState(map.get("state"));
    user.setWeb_url(map.get("web_url"));
    return user;
  }

}
