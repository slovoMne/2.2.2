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
    public String getCarsByTotal(@RequestParam(value = "count",
            required = false) Integer count, Model model) {
        model.addAttribute("garage", carServise.getCarsByTotal(count));
        return "cars";
    }
}