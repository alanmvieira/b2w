package com.operacoes;

import java.util.StringTokenizer;

public class OperacoesTriangulo {

	private final String SEPARADOR = ",";
	
	public String getValoresTriangulo(String input) {
		return input.substring(1, input.length() - 1);
	}

	public int[][] getEstruturaTriangulo(String input) {

		int retorno[][] = null;
		int i = 0;
		int j = 0;

		StringTokenizer tokens = new StringTokenizer(input, "[");

		retorno = new int[tokens.countTokens()][];

		while (tokens.hasMoreTokens()) {
			
			j = 0;
			String token = tokens.nextToken();
			
			if (token != null && token.trim().length() > 0) {
				
				if (token.endsWith(SEPARADOR)) {
					token = token.substring(0, token.length() - 1);
				}
				
				token = token.replaceFirst("]", "");
				
				StringTokenizer tokenSeparacao = new StringTokenizer(token, SEPARADOR);
				retorno[i] = new int[tokenSeparacao.countTokens()];

				while (tokenSeparacao.hasMoreTokens()) {
					int valor = Integer.parseInt(tokenSeparacao.nextToken());
					retorno[i][j] = valor;
					j++;
				}

				i++;
			}
		}

		return retorno;
	}

}
