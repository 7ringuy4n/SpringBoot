package com.example.api.Repository;

import com.example.api.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/3/2023, Fri
 **/

@DataJpaTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testInsertStudent() {
        // Create a new student
        Student student = new Student();
        student.setName("John Doe");
        student.setAddress("address1");

        // Save the student to the repository
        Student savedStudent = studentRepository.save(student);

        // Check if the student has been saved with an ID
        assertNotNull(savedStudent.getId());

        // You can also assert other properties if needed
        // assertEquals("John Doe", savedStudent.getName());
        // assertEquals(20, savedStudent.getAge());
    }
}