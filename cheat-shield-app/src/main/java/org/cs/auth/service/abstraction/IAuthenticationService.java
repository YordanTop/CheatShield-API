package org.cs.auth.service.abstraction;

import org.cs.auth.dto.request.UserCredentialDTO;
import org.cs.auth.dto.response.UserAuthenticationCodeDTO;

public interface IAuthenticationService {

    /// Sending authentication code to the client
    public void sendAuthenticationCodeEmail(UserCredentialDTO userCredential);

    /// Checking the authentication code with the sent one.
    public boolean checkAuthenticationCodeEmail(UserAuthenticationCodeDTO authCode);
}
