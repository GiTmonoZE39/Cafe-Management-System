package com.myCAFE.food.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.myCAFE.food.model.User;

public interface UserDao extends MongoRepository<User, String> {
}
