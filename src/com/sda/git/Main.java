package com.sda.git;

public class Main {

    public static void main(String[] args) {
        System.out.println("Yo");
        System.out.println("Aktualny branch to: master");
        System.out.println("Aktualny branch to: feature");
        System.out.println("Aktualny branch to: second_copy");

        for (int i = 0; i < 10; i++) {
            System.out.println("test nr: " + (i + 1));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("test nr: " + (10 - i));
        }
    }
}
