package org.cs.email_comunication.utility.validation.filter;

import org.apache.commons.lang3.StringUtils;
import org.cs.email_comunication.utility.Email;
import org.cs.email_comunication.utility.validation.EmailValidator;

public class EmailTitleFilter extends EmailValidator {


    private boolean isTitleEmpty(String title){
        return StringUtils.isEmpty(title);
    }

    @Override
    public boolean isValid(Email email) {
        if (isTitleEmpty(email.getTitle()))
        {
            setValidationIssue("The title is empty!");
            return false;
        }
        return true;
    }

}
