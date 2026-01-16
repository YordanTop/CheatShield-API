package org.cs.controller;

import org.cs.dto.request.UserCredentialDTO;
import org.cs.service.abstraction.IAuthenticationService;
import org.cs.service.abstraction.ILoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    private ILoginService loginService;

    private IAuthenticationService authenticationService;

    public LoginController(ILoginService loginService, IAuthenticationService authenticationService){
        this.loginService = loginService;
        this.authenticationService = authenticationService;
    }

    public void login(UserCredentialDTO userCredential){

        if(isUserSessionActive(userCredential.emailAddress)){
            loginService.login(userCredential.getEmailAddress(), userCredential.getPassword());
            return;
        }


    }

    @GetMapping("/session-active")
    public boolean isUserSessionActive(@RequestParam String emailAddress){

        return true;//loginService.isUserLoggedIn(emailAddress).isSessionActive;

    }


}
