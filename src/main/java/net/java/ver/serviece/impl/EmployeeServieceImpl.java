package net.java.ver.serviece.impl;
import net.java.ver.serviece.EmployeeServiece;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.*;
import net.java.ver.model.Employee;
import net.java.ver.repository.EmployeeRepository;
import java.util.List;


@Service
public class EmployeeServieceImpl implements EmployeeServiece{
	private EmployeeRepository employeeRepository;

	public EmployeeServieceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
	
	
}


















































