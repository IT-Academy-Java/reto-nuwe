package com.backend.hackaton.controller;

import com.backend.hackaton.entity.User;
import com.backend.hackaton.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserServiceImpl userService;

  @PostMapping
  public ResponseEntity<User> save(@RequestBody User user){
    return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
  }

}
