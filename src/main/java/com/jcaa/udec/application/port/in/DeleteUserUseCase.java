package com.jcaa.udec.application.port.in;

import com.jcaa.udec.application.service.dto.commands.DeleteUserCommand;

public interface DeleteUserUseCase {

    void deleteUser(DeleteUserCommand command);
}
