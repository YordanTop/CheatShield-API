package org.cs.email_comunication.configuration;

import jakarta.mail.MessagingException;
import org.cs.email_comunication.dto.request.RequestEmailBodyDTO;
import org.cs.email_comunication.utility.Email;
import org.cs.email_comunication.utility.EmailContentStrategy;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailTypeConfig {

    public static EmailContentStrategy SimpleEmailBody(String title, String context){
        return new EmailContentStrategy() {
            @Override
            public void MimeMessageConfiguration(MimeMessageHelper helper) throws MessagingException {
                helper.setSubject(title);
                helper.setText(context);
            }
        };
    }

}
