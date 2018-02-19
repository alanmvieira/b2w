package test.com.operacoes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.operacoes.InputValidator;

public class InputValidatorTest {

	private InputValidator inputValidator;

	@Before
	public void init() {
		inputValidator = new InputValidator();
	}
	
	@Test
	public void validInputTest(){
		
		String input = "[[6],[3,5],[9,7,1],[4,6,8,4]]";
		assertTrue(inputValidator.validInput(input));
		
		input = "[6],[3,5],[9,7,1],[4,6,8,4]]";
		assertFalse(inputValidator.validInput(input));
		
		input = "[6],[3,5],[9,7,1],[4,6,8,4]";
		assertFalse(inputValidator.validInput(input));		
		
	}
}
