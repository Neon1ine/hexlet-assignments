package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class InMemoryKV implements KeyValueStorage {

    Map<String, String> dictionary;

    InMemoryKV(Map<String, String> dictionary) {
        this.dictionary = new HashMap<>(dictionary);
    }

    @Override
    public void set(String key, String value) {
        dictionary.put(key, value);
    }

    @Override
    public void unset(String key) {
        dictionary.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        if(dictionary.containsKey(key)) return dictionary.get(key);
        return defaultValue;
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(dictionary);
    }

}
// END
