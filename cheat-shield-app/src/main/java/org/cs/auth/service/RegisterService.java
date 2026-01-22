package org.cs.auth.service;

import org.cs.auth.repositories.RegisterRepository;
import org.cs.auth.service.abstraction.IRegisterService;
import org.springframework.stereotype.Service;

@Service
public class RegisterService implements IRegisterService {

    public RegisterRepository registerService;

    public RegisterService(RegisterRepository registerService){
        this.registerService = registerService;
    }
}
