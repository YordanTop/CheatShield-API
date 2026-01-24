package org.cs.email_comunication.configuration;

import org.cs.email_comunication.utility.validation.EmailValidatorChain;
import org.cs.email_comunication.utility.validation.filter.EmailAddressFilter;
import org.cs.email_comunication.utility.validation.filter.EmailContextFilter;
import org.cs.email_comunication.utility.validation.filter.EmailTitleFilter;
import org.springframework.stereotype.Component;

@Component
public class EmailValidationConfig {


    public EmailValidatorChain DefaultValidator(){

        EmailValidatorChain emailValidatorChain = new EmailValidatorChain();

        emailValidatorChain.linkValidators(new EmailAddressFilter(),
                new EmailTitleFilter(),
                new EmailContextFilter());

        return emailValidatorChain;
    }

}
