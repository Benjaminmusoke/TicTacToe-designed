/**
 * Created by Benjamin on 2016-05-27.
 */
public class Enum {
    PlayerScore total;
    public int playerScores = 1;
    public int getPlayerScores = 1;

    Enum(PlayerScore total) {
        this.total = total;
    }
    public int setPlayerScore(int checkWinner) {

        switch (total) {
            case X:
                boolean probability = true;

                do {

                    if (checkWinner == 1) {


                        playerScores++;
                        getPlayerScores = getPlayerScores + playerScores;

                        System.out.println("Points for player X is " +  getPlayerScores);
                    }
                    else if (checkWinner == 2) {

                        playerScores++;
                        getPlayerScores = getPlayerScores + playerScores;

                        System.out.println("Points for player O is  " +  getPlayerScores);

                    }




                }while (!probability);
                break;


            case O:


                if (checkWinner == 2) {

                    playerScores += playerScores++;

                    getPlayerScores = getPlayerScores + playerScores;
                    System.out.println(" Points for player O is " + playerScores);
                }
                else if (checkWinner == 1) {


                    playerScores++;
                    getPlayerScores = getPlayerScores + playerScores;

                    System.out.println("Points for player X is " +  getPlayerScores);
                }

                break;
            default:
                System.exit(0);
                break;

        }

        return getPlayerScores;

    }

}
enum PlayerScore{O, X}
