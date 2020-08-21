package de.itech.kochbuchmanager.service;

import de.itech.kochbuchmanager.model.User;
import de.itech.kochbuchmanager.model.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
