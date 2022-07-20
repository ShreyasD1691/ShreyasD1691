import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int noOfSnakesLadders = 0;
        int roundCount = 1;
        int arrLen;
        System.out.println("Enter number of Snakes and Ladders in the game:");
        noOfSnakesLadders = validateInput();

        arrLen = noOfSnakesLadders + noOfSnakesLadders;

        int[] snakesLaddersPts = new int[arrLen];
        for (int i = 0; i <= (arrLen - 1); i += 2) {
            System.out.println("Snake or Ladder start and end cell number:");
            snakesLaddersPts[i] = validateInput();
            snakesLaddersPts[i + 1] = validateInput();
        }

        SnakesAndLadders player1 = new SnakesAndLadders("Tom",snakesLaddersPts);
        SnakesAndLadders player2 = new SnakesAndLadders("Jerry",snakesLaddersPts);

        System.out.println("Initial Position of " + player1.getPlayerName() + " is " + player1.returnCurrentPosition());
        System.out.println("Initial Position of " + player2.getPlayerName() + " is " + player2.returnCurrentPosition());

        while(true){
            System.out.println("Round #" + roundCount);
            player1.updateCurrentPosition((int)(Math.random()*6)+1);
            System.out.println("\r\r Current Position of " + player1.getPlayerName() + " is " + player1.returnCurrentPosition());
            if(player1.returnCurrentPosition() >= 100){
                System.out.println(player1.getPlayerName() + " wins!!!");
                break;
            }
            player2.updateCurrentPosition((int)(Math.random()*6)+1);
            System.out.println("\r\r Current Position of " + player2.getPlayerName() + " is " + player2.returnCurrentPosition());
            if(player2.returnCurrentPosition() >= 100){
                System.out.println(player2.getPlayerName() + " wins!!!");
                break;
            }
            roundCount++;
        }
        scanner.close();
    }

    private static int validateInput(){
        int inputVal = 0;
        while(true) {
            if(scanner.hasNextInt()) {
                inputVal = scanner.nextInt();
                break;
            }
            System.out.println("invalid entry, Please enter a valid Integer");
            scanner.nextLine();
        }
        return inputVal;
    }
}