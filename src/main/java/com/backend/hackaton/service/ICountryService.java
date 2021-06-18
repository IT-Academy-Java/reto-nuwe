package com.backend.hackaton.service;

import com.backend.hackaton.entity.Country;
import com.fasterxml.jackson.core.JsonProcessingException;


public interface ICountryService {
  Country getCountryByName(String name) throws JsonProcessingException;
}
