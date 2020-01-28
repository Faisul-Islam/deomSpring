package com.suhid.studentportal.dto.request;

public class SignUpRequest {
    private String studentName;
    private String studentDept;
    private String studentId;
    private String studentPass;

    public String getStudentName() {
        return studentName;
    }

    public String getStudentDept() {
        return studentDept;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentPass() {
        return studentPass;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentDept(String studentDept) {
        this.studentDept = studentDept;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentPass(String studentPass) {
        this.studentPass = studentPass;
    }
}
