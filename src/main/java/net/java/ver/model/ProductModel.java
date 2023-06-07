package net.java.ver.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class ProductModel {
    // Entity fields, annotations, constructors, getters, and setters
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long productId;

	    private String imageUrl;
	    private String productName;
	    private String price;
	    private String description;
	    private String quantity;
}
