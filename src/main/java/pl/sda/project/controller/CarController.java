package pl.sda.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sda.project.service.CarService;
import pl.sda.project.entity.Car;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping("/cars")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @RequestMapping("/cars/{id}")
    public Car getCar(@PathVariable int id) {
        return carService.getCar(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/cars")
    public Car addCar(@RequestBody Car car) {
        return carService.addCar(car);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/cars/{id}")
    public void updateCar(@RequestBody Car car, @PathVariable int id) {
        car.setId(id);
        carService.updateCar(id, car);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/cars/{id}")
    public void deleteCar(@PathVariable int id) {
        carService.deleteCar(id);
    }
}
