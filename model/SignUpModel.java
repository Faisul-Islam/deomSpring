package com.suhid.studentportal.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
// database table create
@Entity
@Table(name = "students")
public class SignUpModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String dept;

    private String studentId;
@Column(name = "passcode")
//If i want to customize column name
@Size(min = 4, max = 5)
    private String password;

    public SignUpModel() {
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getPassword() {
        return password;
    }
}
