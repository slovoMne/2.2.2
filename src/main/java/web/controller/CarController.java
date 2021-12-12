package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServise;

import java.util.List;


@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarServise carServise;

    @GetMapping("")
    public String getCarsByTotal(@RequestParam(defaultValue = "5", value = "count",
            required = false) Integer count, Model model) {
        List<Car> cars = carServise.getCarsByTotal(count));
        model.addAttribute("garage", cars);
        return "cars";
    }
}