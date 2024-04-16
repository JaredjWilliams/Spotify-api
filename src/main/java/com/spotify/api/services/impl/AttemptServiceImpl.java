package com.spotify.api.services.impl;

import com.spotify.api.dtos.AttemptRequestDto;
import com.spotify.api.dtos.AttemptResponseDto;
import com.spotify.api.entitites.Attempt;
import com.spotify.api.entitites.User;
import com.spotify.api.mappers.AttemptMapper;
import com.spotify.api.repositories.AttemptRepository;
import com.spotify.api.services.AttemptService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttemptServiceImpl implements AttemptService {

    private final AttemptMapper attemptMapper;
    private final AttemptRepository attemptRepository;
    private final UserServiceImpl userService;
    @Override
    public AttemptResponseDto createAttempt(AttemptRequestDto attemptRequestDto) {
        User user = userService.getUserByUsername(attemptRequestDto.getCredentials().getUsername());
        Attempt attempt = attemptMapper.requestDtoToEntity(attemptRequestDto);
        attempt.setUser(user);

        return attemptMapper.entityToResponseDto(attemptRepository.saveAndFlush(attemptMapper.requestDtoToEntity(attemptRequestDto)));
    }
}
