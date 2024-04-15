package com.spotify.api.services.impl;

import com.spotify.api.dtos.UserRequestDto;
import com.spotify.api.dtos.UserResponseDto;
import com.spotify.api.entitites.User;
import com.spotify.api.mappers.UserMapper;
import com.spotify.api.repositories.UserRepository;
import com.spotify.api.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final ValidationServiceImpl validationService;
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        User user = getUser(userRequestDto);
        validationService.validateUser(user);
        return userMapper.entityToResponseDto(userRepository.saveAndFlush(userMapper.requestDtoToEntity(userRequestDto)));
    }

    @Override
    public UserResponseDto getUser(String username) {
        return userMapper.entityToResponseDto(userRepository.findByCredentialsUsername(username));
    }

    public User getUser(UserRequestDto userRequestDto) {
        return userRepository.findByCredentialsUsername(userRequestDto.getCredentials().getUsername());
    }
}
