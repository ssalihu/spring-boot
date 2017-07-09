package com.mss.swagger2.dao;

import org.springframework.data.repository.CrudRepository;

import com.mss.swagger2.model.User;
//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete
public interface UserRepository extends CrudRepository<User, Long> {

}
