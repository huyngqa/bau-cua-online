package com.gourdcrab.online.service;

import com.gourdcrab.online.model.User;

public interface IUserService {
    User login(String userName, String password);
}
