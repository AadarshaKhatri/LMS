package org.example.models;

public class Books {
    public String book_name;
    public String author;
    public int code;

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getAuthor() {
        return author;
    }

    public int getCode() {
        return code;
    }

    public Books(String book_name, String author, int code) {
        this.book_name = book_name;
        this.author = author;
        this.code = code;
    }
    public void booksprint(){
        String book_name = this.getBook_name();
        int book_code = this.getCode();
        System.out.println(book_code + "."+ " "+ book_name);

        }
    }

