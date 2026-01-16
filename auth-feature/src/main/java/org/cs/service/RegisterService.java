package org.cs.service;

import org.cs.repositories.RegisterRepository;
import org.cs.service.abstraction.IRegisterService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class RegisterService implements IRegisterService {

    public RegisterRepository registerService;

    public RegisterService(RegisterRepository registerService){
        this.registerService = registerService;
    }
}
