package com.spotify.api.services;

import com.spotify.api.dtos.AttemptRequestDto;
import com.spotify.api.dtos.AttemptResponseDto;
import com.spotify.api.dtos.CredentialsDto;

import java.util.List;

public interface AttemptService {
    AttemptResponseDto createAttempt(AttemptRequestDto attemptRequestDto);

    List<AttemptResponseDto> getAttemptsForUsername(CredentialsDto credentialsDto);
}
