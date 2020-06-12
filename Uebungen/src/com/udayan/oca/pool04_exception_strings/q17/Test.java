package com.udayan.oca.pool04_exception_strings.q17;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(1);
        } catch (NullPointerException ex) {
            System.out.println("ONE");
        } catch (FileNotFoundException ex) {
            System.out.println("TWO");
        }
        System.out.println("THREE");
    }
}