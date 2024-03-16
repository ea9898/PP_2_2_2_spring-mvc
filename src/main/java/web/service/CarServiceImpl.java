package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("car1", 1, "red"));
        cars.add(new Car("car2", 2, "blue"));
        cars.add(new Car("car3", 3, "black"));
        cars.add(new Car("car4", 4, "white"));
        cars.add(new Car("car5", 5, "green"));

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
