package com.kwaku.restful.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @GetMapping("/config")
    public Map<String, String> getConfig() {
        // Function to return environment variables
        Map<String, String> config = new HashMap<>();
        System.getenv().forEach((key, value) -> {
            // Exclude sensitive variables or system variables if needed
            if (!key.startsWith("_") && !key.equals("PWD")) {
                config.put(key, value);
            }
        });
        return config;
    }
}
