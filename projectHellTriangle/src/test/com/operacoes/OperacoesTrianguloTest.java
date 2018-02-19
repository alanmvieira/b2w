package test.com.operacoes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.operacoes.OperacoesTriangulo;

public class OperacoesTrianguloTest {

	private OperacoesTriangulo operacoesTriangulo;

	@Before
	public void init() {
		operacoesTriangulo = new OperacoesTriangulo();
	}

	@Test
	public void getValoresTrianguloTest() {

		String input = "[[6],[3,5],[9,7,1],[4,6,8,4]]";
		String inputRetorno = "[6],[3,5],[9,7,1],[4,6,8,4]";

		assertEquals(inputRetorno, operacoesTriangulo.getValoresTriangulo(input));

	}

	@Test
	public void getEstruturaTrianguloTest() {

		String input = "[[6],[3,5],[9,7,1],[4,6,8,4]]";
		String valoresTriangulo = operacoesTriangulo.getValoresTriangulo(input);

		int[][] retorno = operacoesTriangulo.getEstruturaTriangulo(valoresTriangulo);

		assertEquals(6, retorno[0][0]);

		assertEquals(3, retorno[1][0]);
		assertEquals(5, retorno[1][1]);

		assertEquals(9, retorno[2][0]);
		assertEquals(7, retorno[2][1]);
		assertEquals(1, retorno[2][2]);

		assertEquals(4, retorno[3][0]);
		assertEquals(6, retorno[3][1]);
		assertEquals(8, retorno[3][2]);
		assertEquals(4, retorno[3][3]);

	}

}
