package web.Dao;

import web.Model.Car;

import java.util.List;

public interface CarDao {
    Car addCar(Car car);
    Car getCarByID(int id);
    List<Car> getCars();
    List<Car> getCarsByTotal(int id);
}
