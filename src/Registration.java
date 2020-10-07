import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
	
	public boolean validateInput(String name) throws RegistrationException {
		String expression = "(^[A-Z]{1})[a-z]{2,}$"; // Pattern for Name
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(name);
		boolean result = false;
		if(match.find()) {
		    result = true;
		    return result;
		}
		if(result == false) {
		    throw new RegistrationException("Enter valid name");
		}
		return result;	
	}
	public boolean validateEmail(String Email) throws RegistrationException {		
		String expression = "^[a-zA-Z0-9_]+[-+.]?[A-Za-z0-9_]+@[A-Za-z0-9]+[.][a-z]{2,}[.]?([a-z]{2,})?$"; // Pattern for Email
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(Email);
		boolean result = false;
		if(match.find()) {
		    result = true;
		    return result;
		}
		if(result == false) {
		    throw new RegistrationException("Enter valid email");
		}
		return result;	
	}
	public boolean validateNumber(String number) throws RegistrationException {
		String expression = "^[0-9]{2}?[ ][0-9]{4,13}";	// Pattern for Number
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(number);
		boolean result = false;
		if(match.find()) {
		    result = true;
		    return result;
		}
		if(result == false) {
		    throw new RegistrationException("Enter valid number");
		}
		return result;	
		
	}
	public boolean validatePassword(String pass) throws RegistrationException {
		String expression = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[$#@!%_&])[A-Za-z0-9$#@!%_&]{8,}$";	//Pattern for Password
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(pass);
		boolean result = false;
		if(match.find()) {
		    result = true;
		    return result;
		}
		if(result == false) {
		    throw new RegistrationException("Enter valid name");
		}
		return result;		
		
	}
	ValidateInput validateInput = (String input, String regex)->{
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(input);
		if(match.find()) {
			return true;
		}
		else
			return false;
	};	
}
