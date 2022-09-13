package br.senai.sp.jandira;

import java.awt.Color;

import br.senai.sp.jandira.gui.FrameTabuada;

public class AppTabuada {

	public static void main(String[] args) {
		
		FrameTabuada tabuada = new FrameTabuada();
		tabuada.titulo = "Tabuada";
		tabuada.largura = 600;
		tabuada.altura = 800;
		tabuada.corDoTitulo = (Color.BLACK);
		tabuada.criarTela();
		
	}
}