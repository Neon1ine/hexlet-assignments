package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {

    private String nameTag;
    private SingleTag firstTag;
    private String body;
    private List<Tag> children;

    public PairedTag(String nameTag, Map<String, String> attributes, String body, List<Tag> children) {
        this.nameTag = nameTag;
        this.firstTag = new SingleTag(nameTag, attributes);
        this.body = body;
        this.children = children;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.firstTag.toString());
        result.append(this.body);
        this.children.stream()
        .forEach(singleTagEntry -> result.append(singleTagEntry.toString()));
        result.append("</");
        result.append(this.nameTag);
        result.append(">");
        return result.toString();
    }
}
// END
