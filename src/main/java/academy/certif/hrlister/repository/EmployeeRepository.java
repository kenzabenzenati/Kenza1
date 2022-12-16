package academy.certif.hrlister.repository;

import academy.certif.hrlister.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
