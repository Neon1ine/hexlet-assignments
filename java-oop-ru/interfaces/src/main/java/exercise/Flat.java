package exercise;

// BEGIN
public class Flat implements Home {

    private double area;
    private double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.balconyArea = balconyArea;
        this.area = area + balconyArea;
        this.floor = floor;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Квартира площадью ");
        output.append(area);
        output.append(" метров на ");
        output.append(floor);
        output.append(" этаже");
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
