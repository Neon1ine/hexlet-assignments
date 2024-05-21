package exercise;

import java.util.Map;

// BEGIN
public class App {

    public static void swapKeyValue(KeyValueStorage storage) {
        KeyValueStorage initStorage = new InMemoryKV(storage.toMap());

        storage.toMap().keySet().stream()
        .forEach(key -> storage.set(storage.get(key, "null"), key));

        initStorage.toMap().keySet().stream()
        .filter(key -> storage.toMap().containsValue(key) && initStorage.toMap().containsValue(storage.get(key, "null")))
        .forEach(key -> storage.unset(key.toString()));

    }

}
// END
