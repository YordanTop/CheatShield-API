package org.cs.email_comunication.controller;


import lombok.SneakyThrows;
import org.cs.email_comunication.configuration.EmailTypeConfig;
import org.cs.email_comunication.configuration.EmailValidationConfig;
import org.cs.email_comunication.dto.request.RequestEmailBodyDTO;
import org.cs.email_comunication.dto.response.TrackEmailDTO;
import org.cs.email_comunication.service.abstraction.IEmailService;
import org.cs.email_comunication.utility.Email;
import org.cs.email_comunication.utility.validation.EmailValidatorChain;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/email")
public class EmailController {

    private IEmailService emailService;

    public EmailController(IEmailService emailService){
        this.emailService = emailService;
    }


    @SneakyThrows
    @PostMapping("/send")
    public ResponseEntity<TrackEmailDTO> sendEmail(@RequestBody RequestEmailBodyDTO requestEmailBody){

        Email emailBody = new Email.EmailBuilder(requestEmailBody.receiverAddress())
                                                 .setTitle(requestEmailBody.title())
                                                 .setContext(requestEmailBody.context())
                                                 .buildEmailBody();

        TrackEmailDTO result = emailService.sendMessage(emailBody,
                EmailTypeConfig.SimpleEmailBody(emailBody.getTitle(),emailBody.getContext()));

        if(!result.isEmailReceived()){
            return ResponseEntity.badRequest().body(result);
        }

        return ResponseEntity.ok(result);
    }

}
