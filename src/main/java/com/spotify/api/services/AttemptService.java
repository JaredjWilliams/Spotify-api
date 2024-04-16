package com.spotify.api.services;

import com.spotify.api.dtos.AttemptRequestDto;
import com.spotify.api.dtos.AttemptResponseDto;

public interface AttemptService {
    AttemptResponseDto createAttempt(AttemptRequestDto attemptRequestDto);
}
