package com.herontech.first;

public class ObjectNotFoundException extends SinglyLinkedListException {

	/**
	 * version id for class
	 */
	private static final long serialVersionUID = 6571163191346522013L;

	@Override
	public String getMessage() {
		return "Object not found in list";
	}

}
