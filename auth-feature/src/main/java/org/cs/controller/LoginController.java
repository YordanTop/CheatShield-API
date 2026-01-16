package org.cs.controller;

import org.cs.dto.request.UserCredentialDTO;
import org.cs.service.abstraction.IAuthenticationService;
import org.cs.service.abstraction.ILoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private ILoginService loginService;

    private IAuthenticationService authenticationService;


    public void login(UserCredentialDTO userCredential){

        if(isUserSessionActive(userCredential.emailAddress)){
            loginService.login(userCredential.getEmailAddress(), userCredential.getPassword());
            return;
        }


    }

    @GetMapping("/active")
    public boolean isUserSessionActive(@RequestParam String emailAddress){

        return loginService.isUserLoggedIn(emailAddress).isSessionActive;

    }


}
