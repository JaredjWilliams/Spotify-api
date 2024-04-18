package com.spotify.api.controllers;

import com.spotify.api.dtos.AttemptRequestDto;
import com.spotify.api.dtos.AttemptResponseDto;
import com.spotify.api.dtos.CredentialsDto;
import com.spotify.api.services.AttemptService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/attempts")
public class AttemptController {

    private final AttemptService attemptService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public AttemptResponseDto postAttempt(@RequestBody AttemptRequestDto attemptRequestDto) {
        return attemptService.createAttempt(attemptRequestDto);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AttemptResponseDto> getAttemptsForUsername(@RequestBody CredentialsDto credentialsDto) {
        return attemptService.getAttemptsForUsername(credentialsDto);
    }
}
