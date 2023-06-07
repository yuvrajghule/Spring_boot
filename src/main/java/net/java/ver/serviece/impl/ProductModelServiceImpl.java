package net.java.ver.serviece.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import net.java.ver.serviece.ProductModelService;
import net.java.ver.model.Employee;
import net.java.ver.model.ProductModel;
import net.java.ver.repository.ProductModelRepository;



@Service
public class ProductModelServiceImpl implements ProductModelService {
	private ProductModelRepository productModelRepository;

	public ProductModelServiceImpl(ProductModelRepository productModelRepository) {
		super();
		this.productModelRepository = productModelRepository;
	}
	
	@Override
	public ProductModel saveProduct(ProductModel product) {
		return productModelRepository.save(product);
	}
	
	
	@Override
	public List<ProductModel> getAllProduct() {
		return productModelRepository.findAll();
	}

}
