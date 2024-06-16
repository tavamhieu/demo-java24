package com.example.movieapp.service;

import com.example.movieapp.entity.User;
import com.example.movieapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.FileStore;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Optional<User> getUserByIdEmailAndAvatar(Integer id, String email, String avatar) {

        return userRepository.findByIdAndEmailAndAvatar(id, email, avatar);
    }
}