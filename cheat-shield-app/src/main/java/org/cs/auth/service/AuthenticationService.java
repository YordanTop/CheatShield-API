package org.cs.auth.service;

import org.cs.auth.dto.request.UserCredentialDTO;
import org.cs.auth.dto.response.UserAuthenticationCodeDTO;
import org.cs.auth.service.abstraction.IAuthenticationService;
import org.springframework.stereotype.Service;

/// Service that authentication the users for permissions.
@Service
public class AuthenticationService implements IAuthenticationService {

    @Override
    public void sendAuthenticationCodeEmail(UserCredentialDTO userCredential) {

    }

    @Override
    public boolean checkAuthenticationCodeEmail(UserAuthenticationCodeDTO authCode) {
        return true;
    }

}
