package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	WelcomeMessage msg = new WelcomeMessage();
	msg.sayHello("Milena");
	msg.sayHello("Danny");
	msg.sayGoodbye("Danny");
	msg.sayGoodbye("Milena");
	msg.displayMessage("Milena", "Goodbye");

	int a = 5;
	int b = 6;
	System.out.println("Die Summe von " + a + " und "+ b + " ist " + (a+b));
	Scanner scan = new Scanner(System.in);
	a = scan.nextInt();
	String s = scan.next();

    }
}
