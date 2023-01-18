package com.unique.cls;

import java.util.ArrayList;
import java.util.List;

public class StudentRecord implements Student	 {
    public List<Student> students;

    public StudentRecord() {
        students = new ArrayList<>();
    }

    @Logged
    public void addStudent(Student student) {
        students.add(student);
    }
}
