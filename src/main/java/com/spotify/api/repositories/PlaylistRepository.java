package com.spotify.api.repositories;

import com.spotify.api.entitites.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
