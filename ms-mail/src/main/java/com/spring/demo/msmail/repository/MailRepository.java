package com.spring.demo.msmail.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.msmail.entity.Mail;

@Repository
public interface MailRepository extends CrudRepository<Mail, Integer> { }
