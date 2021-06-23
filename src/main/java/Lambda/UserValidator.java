package Lambda;

/************************************************************
 * Purpose : Create a User Registration using Lambda
 * 
 * @author Sanyukta Nirmal
 * @Version 1.0
 * @since 23-06-2021
 *
 ************************************************************/

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class UserValidator extends Exception {
		String Nameregex = "^[A-Z]{1}[a-z]{2,}$";
	    String Mobileregex = "^[0-9]{2}[-][0-9]{10}$";
	    String Emailregex = "^([a-z A-z 0-9 _.+-]+)@([a-z A-Z 0-9]+)\\.([a-z.]{2,8})$";
	    String Passregex = "^(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";

	    public void valid(boolean result,String msg) throws InvalidExceptions {
	        if (result) {
	            System.out.println("valid ");
	        } else {
	            throw new InvalidException(msg);
	        }
	    }

	    public boolean checkFirstName(String FirstName,String sms) throws InvalidException {
	    	IUser iuser = ((input, regex) -> input.matches(regex));
	        boolean result = iuser.validation(FirstName, Nameregex);
	        try {
	            valid(result,sms);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        return result;
	    }

	    public boolean checkLastName(String LastName,String sms) throws InvalidException {
	    	IUser iuser = ((input, regex) -> input.matches(regex));
	        boolean result = iuser.validation(LastName, Nameregex);
	        try {
	            valid(result,sms);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        return result;
	    }

	    public boolean validMobileNumber(String Phone,String sms) throws InvalidException {
	        IUser iuser = ((input, regex) -> input.matches(regex));
	        boolean result = iuser.validation(Phone, Mobileregex);
	        try {
	            valid(result,sms);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        return result;
	    }
	    public boolean validPassword(String Password,String sms) throws InvalidException {
	    	IUser iuser = ((input, regex) -> input.matches(regex));
	        boolean result = iuser.validation(Password, Passregex);
	        try {
	            valid(result,sms);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        return result;
	    }

	    public boolean validEmail(String Email,String sms) {
	    	IUser iuser = ((input, regex) -> input.matches(regex));
	        boolean result = iuser.validation(Email, Emailregex);
	        try {
	            valid(result,sms);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        return result;
	    }
	    public static void main(String[] args) {
	    }
	}
