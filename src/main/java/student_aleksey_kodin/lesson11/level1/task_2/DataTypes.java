package student_aleksey_kodin.lesson11.level1.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
// Элементы списков могут быть абсолютно любых типов в том числе и null.

class DataTypes {
    private final List<Car> cars = new ArrayList<>();
    private final List<Car> carsLinked = new LinkedList<>();

    private final List<Integer> digits = List.of(1, 2, 3, 4, 5, 6);
    private final LinkedList<Integer> digitsLinked = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

    private final List<String> text = List.of("one", "two", "three", "four", "five");
    private final LinkedList<String> textLinked = new LinkedList<>(Arrays.asList("one", "two", "three", "four",
            "five"));

    private void createLists() {
        Car myCar = new Car("Volvo", "S80", 2016, "Diesel");
        cars.add(myCar);
        carsLinked.add(myCar);
    }
}

class Car {
    private String manufacture;
    private String model;
    private int year;
    private String engine;

    Car(String manufacture, String model, int year, String engine) {
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }
}
