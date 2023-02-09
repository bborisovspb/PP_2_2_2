package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Lada", "Vesta", 123456));
        cars.add(new Car("Mercedes", "Benz", 654357));
        cars.add(new Car("Renault", "Megane", 299000));
        cars.add(new Car("Volkswagen", "Polo", 768999));
        cars.add(new Car("Toyota", "Prius", 133000));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count > cars.size() || count < 0) {
            return cars;
        } else {
            return cars.stream().limit(count).toList();
        }
    }
}
