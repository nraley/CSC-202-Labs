package LabChapter5.FiveDotThirtyNine;

/**
 * Created by nraley on 11/15/15.
 */
public class PrintChar implements Runnable {

    char character;
    int numTimes;

    public PrintChar() {}

    public PrintChar(char character, int numTimes) {
        this.character = character;
        this.numTimes = numTimes;
    }

    public void run() {
        for (int i = 1; i <= numTimes; i++) {
            System.out.println(character);
        }
    }

    public static void main(String[] args) {
        (new Thread(new PrintChar('A', 2000))).start();
        (new Thread(new PrintChar('B', 50))).start();
    }
}

//  When I raise the number of 'A's to 2000 and lower the number of 'B's to 50, I get a pattern
//  Similar to "AAAAAAAAAAABBBBBBBBBAAAAAAAA."  This demonstrates interference.