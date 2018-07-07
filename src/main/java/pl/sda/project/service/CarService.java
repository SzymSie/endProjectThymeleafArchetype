package pl.sda.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.project.repository.CarRepository;
import pl.sda.project.entity.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        carRepository.findAll()
                .forEach(cars::add);
        return cars;
    }

    public Car getCar(int id) {
        Optional<Car> car= carRepository.findById(id);
        return car.get();
    }

    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    public void updateCar(int id, Car car) {
        carRepository.save(car);
    }

    public void deleteCar(int id) {
        carRepository.deleteById(id);
    }
}
