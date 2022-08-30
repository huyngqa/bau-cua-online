package com.gourdcrab.online.repository;

import com.gourdcrab.online.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, String> {
    User findByUserNameAndAndPassword(String userName, String password);
}
