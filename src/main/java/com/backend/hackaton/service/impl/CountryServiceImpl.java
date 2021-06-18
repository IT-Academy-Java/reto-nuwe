package com.backend.hackaton.service.impl;

import com.backend.hackaton.entity.Country;
import com.backend.hackaton.service.ICountryService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CountryServiceImpl implements ICountryService {

  @Autowired
  RestTemplate restTemplate;

  @Override
  public Country getCountryByName(String name) throws JsonProcessingException {

   String restCountriesUrl = "https://restcountries.eu/rest/v2/name/" + name;
   Country[] country = restTemplate
      .getForObject(restCountriesUrl, Country[].class);

    return country[0];
  }

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

}
