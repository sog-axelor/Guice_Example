package com.unique.cls;

import java.util.ArrayList;
import java.util.List;

public class StudentRecord {
    private List<StudentRecord> students = new ArrayList<>();

    @Logged
    public void addStudent(StudentRecord student) {
        students.add(student);
    }

    public List<StudentRecord> getStudents() {
        return students;
    }
}