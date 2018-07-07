package pl.sda.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sda.project.service.DepartmentService;
import pl.sda.project.entity.Department;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/departments")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @RequestMapping("/departments/{id}")
    public Department getDepartments(@PathVariable int id) {
        return departmentService.getDepartment(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/departments")
    public Department addDepartment(@RequestBody Department department) {
        return departmentService.addDepartment(department);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/departments/{id}")
    public void updateDepartment(@RequestBody Department department, @PathVariable int id) {
        department.setId(id);
        departmentService.updateDepartment(id, department);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/departments/{id}")
    public void deleteDepartment(@PathVariable int id) {
        departmentService.deleteDepartment(id);
    }
}
