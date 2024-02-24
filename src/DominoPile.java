import java.util.ArrayList;
import java.util.Random;
public class DominoPile {
    private ArrayList<Domino> pile;
    public DominoPile(){
        pile = new ArrayList();
    }
    public void newStack6(){
        for (int i = 0; i<7;i++){
            for (int j = i; j<7; j++){
                pile.add(new Domino(i,j));
            }
        }
    }
    public ArrayList<Domino> getPile(){
        return pile;
    }

    public void randomSwap(){
        Random random = new Random();
        int min = 0;
        int max = pile.size()-1;
        int randomNumber = random.nextInt(max - min + 1) + min;
        Domino first = pile.get(randomNumber);
        int otherRandom = random.nextInt(max - min + 1) + min;
        pile.set(randomNumber, pile.get(otherRandom));
        pile.set(otherRandom, first);
    }
    public void shuffle(){
        for (int i = 0; i<100; i++){
            randomSwap();
        }
    }

}
