
public class Validator {
	/*Requirement to return true
	 * 1) the string is not "password"
	 * 2) the string is at least 8 characters long
	 * 3) the string contains at least 1 digit
	 * 4) the string contains at least 1 lower case letter
	 * 5) the string contains at least 1 upper case letter
	 */
	public  boolean validate(String pass) {
		if(pass.equals("password"))
			return false;
		if(pass.length()<8)
			return false;
		char[] ch =pass.toCharArray();
		if(!containsDigit(ch))
			return false;
		if(!containLowerCase(ch))
			return false;
		if(!containsUpperCase(ch))
			return false;
			
		return true;
	}
	//at least 1 digit
	public boolean containsDigit(char[] ch) {
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i]))
				return true;
		}
		return false;
	}
	//contains a lower case
	public boolean containLowerCase(char[] ch) {
		for(int i=0;i<ch.length;i++) {
			if(Character.isLowerCase(ch[i]))
				return true;
		}
		return false;
	}
	//contains at least 1 upper case
	public boolean containsUpperCase(char[] ch) {
		for(int i = 0;i<ch.length;i++) {
			if(Character.isUpperCase(ch[i]))
				return true;
		}
		return false;
	}
}
