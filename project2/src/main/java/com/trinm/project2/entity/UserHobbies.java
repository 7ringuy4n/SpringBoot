package com.trinm.project2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/3/2023, Fri
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "dbo", name = "UserHobbies")
public class UserHobbies implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "hobby_id", referencedColumnName = "hobby_id")
    private Hobbies hobbies;

    @Override
    public String toString() {
        return "UserHobbies{" +
                "user=" + user.toString() +
                ", hobbies=" + hobbies.toString() +
                '}';
    }
}
