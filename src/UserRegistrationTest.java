import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
	private static Registration reg;
	@BeforeAll
	static void initialize() {
		reg = new Registration();				
	}
	@Test
	public void validateEntry_ifValid_returnHappy() {
		String firstName = "Aditya";
		String lastName = "Kharade";
		String phone = "91 9865326598";
		String id = "abc-100@yahoo.com";
		String pass = "Aditya@123";
		assertEquals("HAPPY", reg.validateEntry(firstName, lastName, id, pass, phone));
	}
	@Test
	public void validateEntry_ifInvalid_returnSad() {
		String firstName = "Aditya";
		String lastName = "Kharade";
		String phone = "919865326598";
		String id = "abc-100@yahoo.com";
		String pass = "Aditya@123";
		assertEquals("SAD", reg.validateEntry(firstName, lastName, id, pass, phone));
	}
	@ParameterizedTest
	@ValueSource(strings = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
			"abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"})
	public void email_ifValid_shouldReturnValid(String email) {
		assertEquals(true, reg.validateEmail(email));
		
	}

	@ParameterizedTest
	@ValueSource(strings = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*.com", "abc@%*.com", 
			"abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"})
	public void email_ifInvalid_shouldReturnInvalid(String email) {
		assertEquals(false, reg.validateEmail(email));
		
	}
		
}
