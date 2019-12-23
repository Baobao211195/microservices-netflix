package com.spring.demo.msuser.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.spring.demo.msuser.entity.User;
import com.spring.demo.msuser.repository.UserRepository;
import com.spring.demo.msuser.sender.Sender;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Value("${spring.kafka.topic.user-created}")
    private static String USER_CREATED_TOPIC;

    private final UserRepository userRepository;
    private final Sender sender;

    @Override
    public User registerUser(User input) {
        User createdUser = userRepository.save(input);
        sender.send(USER_CREATED_TOPIC, createdUser);
        return createdUser;
    }

    @Override
    public Iterable<User> findAll() {
        return null;
    }
}
