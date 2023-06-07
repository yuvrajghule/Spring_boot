package net.java.ver.serviece;
import net.java.ver.model.Employee;
import net.java.ver.model.ProductModel;
import java.util.List;

public interface EmployeeServiece {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	
}

