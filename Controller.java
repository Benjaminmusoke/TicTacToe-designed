import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


/**
 * Created by Benjamin on 2016-04-11.
 */
public class Controller extends View implements ActionListener {
    private Model model = new Model();
    private int checkWinner;
    private boolean playerTurn = false;
    private int answer;
    Enum returnMethod = new Enum(PlayerScore.O);
    Enum returnMethod2 = new Enum(PlayerScore.X);

    public Controller() {
        for (int x = 0; x < 9; x++) {
            super.button[x].addActionListener(this);
        }
    }

     public void playAgain(){
        answer = JOptionPane.showConfirmDialog(null , "Do you want to play again?", "TIC TAC TOE", JOptionPane.YES_NO_OPTION);
        if(answer == JOptionPane.YES_OPTION){
            model.resetGame();
           super.resetGame();
        }
        else {

                System.exit(0);
        }
    }


    public void actionPerformed(ActionEvent event){
        Object objClicked = event.getSource();

                try {
                    mainEvents(objClicked);
                } catch (Exception e) {
                    for (int k = 0; k < 1; k++) {
                        JOptionPane.showMessageDialog(null, "Error: The chosen place is occupied, choose again please!");
                    }

                }

    }


    public void mainEvents (Object objClicked) throws Exception {
        for (int x = 0; x < 9; x++){
            if (objClicked == super.button[x]) {
                if (super.button[x].getText() != "") {
                    throw new Exception();
                }
                if (playerTurn == false) {
                    onScreenText.setText("It is O's turn to play");
                    super.button[x].setText("X");
                    model.setClick(x, 1);
                    playerTurn = true;

                    checkWinner = model.getResult();
                } else {
                    onScreenText.setText("It is X's turn to play");
                    super.button[x].setText("O");
                    model.setClick(x, 2);
                    playerTurn = false;

                    checkWinner = model.getResult();
                }
                if (checkWinner == 2) {
                    onScreenText.setText("O wins");
                    System.out.println("Points:" + returnMethod2.setPlayerScore(2));
                    playAgain();
                } else if (checkWinner == 1) {
                    onScreenText.setText("X wins");
                    System.out.println("Points:" + returnMethod.setPlayerScore(1));
                    playAgain();
                } else if (checkWinner == 3) {
                    onScreenText.setText("Too bad It's a tie try again!");
                    playAgain();
                }
            }
        }


    }

}
