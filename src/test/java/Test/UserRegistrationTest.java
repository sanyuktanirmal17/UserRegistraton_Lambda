package Test;

/************************************************************
 * Purpose : Create a User Registration using Lambda
 * 
 * @author Sanyukta Nirmal
 * @Version 1.0
 * @since 23-06-2021
 *
 *
 ************************************************************/

import java.util.Scanner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Lambda.InvalidException;
import Lambda.UserLambdaExpression;
import Lambda.UserRegistration;


	public class UserRegistrationTest {

		@Test // test case to pass true to firstname validation
		public void checkFirstNameToValidate() throws InvalidException {
			UserRegistrationTest valid = new UserRegistrationTest();
			boolean result = valid.validateFirstName("Sanyukta");
			Assert.assertEquals(true, result);
		}

		@Test // test case to fail the firstname validation
		public void checkFirstNameToInvalid() throws InvalidException {
			UserRegistrationTest valid = new UserRegistrationTest();
			boolean result = valid.validateFirstName("SN");
			Assert.assertEquals(false,result);
		}

		@Test // test case to pass to lastname validation
		public void checkLastNameToValidate() throws InvalidException {
			UserRegistrationTest valid = new UserRegistrationTest();
			boolean result = valid.validateFirstName("Pawar");
			Assert.assertEquals(true, result);
		}

		@Test // test case to fail the last name validation
		public void checkLastNameToSeeInvalid() throws InvalidException{
			UserRegistrationTest valid = new UserRegistrationTest();
			boolean result = valid.validateLastName("pawar");
			Assert.assertEquals(false, result);
		}

		@Test // test case to pass email validation
		public void checkEmailToValidate() throws InvalidException{
			UserRegistrationTest valid = new UserRegistrationTest();
			boolean result = valid.validateEmail("sanyukta.q@yahoo.com");
			Assert.assertEquals(true, result);
		}

		@Test // test case to fail email validation
		public void checkEmailToSeeInvalid() throws InvalidException{
			UserRegistrationTest valid = new UserRegistrationTest();
			boolean result = valid.validateEmail("sanyukta@.@yahoo.com");
			Assert.assertEquals(false, result);
		}

		@Test // test case to pass mobile number validation
		public void checkMobilToValidate() throws InvalidException{
			UserRegistrationTest valid = new UserRegistrationTest();
			boolean result = valid.validateMobile("91 9736382937");
			Assert.assertEquals(true, result);
		}

		@Test // Test case to fail mobile number validation
		public void checkMobilToSeeInvalid() throws InvalidException{
			UserRegistrationTest valid = new UserRegistrationTest();
			boolean result = valid.validateMobile("91 0079836382937");
			Assert.assertEquals(false, result);
		}

		@Test // test case to pass Password validation
		public void checkPasswordToValidate() throws InvalidException{
			UserRegistrationTest valid = new UserRegistrationTest();
			boolean result = valid.validatePassword("Purva1!aa");
			Assert.assertEquals(true, result);
		}

		@Test // test case to fail Password validation
		public void checkPasswordToSeeInvalid() throws InvalidException{
			UserRegistrationTest valid = new UserRegistrationTest();
			boolean result = valid.validatePassword("Purc1,");
			Assert.assertEquals(false, result);
		}
	}

