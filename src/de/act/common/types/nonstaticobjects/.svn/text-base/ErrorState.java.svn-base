package de.act.common.types.nonstaticobjects;

/**
 * @author Martin Sachs
 * @since 1.0 - 08.08.2006
 */
public enum ErrorState {

	UNKNOWN	("unk"),
	OK 		("ok"),
	ERROR	("error");

	final private String error;

	private ErrorState(final String error) {
		this.error = error; 
	}

	public String getError() {
		return error;
	}

	public static ErrorState getErrorState(String work_state) {
		if (work_state.equals(UNKNOWN.getError())) {
			return UNKNOWN;
		}
		else if (work_state.equals(OK.getError())){
			return OK;
		}
		return UNKNOWN;
	}
}