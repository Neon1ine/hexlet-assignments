package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {

    private String nameTag;
    private Map<String, String> attributes;

    public SingleTag(String nameTag, Map<String, String> attributes) {
        this.nameTag = nameTag;
        this.attributes = attributes;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("<");
        result.append(nameTag);
        result.append(">");

        attributes.keySet().stream()
        .forEach(key -> {
            result.deleteCharAt(result.length()- 1);
            result.append(" ");
            result.append(key);
            result.append("=\"");
            result.append(attributes.get(key));
            result.append("\">");
        });

        return result.toString();
    }
}
// END
