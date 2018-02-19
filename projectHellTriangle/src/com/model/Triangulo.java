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
		int index = 0;
		
		somaCaminho += estrutura[0][index];
		
		for (int i = 1; i < estrutura.length; i++) {
			int maior = estrutura[i][index] > estrutura[i][index + 1] ? estrutura[i][index] : estrutura[i][++index];
			somaCaminho += maior;
		}
		
		return somaCaminho;
	}

	
}
