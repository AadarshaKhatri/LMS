package org.example;
import org.example.models.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// This main class work as Library in a real world !!!!!

public class Main {


    public static void main(String[] args) throws InterruptedException, SameBook {
        Scanner sc = new Scanner(System.in);
        Books book1 = new Books("Chalang","Dilip Dhakal",234);
        Books book2 = new Books(" Pride and Prejudice","Jane Austen",35);
        Books book3 = new Books(" Lyddie","Katheriene Paterson",846);
        Books book4 = new Books ("Diary of a Young girl","Anne Frank",875);
        Books book5 = new Books(" Sunyako Mulya","Nawaraj Kc",984);

        ArrayList<Books>  library_books = new ArrayList<>();
        library_books.add(book1);
        library_books.add(book2);
        library_books.add(book3);
        library_books.add(book4);
        library_books.add(book5);
        Customer perosn = new Customer();
        System.out.println("Hello, Welcome to the Library!");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("===== Services =====");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1. Issue Books");
        System.out.println("2. Return Books");
        System.out.println("3. Add Books");
        System.out.println("4. Show available Books");
        TimeUnit.SECONDS.sleep(3);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        switch (number) {
            case 1 -> {
                perosn.order_details();
                Renting issuing_books = new Renting();
                issuing_books.issue_books(library_books);
                System.out.println("Issued by:");
                perosn.slip();

            }
            case 2 -> {
                perosn.order_details();
                Returning returing_books = new Returning();
                returing_books.returned_books(library_books);
                System.out.println("Returned by:");
                perosn.slip();
            }
            case 3 -> {
                perosn.order_details();
                Adding adding_boooks = new Adding();
                adding_boooks.added_books(library_books);
                System.out.println("Added by:");
                perosn.slip();
            }
            case 4 -> {
                for (Books o : library_books) {
                    o.booksprint();
                }
            }
            default -> System.out.println("Invalid Number!");
        }






    }

}