import java.util.Scanner;

public class MatchMaker {

    static final int DESIRED_ONE =5; 
    static final int DESIRED_TWO =4;
    static final int DESIRED_THREE =3;
    static final int DESIRED_FOUR =2;
    static final int DESIRED_FIVE =1;
    
    static final int WEIGHT_ONE = 3 ;
    static final int WEIGHT_TWO = 2 ;
    static final int WEIGHT_THREE = 1 ;
    static final int WEIGHT_FOUR = 3 ;
    static final int WEIGHT_FIVE = 2;
       
    static final  int TRUE_LOVE = 85;
    static final int FRIENDS = 75;

    public static void main (String[] args) throws Exception  {

    	System.out.println();
    	System.out.println();
        System.out.
        println
            ("WELCOME TO MARRIEGE BUREAU!!!\nHello my future love,  may be my future friend or my nothing! Don't panic buddy!\n This program fugures out if you " +
                "and I are meant to be.\nTo each question, answer 5\n" +
                "if you strongly agree, 4 if you agree, 3 if you neither\n" +
                "agree nor disagree, 2 if you disagree, and 1 if you\n" +
                "strongly disagree.");

        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
        validate(num1, num2, num3, num4, num5);
    }

    public static void validate(int input1, int input2, int input3, int input4,
        int input5)  throws Exception{

        Scanner scan = new Scanner(System.in);
        try {
        	
        	System.out.println();
            System.out.print("There is nothing PEANUT BUTTER spoon can't fix: ");
            input1 = scan.nextInt();
            while (input1 > 5 || input1 < 1) {
                System.out.println();
                System.out.println("Sorry! Please enter a number between 1 to 5: ");
                System.out.print("There is nothing PEANUT BUTTER spoon can't fix: ");
                input1 = scan.nextInt();
            }

            System.out.println();
            System.out.print("Going to gym on weekends and holidays is fun ");
            input2 = scan.nextInt();

            while (input2 > 5 || input2 < 1) {
                System.out.print("Sorry! Please enter a number between 1 to 5: ");
                System.out.println();
                System.out.print("Going to gym on weekends and holidays is fun ");
                input2 = scan.nextInt();
            }

            System.out.println();
            System.out.print("Cooking home at home is better than eating out ");
            input3 = scan.nextInt();

            while (input3 > 5 || input3 < 1) {
                System.out.print("Sorry! Please enter a number between 1 to 5: ");
                System.out.println();
                System.out.print("Cooking home at home is better than eating out  ");
                input3 = scan.nextInt();
            }

            System.out.println();
            System.out.print("Black coffee makes me awesome: ");
            input4 = scan.nextInt();

            while (input4 > 5 || input4 < 1) {
                System.out.print("Sorry! Please enter a number between 1 to 5: ");
                System.out.println();
                System.out.print("Black coffee makes me awesome: ");
                input4 = scan.nextInt();

            }

            System.out.println();
            System.out.print("I love going on adventures: ");
            input5 = scan.nextInt();

            while(input5 > 5 || input5 < 1) {
                System.out.print("Sorry! Please enter a number between 1 to 5: ");
                System.out.println();
                System.out.print("I love going on adventures: ");
                input5 = scan.nextInt();

            }
        } catch (Exception e) {
            System.out.print("oopsss!!!! Invalid input!");
            validate(input1, input2, input3, input4, input5);

        }
        
        int score1 = Math.abs (input1 - DESIRED_ONE);
        int score2 = Math.abs (input2 - DESIRED_TWO);
        int score3 = Math.abs (input3 - DESIRED_THREE);
        int score4 = Math.abs (input4 - DESIRED_FOUR);
        int score5 = Math.abs (input5 - DESIRED_FIVE);



        int weightedScoreOne = score1 * WEIGHT_ONE;
        int weightedScoreTwo = score2 * WEIGHT_TWO;
        int weightedScoreThree = score3 * WEIGHT_THREE;
        int weightedScoreFour = score4 * WEIGHT_FOUR;
        int weightedScoreFive = score5 * WEIGHT_FIVE;


        float addedScore =
          (weightedScoreOne + weightedScoreTwo + weightedScoreThree +
           weightedScoreFour + weightedScoreFive);

        float finalScore = 100 - (addedScore / 100 * 100);
        System.out.println ();

        if (finalScore >= TRUE_LOVE){
        	System.out.println ("You are the peanut butter to my jelly!! You scored: " + finalScore + "\nPlease fill out required documents because you have found your match!!");

        }
    	else if (finalScore >= FRIENDS && finalScore <= TRUE_LOVE) {
    	  System.out.println("hmmmm!!! I love to add names in my friendlist.. you scored... not bad: "+ finalScore);

    	}
    	else if (finalScore <= FRIENDS){
    	  System.out.println  ("Relationship Status: Peanut Butter: very loyal and always makes me happy! You scored:"
    	     + finalScore);
          }
        
      }
             
            
    }
