package com.trinm.project2.dao;

import com.trinm.project2.entity.User;

import java.util.List;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/3/2023, Fri
 **/


public interface UserDao {
    User save(User user);
    User getById(int id);
    User getByUserName(String userName, String password);
    List<User> getAllUser();
    void update(User user);
    void deleteUserById(int id);

    List<User> getUserByColumn(String column, String text, int entries);

    String[] getColumnNames();
}