package Chapter3Homework;

import LabChapter3.LLNode;
import LabChapter3.ThreeDotFortyTwo.LinkedStackToString;

/**
 * Created by nraley on 9/28/15.
 */
public class PezDispenser extends LinkedStackToString {

    public static final String YELLOW = "yellow";
    public static final String NOTYELLOW = "!yellow";

    public static void main(String[] args) {
        LinkedStackToString<String> pez = new LinkedStackToString<String>();

        pez.push(YELLOW);
        pez.push(NOTYELLOW);
        pez.push(YELLOW);
        pez.push(YELLOW);
        pez.push(NOTYELLOW);
        pez.push(NOTYELLOW);
        pez.push(YELLOW);
        System.out.println(pez);

        LinkedStackToString<String> storageStack = new LinkedStackToString<String>();
        String color;
        while (!pez.isEmpty()) {
            color = pez.popTop();

            if (!YELLOW.equals(color)) {  //store non-yellow pez
                storageStack.push(color);
            }
        }

        while (!storageStack.isEmpty()) {
            color = storageStack.popTop();
            pez.push(color);
        }

        System.out.println(pez);
    }
}