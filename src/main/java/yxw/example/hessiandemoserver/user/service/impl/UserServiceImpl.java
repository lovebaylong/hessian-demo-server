package yxw.example.hessiandemoserver.user.service.impl;

import org.springframework.stereotype.Service;
import yxw.example.hessiandemoserver.user.service.UserService;
import yxw.example.user.entity.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("海王子");
        user.setAge(18);
        user.setEmail("168@163.com");
        user.setIdCardNo("不能告诉你");
        user.setIsLive(true);
        user.setPhone("13800138000");
        user.setType(1);
        user.setAddress("农村");
        return user;
    }

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        userList.add(findById(1L));
        return userList;
    }
}
