package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTabuada {
	
	public String titulo;
	public int altura;
	public int largura;
	public Color corFundoTela;
	public Font fonteDosLabels;
	public Color corDoTextoDoBotao;
	public Color corDoBotao;
	public Color corDoTitulo; 
	public Color corDosLabels;
	
	public void criarTela() {
		
	      JFrame tela = new JFrame();
	      tela.setTitle(titulo);
	      tela.setSize(400, 500);
	      tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      tela.setLayout(null);
	      
	      
	      
	//Obter a instância do painel de conteúdo(Container)
	   Container painel = tela.getContentPane();
	   painel.setBackground(corFundoTela);
	   
	 //Criar os componentes da tela e colocar no painel(Container)
       JLabel labelImc = new JLabel();
       labelImc.setText("TABUADA");
       labelImc.setBounds(30,10,80,30);
       labelImc.setForeground(new Color(113,65,45));
       labelImc.setFont(new Font("Courier new", Font.BOLD, 32));
	   
	   
	

	}
}
