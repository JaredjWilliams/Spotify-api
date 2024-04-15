package com.spotify.api.services;

import com.spotify.api.dtos.UserRequestDto;
import com.spotify.api.dtos.UserResponseDto;

public interface UserService {
    UserResponseDto createUser(UserRequestDto userRequestDto);

    UserResponseDto getUser(String username);
}
