package com.company;

import java.util.Scanner;
public class MovieDriver
{

    public static void main(String[] args)
    {

    //Create a new object of type Scanner that reads from the keyboard
	Scanner input= new Scanner(System.in);
	//Create a new movie object
	Movie movie=new Movie();

	String userAnswer;
	do {

            //Prompt the user to enter the title of a movie
            System.out.println("Please enter the movie title.");
            //Read in the line that the user types
            String title = input.nextLine();
            //Set the title in the movie object
            movie.setTitle(title);
            //Prompt the user to enter the movie’s rating
            System.out.println("Please enter the movie rating.");
            //Read in the line that the user types
            String rating = input.nextLine();

            //Set the rating in the movie object
            movie.setRating(rating);

            //Prompt the user to enter the number of tickets sold at a (unnamed) theater
            System.out.println("Please enter the tickets sold at the theater.");
            //Read in the integer that the user types
            int soldTickets = input.nextInt();
            //Set the number of tickets sold in the movie object
            movie.setSoldTickets(soldTickets);
            //Print out the information using the movie’s toString method
            String information = movie.toString();
            System.out.println(information);

            System.out.println("Would you like to enter another?");
            input.nextLine();
            userAnswer= input.nextLine();
        }while (userAnswer.charAt(0)=='Y'|| userAnswer.charAt(0)=='y');



    }
}
