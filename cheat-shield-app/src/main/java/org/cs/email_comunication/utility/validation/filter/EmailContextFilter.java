package org.cs.email_comunication.utility.validation.filter;

import org.apache.commons.lang3.StringUtils;
import org.cs.email_comunication.utility.Email;
import org.cs.email_comunication.utility.validation.EmailValidator;

public class EmailContextFilter extends EmailValidator {
    private boolean isContextEmpty(String context){
        return StringUtils.isEmpty(context);
    }

    @Override
    public boolean isValid(Email email) {
        if (isContextEmpty(email.getContext()))
        {
            setValidationIssue("The context is empty!");
            return false;
        }
        return true;
    }
}