package br.senai.br.jandira.model;


public class Usuario {
		
		
		public int multiplicando;
		public int minimoMultiplicador;
		public int maximoMultiplicador;
		
		 public String[] getTabuada() {
			 
			 int tamanho = maximoMultiplicador - minimoMultiplicador +1;
			 String tabuada[] = new String[tamanho]; 
			 
			 int contador =0;
			 
			 while (contador < tamanho) {
				 
				 int produto = multiplicando * minimoMultiplicador;
				 
				 String resultado = (multiplicando + "x" + minimoMultiplicador + "=" + produto);	 
			      tabuada[contador] = resultado;
				 
				 contador++;
				 minimoMultiplicador++;
	 }
			return tabuada;
			
   }
 
}

  
