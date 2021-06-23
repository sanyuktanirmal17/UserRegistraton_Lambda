package Lambda;

/**
 * 
 * @param input
 * @param regex
 * @return string and regex pattern print
 */
	@FunctionalInterface
	public interface IUser {
	boolean validation(String input, String regex);
	}


