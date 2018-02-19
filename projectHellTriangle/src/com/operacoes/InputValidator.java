package com.operacoes;

public class InputValidator {

	public boolean validInput(String input) {

		if (input != null && input.trim().length() > 0 && input.startsWith("[[") && input.endsWith("]]")) {
			return true;
		}

		return false;
	}

}
