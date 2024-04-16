package com.spotify.api.repositories;

import com.spotify.api.entitites.Attempt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttemptRepository extends JpaRepository<Attempt, Long> {

}
