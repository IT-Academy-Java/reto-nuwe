package com.backend.hackaton.repository;

import com.backend.hackaton.entity.GithubUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IGithubUserRepository extends MongoRepository<GithubUser, String> {

}
