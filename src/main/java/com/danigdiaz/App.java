package com.danigdiaz;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        try (Scanner myObj = new Scanner(System.in)) {
            String userName;
            byte age;

            System.out.println("Enter name: ");
            userName = myObj.nextLine();

            System.out.println("Hello " + userName);

            System.out.println("Enter age: ");
            age = myObj.nextByte();

            if (age > 18){
                System.out.println(userName + ", your age is " + age + ", you can pass.");
            } else {
                System.out.println(userName + ", your age is " + age + ", you cannot pass.");
            }
        }
    }
}