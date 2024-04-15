package com.spotify.api.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SettingsDto {
    private String difficulty;
    private Boolean hints;
}
