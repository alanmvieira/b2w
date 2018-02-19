package test.com.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.model.Triangulo;
import com.operacoes.InputValidator;
import com.operacoes.OperacoesTriangulo;

public class TrianguloTest {

	InputValidator inputValidator = new InputValidator();
	OperacoesTriangulo operacoesTriangulo = new OperacoesTriangulo();

	@Test
	public void criarTrianguloTest() {
		Triangulo triangulo;

		String input = "[[6],[3,5],[9,7,1],[4,6,8,4]]";
		String valoresTriangulo = operacoesTriangulo.getValoresTriangulo(input);

		int[][] estrutura = operacoesTriangulo.getEstruturaTriangulo(valoresTriangulo);

		triangulo = new Triangulo(estrutura);

		assertNotNull(triangulo.getEstrutura());

	}

	@Test
	public void getMaiorCaminhoTest() {
		Triangulo triangulo;
		
		String input = "[[6],[3,5],[9,7,1],[4,6,8,4]]";
		String valoresTriangulo = operacoesTriangulo.getValoresTriangulo(input);

		int[][] estrutura = operacoesTriangulo.getEstruturaTriangulo(valoresTriangulo);

		triangulo = new Triangulo(estrutura);
		
		assertEquals(26,triangulo.calculeMaiorCaminho());

	}

}
