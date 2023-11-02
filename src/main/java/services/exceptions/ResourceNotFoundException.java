package services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7209045429499920584L;

	public ResourceNotFoundException(String message, Exception e) {
        super(message);
    }
}
