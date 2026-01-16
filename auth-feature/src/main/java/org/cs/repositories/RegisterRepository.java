package org.cs.repositories;

import org.cs.dto.request.CreateUserDTO;
import org.cs.repositories.abstraction.IRegisterRepository;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterRepository implements IRegisterRepository {


    @Override
    public void createAccount(CreateUserDTO user) {

    }


}
