package com.backend.hackaton.service;

import com.backend.hackaton.entity.User;

import java.util.Optional;

public interface IUserService {

  public User save(User user);
  public Optional<User> getUserById(String userId);
  public Boolean deleteUserById(String userId);
  public Boolean update(User user,String userId);

}
