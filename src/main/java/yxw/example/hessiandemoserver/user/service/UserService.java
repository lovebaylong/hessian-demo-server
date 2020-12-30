package yxw.example.hessiandemoserver.user.service;

import yxw.example.user.entity.User;

import java.util.List;

public interface UserService {
    User findById(Long id);

    List<User> findAll();
}
