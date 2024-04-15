package com.spotify.api.repositories;

import com.spotify.api.entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByCredentialsUsername(String username);
}
