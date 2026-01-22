package org.cs.auth.service;

import org.cs.auth.dto.request.UserCredentialDTO;
import org.cs.auth.dto.response.UserActiveSessionDTO;
import org.cs.auth.repositories.LoginRepository;
import org.cs.auth.service.abstraction.ILoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService {

    private LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository){
        this.loginRepository = loginRepository;
    }

    @Override
    public UserActiveSessionDTO sessionStatus(String emailAddress) {
        return loginRepository.sessionStatus(emailAddress);
    }

    @Override
    public UserCredentialDTO login(String emailAddress, String password) {
        return loginRepository.login(emailAddress,password);
    }

}
