import java.util.Scanner;
import java.util.HashMap;

/**
 * A program that mimics ELIZA, a language processing program which returns
 * therapeutic statements
 * Group #10
 * 
 * @author Higinio Winston
 * @since October 15, 2022
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        welcomePage();

        // variable to store phases of program execution
        int programPhase = 0;
        String[] loopQuestions = new String[5];
        loopQuestions[0] = "What do you think about what you just said?";
        loopQuestions[1] = "What else?";
        loopQuestions[2] = "How did you arrive at this point?";
        loopQuestions[3] = "How are you feeling now after this discussion?";
        loopQuestions[4] = "What did you want to talk about now?";
        int loopQuestionsIndex = 0;

        // take user input as string
        String userInput = scnr.nextLine().toString().toLowerCase();

        // create Hashmap for different feeling types that are associated with numbers 1-10
        HashMap<Integer, String> userFeeling = new HashMap<Integer, String>();
        userFeeling.put(1,"depressed");
        userFeeling.put(2,"horrible");
        userFeeling.put(3,"bad");
        userFeeling.put(4,"iffy");
        userFeeling.put(5,"neutral");
        userFeeling.put(6,"okay");
        userFeeling.put(7,"good");
        userFeeling.put(8,"great");
        userFeeling.put(9,"fantastic");
        userFeeling.put(10,"amazing");

        // Hashmap that contains responses for specific keywords. 
        HashMap<String, String> responseList = new HashMap<String, String>();
        
        // populate response list hashmap;        
        responseList.put("know","What do you know or not know?");
        responseList.put("problem","What is the problem you're currently experiencing?");
        responseList.put("stressed","What exactly is making you stressed?");
        responseList.put("you","I am here for you, not me. What do you think?");
        responseList.put("late","What led to you being late, was it in your control?");
        responseList.put("sleepy","Have you been getting enough sleep?"); 

        /**
        * while loop takes in filtered userInput as a lowercase string
        * if userRating is an integer and meets && conditions, prints "Why do you feel ___?" and moves on
        * else it queries for a proper number between 1-10 and scans
        * @param userInput, programPhase
        */
        while(programPhase == 0) {
            try {
                exitProgram(userInput);
                int userRating = Integer.parseInt(userInput);
                if (userRating == (int)userRating && userRating > 0 && userRating <= 10) {
                    System.out.println("Why do you feel " + userFeeling.get(userRating) + "?");
                    programPhase++;
                } else {
                    System.out.println("Please input a valid numeric descriptor (1-10) for your mood");
                    userInput = scnr.nextLine().toString().toLowerCase();
                }
            } catch(Exception e) {
                System.out.println("Please input a valid numeric descriptor (1-10) for your mood");
                userInput = scnr.nextLine().toString().toLowerCase();
                continue;
            }
        }
        /**
         * While loop for programPhase == 1 filters the input and takes away punctiation and
         * reduces it to a lowercase string. The words are then split by space and placed in 
         * an array
         * For loop goes through string input array and if a match hits hashmap responseList,
         * a question from that keyword is returned
         * @return stringInputArr[i]
         */
        while(programPhase == 1) {
            boolean status= true;
            while(status == true) {
                try {
                    userInput = scnr.nextLine().replaceAll("\\p{Punct}", "").toLowerCase();
                    exitProgram(userInput);
                    String stringInputArr[] = userInput.split(" ");
                    
                    for (int i=0; i<stringInputArr.length; i++) {
                        if (responseList.containsKey(stringInputArr[i]) == true) {
                            System.out.println(responseList.get(stringInputArr[i]));
                        } else {
                            if (loopQuestionsIndex < 5) {
                                System.out.println(loopQuestions[loopQuestionsIndex]);
                                loopQuestionsIndex++;
                            } else {
                                loopQuestionsIndex = 0;
                                System.out.println(loopQuestions[loopQuestionsIndex]);
                            }
                        }
                        break;
                    }
                } catch(Exception e) {
                    status = false;
                    break;
                }
            }
        }
    }

    /**
     * method welcomePage() presents a menu of strings 
     */
    public static void welcomePage() {
        System.out.println("Hello my name is Dr. Tropic Thunder, and I will be your therapist today.");
        System.out.println("You may leave at any time by typing \"goodbye\"");
        System.out.println("Today we will be talking about how you feel today.");
        System.out.println("This session will work by me asking a question and you answering it");
        System.out.println("If you ever want to end the session just say 'goodbye', and we will end the session.");
        System.out.println("Let us start. How are you feeling today on a scale of 1-10?:");
    }

    /**
     * Takes input Element and if the string equals "goodbye", exits the program
     * @param inputElement
     */
    public static void exitProgram(String inputElement) {
        if (inputElement.equals("goodbye")) {
            System.out.println("Thank you for consulting Dr. Tropic Thunder!");
            System.exit(0);    
        }
    }
}
