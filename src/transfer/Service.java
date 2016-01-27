package transfer;

import java.io.IOException;

import exceptions.NotRedefinedButShouldBe;

public abstract class Service {
	
	// here should be add something to handle proxies
	
	public static void validateAndPersist(ValidateAndPersistMsg msg) throws NotRedefinedButShouldBe, IOException{
		throw new NotRedefinedButShouldBe("ERROR : this method should be hidden by a redefinition in the called service.");
	};
	
	public static IsValidatedAsw isValidated(IsValidatedMsg msg) throws NotRedefinedButShouldBe{
		throw new NotRedefinedButShouldBe("ERROR : this method should be hidden by a redefinition in the called service.");
	};

}
