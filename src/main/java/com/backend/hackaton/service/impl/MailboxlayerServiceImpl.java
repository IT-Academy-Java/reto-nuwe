package com.backend.hackaton.service.impl;

import com.backend.hackaton.entity.MailboxLayer;
import com.backend.hackaton.service.IMailboxlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class MailboxlayerServiceImpl implements IMailboxlayerService {

  @Value("${api.key}")
  String apiKey;

  @Autowired
  RestTemplate restTemplate;

  @Override
  public Boolean mailIsValid(String mail) {
    String url = "http://apilayer.net/api/check?access_key=" + apiKey + "&email=" + mail;
    Boolean isValid = restTemplate.getForObject(url, MailboxLayer.class).getFormat_valid();
    return isValid;
  }
}
