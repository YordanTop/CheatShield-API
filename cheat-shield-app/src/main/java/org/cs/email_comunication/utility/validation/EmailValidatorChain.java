package org.cs.email_comunication.utility.validation;

import org.cs.email_comunication.utility.Email;

public class EmailValidatorChain {

    private EmailValidator emailValidator;

    public void linkValidators(EmailValidator firstValidator, EmailValidator... chain){
        EmailValidator head = firstValidator;

        for(EmailValidator nextValidator : chain){
            head.nextValidator = nextValidator;
            head = nextValidator;
        }
        emailValidator = firstValidator;
    }

    public boolean isEmailValid(Email email){

        while(emailValidator != null){

            if(!emailValidator.isValid(email)){
                return false;
            }
            emailValidator = emailValidator.nextValidator;
        }
        return true;
    }

    public String validationIssue(){
        return emailValidator.getValidationIssue();
    }



}
