package exercise;

import java.util.*;

// BEGIN
class App {

    private static final String CHANGED = "changed";
    private static final String UNCHANGED = "unchanged";
    private static final String DELETED = "deleted";
    private static final String ADDED = "added";

    public static LinkedHashMap<String, Object> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Map<String, Object> result = new HashMap<>();
        for (Map.Entry<String, Object> data1Entry: data1.entrySet()) {
            if (data2.containsKey(data1Entry.getKey())) {
                Object data2Obj = data2.get(data1Entry.getKey());
                if (data1Entry.getValue().equals(data2Obj)) {
                    result.put(data1Entry.getKey(), UNCHANGED);
                } else {
                    result.put(data1Entry.getKey(), CHANGED);
                }
            } else {
                result.put(data1Entry.getKey(), DELETED);
            }
        }

        for (Map.Entry<String, Object> entry: data2.entrySet()) {
            if (!data1.containsKey(entry.getKey())) {
                result.put(entry.getKey(), ADDED);
            }
        }

        LinkedHashMap<String, Object> sortedMap = new LinkedHashMap<>(result.size());
        List<Map.Entry<String, Object>> entries = new ArrayList<>(result.entrySet());
        entries.sort((o1, o2) -> o1.getKey().compareTo(o2.getKey()));

        for (Map.Entry<String, Object> entry: entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
//END
