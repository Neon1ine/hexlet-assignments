package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {

    public static void main(String[] args) {
        List<Home> apartments = new ArrayList<>(List.of(  
            new Flat(41, 3, 10),
            new Cottage(125.5, 2),
            new Flat(80, 10, 2),
            new Cottage(150, 3)
        ));

        List<String> result = buildApartmentsList(apartments, 3);
        System.out.println(result);

    }

    public static List<String> buildApartmentsList(List<Home> apartments, int n) {
        int l = apartments.size();
        for(;n < l; n++) {
            apartments.remove(n);
        }

        return apartments.stream()
        .sorted(Comparator.comparingDouble(Home::getArea))
        .map(home -> home.toString())
        .toList();
    }

}
// END
