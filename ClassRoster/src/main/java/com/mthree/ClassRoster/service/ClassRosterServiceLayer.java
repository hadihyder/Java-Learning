package com.mthree.ClassRoster.service;

import com.mthree.ClassRoster.dao.ClassRosterPersistenceException;
import com.mthree.ClassRoster.dto.Student;

import java.util.List;

public interface ClassRosterServiceLayer {


    void addStudent(Student student) throws ClassRosterDuplicateIdException, ClassRosterDataValidationException, ClassRosterPersistenceException;

    List<Student> getAllStudents() throws
            ClassRosterPersistenceException;

    Student getStudent(String studentId) throws
            ClassRosterPersistenceException;

    Student removeStudent(String studentId) throws
            ClassRosterPersistenceException;
}
