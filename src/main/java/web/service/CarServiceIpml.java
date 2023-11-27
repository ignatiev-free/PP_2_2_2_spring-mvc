package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceIpml {

    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Tesla", 480, 78000));
        cars.add(new Car("Camaro", 570, 82000));
        cars.add(new Car("Mustang", 640, 92000));
        cars.add(new Car("Hellcat", 633, 114000));
        cars.add(new Car("LaFerrari", 730, 485000));
    }

    public static List<Car> getCars(int count) {
        if (count != 0 && count < 5) {
            return cars.subList(0, count);
        } else {
            return cars;
        }
    }
}
