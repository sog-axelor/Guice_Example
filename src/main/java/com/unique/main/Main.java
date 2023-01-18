package com.unique.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.unique.cls.Student;
import com.unique.cls.StudentRecord;
import com.unique.module.LoggingModule;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new LoggingModule());
        
        //for studentREcord to invoke Method
        StudentRecord studentRecord = injector.getInstance(StudentRecord.class);
        studentRecord.addStudent(new StudentRecord());
        
        //for getting the value form student
        Student st = injector.getInstance(Student.class);
        //st.addStudent(new Student("hello","Sonu"));      	
    }
}