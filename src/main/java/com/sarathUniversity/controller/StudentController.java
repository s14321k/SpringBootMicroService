package com.sarathUniversity.controller;

import com.sarathUniversity.request.CreateStudentRequest;
import com.sarathUniversity.response.StudentResponse;
import com.sarathUniversity.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController
{
    private final StudentService stdService;

    // a constructor so that the Spring container can inject a StudentService.
    public StudentController(StudentService stdService) {
        this.stdService = stdService;
    }

    @PostMapping("/create")
    public StudentResponse createStudent(@RequestBody CreateStudentRequest createStudentRequest)
    {
        return stdService.createStudentResponse(createStudentRequest);
    }

    @GetMapping("/getById/{id}")
    public StudentResponse getById(@PathVariable long id)
    {
        return null;
    }
}
