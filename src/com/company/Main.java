package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner answerObj = new Scanner(System.in);
        String name = null;
        String guess = "0";
        Random rand = new Random();
        int counter = 0;
        int upperbound = 21;
        int number = rand.nextInt(upperbound);
        System.out.println("Hello! What is your name?");
        String last;
        name = answerObj.nextLine();
        System.out.println("Hello"+ name + ", I am thinking of a number between 1 and 20");

        while(Integer.parseInt(guess) != number){
            counter++;
            System.out.println("Take a guess");
            guess = answerObj.nextLine();
            if(Integer.parseInt(guess) > number){
                System.out.println("Your guess was too high");
            } else if (Integer.parseInt(guess) < number){
                System.out.println("Your guess was too low");
            } else if (Integer.parseInt(guess) == number){
                System.out.println("Good job, " + name + "! You guess my number " + number + " in " + counter + " guesses!!");
                System.out.println("Would you like to play again? (y/n)");
                last = answerObj.nextLine();
                if(last.equals("y")){
                    number = rand.nextInt(upperbound);
                    guess = "0";
                } else{
                    break;
                }
            }
        }
    }
}
