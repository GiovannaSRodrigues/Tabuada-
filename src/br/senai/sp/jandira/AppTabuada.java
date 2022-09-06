package br.senai.sp.jandira;

import br.senai.br.jandira.model.Usuario;
import br.senai.sp.jandira.gui.FrameTabuada;

public class AppTabuada {

	public static void main(String[] args) {
	
		Usuario usuario = new Usuario();
		usuario.multiplicando =2;
		usuario.minimoMultiplicador =0;
		usuario.maximoMultiplicador =5;
		
		
		String[] resultado = usuario.getTabuada();
		
		int contador = 0;
		
		while(contador < resultado.length) {
		System.out.println(resultado[contador]);
		contador++;
			
		}

	}

}
