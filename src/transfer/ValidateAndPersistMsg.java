package transfer;


public class ValidateAndPersistMsg extends Message  {
	private String modelName;

	public String getModelName() {
		return modelName;
	}

	public ValidateAndPersistMsg(String modelName) {
		super();
		this.modelName = modelName;
	}

}
