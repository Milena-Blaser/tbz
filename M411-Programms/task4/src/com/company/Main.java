package com.company;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //exercise 1
        try {
            File filename = new File("C:/Users/Milena/Desktop/M411/task4/superImportantText.txt");
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //exercise 3

        try {
            Scanner scan = new Scanner(System.in);
            File filename = new File("C:/Users/Milena/Desktop/M411/task4/people.txt");
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            System.out.println();
            System.out.println("Enter the first name of the person you're looking for: ");
            String firstname = scan.nextLine();

            while ((line = br.readLine()) != null) {

                if(line.toLowerCase().contains(firstname.toLowerCase())) {
                    String[] lineparts = line.split(";");
                    for (String p : lineparts) {
                        System.out.println(p);
                        if (p.matches("[0-9]{4}")) {
                            int intVal = Integer.parseInt(p);
                            int age = LocalDate.now().getYear() - intVal;
                            System.out.println(age);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //exercise 4
        MyWriter myWriter = new MyWriter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to write into the file?");

        myWriter.printReverse(scanner.nextLine());

    }
}