package com.trinm.project2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/3/2023, Fri
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HobbiesForUpdate {
    private int hobbyId;
    @Size(min = 3, max = 20, message = "Hobby name must be between 3 and 20 characters")
    @NotBlank(message = "Hobbies cannot be blank")
    @Pattern(regexp = "^[A-Za-z ]*$", message = "Hobbies must contain only letters")
    private String hobbyName;
    private String description;
}
