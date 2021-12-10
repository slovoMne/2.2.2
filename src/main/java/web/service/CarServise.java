package web.service;

import web.dao.CarDao;
import web.model.Car;

import java.util.List;

public class CarServise {
    private CarDao carsDao = new CarDao();

    public List<Car> getCars(Integer count) {
        List<Car> cars = carsDao.cars();
        int number = count != null && count < cars.size() ? count : cars.size();
        return cars.subList(0, number);
    }
}
