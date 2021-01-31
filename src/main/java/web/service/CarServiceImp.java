package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService{

    @Override
    public List<Car> getCarList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Cadilac", "black", 100));
        carList.add(new Car("Ford", "Blue", 150));
        carList.add(new Car("Pantiac", "Red", 200));
        carList.add(new Car("Chevrolet", "Yellow", 250));
        carList.add(new Car("Jeep", "Green", 300));
        return carList;
    }

    @Override
    public List<Car> listCar(int num) {
        return getCarList().stream().limit(num).collect(Collectors.toList());
    }

}
