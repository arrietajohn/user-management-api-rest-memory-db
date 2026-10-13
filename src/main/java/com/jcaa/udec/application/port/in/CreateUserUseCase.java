package com.jcaa.udec.application.port.in;

import com.jcaa.udec.application.service.dto.commands.CreateUserCommand;
import com.jcaa.udec.application.service.dto.response.UserResult;

public interface CreateUserUseCase {

    UserResult createUser(CreateUserCommand command);
}
