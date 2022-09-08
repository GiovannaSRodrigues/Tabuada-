package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;

import br.senai.sp.jandira.gui.FrameTabuada;

public class AppTabuada {

	public static void main(String[] args) {
		
		FrameTabuada tabuada = new FrameTabuada();
		tabuada.titulo = "Tabuada";
		tabuada.largura = 600;
		tabuada.altura = 800;
		tabuada.corFundoDeTela = new Color(64, 128, 128);
		tabuada.corDoTextoDoBotao = new Color(0, 0, 0);
		tabuada.corDoBotao = new Color(192, 192, 192);
		tabuada.fonteDosLabels = new Font("Arial Black", Font.BOLD, 13);
		tabuada.corDoTitulo = new Color(255, 255, 255);
		tabuada.corDosLabels = new Color(192, 192, 192);
		tabuada.criarTela();
		
	}
}