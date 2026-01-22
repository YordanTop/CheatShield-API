package org.cs.auth.service.abstraction;

import org.cs.auth.dto.request.UserCredentialDTO;
import org.cs.auth.dto.response.UserActiveSessionDTO;

public interface ILoginService {

    public UserActiveSessionDTO sessionStatus(String emailAddress);

    public UserCredentialDTO login(String emailAddress, String password);

}
