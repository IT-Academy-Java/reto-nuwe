package com.backend.hackaton.service.impl;

import com.backend.hackaton.entity.User;
import com.backend.hackaton.repository.IUserRepository;
import com.backend.hackaton.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

  @Autowired
  private IUserRepository userRepository;

  @Override
  public User save(User user) {
    return userRepository.save(user);
  }
}
