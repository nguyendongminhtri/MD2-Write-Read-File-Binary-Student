package com.company.view;

import java.io.IOException;
import java.util.Scanner;

public class Main {
public Main() throws IOException {
    Scanner scanner = new Scanner(System.in);
    StudentView studentView = new StudentView();
    System.out.println("1. Show List Student: ");
    System.out.println("2. Create Student: ");
    int chooseMenu = scanner.nextInt();

    switch (chooseMenu){
        case 1:
            studentView.viewShowListStudent();
            break;
        case 2:
            studentView.viewCreateStudent();
            break;
    }

}
    public static void main(String[] args) throws IOException {
	// write your code here
        new Main();
    }
}
