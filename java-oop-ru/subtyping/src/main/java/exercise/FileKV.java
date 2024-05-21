package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class FileKV implements KeyValueStorage {

    private String path;
    private Map<String, String> dictionary;

    public FileKV(String path, Map<String, String> dictionary) {
        this.path = path;
        this.dictionary = dictionary;
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

    public String getPath() {
        return path;
    }
}
// END
