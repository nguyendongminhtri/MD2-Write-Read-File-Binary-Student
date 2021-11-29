package com.company.service;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.Student;

import java.io.IOException;
import java.util.List;

public class StudentServiceImpl implements IStudentService {
    public String PATH_STUDENT = "E:\\CODEGYM\\C0921K1\\untitled15\\src\\com\\company\\file\\student.txt";
    ConfigReadAndWriteFile configReadAndWriteFile = new ConfigReadAndWriteFile();
    List<Student> studentList = configReadAndWriteFile.readFromFile(PATH_STUDENT);

    @Override
    public List<Student> findAll() throws IOException {
        configReadAndWriteFile.writeToFile(PATH_STUDENT, studentList);
        return studentList;
    }

    @Override
    public void save(Student student) {
        studentList.add(student);
    }
}
