package com.mthree.ClassRoster.controller;


import com.mthree.ClassRoster.dao.ClassRosterPersistenceException;
import com.mthree.ClassRoster.service.ClassRosterDataValidationException;
import com.mthree.ClassRoster.service.ClassRosterDuplicateIdException;

import com.mthree.ClassRoster.dto.Student;
import com.mthree.ClassRoster.service.ClassRosterServiceLayer;
import com.mthree.ClassRoster.ui.ClassRosterView;


import java.util.List;

public class ClassRosterController {



    private ClassRosterView view;
    private ClassRosterServiceLayer service;

    public ClassRosterController(ClassRosterServiceLayer service, ClassRosterView view) {
        this.service = service;
        this.view = view;
    }

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {
                menuSelection = getMenuSelection();
                switch (menuSelection) {
                    case 1: {
                        listStudents();
                        break;
                    }
                    case 2: {
                        createStudent();
                        break;
                    }
                    case 3:
                        viewStudent();
                        break;
                    case 4:
                        removeStudent();
                        break;
                    case 5:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();

                }
            }
            exitMessage();
        } catch (ClassRosterPersistenceException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void createStudent() throws ClassRosterPersistenceException {
        view.displayCreateStudentBanner();
        boolean hasErrors = false;
        do {
            Student newStudent = view.getNewStudentInfo();
            try {
                service.addStudent(newStudent);
                view.displayCreateSuccessBanner();
                hasErrors = false;
            }catch (ClassRosterDuplicateIdException | ClassRosterDataValidationException e){
                hasErrors = true;
                view.displayErrorMessage(e.getMessage());
            }
        }while (hasErrors);
    }

    private void listStudents() throws ClassRosterPersistenceException {
        view.displayAllStudentBanner();
        List<Student> studentList = service.getAllStudents();
        view.displayStudentList(studentList);
    }

    private void viewStudent() throws ClassRosterPersistenceException {
        view.displayStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student student = service.getStudent(studentId);
        view.displayStudent(student);
    }

    private void removeStudent() throws ClassRosterPersistenceException, ClassRosterPersistenceException {
        view.displayRemoveStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student removedStudent  = service.removeStudent(studentId);
        view.displayRemoveResult(removedStudent);
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }
}
