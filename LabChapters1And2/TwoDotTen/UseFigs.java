package LabChapters1And2.TwoDotTen;

/**
 * Created by Nelson Raley on 9/13/15.
 */
public class UseFigs {

    public static void main(String[] args) {
        Circle myCircle = new Circle(5);
        System.out.println(myCircle.perimeter());
        System.out.println(myCircle.area());

        Rectangle myRectangle = new Rectangle(7, 8);
        System.out.println(myRectangle.perimeter());
        System.out.println(myRectangle.area());
    }
}
