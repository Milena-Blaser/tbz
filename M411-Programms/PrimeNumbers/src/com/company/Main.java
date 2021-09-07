package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 2;
        int rest = 1;
        int number = 12;

        if (i < number && rest > 0) {
            rest = number % i;
            if (rest > 0) {
                System.out.print(number + " ist eine Primzahl");
            } else {
                System.out.print(number + " ist keine Primzahl");
            }
        }
        }

}
