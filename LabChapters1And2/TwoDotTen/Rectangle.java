package LabChapters1And2.TwoDotTen;

/**
 * Created by Nelson Raley on 8/31/15.
 */
public class Rectangle implements FigureGeometry {

    protected float length;
    protected float width;
    protected int scale;


    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public float perimeter() {
        return (2 * (length + width));
    }

    @Override
    public float area() {
        return (length * width);
    }

    @Override
    public void setScale(int scale) {
        this.scale = scale;
    }

    @Override
    public float weight() {
        // Precondition: Scale of this figure has been set.
        return(this.area() * scale);
    }
}
