package com.spotify.api.config;

import com.spotify.api.entitites.Credentials;
import com.spotify.api.entitites.Profile;
import com.spotify.api.entitites.Settings;
import com.spotify.api.entitites.User;
import com.spotify.api.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@RequiredArgsConstructor
//@org.springframework.context.annotation.Profile("local || test")
public class Seeder implements CommandLineRunner {
    private final UserRepository userRepo;


    @Override
    public void run(String... args) throws Exception {
        Credentials creds = new Credentials();
        creds.setUsername("test");
        creds.setPassword("tester");
        Profile profile = new Profile();
        profile.setEmail("testing@gmail.com");
        profile.setFirstName("Test");
        Settings settings = new Settings();
        settings.setDifficulty("Easy");
        settings.setHints(true);
        User user = new User();
        user.setProfile(profile);
        user.setCredentials(creds);
        user.setSettings(settings);
        userRepo.saveAndFlush(user);

    }
}
