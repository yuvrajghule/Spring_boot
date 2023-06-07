package net.java.ver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.java.ver.model.ProductModel;

public interface ProductModelRepository extends JpaRepository<ProductModel, Long> {
    // Add custom query methods or use default methods provided by JpaRepository
}