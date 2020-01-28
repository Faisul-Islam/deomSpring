package com.suhid.studentportal.controller;

import com.suhid.studentportal.dto.request.SignUpRequest;
import com.suhid.studentportal.model.SignUpModel;
import com.suhid.studentportal.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student/")
public class UserSignInAndSignUpController {
    private final StudentRepository studentRepository;

    public UserSignInAndSignUpController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("signup")
    public void signUp(@RequestBody SignUpRequest signUpRequest) {
        SignUpModel signUpModel = new SignUpModel();
        signUpModel.setStudentId(signUpRequest.getStudentId());
        signUpModel.setDept(signUpRequest.getStudentDept());
        signUpModel.setName(signUpRequest.getStudentName());
        signUpModel.setPassword(signUpRequest.getStudentPass());
        studentRepository.save(signUpModel);
    }

    @GetMapping("signin")
    public String signIn() {

        return "user";
    }

}
