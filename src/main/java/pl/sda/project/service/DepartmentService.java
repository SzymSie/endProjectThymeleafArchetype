package pl.sda.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.project.repository.DepartmentRepository;
import pl.sda.project.entity.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments() {
        List<Department> departments = new ArrayList<>();
        departmentRepository.findAll()
                .forEach(departments::add);
        return departments;
    }

    public Department getDepartment(int id) {
        Optional<Department> department = departmentRepository.findById(id);
        return department.get();
    }

    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public void updateDepartment(int id, Department department) {
        departmentRepository.save(department);
    }

    public void deleteDepartment(int id) {
        departmentRepository.deleteById(id);
    }
}
