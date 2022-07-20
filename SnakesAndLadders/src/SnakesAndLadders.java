/*
Inputs:
- Integer N : number of snakes and ladders in the game
- Next N lines will contain pair of integers  Each pair will describe either a snake or ladder by its start cell and
an end cell. For example, for a snake, start cell will be higher than end cell.
- Following line of input has a single integer D, indicating the number of moves (dice throws) made by both players A and B
- Last line contains D integers, each indicating a dice throw, alternately made by A and B.
First throw is made by player A. Each dice throw is an integer between 1 to 6

 */
public class SnakesAndLadders {
    private String playerName;
    private int[] snakesLaddersPts;
    private int currentPosition;

    public SnakesAndLadders(String playerA, int[] snakesLaddersPts) {
        this.playerName = playerA;
        this.snakesLaddersPts = snakesLaddersPts;
        this.currentPosition = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int returnCurrentPosition(){
        return currentPosition;
    }

    public void updateCurrentPosition(int diceVal){
        System.out.println("\r\rValue of Dice is " + diceVal);
        if((currentPosition + diceVal) <= 100){
            currentPosition += diceVal;
            checkSnakesLadder();
        }
        else{
            System.out.println("\r\rCannot move forward as player needs exactly " + (100 - currentPosition) + " dice value");
        }
    }

    private void checkSnakesLadder(){
        for(int i=0;i<(snakesLaddersPts.length);i+=2){
            if(currentPosition == snakesLaddersPts[i]){
                if(snakesLaddersPts[i]>snakesLaddersPts[i+1]){
                    System.out.println("\r\rPlayer " + playerName + " was bitten by a snake, he came back to position "
                            + snakesLaddersPts[i+1]);
                    currentPosition = snakesLaddersPts[i+1];
                }else{
                    System.out.println("\r\rPlayer " + playerName + " climbed up the ladder, he went up to position " +
                            snakesLaddersPts[i+1]);
                    currentPosition = snakesLaddersPts[i+1];
                }
            }
        }
    }

}
