package Jar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public String testApi() {
        return "Hello Harshika! Back2U Backend එක නියමෙට වැඩ කරනවා! 🚀";
    }
}