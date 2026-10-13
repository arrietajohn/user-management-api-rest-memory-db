package com.jcaa.udec.application.port.in;

import com.jcaa.udec.application.service.dto.response.UserResult;

import java.util.List;

public interface ListUsersUseCase {

    List<UserResult> listUsers();
}
