package com.quydmfl.healthcare.application.usercase;

import com.quydmfl.healthcare.domain.model.User;
import com.quydmfl.healthcare.domain.repository.UserRepository;
import com.quydmfl.healthcare.interfaces.dto.AuthResponse;
import com.quydmfl.healthcare.interfaces.dto.RegisterRequest;
import org.springframework.stereotype.Service;

@Service
public class AuthUseCase {
    private final UserRepository userRepository;

    public AuthUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public AuthResponse register(RegisterRequest request) {
        var user = User.builder().
                email(request.getEmail()).
                password(request.getPassword()).
                build();

        userRepository.save(user);

        return new AuthResponse("");
    }
}
