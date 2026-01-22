package org.cs.auth.repositories.abstraction;

import org.cs.auth.dto.request.CreateUserDTO;


public interface IRegisterRepository {
    /// Creates new user account.
    public void createAccount(CreateUserDTO user);
}
