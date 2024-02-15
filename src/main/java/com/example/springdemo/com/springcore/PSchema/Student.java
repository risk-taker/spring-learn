package com.example.springdemo.com.springcore.PSchema;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;

    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public String getStudentAddress(){
        return studentAddress;
    }
    public void setStudentAddress(String studentAddress){
        this.studentAddress = studentAddress;
    }

    public Student(int studentId, String studentName, String studentAddress){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public Student(){
        super();
    }


    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName='" + studentName + '\'' + ", studentAddress='" + studentAddress + '\'' + '}';
//        "Student{"+"studentId =" + '}';
//        return "Student{"+"studentId =" + '}';
//        return {"studentId" + studentId+};

    }
}
