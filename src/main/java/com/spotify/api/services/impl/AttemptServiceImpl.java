package com.spotify.api.services.impl;

import com.spotify.api.dtos.AttemptRequestDto;
import com.spotify.api.dtos.AttemptResponseDto;
import com.spotify.api.entitites.Attempt;
import com.spotify.api.entitites.User;
import com.spotify.api.exceptions.NotFoundException;
import com.spotify.api.mappers.AttemptMapper;
import com.spotify.api.repositories.AttemptRepository;
import com.spotify.api.repositories.UserRepository;
import com.spotify.api.services.AttemptService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttemptServiceImpl implements AttemptService {

    private final AttemptMapper attemptMapper;
    private final AttemptRepository attemptRepository;
    private final UserServiceImpl userService;
    private final UserRepository userRepository;
    @Override
    public AttemptResponseDto createAttempt(AttemptRequestDto attemptRequestDto) {
        final String username = attemptRequestDto.getCredentials().getUsername();
        User user = userRepository.findByCredentialsUsernameIgnoreCase(username).orElseThrow(() -> new
                NotFoundException("User with username '" + username + "' not found."));
        Attempt attempt = attemptMapper.requestDtoToEntity(attemptRequestDto);
        attempt.setUser(user);

        return attemptMapper.entityToResponseDto(attemptRepository.saveAndFlush(attempt));
    }
}
