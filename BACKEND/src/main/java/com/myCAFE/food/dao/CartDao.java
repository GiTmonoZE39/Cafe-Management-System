package com.myCAFE.food.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.myCAFE.food.model.Cart;

public interface CartDao extends MongoRepository<Cart, Integer> {

}
