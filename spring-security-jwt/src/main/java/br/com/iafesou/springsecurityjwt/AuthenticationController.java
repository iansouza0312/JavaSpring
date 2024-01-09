package br.com.iafesou.springsecurityjwt;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }
    private final AuthenticationService authenticationService;

    @PostMapping("/authenticate")
    public String authenticate() {
        return authenticationService.authenticate();
    }
}
