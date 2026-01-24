package org.cs.email_comunication.utility;

import jakarta.mail.MessagingException;
import org.springframework.mail.javamail.MimeMessageHelper;

public interface EmailContentStrategy {

    void MimeMessageConfiguration(MimeMessageHelper helper) throws MessagingException;

}
