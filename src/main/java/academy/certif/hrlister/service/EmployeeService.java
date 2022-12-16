package academy.certif.hrlister.service;

import academy.certif.hrlister.domain.Employee;
import academy.certif.hrlister.exception.EmployeeNotFoundException;
import academy.certif.hrlister.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;
    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> list() {
        return repository.findAll();
    }

    public Employee persist(Employee employee) {
        return repository.save(employee);
    }

    public Employee find(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

}
