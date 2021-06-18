package com.backend.hackaton.repository;

import com.backend.hackaton.entity.Country;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepository extends MongoRepository<Country, String> {

}
