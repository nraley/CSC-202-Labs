package LabChapters1And2.TwoDotTen;

/**
 * Created by Nelson Raley on 8/31/15.
 */
public class Circle implements FigureGeometry {

    protected float radius;
    protected int scale;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float perimeter() {
        // Returns the perimeter of this figure.
        return(2 * PI * radius);
    }

    public float area() {
        // Returns the area of this figure.
        return(PI * radius * radius);
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public float weight() {
        // Precondition: Scale of this figure has been set.
        // Returns weight of this figure. Weight = area X scale.
        return(this.area() * scale);
    }
}
