package com.company;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/*************************************************************
        Program:
        Author:Milena
        Date:31.08.2021
        Project:
        Description:
        **************************************************************/

public class AgeCalculator {
    public void tellAge(){
        Scanner scan = new Scanner(System.in);
        String name;
        int birthyear;
        int age;
        System.out.println("Wie heisst du?");
        name = scan.next();
        System.out.println("In welchem Jahr wurdest du geboren?");
        birthyear = scan.nextInt();
        age =calculateAge(birthyear);
        System.out.println("Hallo " + name +", du wirst in diesem Jahr "+ age +" Jahre alt.");
    }
    public int calculateAge(int birthyear){
     return LocalDate.now().getYear()- birthyear;
    }

}
