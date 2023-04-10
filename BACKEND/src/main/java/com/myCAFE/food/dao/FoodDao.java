package com.myCAFE.food.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.myCAFE.food.model.Food;

public interface FoodDao extends MongoRepository<Food, String> {
}
