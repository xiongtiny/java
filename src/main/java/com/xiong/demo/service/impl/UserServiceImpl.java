package com.xiong.demo.service.impl;

import com.xiong.demo.entity.User;
import com.xiong.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author RC
 * @description 用户业务实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String addUser(User user) {
        // 直接编写业务逻辑
        return "success";
    }
}
