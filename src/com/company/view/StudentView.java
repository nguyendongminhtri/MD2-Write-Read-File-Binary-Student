package com.company.view;

import com.company.controller.StudentController;
import com.company.model.Student;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    Scanner scanner = new Scanner(System.in);
    StudentController studentController = new StudentController();
    List<Student> studentList = studentController.showListStudent();

    public StudentView() throws IOException {
    }

    public void viewShowListStudent() throws IOException {
        System.out.println(studentList);
        System.out.println("Enter QUIT to back MENU: ");
        String back = scanner.nextLine();
        if(back.equalsIgnoreCase("quit")){
            new Main();
        }
    }
    public void viewCreateStudent() throws IOException {
        while (true){
            int id;
            if(studentList.size()==0){
                id =1;
            } else {
                id = studentList.get(studentList.size()-1).getId()+1;
            }
            System.out.println("Enter the name Student: ");
            String name = scanner.nextLine();
            System.out.println("Enter the age Student: ");
            int age = scanner.nextInt();
            Student student = new Student(id, name,age);
            studentController.createStudent(student);
            System.out.println("Enter any Key to continue create - Enter QUIT to back MENU: ");
            String back = scanner.next();
            if(back.equalsIgnoreCase("quit")){
                new Main();
            }
        }
    }
}
