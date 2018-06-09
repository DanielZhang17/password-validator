
public class Validator {

	public boolean validate(String pass) {
		if(pass.equals("password")||pass.equals("Password"))
			return false;
		if(pass.length()<8)
			return false;
		return true;
	}
}
