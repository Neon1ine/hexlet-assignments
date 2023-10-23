package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> library, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book : library) {
            boolean isExist = true;
            for (Map.Entry<String, String> searchedBookEntry : where.entrySet()) {
                if (!(searchedBookEntry.getValue().equals(book.get(searchedBookEntry.getKey())))) {
                    isExist = false;
                }
            }
            if (isExist) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
