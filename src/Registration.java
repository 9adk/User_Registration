import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
	
	public boolean validateInput(String name) {
		String expression = "(^[A-Z]{1})[a-z]{2,}$"; // Pattern for Names
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(name);
		if(match.find()) {
			return true;
		}
		return false;
	}
	public boolean validateEmail(String Email) {		
		String expression = "^[a-z]+[.|+_-]?[a-z0-9]+[@][a-z0-9]{1,}[.][a-z]{2,}[.]{0,1}[a-z]*$"; // Pattern
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(Email);
		if(match.find()) {
			return true;
		}
		return false;
	}
	public boolean validateNumber(String number) {
		String expression = "^[0-9]{2}?[ ][0-9]{4,13}";	// Pattern for Number
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(number);
		if(match.find()) {
			return true;
		}
		return false;
		
	}
	public boolean validatePassword(String pass) {
		String expression = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[$#@!%_&])[A-Za-z0-9$#@!%_&]{8,}$";	//Pattern for Password
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(pass);
		if(match.find()) {
			return true;
		}
		return false;		
		
	}
	public String validateEntry(String fName , String lName, String id, String pass, String phone) {
		boolean firstName = validateInput(fName);
		boolean lastName = validateInput(lName);
		boolean email = validateEmail(id);
		boolean password = validatePassword(pass);
		boolean number = validateNumber(phone);	
		boolean result = firstName && lastName && email && password && number;
		if(result) {
			return "HAPPY";
		}
		else {
			return "SAD";
		}
		
	}
	
	
	
}
