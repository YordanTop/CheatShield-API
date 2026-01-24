package org.cs.email_comunication.service.abstraction;

import jakarta.mail.MessagingException;
import org.cs.email_comunication.dto.response.TrackEmailDTO;
import org.cs.email_comunication.utility.Email;
import org.cs.email_comunication.utility.EmailContentStrategy;

public interface IEmailService {

    public TrackEmailDTO sendMessage(Email email,  EmailContentStrategy emailContent) throws MessagingException;

}
