
public class Validator {

	public boolean validate(String pass) {
		if(pass.toLowerCase().equals("password"))//case insensitive
			return false;
		if(pass.length()<8)
			return false;
		return true;
	}
}
