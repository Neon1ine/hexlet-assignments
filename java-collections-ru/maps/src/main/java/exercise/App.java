package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {

    public static Map getWordCount(String sentence) {
        HashMap<String, Integer> countMap = new HashMap<>();
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (countMap.containsKey(word)) {
                countMap.put(word, countMap.get(word) + 1);
            } else {
                countMap.put(word, 1);
            }
        }
        if (sentence.isEmpty()) {
            countMap.clear();
        }
        return countMap;
    }

    public static String toString(Map map) {
        if (map.isEmpty()) return "{}";
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        map.forEach((key, value) -> sb.append("  ").append(key).append(": ").append(value).append("\n"));
        sb.append("}");
        return String.valueOf(sb);
    }
}
//END
