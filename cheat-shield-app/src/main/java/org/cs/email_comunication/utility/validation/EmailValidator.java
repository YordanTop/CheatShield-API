package org.cs.email_comunication.utility.validation;

import lombok.Getter;
import lombok.Setter;
import org.cs.email_comunication.utility.Email;

public abstract class EmailValidator {

    protected EmailValidator nextValidator;

    @Getter
    @Setter
    private String validationIssue;


    public abstract boolean isValid(Email email);

}
