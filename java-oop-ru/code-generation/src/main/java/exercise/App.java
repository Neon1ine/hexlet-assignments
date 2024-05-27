package exercise;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {

    public static void save(Path path, Car car) throws IOException {
        String saveData = car.serialize();
        Files.writeString(path, saveData, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

    public static Car extract(Path path) throws IOException {
        String saveData = Files.readString(path);
        return Car.unserialize(saveData);
    }

}
// END
