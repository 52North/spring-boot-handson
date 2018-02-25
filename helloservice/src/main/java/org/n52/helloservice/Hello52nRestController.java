package org.n52.helloservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello52nRestController {

    @Value("${message}")
    private String message;

    @RequestMapping("hello")
    public ResponseEntity getGreetings() {
        return ResponseEntity.ok(message);
    }
}
