package com.mr.service;

import com.mr.model.User;

import java.util.List;

/**
 * Created by lenovo on 2018/5/25.
 */
public interface UserService {
    User getUserByUserName(String username);

    List<String> selectPermissionByUserId(Integer id);

    List<String> selectRolesByUserId(Integer id);
}
