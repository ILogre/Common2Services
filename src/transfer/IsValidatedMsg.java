package transfer;


public class IsValidatedMsg extends Message  {
	private String modelName;

	public String getModelName() {
		return modelName;
	}

	public IsValidatedMsg(String modelName) {
		super();
		this.modelName = modelName;
	}

}
