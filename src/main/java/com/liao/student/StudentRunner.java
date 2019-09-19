package com.liao.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args){
        com.liao.kotlin.Student.Companion.getPass(); //Java要使用Kotlin的類別層級屬性
        //userInput();
        Student.pass = 50;
        Student stu = new Student("Liao", 55, 58);
        Student stu2 = new Student("Emma", 90, 20);
        Student stu3 = new Student("Hong", 42, 35);
        GraduateStudent gstu = new GraduateStudent("Pupu", 55, 65, 60);
        gstu.print();
        stu.print();
        stu2.print();
        stu3.print();
        System.out.println("High score: " + stu.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student's name:");
        String name = scanner.next();
        System.out.println("Please enter student's english:");
        int english = scanner.nextInt();
        System.out.println("Please enter student's math:");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println("High score: " + stu.highest());
    }
}
