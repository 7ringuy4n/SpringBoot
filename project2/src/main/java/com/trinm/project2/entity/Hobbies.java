package com.trinm.project2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/3/2023, Fri
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "dbo", name = "Hobbies")
public class Hobbies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hobby_id")
    private int hobbyId;

    @Column(name = "hobby_name")
    private String hobbyName;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "hobbies")
    private List<UserHobbies> hobbies;

    @Override
    public String toString() {
        return "Hobbies{" +
                "hobbyId=" + hobbyId +
                ", hobbyName='" + hobbyName + '\'' +
                ", description='" + description + '\'' +
                ", hobbies=" + hobbies.toString() +
                '}';
    }
}
