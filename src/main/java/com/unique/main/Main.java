package com.unique.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.unique.cls.StudentRecord;
import com.unique.module.LoggingModule;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new LoggingModule());
        StudentRecord studentRecord = injector.getInstance(StudentRecord.class);
       studentRecord.addStudent(new StudentRecord());
       //studentRecord.addStudent(new StudentRecord("John","Doe"));
       


    }
}