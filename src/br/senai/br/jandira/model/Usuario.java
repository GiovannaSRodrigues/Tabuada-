package br.senai.br.jandira.model;

import java.util.Scanner;

public class Usuario {
	
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		int multiplicador = 1, tab;
		System.out.println("Número da tabuada que deseja: ");
		int var = n.nextInt();
		
		while(multiplicador <= 10)
		{
			tab = var*multiplicador;
			System.out.println(multiplicador + "x" + var + "=" + tab);
			multiplicador = multiplicador +1;
		}
	}

}
