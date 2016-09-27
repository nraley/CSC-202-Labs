package LabChapters1And2.OneDotFortyFour;
import java.util.Date;
/**
 * Created by Nelson Raley on 8/31/15.
 */
public class DateArrayLoop {

    Date [] dateArray = new Date[10];

    public DateArrayLoop() {
        for (int i = 0; i < dateArray.length; i++) {
            dateArray[i] = new Date(105, 11, i + 1);
        }
    }

    public void printer() {
        for (Date value : dateArray) {
            System.out.println(value);
        }
    }
}
