import java.util.Observable;

/**
 * Created by Benjamin on 2016-04-11.
 */
public class Model extends Observable {

    protected int array[] = new int[9];
    private int totalClicks = 9;
    protected int array1[] = new int[9];

    public int setClick(int position, int characters){
        array[position] = characters;

    return array1[array[position] = characters];
    }

    public void resetGame(){
        totalClicks = 9;
        for (int q = 0; q < 9; q++){
            array[q] = 0;
        }
    }

    public int getResult(){
        totalClicks--;
        // Horizontal Test
        // Om resultatet blir 1 då vinner spelare X och om resultatet är 2 då vinner spelare O
        if(array[0] == 1 && array[1] == 1 && array[2] == 1) {
            return 1;
        }
        if(array[0] == 2 && array[1] == 2 && array[2] == 2) {
            return 2;
        }
        if(array[3] == 1 && array[4] == 1 && array[5] == 1) {
            return 1;
        }
        if(array[3] == 2 && array[4] == 2 && array[5] == 2) {
            return 2;
        }
        if(array[6] == 1 && array[7] == 1 && array[8] == 1) {
            return 1;
        }
        if (array[6] == 2 && array[7] == 2 && array[8] == 2) {
            return 2;
        }


        // Vertical Test
        if(array[0] == 1 && array[3] == 1 && array[6] == 1) {
            return 1;
        }
        if(array[0] == 2 && array[3] == 2 && array[6] == 2) {
            return 2;
        }
        if(array[1] == 1 && array[4] == 1 && array[7] == 1) {
            return 1;
        }
        if(array[1] == 2 && array[4] == 2 && array[7] == 2) {
            return 2;
        }
        if(array[2] == 1 && array[5] == 1 && array[8] == 1) {
            return 1;
        }
        if(array[2] == 2 && array[5] == 2 && array[8] == 2) {
            return 2;
        }

        // Diagonal Test
        if(array[0] == 1 && array[4] == 1 && array[8] == 1) {
            return 1;
        }
        if(array[0] == 2 && array[4] == 2 && array[8] == 2) {
            return 2;
        }
        if(array[2] == 1 && array[4] == 1 && array[6] == 1) {
            return 1;
        }
        if(array[2] == 2 && array[4] == 2 && array[6] == 2) {
            return 2;
        }

        if (totalClicks == 0) {
            return 3;
        }
        notifyObservers();
        setChanged();

            return 0;

    }

    public void notifyObservers(){
        super.notifyObservers();
    }

    protected synchronized void setChanged(){
        super.setChanged();
    }
}
