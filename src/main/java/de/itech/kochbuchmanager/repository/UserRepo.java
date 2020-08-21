package de.itech.kochbuchmanager.repository;

import de.itech.kochbuchmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
}