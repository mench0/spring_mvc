package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> listCar(int num);
    List<Car> getCarList();
}
