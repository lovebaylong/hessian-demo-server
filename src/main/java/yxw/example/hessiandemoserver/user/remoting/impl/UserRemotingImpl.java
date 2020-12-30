package yxw.example.hessiandemoserver.user.remoting.impl;

import org.springframework.stereotype.Component;
import yxw.example.hessiandemoserver.user.service.UserService;
import yxw.example.user.entity.User;
import yxw.example.user.remoting.UserRemoting;

import java.util.List;

@Component
public class UserRemotingImpl implements UserRemoting {
    private final UserService userService;

    public UserRemotingImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User findById(Long id) {
        return userService.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userService.findAll();
    }
}
