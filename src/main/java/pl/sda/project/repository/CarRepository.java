package pl.sda.project.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sda.project.entity.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {

}
