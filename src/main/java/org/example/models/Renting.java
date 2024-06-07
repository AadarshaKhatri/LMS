package org.example.models;
import org.example.models.Books;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Renting {
    Customer perso = new Customer();
    LocalDateTime time = LocalDateTime.now();
    DateTimeFormatter design = DateTimeFormatter.ofPattern("dd/MM/yyyy\n -- H:m:s");
    Books issued_books = null;
    Scanner sc = new Scanner(System.in);



    public void issue_books(List<Books> availableBooks) throws InterruptedException {
        System.out.println("Here are the available Books, please enter the number of the book that you want;");
        TimeUnit.SECONDS.sleep(1);
        for (Books i : availableBooks) {
            i.booksprint();
        }
        int book_number = sc.nextInt();

            for (Books issue_book : availableBooks) {
                if(book_number == issue_book.getCode()){
                    issued_books = issue_book;
                }

        }
            availableBooks.remove(issued_books);

        System.out.println("You have issued:\n" +
                "Book Name: "+issued_books.getBook_name()+"\n"+
                "Book id: "+ issued_books.getCode()+"\n" +
                "Book Author: " + issued_books.getAuthor()+ "\n" +
                "Issued on:"+ time.format(design)+"\n" );



    }




}


