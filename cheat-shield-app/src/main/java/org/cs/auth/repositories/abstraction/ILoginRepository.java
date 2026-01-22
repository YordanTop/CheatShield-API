package org.cs.auth.repositories.abstraction;


import org.cs.auth.dto.request.UserCredentialDTO;
import org.cs.auth.dto.response.UserActiveSessionDTO;

public interface ILoginRepository {

    public UserActiveSessionDTO sessionStatus(String emailAddress);

    public UserCredentialDTO login(String emailAddress, String password);

}
