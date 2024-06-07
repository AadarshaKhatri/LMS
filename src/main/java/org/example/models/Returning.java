package org.example.models;

import java.util.List;
import java.util.Scanner;

public class Returning {

    public void returned_books(List<Books> avaialableBooks){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill the below detail to return the books!");
        System.out.println("Enter the book name:");
        String book_name = sc.nextLine();
        System.out.println("Enter the book's code:");
        int code = sc.nextInt();
        System.out.println("Enter the author:");
        String author = sc.nextLine();

        Books return_book = new Books(book_name,author,code);
        try {
            avaialableBooks.add(return_book);
            System.out.println("You have returned the Book!");
        }catch (Exception e){
            System.out.println(e);
        }


    }
;
    }




