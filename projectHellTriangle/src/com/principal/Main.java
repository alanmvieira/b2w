package com.principal;

import com.model.Triangulo;
import com.operacoes.InputValidator;
import com.operacoes.OperacoesTriangulo;

public class Main {

	public static void main(String[] args) {
		
		InputValidator inputValidator = new InputValidator();
		OperacoesTriangulo operacoesTriangulo = new OperacoesTriangulo(); 
		
		if (args.length == 1 && inputValidator.validInput(args[0])) {
			
			String valoresTriangulo = operacoesTriangulo.getValoresTriangulo(args[0]);
			int[][] estruturaTriangulo = operacoesTriangulo.getEstruturaTriangulo(valoresTriangulo);
			
			Triangulo triangulo = new Triangulo(estruturaTriangulo);
			
			System.out.println("the maximum total is: "+ triangulo.calculeMaiorCaminho());
			
		}else {
			System.err.println("O valor informado para entrada não contém uma estrutura válida.");
		}
		
	}

}
