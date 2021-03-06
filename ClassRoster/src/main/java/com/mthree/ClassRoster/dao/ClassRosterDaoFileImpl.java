package com.mthree.ClassRoster.dao;

import com.mthree.ClassRoster.dto.Student;

import java.io.*;
import java.util.*;

public class ClassRosterDaoFileImpl implements ClassRosterDao {

    public static final String ROSTER_FILE = "roster.txt";
    public static final String DELIMITER = "::";

    private final Map<String, Student> students = new HashMap<>();

    @Override
    public Student addStudent(String studentId, Student student)
    throws ClassRosterPersistenceException {
        loadRoster();
        Student newStudent = students.put(studentId, student);
        writeRoster();
        return  newStudent;
    }

    @Override
    public List<Student> getAllStudents()
    throws ClassRosterPersistenceException {
        loadRoster();
        return new ArrayList<Student>(students.values());
    }

    @Override
    public Student getStudent(String studentId)
    throws ClassRosterPersistenceException {
        loadRoster();
        return students.get(studentId);
    }

    @Override
    public Student removeStudent(String studentId)
    throws ClassRosterPersistenceException {
          loadRoster();
          Student removedStudent = students.remove(studentId);
          writeRoster();
          return removedStudent;
    }

    private Student unmarshallStudent(String studentAsText) {
        String[] studentTokens = studentAsText.split(DELIMITER);

        String studentId = studentTokens[0];

        Student studentFromFile = new Student(studentId);

        studentFromFile.setFirstName(studentTokens[1]);

        studentFromFile.setLastName(studentTokens[2]);

        studentFromFile.setCohort(studentTokens[3]);

        return studentFromFile;
    }

    private void loadRoster() throws ClassRosterPersistenceException {

        Scanner sc;

        try {

            sc = new Scanner(
                    new BufferedReader(
                            new FileReader(ROSTER_FILE)
                    )
            );
        } catch (FileNotFoundException ex) {
            throw  new ClassRosterPersistenceException("-_- Could not load roster data into memory.", ex);
        }

        String currentLine;

        Student currentStudent;

        while (sc.hasNextLine()) {

            currentLine = sc.nextLine();

            currentStudent = unmarshallStudent(currentLine);

            students.put(currentStudent.getStudentId(), currentStudent);
        }
        sc.close();
    }

    private String marshallStudent(Student aStudent) {

        String studentAsText = aStudent.getStudentId() + DELIMITER;

        studentAsText += aStudent.getFirstName() + DELIMITER;

        studentAsText += aStudent.getLastName() + DELIMITER;

        studentAsText += aStudent.getCohort() + DELIMITER;

        return studentAsText;
    }

    private void writeRoster() throws ClassRosterPersistenceException {

        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
        } catch (IOException e) {
            throw new ClassRosterPersistenceException(
                    "Could not save student data.", e);
        }

        String studentAsText;
        List<Student> studentList = this.getAllStudents();
        for(Student currentStudent: studentList) {

            studentAsText = marshallStudent(currentStudent);

            out.println(studentAsText);

            out.flush();
        }

        out.close();
    }
}
