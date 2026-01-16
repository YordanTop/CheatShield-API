package org.cs.repositories;

import org.cs.dto.response.UserActiveSessionDTO;
import org.cs.repositories.abstraction.ILoginRepository;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepository implements ILoginRepository {

    @Override
    public UserActiveSessionDTO isUserLoggedIn(String emailAddress) {
        return new UserActiveSessionDTO();
    }

    @Override
    public void login(String emailAddress, String password) {

    }
}
