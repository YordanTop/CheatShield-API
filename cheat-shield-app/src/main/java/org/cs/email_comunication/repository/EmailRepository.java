package org.cs.email_comunication.repository;

import org.cs.email_comunication.repository.abstraction.IEmailRepository;
import org.springframework.stereotype.Repository;


@Repository
public class EmailRepository implements IEmailRepository {

    @Override
    public void sendEmail(String emailAddress) {

    }
}
