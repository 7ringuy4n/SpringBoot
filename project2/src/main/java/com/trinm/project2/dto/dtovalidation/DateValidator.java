package com.trinm.project2.dto.dtovalidation;

import org.apache.commons.beanutils.BeanUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/3/2023, Fri
 **/


public class DateValidator implements ConstraintValidator<DateValidation, Object> {
    private String dob;

    private String message;

    @Override
    public void initialize(final DateValidation constraintAnnotation) {
        dob = constraintAnnotation.dob();
        message = constraintAnnotation.message();
    }

    @Override
    public boolean isValid(final Object value, final ConstraintValidatorContext context) {
        boolean valid = true;
        try {
            final Object obj = BeanUtils.getProperty(value, dob);
            if (obj == null || obj.toString().isEmpty()) {
                valid = false;
            } else {
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate dateOfBirth = LocalDate.parse(obj.toString(), dateFormatter);

                LocalDate currentDate = LocalDate.now();
                if (dateOfBirth.isAfter(currentDate)) {
                    valid = false;
                }
            }
        } catch (final Exception ignore) {
            valid = false;
        }

        if (!valid) {
            context.buildConstraintViolationWithTemplate(message)
                    .addPropertyNode(dob)
                    .addConstraintViolation()
                    .disableDefaultConstraintViolation();
        }

        return valid;
    }

}