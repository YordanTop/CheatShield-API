package org.cs.email_comunication.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.cs.email_comunication.configuration.EmailValidationConfig;
import org.cs.email_comunication.dto.response.TrackEmailDTO;
import org.cs.email_comunication.service.abstraction.IEmailService;
import org.cs.email_comunication.utility.Email;
import org.cs.email_comunication.utility.EmailContentStrategy;
import org.cs.email_comunication.utility.validation.EmailValidatorChain;
import org.cs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

@Service
public class EmailService implements IEmailService {

    private JavaMailSender mailSender;
    private EmailValidationConfig emailValidationConfig;


    public EmailService(JavaMailSender mailSender, EmailValidationConfig emailValidationConfig) {
        this.mailSender = mailSender;
        this.emailValidationConfig = emailValidationConfig;
    }


    @Override
    public TrackEmailDTO sendMessage(Email emailBody, EmailContentStrategy emailContent) throws MessagingException {

        EmailValidatorChain emailFilter = emailValidationConfig.DefaultValidator();


        if(!emailFilter.isEmailValid(emailBody)){
            return createTrackingResponse(emailBody, emailFilter.validationIssue(), false);
        }

        mailSender.send(createMimeMessage(emailBody,emailContent));


        return createTrackingResponse(emailBody, true);
    }

    private MimeMessage createMimeMessage(Email emailBody, EmailContentStrategy emailContent) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();

        MimeMessageHelper messageHelper = new MimeMessageHelper(message,true);

        messageHelper.setTo(emailBody.getReceiverAddress());

        emailContent.MimeMessageConfiguration(messageHelper);

        return message;
    }

    private TrackEmailDTO createTrackingResponse(Email email, String issue, boolean isSent){
        return new TrackEmailDTO(email.getTitle(),
                email.getReceiverAddress(),
                LocalDate.now(),
                issue,
                isSent
        );
    }

    private TrackEmailDTO createTrackingResponse(Email email, boolean isSent){
        String noIssue = "";

        return new TrackEmailDTO(email.getTitle(),
                email.getReceiverAddress(),
                LocalDate.now(),
                noIssue,
                isSent
        );
    }


}
