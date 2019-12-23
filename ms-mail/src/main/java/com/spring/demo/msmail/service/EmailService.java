package com.spring.demo.msmail.service;

import com.spring.demo.msmail.dto.UserDto;

public interface EmailService {
    void sendSimpleMessage(UserDto userDto);
}
