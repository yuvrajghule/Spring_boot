package net.java.ver.serviece;

import java.util.List;


import net.java.ver.model.ProductModel;

public interface ProductModelService{
    // Add custom query methods or use default methods provided by JpaRepository
	ProductModel saveProduct(ProductModel product);
	List<ProductModel> getAllProduct();
}
