package br.com.iafesou.springsecurityjwt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("private")
public class PrivateController {

    @GetMapping
    public String getMessage() {
        return "Private API Controller";
    }
}