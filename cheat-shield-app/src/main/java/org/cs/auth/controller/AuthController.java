package org.cs.auth.controller;

import org.cs.auth.dto.request.UserCredentialDTO;
import org.cs.auth.dto.response.UserActiveSessionDTO;
import org.cs.auth.service.abstraction.IAuthenticationService;
import org.cs.auth.service.abstraction.ILoginService;
import org.cs.auth.service.abstraction.IRegisterService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private ILoginService loginService;

    private IRegisterService registerService;

    private IAuthenticationService authenticationService;

    public AuthController(ILoginService loginService, IRegisterService registerService, IAuthenticationService authenticationService) {
        this.loginService = loginService;
        this.registerService = registerService;
        this.authenticationService = authenticationService;
    }



    @PostMapping("/login")
    public void login(@RequestBody UserCredentialDTO userCredential){
        loginService.login(userCredential.getEmailAddress(), userCredential.getPassword());
    }

    @GetMapping("/session-status")
    public UserActiveSessionDTO UserSessionStatus(@RequestParam String emailAddress){
        return loginService.sessionStatus(emailAddress);
    }


}
