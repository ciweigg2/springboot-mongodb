package com.ciwei.mongo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ciwei.mongo.model.User;

public interface UserRepository extends MongoRepository<User, String>{

   Page<User> findByUserNameLike(String userName, Pageable pageable);

}
