package net.java.ver.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import net.java.ver.model.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Add custom query methods or use default methods provided by JpaRepository
}
