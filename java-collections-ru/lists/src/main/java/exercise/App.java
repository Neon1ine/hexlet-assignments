package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String symbols, String word) {
        ArrayList<String> symbolsList = new ArrayList<>(Arrays.asList(symbols.toLowerCase().split("")));
        String[] lettersInWord = word.toLowerCase().split("");
        for (String letter : lettersInWord) {
            if (symbolsList.contains(letter)) {
                symbolsList.remove(letter);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
