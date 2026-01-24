package org.cs.email_comunication.utility.validation.filter;

import org.cs.email_comunication.utility.Email;
import org.cs.email_comunication.utility.validation.EmailValidator;

import java.util.regex.Pattern;

public class EmailAddressFilter extends EmailValidator {

    private boolean isEmailAddressNotCorrect(String emailAddress){
        String emailRegexPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

        return !Pattern.matches(emailRegexPattern, emailAddress);
    }

    @Override
    public boolean isValid(Email email) {

        if (isEmailAddressNotCorrect(email.getReceiverAddress()))
        {
            setValidationIssue("The email '" +email.getReceiverAddress()+ "' is not correct!");
            return false;
        }

    return true;
    }
}
