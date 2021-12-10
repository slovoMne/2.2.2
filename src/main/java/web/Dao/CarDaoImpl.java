package web.Dao;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private final List<Car> garage = new ArrayList<>();

    public CarDaoImpl() {
        garage.add(new Car("Hyundai", "Solaris", 2021));
        garage.add(new Car("Nissan", "Qashqai", 2019));
        garage.add(new Car("Audi", "A6", 2018));
        garage.add(new Car("Lexus", "IS", 2013));
        garage.add(new Car("Porsche", "Cayenne", 2008));
    }

    @Override
    public Car addCar(Car car) {
        garage.add(car);
        return car;
    }

    @Override
    public Car getCarByID(int id) {
        return garage.get(id);
    }

    @Override
    public List<Car> getCars() {
        return garage;
    }

    @Override
    public List<Car> getCarsByTotal(int id) {
        if(id >= 5) {
            return getCars();
        }
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < id; i++) {
            list.add(garage.get(i));
        }
        return list;
    }
}
