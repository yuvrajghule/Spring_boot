package net.java.ver.controller;
import net.java.ver.serviece.EmployeeServiece;
import net.java.ver.model.Employee;
import net.java.ver.model.ProductModel;
import net.java.ver.serviece.ProductModelService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import net.java.ver.serviece.impl.EmployeeServieceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
//@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeServiece employeeServiece ;
    private ProductModelService productModelService;

    public EmployeeController(EmployeeServiece employeeServiece, ProductModelService productModelService) {
		super();
		this.employeeServiece = employeeServiece;
		this.productModelService = productModelService;
	}


	@PostMapping("/api/signup")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
//		Employee createdResource = Employee.saveEmployee(employee);
        return new ResponseEntity<Employee>(employeeServiece.saveEmployee(employee), HttpStatus.CREATED);
    }
	
	
	
	@GetMapping("/api/getcred")
    // Other methods for handling different HTTP methods and operations
	public List<Employee> getAllEmployee() {
		return employeeServiece.getAllEmployee();
	}
	
	
	@PostMapping("/api/addproduct")
    public ResponseEntity<ProductModel> saveProduct(@RequestBody ProductModel product) {
//		Employee createdResource = Employee.saveEmployee(employee);
        return new ResponseEntity<ProductModel>(productModelService.saveProduct(product), HttpStatus.CREATED);
    }
	
	
	@GetMapping("/api/getproduct")
    // Other methods for handling different HTTP methods and operations
	public List<ProductModel> getAllProduct() {
		return productModelService.getAllProduct();
	}

}










































