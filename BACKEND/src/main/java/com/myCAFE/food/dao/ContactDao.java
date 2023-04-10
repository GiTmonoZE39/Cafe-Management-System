package com.myCAFE.food.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.myCAFE.food.model.Contact;

public interface ContactDao extends MongoRepository<Contact, Integer> {
}
