package com.company;
/*************************************************************
        Program:
        Author:Milena
        Date:31.08.2021
        Project:
        Description:
        **************************************************************/

public class WelcomeMessage {
    public void sayHello(String name){
        System.out.println("Welcome " + name);
    }
    public void sayGoodbye(String name){
        System.out.println("Goodbye, " + name + "!");
    }
    public void displayMessage(String name, String Message){
     System.out.println(Message + " " + name);
    }
}
