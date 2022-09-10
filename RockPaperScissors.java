import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("Are you ready? Write 'yes' if you are.");

    //asking if user want to play.
        String answer = scan.nextLine();
        
    /*
    - pick up user's choice.
    - get the computer choice
    - get the result
    */
              
        if(answer.equals("yes")){
            System.out.println("\nGreat!");
            System.out.println("rock - paper - scissors!");
            System.out.println("\nPlease write your choice: 'rock', 'paper' or 'scissors'");
            String userChoice = scan.nextLine();
            String computerChoice = computerChoice();
            String resultMessage = result(userChoice, computerChoice);
            printResult(userChoice, computerChoice, resultMessage);
        }else{
            System.out.println("Darn, some other time...!");
        }

        scan.close();
    }


    // func computer picks a choice, randomly between rock paper and scissors.

    public static String computerChoice(){
        double num = Math.random() * 3;
        if((int)num == 0){
            return "rock";
        }else if((int)num == 1){
            return "paper";
        }else{
            return "scissors";
        }
    }


    //func that compares the choices and returns the result

    public static String result(String yourChoice, String computerChoice) {
        if((yourChoice.equals("rock") && computerChoice.equals("scissors")) || (yourChoice.equals("paper") && computerChoice.equals("rock")) || ((yourChoice.equals("scissors") && computerChoice.equals("paper")))){
            return "You win :)";
        }else if((yourChoice.equals("scissors") && computerChoice.equals("rock")) || (yourChoice.equals("rock") && computerChoice.equals("paper")) || ((yourChoice.equals("paper") && computerChoice.equals("scissors")))){
            return "You lose :(";
        }else{
            return "Your choice equals computer choice";
        }
      }
 
     //func that prints choices and result

    public static void printResult(String yourChoice, String computerChoice, String result){
        System.out.println("\nYou chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println("\n" + result);
    }

}
