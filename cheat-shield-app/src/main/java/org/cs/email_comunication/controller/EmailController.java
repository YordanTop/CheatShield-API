package org.cs.email_comunication.controller;


import org.cs.email_comunication.dto.response.SendEmailDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    @PostMapping("/monitoring-code")
    public ResponseEntity<SendEmailDTO> sendMonitoringCode(@RequestBody String emailAddress){
        return null;
    }

    @PostMapping("/auth-code")
    public ResponseEntity<SendEmailDTO> sendAuthenticationCode(@RequestBody String emailAddress){
        return null;
    }
}
