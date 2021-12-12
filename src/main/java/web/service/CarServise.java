package web.service;

import web.dao.CarDao;
import web.model.Car;

import java.util.List;

public interface CarServise {

    List<Car> getCars();

    List<Car> getCarsByTotal(int value);
}
