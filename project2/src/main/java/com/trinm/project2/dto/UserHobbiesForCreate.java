package com.trinm.project2.dto;

import com.trinm.project2.entity.Hobbies;
import com.trinm.project2.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/3/2023, Fri
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserHobbiesForCreate {
    private User user;
    private Hobbies hobbies;

    @Override
    public String toString() {
        return "UserHobbiesForCreate{" +
                "user=" + user.getId() +
                ", hobbies=" + hobbies.getHobbyId() +
                '}';
    }
}