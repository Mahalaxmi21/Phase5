package Testing.test;

public class AgeValidation {

	public String ageValidator(int age) {
		if(age>=18) {
			return "valid to vote";
		}else
		{
			return "not valid to vote";
		}
		
	}
}
