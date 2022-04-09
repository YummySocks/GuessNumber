package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner answerObj = new Scanner(System.in);
        String name = null;
        String guess = null;
        System.out.println("Hello! What is your name?");
        name = answerObj.nextLine();
        System.out.println("Hello"+ name + ", I am thinking of a number between 1 and 20");
        System.out.println("Take a guess");
        guess = answerObj.nextLine();
        System.out.println("Hello you guessed " + guess);
        System.out.println("Hello! What is your name?");

    }
}
