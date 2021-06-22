package com.example.auth.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.auth.model.User;

@Repository

public interface UserRepository extends MongoRepository <User,Long> {

}
