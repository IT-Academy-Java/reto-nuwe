package com.backend.hackaton.repository;

import com.backend.hackaton.entity.UserGitlab;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IUserGitlabRepository extends MongoRepository<UserGitlab, String> {

}
