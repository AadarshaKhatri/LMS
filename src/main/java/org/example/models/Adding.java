package org.example.models;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Adding {
    public void added_books(List<Books> availableBooks) throws SameBook, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill in the details if you want to add the books!");
        System.out.println("Enter the book name:");
        String book_name = sc.nextLine();
        System.out.println("Enter the book's code:");
        int code = sc.nextInt();
        System.out.println("Enter the author:");
        String author = sc.nextLine();
        TimeUnit.SECONDS.sleep(2);
        Books added_books = new Books(book_name,author,code);
        for( Books i : availableBooks){
            try {
                availableBooks.add(added_books);
                if (added_books.equals(i)) {
                    throw new SameBook();
                }
                System.out.println("The book has been added successfully!");
            } catch (SameBook e){
                System.out.println(e);
            }
            }


                }


        }





