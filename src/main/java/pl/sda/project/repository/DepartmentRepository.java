package pl.sda.project.repository;
import org.springframework.data.repository.CrudRepository;
import pl.sda.project.entity.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {

}
