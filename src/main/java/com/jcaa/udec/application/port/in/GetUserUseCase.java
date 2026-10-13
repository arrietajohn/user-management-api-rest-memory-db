package com.jcaa.udec.application.port.in;

import com.jcaa.udec.application.service.dto.queries.GetUserQuery;
import com.jcaa.udec.application.service.dto.response.UserResult;

public interface GetUserUseCase {

    UserResult getUser(GetUserQuery query);
}
