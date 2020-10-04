import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
	Registration reg = new Registration();
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
	
		
}
