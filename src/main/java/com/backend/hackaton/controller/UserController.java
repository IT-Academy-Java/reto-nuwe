package com.backend.hackaton.controller;

import com.backend.hackaton.entity.User;
import com.backend.hackaton.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserServiceImpl userService;

  @GetMapping("/{id}")
  @ResponseBody
  public ResponseEntity<User> getUserById(@PathVariable("id") String userId){
    return userService.getUserById(userId)
      .map(user -> new ResponseEntity<>(user, HttpStatus.OK))
      .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PostMapping
  public ResponseEntity<User> save(@RequestBody User user){
    return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
  }

}
