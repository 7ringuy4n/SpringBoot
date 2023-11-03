package com.example.api.Controller;

import com.example.api.Configure.API;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/2/2023, Thu
 **/

@RestController
public class StudentController {

    @GetMapping(value = API.PING)
    public String ping() {
        return "Start";
    }
}
