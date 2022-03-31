package com.mthree.ClassRoster.dao;

import com.mthree.ClassRoster.dto.Student;

import java.util.List;

public interface ClassRosterDao {

    Student addStudent(String studentId, Student student) throws ClassRosterPersistenceException;

    List<Student> getAllStudents() throws ClassRosterPersistenceException;

    Student getStudent(String studentId) throws ClassRosterPersistenceException;

    Student removeStudent(String studentId) throws ClassRosterPersistenceException;
}
