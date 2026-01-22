package org.cs.auth.repositories;

import org.cs.auth.dto.request.UserCredentialDTO;
import org.cs.auth.dto.response.UserActiveSessionDTO;
import org.cs.auth.repositories.abstraction.ILoginRepository;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepository implements ILoginRepository {

    @Override
    public UserActiveSessionDTO sessionStatus(String emailAddress) {
        UserActiveSessionDTO userActiveSessionDTO = new UserActiveSessionDTO();

        userActiveSessionDTO.getEmailAddress();
        userActiveSessionDTO.getSessionCode();
        userActiveSessionDTO.isSessionActive();

        return userActiveSessionDTO;
    }

    @Override
    public UserCredentialDTO login(String emailAddress, String password) {
        return null;
    }
}
