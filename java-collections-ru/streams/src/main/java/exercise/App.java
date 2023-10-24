package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static int getCountOfFreeEmails(List<String> emailsList) {
        final String[] safeEmails = {"gmail.com", "yandex.ru", "hotmail.com"};
        return emailsList.stream()
                .filter(email -> email.endsWith(safeEmails[0])
                        || email.endsWith(safeEmails[1])
                        || email.endsWith(safeEmails[2]))
                .mapToInt(email -> 1)
                .sum();
    }
}
// END
