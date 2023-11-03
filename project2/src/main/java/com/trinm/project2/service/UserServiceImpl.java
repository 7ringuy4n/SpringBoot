package com.trinm.project2.service;

import com.trinm.project2.dao.UserDao;
import com.trinm.project2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/3/2023, Fri
 **/


@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDAO;

    @Override
    @Transactional
    public User getByUserName(String userName, String password) {
        User user = userDAO.getByUserName(userName, password);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
