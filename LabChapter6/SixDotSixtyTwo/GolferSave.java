package LabChapter6.SixDotSixtyTwo;

import LabChapter6.Golfer;

import java.io.*;

/**
 * Created by nraley on 10/18/15.
 */
public class GolferSave {
    public static void main(String[] args) throws IOException {
        Golfer golfer = new Golfer("Donald Trump", 0);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("golfer.dat"));

        out.writeObject(golfer);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("golfer.dat"));

        try {
            golfer = (Golfer)in.readObject();
            System.out.println("The name of the golfer is " + golfer.getName());
            System.out.println("The score of the golfer is " + golfer.getScore());
        } catch (Exception e) {
            System.out.println("Error in readObject: "+ e);
        }
    }
}
