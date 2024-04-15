package com.spotify.api.controllers;

import com.spotify.api.dtos.UserRequestDto;
import com.spotify.api.dtos.UserResponseDto;
import com.spotify.api.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public UserResponseDto getUser() {
//        return userService.getA;
//    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDto createUser(@RequestBody UserRequestDto userRequestDto) {
        return userService.createUser(userRequestDto);
    }

    


}
