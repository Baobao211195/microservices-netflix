package com.spring.demo.msuser.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.msuser.entity.User;
import com.spring.demo.msuser.service.UserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @RequestMapping(method = RequestMethod.GET, path = "/member")
    public ResponseEntity<Iterable<User>> getAll() {
        Iterable<User> all = userService.findAll();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/member")
    public ResponseEntity<User> register(@RequestBody User input) {
        User result = userService.registerUser(input);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
