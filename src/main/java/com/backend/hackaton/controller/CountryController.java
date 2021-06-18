package com.backend.hackaton.controller;

import com.backend.hackaton.entity.Country;
import com.backend.hackaton.service.impl.CountryServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryController {

  @Autowired
  CountryServiceImpl countryService;

  @GetMapping("/{name}")
  public Country getCountryByName(@PathVariable("name") String name) throws JsonProcessingException {
    return countryService.getCountryByName(name);
  }
}
