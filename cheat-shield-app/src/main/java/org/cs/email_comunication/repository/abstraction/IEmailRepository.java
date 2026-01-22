package org.cs.email_comunication.repository.abstraction;

import org.cs.email_comunication.dto.response.SendEmailDTO;

public interface IEmailRepository {

    public void sendEmail(String emailAddress);

}
