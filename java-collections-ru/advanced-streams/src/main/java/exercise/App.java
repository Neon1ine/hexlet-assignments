package exercise;

import java.util.List;

// BEGIN
class App {
    private static final String lineStart = "environment";
    private static final String lineForwarded = "X_FORWARDED_";

    public static String getForwardedVariables(String config) {
        List<String> lines = List.of(config.split("\n"));
        StringBuilder result = new StringBuilder();
        List<String> vars = lines.stream()
                .filter(line -> line.contains(lineForwarded) && line.contains(lineStart))
                .map(App::findVars)
                .toList();

        for (String variable: vars) {
            result.append(variable);
            if (!(vars.get(vars.size() - 1).equals(variable))) {
                result.append(",");
            }
        }
        return result.toString();
    }

    private static String findVars(String line) {
        int startInd = line.indexOf(lineForwarded) + lineForwarded.length();
        String newLine = line.substring(startInd);
        final String QUOTATION = "\"";
        final String COMMA = ",";
        int point = newLine.length();
        if (newLine.contains(QUOTATION)) point = newLine.indexOf(QUOTATION);
        if (newLine.contains(COMMA) && point > newLine.indexOf(COMMA)) point = newLine.indexOf(COMMA);

        StringBuilder result = new StringBuilder();
        result.append(line, line.indexOf(lineForwarded) + lineForwarded.length(), point + startInd);

        if (newLine.contains(lineForwarded)) {
            result.append(",").append(findVars(newLine));
        }
        return result.toString();
    }
}
//END
