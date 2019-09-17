package com.liao.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10)+1; //random.newInt(10)+1 是1~10取一個亂數, random.newInt(10) 是0~9取一個亂數
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number != secret) {
            System.out.println("Please enter a number: ");
            number = scanner.nextInt();
            if (number < secret) {
                System.out.println("Higher");
            } else if (number > secret) {
                System.out.println("Lower");
            } else {
                System.out.println("Great, the number is " + secret);
            }
        }
        /*int i = 0;
        do {
            System.out.println(i);
            i = i + 1;
        } while (i < 3);*/
    }
}
