package com.veranyagaka.stage_zero.controller;

import com.veranyagaka.stage_zero.model.ProfileResponse;
import com.veranyagaka.stage_zero.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@RestController
@RequestMapping("/me")
@CrossOrigin(origins = "*")
public class ProfileController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping
    public ResponseEntity<?> getProfile() {
        String catFactApi = "https://catfact.ninja/fact";
        String fact = "No cat fact available right now.";

        try {
            Map response = restTemplate.getForObject(catFactApi, Map.class);
            if (response != null && response.containsKey("fact")) {
                fact = response.get("fact").toString();
            }
        } catch (Exception e) {
            System.err.println("Error fetching cat fact: " + e.getMessage());
        }

        User user = new User(
                "nyagakavera@gmail.com",
                "Vera Nyagaka",
                "Java/Spring Boot"
        );

        ProfileResponse profileResponse = new ProfileResponse(
                "success",
                user,
                DateTimeFormatter.ISO_INSTANT.format(Instant.now()),
                fact
        );

        return ResponseEntity.ok(profileResponse);
    }
}
