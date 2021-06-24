package Lambda;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * @authorShweta
 * Assignment User registration Problem with lambda expression
 * 
 */

public class UserRegistration {

	private final static String NAME_PATTERN = "^[A-Z][a-z]{3,15}$";
	private final static String EMAIL_PATTERN = "^([a-zA-Z0-9.]+)([0-9a-zA-Z]{0,1}@([a-zA-Z0-9.]+([a-zA-Z]{2,3}))+([a-z]{0,2}))$";
	private final static String MOBILE_PATTERN = "^\\d{2}[ ]\\d{10}$";
	private final static String PASSWORD_PATTERN = "^(?=.*?[0-9a-zA-Z])[0-9a-zA-Z]*[@#$%!][0-9a-zA-Z]*$";

	public boolean validatePassword(String password) throws InvalidException { // UC8-> UC7-> UC6->UC5 password
																					// validation
		/*
		 * @param password
		 * 
		 * @ return boolean
		 */
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		boolean match = false;
		String message= "";
		try {
			Matcher matcher = pattern.matcher(password);
			match= matcher.matches();
			if (!match) {
				message = password+"is an invalid password";
				throw new InvalidException(message);
			}
		}catch(InvalidException e) {
				System.out.println(e);
			}
		return match;
	}

	public boolean validateMobile(String mob) throws InvalidException { // UC4 mobile number validation
		/*
		 * @param mobile
		 *
		 * @ return boolean
		 */
		Pattern pattern = Pattern.compile(MOBILE_PATTERN);
		boolean match = false;
		String message= "";
		try {
			Matcher matcher = pattern.matcher(mob);
			match= matcher.matches();
			if (!match) {
				message = mob+"is an invalid mobile number";
				throw new InvalidException(message);
			}
		}catch(InvalidException e) {
				System.out.println(e);
			}
		return match;
	}

	public boolean validateEmail(String email) throws InvalidException { // UC3 email validation
		/*
		 * @param Email
		 * 
		 * @ return boolean
		 */
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		boolean match = false;
		String message= "";
		try {
			Matcher matcher = pattern.matcher(email);
			match= matcher.matches();
			if (!match) {
				message = email+"is an invalid email id";
				throw new InvalidException(message);
			}
		}catch(InvalidException e) {
				System.out.println(e);
			}
		return match;
	}

	public boolean validateLastName(String lastName) throws InvalidException { //UC2 Last name validation
			/*@param Last name
			 * @ return boolean
			 */
			Pattern pattern = Pattern.compile(NAME_PATTERN);
			boolean match = false;
			String message ="";
				try {
					Matcher matcher = pattern.matcher(lastName);
					match =matcher.matches(); 
					if(!match){
						message = lastName + "is an invalid last name";
						throw new InvalidException("message");
					}
				}catch(InvalidException e) {
					System.out.println(e);
				}
			return match;
		}

	public boolean validateFirstName(String firstName) throws InvalidException { // UC1 firstname validation

		/*
		 * @param first name
		 * 
		 * @ return boolean
		 */
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		boolean match = false;
		String message = "";

		try {
			Matcher matcher = pattern.matcher(firstName);
			match = matcher.matches();
			if (!match) {
				message = firstName + " is an invalid first name";
				throw new InvalidException(message);
			}
		} catch (InvalidException e) {
			System.out.println(e);
		}
		return match;

	}

}


	
