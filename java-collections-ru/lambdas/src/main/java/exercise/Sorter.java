package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .filter(man -> man.get("gender").equals("male"))
                .map(man -> man.get("name") + " " + man.get("birthday"))
                .sorted(Comparator.comparing(man -> LocalDate.parse(man.substring(man.length() - 10))))
                .map(man -> man.substring(0, man.length() - 11))
                .toList();
    }
}
// END
