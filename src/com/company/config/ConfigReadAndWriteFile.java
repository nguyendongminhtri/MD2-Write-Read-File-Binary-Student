package com.company.config;

import com.company.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConfigReadAndWriteFile {
    public void writeToFile(String path, List<Student> studentList) throws IOException { //Ghi RA --> OUT FileOutPutTream.
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(studentList);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public List<Student> readFromFile(String path){ //Đọc vào IN -> FileInputStream
        List<Student> studentList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            studentList = (List<Student>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception e){
            e.getMessage();
        }
        return studentList;
    }
}
