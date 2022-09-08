package br.senai.sp.jandira.model;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Usuario {

	public int multiplicando;
	public int minimoMultiplicador;
	public int maximoMultiplicador;
	
	public String[] getResultado() {

		DefaultListModel model = new DefaultListModel();
		JList list = new JList(model);

		int tamanho = maximoMultiplicador - minimoMultiplicador + 1;
		String tabuada[] = new String[tamanho];

		int contador = 0;
		
		while (contador < tamanho) {

			int produto = multiplicando * minimoMultiplicador;

			String resultado = multiplicando + " X " + minimoMultiplicador + " = " + produto;
			tabuada[contador] = resultado;
			model.addElement(tabuada[contador]);
			contador++;
			minimoMultiplicador++;
		}
		return tabuada;

	}

}