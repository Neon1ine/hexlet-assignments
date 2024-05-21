package exercise;

// BEGIN
public class Cottage implements Home {

    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(floorCount);
        output.append(" этажный коттедж площадью ");
        output.append(area);
        output.append(" метров");
        return output.toString();
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Home home) {
        double areaDiff = area - home.getArea();
        if (areaDiff > 0) return 1;
        if (areaDiff < 0) return -1;
        return 0;
    }

}
// END
