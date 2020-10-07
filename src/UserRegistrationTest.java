import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
	private static Registration reg;
	@BeforeAll
	static void initialize() {
	    reg = new Registration();				
	}	
	@Test
	public void givenInvalidName_shouldThrowException() {
	    assertThrows(RegistrationException.class,()->{
	        reg.validateInput("aditya");
		});
	}
	@Test
	public void givenInvalidNumber_shouldThrowException() {
	    assertThrows(RegistrationException.class,()->{
		reg.validateNumber("917887483853");
		});
	}
	@Test
	public void givenInvalidEmail_shouldThrowException() {
	    assertThrows(RegistrationException.class,()->{
		reg.validateEmail("abc..@gmail.com.a");
		});
	}
	@Test
	public void givenInvalidPassword_shouldThrowException() {
	    assertThrows(RegistrationException.class,()->{
		reg.validatePassword("poiuytr");
		});
	}	
	@Test
	public void givenValidName_shouldReturnValid() {
	    try {
	    	assertEquals("valid",reg.validateInput("Aditya"));
	    }
	    catch(RegistrationException e) {
	    	System.out.println(e);
	    }
	}
	@Test
	public void givenValidPassword_shouldReturnValid() {
	    try {
	    	assertEquals("valid",reg.validatePassword("Aditya@123"));
	    }
	    catch(RegistrationException e) {
	    	System.out.println(e);
	    }
	}
	@Test
	public void givenValidNumber_shouldReturnValid() {
	    try {
	    	assertEquals("valid",reg.validateNumber("91 7887483853"));
	    }
	    catch(RegistrationException e) {
	    	System.out.println(e);
	    }
	}
	@Test
	public void givenValidEmail_shouldReturnValid() {
	    try {
	    	assertEquals("valid",reg.validateInput("abc@gmail.com"));
	    }
	    catch(RegistrationException e) {
	    	System.out.println(e);
	    }
	}
	//Implemented lambda expression
	@Test
	public void givenInvalidInput_shouldThrowException() {
	    assertEquals(true,reg.validateInput.validateInput("Aditya","(^[A-Z]{1})[a-z]{2,}$"));
	}
}
