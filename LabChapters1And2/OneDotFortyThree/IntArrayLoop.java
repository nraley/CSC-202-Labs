package LabChapters1And2.OneDotFortyThree;

/**
 * Created by Nelson Raley on 8/31/15.
 */
public class IntArrayLoop {

    private int [] squareArray = new int[10];

    public IntArrayLoop() {
        for (int i = 0; i < squareArray.length; i++) {
            squareArray[i] = (i * i);
        }
    }

    public void printer() {
//        for (int i = 0; i < squareArray.length; i++) {
//            System.out.println(squareArray[i]);
//        }

        for (int value : squareArray) {
            System.out.println(value);

        }
    }
}
