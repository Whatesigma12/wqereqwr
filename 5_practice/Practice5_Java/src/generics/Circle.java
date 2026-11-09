package generics;

/** Circles are compared by radius (and therefore by area). */
public class Circle implements Comparable<Circle> {
    private final double radius;

    public Circle(double radius) {
        if (radius < 0 || Double.isNaN(radius)) {
            throw new IllegalArgumentException("Radius must be nonnegative");
        }
        this.radius = radius;
    }

    public double getRadius() { return radius; }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }

    @Override
    public String toString() { return "Circle(radius=" + radius + ")"; }
}
