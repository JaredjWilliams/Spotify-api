package com.spotify.api.controllers;

import com.spotify.api.dtos.SettingsDto;
import com.spotify.api.dtos.UserResponseDto;
import com.spotify.api.services.SettingsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/settings")
public class SettingsController {

    private final SettingsService settingsService;

    @PatchMapping("/{username}")
    @ResponseStatus(HttpStatus.OK)
    public UserResponseDto updateSettings(@PathVariable("username") String username, @RequestBody SettingsDto settingsDto) {
        return settingsService.updateSettings(username, settingsDto);
    }
}
