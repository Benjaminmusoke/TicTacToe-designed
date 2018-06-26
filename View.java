
import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * Created by Benjamin on 2016-04-11.
 */
public class View extends JFrame implements Observer  {
    private static View firstInstance = null;
    JButton newButton;
    JPanel buttonPanel;

    protected JLabel label;
    protected JLabel onScreenText;
    protected JLabel title;
    protected JButton[]button;
    protected GridLayout grid;
    JPanel centerPanel = new JPanel();
    JPanel screenText = new JPanel();


    protected View(){
        super("TIC TAC TOE GAME");
        button = new JButton[9];

        label = new JLabel("");
        title = new JLabel("TIC TAC TOE");
        screenText = new JPanel();

        grid = new GridLayout(3,0);
        centerPanel.setLayout(grid);
        onScreenText = new JLabel("X goes first!");

        button = new JButton[9];

        grid = new GridLayout(3,3);
        centerPanel.setLayout(grid);
       // setLayout(null);
        onScreenText.setBounds(300,10,150,60);
        screenText.setBounds(150,200,1000,1000);
        screenText.add(onScreenText);
        add("North", screenText);
        onScreenText.setVisible(true);



        for (int check = 0; check < 9; check++){
            button[check] = new JButton();
            button[check].setFont(new Font("",Font.CENTER_BASELINE,160));
            button[check].setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY.brighter()));
            button[check].setBackground(new Color(201, 201, 85));
            centerPanel.add(button[check]);
            add("Center",centerPanel);
            button[check].setVisible(true);

        }



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setSize(800,600);
        setVisible(true);
    }


    public void resetGame() {
        for (int q = 0; q < 9; q++){
            button[q].setText("");

        }
    }



    // Singleton Pattern
    public static View getInstance(){
        if(firstInstance == null){
            firstInstance = new View();
        }
        return firstInstance;
    }


    @Override
    public void update(Observable o, Object arg) {
        JLabel model=new JLabel("Model observation 12b345e");
        JOptionPane.showMessageDialog(model, "Update number 5567c" + arg.getClass()+ o.getClass());
    }
}


