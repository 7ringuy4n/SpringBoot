package com.trinm.project2.dto;

import com.trinm.project2.dto.dtovalidation.DateValidation;
import com.trinm.project2.dto.dtovalidation.FieldMatch;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotEmpty;
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
@DateValidation(dob = "dateOfBirth", message = "Date of birth not valid")
@FieldMatch(first = "password", second = "confirmPassword", message = "The password and confirm password do not match")
public class UserDtoForCreate {

    @NotBlank(message = "Username cannot be blank")
    @Pattern(regexp = "^[A-Za-z][A-Za-z0-9_]*$", message = "Username must not start with a digit and contain only letters, digits, or underscores")
    @Size(min = 5, max = 20, message = "Username must be between 5 and 20 characters")
    private String userName;

    @NotBlank(message = "Full name cannot be blank")
    @Size(min = 5, max = 20, message = "Full name must be between 5 and 20 characters")
    @Pattern(regexp = "^[A-Za-z ]*$", message = "Fullname must contain only letters")
    private String fullName;

    @Email(message = "Your email format is invalid")
    private String email;

    @NotBlank(message = "Password cannot be blank")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}$$", message = "Password must contain at least one letter, one digit, and be at least 6 characters long")
    private String password;

    @NotBlank(message = "Password cannot be blank")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}$$", message = "Password must contain at least one letter, one digit, and be at least 6 characters long")
    private String confirmPassword;


    private String dateOfBirth;

    @NotEmpty(message = "Gender must be chosen")
    private String gender;


    private String hobbies;

    @NotBlank(message = "Country must be chosen")
    @NotEmpty(message = "Country must be chosen")
    private String country;

    private String description;
}
