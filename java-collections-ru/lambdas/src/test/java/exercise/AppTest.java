package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {
    @Test
    void testEnlargeArrayImage1() {
        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
        String[][] expected = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
        };
        String[][] actual = App.enlargeArrayImage(image);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testEnlargeArrayImage2() {
        String[][] image = {
                {"+", "+", "+", "+", "+"},
                {"+", "-", "-", "-", "+"},
                {"+", "+", "+", "+", "+"},
        };
        String[][] expected = {
                {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
                {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
                {"+", "+", "-", "-", "-", "-", "-", "-", "+", "+"},
                {"+", "+", "-", "-", "-", "-", "-", "-", "+", "+"},
                {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
                {"+", "+", "+", "+", "+", "+", "+", "+", "+", "+"},
        };
        String[][] actual = App.enlargeArrayImage(image);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testNullEnlargeArrayImage() {
        String[][] image = null;
        String[][] expected = null;
        String[][] actual = App.enlargeArrayImage(image);
        assertThat(actual).isEqualTo(expected);
    }
}
// END
