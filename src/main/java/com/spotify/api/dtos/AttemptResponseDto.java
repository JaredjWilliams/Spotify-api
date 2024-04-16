package com.spotify.api.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@Data
public class AttemptResponseDto {
    @NonNull
    private Integer score;
}
