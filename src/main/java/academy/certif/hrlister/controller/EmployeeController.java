package academy.certif.hrlister.controller;

import academy.certif.hrlister.domain.Employee;
import academy.certif.hrlister.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import academy.certif.hrlister.repository.EmployeeRepository;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService service;

    EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/employees")
    List<Employee> all() {
        return service.list();
    }

    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee request) {
        return service.persist(request);
    }

    @GetMapping("/employees/{id}")
    Employee one(@PathVariable Long id) {
        return service.find(id);
    }

}
