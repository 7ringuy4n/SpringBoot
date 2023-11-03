package com.trinm.project2.service;

import com.trinm.project2.entity.User;

import java.util.List;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/3/2023, Fri
 **/


public interface UserService {
//    void save(UserDtoForCreate userDTOForCreate);
    User getByUserName(String userName, String password);
//    List<User> getAllUser();
//    void deleteUserById(int id);
//    UserDtoForUpdate getUserById(int id);
//    void updateUser(UserDtoForUpdate userDtoForUpdate);
//    List<User> searchByColumn(String column, String text, int entries);
//
//    @Transactional
//    List<String> getColumnNames();
}
