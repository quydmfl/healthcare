package com.quydmfl.healthcare.infrastructure.repository;

import com.quydmfl.healthcare.domain.model.User;
import com.quydmfl.healthcare.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserJpaRepository implements UserRepository {

    @Autowired
    private SpringDataUserRepository jpa;

    @Override
    public User save(User user) {
        return jpa.save(user);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return jpa.findByEmail(email);
    }

    // Interface extend from JpaRepository<User, Long>
    interface SpringDataUserRepository extends JpaRepository<User, Long> {
        Optional<User> findByEmail(String email);
    }
}
