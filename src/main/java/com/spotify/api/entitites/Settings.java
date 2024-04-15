package com.spotify.api.entitites;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Settings {
    private String difficulty = "Easy";
    private Boolean hints = false;
}
