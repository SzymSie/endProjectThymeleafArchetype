package pl.sda.project.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sda.project.entity.Worker;

public interface WorkerRepository extends CrudRepository<Worker, Integer> {

}
