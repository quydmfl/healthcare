package com.quydmfl.healthcare.domain.repository;

import com.quydmfl.healthcare.domain.model.User;

import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findByEmail(String email);
}
