package com.example.movieapp.rest;

import com.example.movieapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users/update-profile")
@RequiredArgsConstructor
public class UserApi {
    private UserService userService;
}
