package com.sarathUniversity.service;

import com.sarathUniversity.entity.Address;
import com.sarathUniversity.entity.Student;
import com.sarathUniversity.repository.AdressRepository;
import com.sarathUniversity.repository.StudentRepository;
import com.sarathUniversity.request.CreateStudentRequest;
import com.sarathUniversity.response.StudentResponse;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{
    StudentRepository studentRepository;
    AdressRepository adressRepository;
    public StudentResponse createStudentResponse(CreateStudentRequest createStudentRequest)
    {
        Address addrs = new Address();

        System.out.println("Address");

        addrs.setStreet(createStudentRequest.getStreet());
        addrs.setCity(createStudentRequest.getCity());

        addrs = adressRepository.save(addrs);

        Student std = new Student();

        System.out.println("Address");

        std.setFirstName(createStudentRequest.getFirstName());
        std.setLastName(createStudentRequest.getLastName());
        std.setEmail(createStudentRequest.getEmail());
        std.setAddressId(addrs);
        std = studentRepository.save(std);

        return new StudentResponse(std);
    }

    public StudentResponse getById(long id)
    {
        return new StudentResponse(studentRepository.findById(id).orElse(null));
    }
}
