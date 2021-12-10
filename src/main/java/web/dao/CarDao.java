package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    Car addCar(Car car);
    Car getCarByID(int id);
    List<Car> getCars();
    List<Car> getCarsByTotal(int id);

    List<Car> cars();
}
