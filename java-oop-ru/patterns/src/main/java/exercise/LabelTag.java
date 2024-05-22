package exercise;

// BEGIN
public class LabelTag implements TagInterface {

    private String label;
    private TagInterface tag;


    public LabelTag(String label, TagInterface tag) {
        this.label = label;
        this.tag = tag;
    }

    public String render() {
        StringBuilder result = new StringBuilder();
        result.append("<label>");
        result.append(label);
        result.append(tag.render());
        result.append("</label>");
        return result.toString();
    }

}
// END
