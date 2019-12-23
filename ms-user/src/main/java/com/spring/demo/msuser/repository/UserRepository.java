package com.spring.demo.msuser.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.msuser.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
