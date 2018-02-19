package com.model;

public class Triangulo {

	private int[][] estrutura = null;
	
	public Triangulo(int[][] valores) {
		estrutura = valores;
	}

	public int[][] getEstrutura() {
		return estrutura;
	}

	public int calculeMaiorCaminho() {

		int somaCaminho = 0;
		int ind = 0;
		
		somaCaminho += estrutura[0][ind];
		
		for (int i = 1; i < estrutura.length; i++) {
			int maior = estrutura[i][ind] > estrutura[i][ind + 1] ? estrutura[i][ind] : estrutura[i][++ind];
			somaCaminho += maior;
		}
		
		return somaCaminho;
	}

	
}
