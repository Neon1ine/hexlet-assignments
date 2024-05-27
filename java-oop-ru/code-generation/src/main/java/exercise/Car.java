package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

// BEGIN
@Getter
@AllArgsConstructor
@ToString
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String jsonRepresentation = mapper.writeValueAsString(this);
        System.out.println(jsonRepresentation);
        return jsonRepresentation;
    }

    public static Car unserialize(String jsonRepresentation) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Car car = mapper.readValue(jsonRepresentation, Car.class);
        return car;
    }
    // END
}
