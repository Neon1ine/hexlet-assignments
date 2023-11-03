package exercise;

// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        if (image == null) {
            return null;
        }
        String[][] result = new String[image.length * 2][image[0].length * 2];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                //(3, 3) -> (5, 5) (5, 6) (6, 5) (6, 6)
                String frame = image[i][j];
                result[i * 2][j * 2] = frame;
                result[i * 2 + 1][j * 2] = frame;
                result[i * 2][j * 2 + 1] = frame;
                result[i * 2 + 1][j * 2 + 1] = frame;
            }
        }
        return result;
    }
}
// END
