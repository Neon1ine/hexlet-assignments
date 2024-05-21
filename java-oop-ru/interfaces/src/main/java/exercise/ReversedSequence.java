package exercise;

// BEGIN
public class ReversedSequence implements CharSequence{

    private String text;
    private int length;

    ReversedSequence(String text) {
        this.text = reverse(text);
        this.length = text.length();
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public char charAt(int index) {
        return text.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return text.subSequence(start, end );
    }

    @Override
    public String toString() {
        return text;
    }

    private String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

}
// END
