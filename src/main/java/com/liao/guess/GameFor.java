package com.liao.guess;

import com.liao.Person;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args){

        /*for (int i=5; i>=1; i--){
            System.out.println(i);
        }*/

        int secret = new Random().nextInt(10) + 1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        for (int i=1; i<=4; i++) {
            System.out.println("Please enter a number( " + i + "/4):");
            int number = scanner.nextInt();
            System.out.println("第" + i +"次:" + number);
            if (number > secret) {
                System.out.println("Lower");
            } else if (number < secret) {
                System.out.println("Higher");
            } else {
                System.out.println("Great, the number is: " + secret);
                break;
            }
        }
        System.out.println("結束");
    }
}
