package utils.validation;

public final class ValidationProvider {
	
	private static final ValidationProvider instance = new ValidationProvider();
	
	private ValidationProvider() {};
	
	private final IUserDataValidation userDataValidation = new UserDataValidation();
	
	public IUserDataValidation getUserDataValidation() {
		return userDataValidation;
	}
	
	public static ValidationProvider getInstance() {
		return instance;
	}

}
