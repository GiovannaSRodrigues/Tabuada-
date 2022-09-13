package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import br.senai.sp.jandira.JtextFieldSomenteNumeros;
import br.senai.sp.jandira.model.Usuario;

public class FrameTabuada {

	public String titulo;
	public Color corFundoDeTela;
	public Font fonteDosLabels;
	public Color corDoTextoDoBotao;
	public Color corDoBotao;
	public Color corDoTitulo;
	public Color corDosLabels;
	public int largura;
	public int altura;
	
	Icon iconeMenino = new ImageIcon("src/br/senai/sp/jandira/imagens/menino.png");

	Usuario usuario = new Usuario();
	JTextField textFieldMultiplicando = new JtextFieldSomenteNumeros();
	JTextField textFieldMinimoMultiplicador = new JtextFieldSomenteNumeros();
	JTextField textFieldMaximoMultiplicador = new JtextFieldSomenteNumeros();
	
	JList<String> listResultado = new JList<String>();

	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		Container painel = tela.getContentPane();
		painel.setBackground(new Color(147,112,219) );

		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("Tabuada");
		labelTitulo.setBounds(20, 10, 300, 30);
		labelTitulo.setFont(new Font("AmericanTypewriter-Light", Font.PLAIN, 26));
		labelTitulo.setForeground(corDoTitulo);
		labelTitulo.setOpaque(true);
		labelTitulo.setBackground(new Color(225, 214, 246)); 

		JLabel labelCorFundoTitulo = new JLabel();
		labelCorFundoTitulo.setBounds(0, 0, 600, 50);
		labelCorFundoTitulo.setOpaque(true);
		labelCorFundoTitulo.setBackground(new Color(225, 214, 246));

		JLabel labelIcone = new JLabel();
		labelIcone.setBounds(10, 65, 130, 130);
		labelIcone.setSize(80, 80);
		labelIcone.setIcon(iconeMenino);

		JLabel labelTitulo1 = new JLabel();
		labelTitulo1.setText("Tabuada 1.0");
		labelTitulo1.setBounds(115, 80, 300, 30);
		labelTitulo1.setFont(new Font("AmericanTypewriter-Light", Font.BOLD, 30));
		labelTitulo1.setForeground (Color.BLACK);

		JLabel labelSubtitulo = new JLabel();
		labelSubtitulo.setText(
				"<html>Com a Tabuada 1.0 os seus problemas acabaram. Calcule<br> a tabuada que desejar em segundos</html>");
		labelSubtitulo.setBounds(123, 115, 380, 30);
		labelSubtitulo.setFont(new Font("AmericanTypewriter-Light", Font.PLAIN, 12));
		labelSubtitulo.setForeground(new Color(225,214,246));

		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(140, 160, 300, 30);
		labelMultiplicando.setFont(new Font("AmericanTypewriter-Light", Font.PLAIN, 26));
		labelMultiplicando.setForeground(Color.BLACK);

		textFieldMultiplicando.setBounds(330, 160, 200, 40);
		textFieldMultiplicando.setBorder(new MatteBorder(2, 2, 2, 2, new Color(91, 132, 203)));
		textFieldMultiplicando.setBorder(BorderFactory.createCompoundBorder(textFieldMultiplicando.getBorder(),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		textFieldMultiplicando.setHorizontalAlignment(JTextField.RIGHT);
		textFieldMultiplicando.setForeground(Color.BLACK);
		textFieldMultiplicando.setFont(new Font("AmericanTypewriter-Light", Font.PLAIN, 30));
		textFieldMultiplicando.setMargin(new Insets(20, 20, 20, 20));

		JLabel labelMiniMultiplicador = new JLabel();
		labelMiniMultiplicador.setText("Mínimo Multiplicador:");
		labelMiniMultiplicador.setBounds(55, 210, 300, 30);
		labelMiniMultiplicador.setFont(new Font("AmericanTypewriter-Light", Font.PLAIN, 26));
		labelMiniMultiplicador.setForeground(Color.BLACK);

		textFieldMinimoMultiplicador.setBounds(330, 210, 200, 40);
		textFieldMinimoMultiplicador.setBorder(new MatteBorder(2, 2, 2, 2, new Color(91, 132, 203)));
		textFieldMinimoMultiplicador.setHorizontalAlignment(JTextField.RIGHT);
		textFieldMinimoMultiplicador.setForeground(Color.BLACK);
		textFieldMinimoMultiplicador.setFont(new Font("AmericanTypewriter-Light", Font.PLAIN, 30));
		textFieldMinimoMultiplicador.setBorder(BorderFactory.createCompoundBorder(
				textFieldMinimoMultiplicador.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));

		JLabel labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo Multiplicador:");
		labelMaxMultiplicador.setBounds(52, 260, 300, 30);
		labelMaxMultiplicador.setFont(new Font("AmericanTypewriter-Light", Font.PLAIN, 26));
		labelMaxMultiplicador.setForeground(Color.BLACK);

		textFieldMaximoMultiplicador.setBounds(330, 260, 200, 40);
		textFieldMaximoMultiplicador.setBorder(new MatteBorder(2, 2, 2, 2, new Color(91, 132, 203)));
		textFieldMaximoMultiplicador.setHorizontalAlignment(JTextField.RIGHT);
		textFieldMaximoMultiplicador.setForeground(Color.BLACK);
		textFieldMaximoMultiplicador.setFont(new Font("AmericanTypewriter-Light", Font.PLAIN, 30));
		textFieldMaximoMultiplicador.setBorder(BorderFactory.createCompoundBorder(
				textFieldMaximoMultiplicador.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));

		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 340, 310, 50);
		buttonCalcular.setForeground(Color.WHITE);
		buttonCalcular.setFont(new Font("AmericanTypewriter-Light", Font.BOLD, 24));
		buttonCalcular.setBackground(new Color(102,0,153));
		buttonCalcular.setBorder(new MatteBorder(1, 1, 1, 1, new Color(91, 132, 203)));

		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(340, 340, 190, 50);
		buttonLimpar.setForeground(Color.WHITE);
		buttonLimpar.setFont(new Font("AmericanTypewriter-Light", Font.PLAIN, 24));
		buttonLimpar.setBackground(new Color(219,112,147));
		buttonLimpar.setBorder(new MatteBorder(1, 1, 1, 1, new Color(91, 132, 203)));

		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setBounds(20, 420, 180, 30);
		labelResultado.setFont(new Font("AmericanTypewriter-Light", Font.BOLD, 26));
		labelResultado.setForeground (Color.BLACK);
		
		
		listResultado.setBounds(20, 460, 510, 280);
		listResultado.setBackground(Color.BLACK);
		listResultado.setForeground(Color.WHITE);

		JScrollPane scroll = new JScrollPane(listResultado);
		scroll.setBounds(20, 460, 510, 280);
		listResultado.setBorder(new MatteBorder(1, 1, 1, 1, new Color(91, 132, 203)));
		listResultado.setFont(new Font("AmericanTypewriter-Light", Font.BOLD, 28));
		listResultado.setBorder(BorderFactory.createCompoundBorder(listResultado.getBorder(),
				BorderFactory.createEmptyBorder(5, 14, 5, 5)));

		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					usuario.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
					usuario.minimoMultiplicador = Integer.parseInt(textFieldMinimoMultiplicador.getText());
					usuario.maximoMultiplicador = Integer.parseInt(textFieldMaximoMultiplicador.getText());
					
					String resultado[] = usuario.getResultado();
					listResultado.setListData(resultado);

				} catch (NegativeArraySizeException exception) {
					verificarMinimoMaximoInvalido();
				} catch (NumberFormatException exception) {
					verificarErros();
				}

			}
		});

		buttonLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				limparCampos();
				String[] campoVazio = {""};
				listResultado.setListData(campoVazio);;

			}
		});

		painel.add(labelTitulo);
		painel.add(labelCorFundoTitulo);
		painel.add(labelIcone);
		painel.add(labelTitulo1);
		painel.add(buttonCalcular);
		painel.add(labelSubtitulo);
		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);
		painel.add(labelMiniMultiplicador);
		painel.add(textFieldMinimoMultiplicador);
		painel.add(labelMaxMultiplicador);
		painel.add(textFieldMaximoMultiplicador);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		painel.add(scroll);

		tela.setVisible(true);
	}

	public void limparCampos() {
		textFieldMultiplicando.setText("");
		textFieldMinimoMultiplicador.setText("");
		textFieldMaximoMultiplicador.setText("");
	}

	public void verificarMinimoMaximoInvalido() {
		JOptionPane.showMessageDialog(null,
				"<html>Preencha os campos \"Mínimo Multiplicador\" e \"Máximo Multiplicador\" de maneira correta.<br> Onde o Mínimo Multiplicador precisa ser um valor menor do que o Máximo Multiplicador<html>",
				"Erro!", JOptionPane.ERROR_MESSAGE);
		textFieldMinimoMultiplicador.setText("");
		textFieldMaximoMultiplicador.setText("");
	}

	public void verificarErros() {

		if (textFieldMultiplicando.getText().isEmpty() || textFieldMultiplicando == null) {
			JOptionPane.showMessageDialog(null, "Campo \"Multiplicando\" está Vazio! Preencha com um valor numérico", "Erro!", JOptionPane.ERROR_MESSAGE);
		}

		else if (textFieldMinimoMultiplicador.getText().isEmpty() || textFieldMinimoMultiplicador == null) {
			JOptionPane.showMessageDialog(null, "Campo \"Mínimo Multiplicador\" está Vazio! Preencha com um valor numérico", "Erro!", JOptionPane.ERROR_MESSAGE);
		}

		else if (textFieldMaximoMultiplicador.getText().isEmpty() || textFieldMaximoMultiplicador == null) {
			JOptionPane.showMessageDialog(null, "Campo \"Máximo Multiplicador\" está Vazio! Preencha com um valor numérico", "Erro!", JOptionPane.ERROR_MESSAGE);
		}

	}

}