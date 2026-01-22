package org.cs.auth.repositories;

import org.cs.auth.dto.request.CreateUserDTO;
import org.cs.auth.repositories.abstraction.IRegisterRepository;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterRepository implements IRegisterRepository {


    @Override
    public void createAccount(CreateUserDTO user) {

    }


}
