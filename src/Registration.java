import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Registration user = new Registration();
		
		System.out.println("Enter the first name");
		String firstName = sc.nextLine();
		System.out.println("Enter the last name");
		String lastName = sc.nextLine();
		
		System.out.println("Enter the Email Id");
		String Email = sc.nextLine();
		System.out.println("Enter the Phone Number");
		String Phone = sc.nextLine();
		System.out.println("Enter the Password");
		String Password = sc.nextLine();
			
		System.out.println(firstName + " is " +user.validateInput(firstName)); //Validating firstName
		System.out.println(lastName + " is " +user.validateInput(lastName)); //Validating lastName
		System.out.println(Email + " is " +user.validateEmail(Email));	// Validating Email
		System.out.println(Phone+ " is " +user.validateNumber(Phone));	// Validating Number
		System.out.println(Password+ " is " +user.validatePassword(Password));
			
		user.verifyEmail();
	}
	private String validateInput(String name) {
		String expression = "(^[A-Z]{1})[a-z]{2,}$"; // Pattern for Names
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(name);
		if(match.find()) {
			return "valid";
		}
		return "invalid";
	}
	private void verifyEmail() {
		System.out.println("abc@gmail.com" + " is " +validateEmail("abc@gmail.com"));
		System.out.println("abc-100@yahoo.com" + " is " +validateEmail("abc-100@yahoo.com"));
		System.out.println("abc.100@yahoo.com" + " is " +validateEmail("abc.100@yahoo.com"));
		System.out.println("abc-100@abc.net" + " is " +validateEmail("abc-100@abc.net"));
		System.out.println("abc.100@abc.com.au" + " is " +validateEmail("abc.100@abc.com.au"));
		System.out.println("abc@gmail.com.com" + " is " +validateEmail("abc@gmail.com.com"));
		System.out.println("abc@.com.my" + " is " +validateEmail("abc@.com.my"));
		System.out.println("abc123@gmail.a" + " is " +validateEmail("abc123@gmail.a"));
		System.out.println("abc123@.com" + " is " +validateEmail("abc123@.com"));
		System.out.println(".abc@abc.com" + " is " +validateEmail(".abc@abc.com"));
		System.out.println("abc()*@gmail.com" + " is " +validateEmail("abc()*@gmail.com"));
		System.out.println("abc@%*.com" + " is " +validateEmail("abc@%*.com"));
		System.out.println("abc..2002@gmail.com" + " is " +validateEmail("abc..2002@gmail.com"));
		System.out.println("abc@abc@gmail.com" + " is " +validateEmail("abc@abc@gmail.com"));
	}
	private String validateEmail(String Email) {
		
		String expression = "^[a-z]+[.|+_-]?[a-z0-9]+[@][a-z0-9]{1,}[.][a-z]{2,}[.]{0,1}[a-z]*$"; // Pattern
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(Email);
		if(match.find()) {
			return "valid";
		}
		return "invalid";
	}
	private String validateNumber(String number) {
		String expression = "^[0-9]{2}?[ ][0-9]{4,13}";	// Pattern for Number
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(number);
		if(match.find()) {
			return "valid";
		}
		return "invalid";
		
	}
	private String validatePassword(String pass) {
		String expression = "(?=.*[A-Z])(?=.*[0-9])(?=.[@#$%^&*])[A-Z-a-z0-9]{8,}$";	//Pattern for Password
		Pattern pattern = Pattern.compile(expression);
		Matcher match = pattern.matcher(pass);
		if(match.find()) {
			return "valid";
		}
		return "invalid";		
		
	}
	
	
	
}
