import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.HashMap;
/**
 * A program that mimics ELIZA, a language processing program which returns therapeutic statements
 * Group #10
 * @author 
 * @since
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        welcomePage();
        // local variables
        Int programPhase = 0;
        // take user input as string
        String userInput = scnr.toString().toLowerCase();

        //create dictionary for different feeling types that are associated with numbers 1-10 

                // Dictionary code will be under here for now
            HashMap userFeeling = new HashMap<>();
                userFeeling.put("1","depressed");
                userFeeling.put("2","horrible");
                userFeeling.put("3","bad");
                userFeeling.put("4","iffy");
                userFeeling.put("5","neutral");
                userFeeling.put("6","okay");
                userFeeling.put("7","good");
                userFeeling.put("8","great");
                userFeeling.put("9","fantastic");
                userFeeling.put("10","amazing");

        /**
        * while loop takes in filtered userInput as a lowercase string
        * if userRating is an integer and meets && conditions, prints "Why do you feel ___?" and moves on
        * else it queries for a proper number between 1-10 and scans
        * @param userInput, programPhase
        */
        while(programPhase == 0) {
            
            while(userInput == "goodbye") {
                System.out.println("Thank you for consulting DR.Tropic Thunder!");
                exit();    
            }

            try {
                Int userRating = parseInt(userInput);
                if (userRating == (int)userRating && userRating > 0 && userRating =< 10) {
                    System.out.println("Why do you feel " + userFeeling.get(userRating) + "?");
                    programPhase++;
                } else {
                    System.out.println("Please input a valid numeric descriptor (1-10) for your mood")
                    userInput = scnr.toString().toLowerCase();
                }
            } catch(Exception e) {
                System.out.println("Please input a valid numeric descriptor (1-10) for your mood")
                userInput = scnr.toString().toLowerCase();
                continue;
            }

        }

        while(programPhase == 1) {
            
        }
        
        // template statements for responses to feelings/user inputs
        System.out.println("why do you feel " + userFeeling.get("NUM");
        System.out.println("Why do you think that is?");
        System.out.println("I dont quite understand, can you explain further?");
        System.out.println("Who made you come to me for help?");
        System.out.println("Is there a specific example?");
		System.out.println("What can you do differently?");
        System.out.println("So you are feeling "+ userFeeling + ", is that correct?" );
        System.out.println("So your "+  person + " made you come here?");
		


                
                


        // Exit word is "Goodbye" we can change this as well
            String exitWord = "Goodbye";
            // if user input == "exitWord" end program and run ending print  statements
//have different responses for different feelings, we can start with "why are you feeling ___?"
		// then we can delve into more specific questions, " what happened that made you fell sad?"
		
        

            // possible resones: "Why are you feeling ____?", "How does that make you feel?", "Is there anything else you wanted to talk about?" "What else?"
            //                      "I'm sorry that you feel ______." "Why do you think that is?"


            

	//Check list: Therapist name[Tropic Thunder]     Welcome method[**being worked on**]          Repeating loop until User quits[]
	
    //              words extracted from user input[]                5 or more pre-defined sentences[done]
	
	


        

    }
    public static void welcomePage() {
            System.out.println("Hello my name is Dr. Tropic Thunder, and I will be your therapist today.");
            System.out.println("Today we will be talking about how you feel today.");
            System.out.println("This session will work by me asking a question and you answering it");
            System.out.println("If you ever want to end the session just say 'goodbye', and we will end the session.");
            System.out.println("Let us start. How are you feeling today on a scale of 1-10?:   ");
        }

}
