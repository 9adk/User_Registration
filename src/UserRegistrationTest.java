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
}
