package com.example.api.Entity;

import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/2/2023, Thu
 **/

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;


}
