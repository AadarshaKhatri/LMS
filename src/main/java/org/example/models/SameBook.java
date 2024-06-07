package org.example.models;

public class SameBook extends Exception{
    @Override
    public String toString() {
        return "The Book you have entered is already available here !";
    }

    @Override
    public String getMessage() {
        return "The Book you have entered is already available here !";
    }
}
