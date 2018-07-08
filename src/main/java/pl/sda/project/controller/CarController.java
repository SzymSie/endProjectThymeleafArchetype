package pl.sda.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.sda.project.dao.CarDao;
import pl.sda.project.service.CarService;
import pl.sda.project.entity.Car;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarDao carDao;

    @RequestMapping("/cars")
    public String getAllCars(Model model) {

        List<Car> cars = carDao.findAll();
        model.addAttribute("cars", cars);
        return "cars";
    }

//    @RequestMapping("/cars/{id}")
//    public Car getCar(@PathVariable int id) {
//        return carService.getCar(id);
//    }
//
//    @RequestMapping(method= RequestMethod.POST, value="/cars")
//    public Car addCar(@RequestBody Car car) {
//        return carService.addCar(car);
//    }
//
//    @RequestMapping(method= RequestMethod.PUT, value="/cars/{id}")
//    public void updateCar(@RequestBody Car car, @PathVariable int id) {
//        car.setId(id);
//        carService.updateCar(id, car);
//    }
//
//    @RequestMapping(method= RequestMethod.DELETE, value="/cars/{id}")
//    public void deleteCar(@PathVariable int id) {
//        carService.deleteCar(id);
//    }
}
