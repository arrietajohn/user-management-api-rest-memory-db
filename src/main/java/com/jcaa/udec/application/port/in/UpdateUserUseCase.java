package com.jcaa.udec.application.port.in;

import com.jcaa.udec.application.service.dto.commands.UpdateUserCommand;
import com.jcaa.udec.application.service.dto.response.UserResult;

public interface UpdateUserUseCase {

    UserResult updateUser(UpdateUserCommand command);
}
