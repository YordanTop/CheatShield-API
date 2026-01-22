package org.cs.email_comunication.service;

import org.cs.email_comunication.repository.abstraction.IEmailRepository;
import org.cs.email_comunication.service.abstraction.IEmailService;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements IEmailService {



    public EmailService(IEmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }





}
