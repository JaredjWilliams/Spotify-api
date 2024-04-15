package com.spotify.api.services.impl;

import com.spotify.api.dtos.UserRequestDto;
import com.spotify.api.dtos.UserResponseDto;
import com.spotify.api.mappers.UserMapper;
import com.spotify.api.repositories.UserRepository;
import com.spotify.api.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        return userMapper.entityToResponseDto(userRepository.saveAndFlush(userMapper.requestDtoToEntity(userRequestDto)));
    }
}
