package org.example.models;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Customer {
    String name;
    double roll_no;
    int grade;



    public void order_details() throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill up the below details in order to issue the book of your choice!!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Enter you full name:");
        this.name = sc.nextLine();
        System.out.println("Enter your grade:");
        this.grade = sc.nextInt();
        System.out.println("Enter your Roll number:");
        this.roll_no = sc.nextDouble();
        TimeUnit.SECONDS.sleep(1);

    }
    public void slip(){

        System.out.println("Name: "+this.name+"\n" +
                "Roll number: "+this.roll_no+"\n" +
                "Grade: "+ this.grade);
    }
}
