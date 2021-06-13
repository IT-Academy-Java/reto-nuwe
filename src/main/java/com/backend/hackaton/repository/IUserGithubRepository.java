package com.backend.hackaton.repository;

import com.backend.hackaton.entity.UserGithub;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IUserGithubRepository extends MongoRepository<UserGithub, String> {

}
