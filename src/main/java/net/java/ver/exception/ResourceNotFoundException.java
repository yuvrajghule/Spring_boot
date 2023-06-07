package net.java.ver.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value=(HttpStatus.NOT_FOUND))
public class ResourceNotFoundException extends RuntimeException {
	
	private String resourceName;
	private String resourceField;
	private Object resourceValue;
	public ResourceNotFoundException(String resourceName, String resourceField, Object resourceValue) {
		super(String.format("%s not found with %s : '%s'", resourceName, resourceField, resourceValue ));
		this.resourceName = resourceName;
		this.resourceField = resourceField;
		this.resourceValue = resourceValue;
	}
	public String getResourceName() {
		return resourceName;
	}

	public String getResourceField() {
		return resourceField;
	}
	
	public Object getResourceValue() {
		return resourceValue;
	}
	
	
   
}
