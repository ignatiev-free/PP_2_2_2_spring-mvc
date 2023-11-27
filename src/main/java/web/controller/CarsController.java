package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceIpml;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private CarServiceIpml carService;

    @GetMapping(value = "/cars")
    public String printCar(ModelMap model, @RequestParam(defaultValue = "0")int count) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }

}