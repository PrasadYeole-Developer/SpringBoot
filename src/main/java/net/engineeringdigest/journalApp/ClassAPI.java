package net.engineeringdigest.journalApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassAPI {
    @GetMapping("/")
    public String slash(){
        return "Default Route.";
    }
    @GetMapping("/home")
    public String home(){
        return "Home Arrived!";
    }
}
