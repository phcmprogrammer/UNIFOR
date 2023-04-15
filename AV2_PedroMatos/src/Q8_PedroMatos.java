import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Q8_PedroMatos extends JFrame{

	private JButton[] botoes;
	private JTextField txtTentativa;
	private JLabel lblResultado;
	
	private int numeroSorteado;
	private int tentativas;
	
	public Q8_PedroMatos() {
		// Configurando a janela
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setTitle("Jogo de Adivinhação");
		setResizable(false);
		
		// Criando painel de botões
		JPanel pnlBotoes = new JPanel();
		pnlBotoes.setLayout(null);
		add(pnlBotoes, BorderLayout.CENTER);
		
		// Criando os botões numerados
		botoes = new JButton[20];
		for (int i = 0; i < 20; i++) {
			botoes[i] = new JButton(String.valueOf(i+1));
			botoes[i].setBounds((i % 5) * 70 + 20, (i / 5) * 50 + 20, 50, 30);
			pnlBotoes.add(botoes[i]);
			botoes[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonClick((JButton) e.getSource());
				}
			});
		}
		
		// Criando painel de tentativas
		JPanel pnlTentativas = new JPanel();
		add(pnlTentativas, BorderLayout.NORTH);
		
		JLabel lblTentativa = new JLabel("Tentativa:");
		pnlTentativas.add(lblTentativa);
		
		txtTentativa = new JTextField(2);
		txtTentativa.setEditable(false);
		pnlTentativas.add(txtTentativa);
		
		// Criando painel de resultado
		JPanel pnlResultado = new JPanel();
		add(pnlResultado, BorderLayout.SOUTH);
		
		lblResultado = new JLabel("");
		pnlResultado.add(lblResultado);
		
		// Sorteando o número a ser adivinhado
		Random rand = new Random();
		numeroSorteado = rand.nextInt(20) + 1;
		
		// Configurando a primeira tentativa
		tentativas = 1;
		txtTentativa.setText(String.valueOf(tentativas));
	}
	
	private void buttonClick(JButton button) {
		// Obtendo o número escolhido pelo usuário
		int numeroEscolhido = Integer.parseInt(button.getText());
		
		// Verificando se o número escolhido é igual ao número sorteado
		if (numeroEscolhido == numeroSorteado) {
			lblResultado.setText("Parabéns, você acertou o número " + numeroSorteado + "!");
			disableButtons();
		} else {
			lblResultado.setText("Tentativa " + tentativas + ": você escolheu o número " + numeroEscolhido);
			tentativas++;
			txtTentativa.setText(String.valueOf(tentativas));
			if (tentativas > 5) {
				lblResultado.setText("Suas tentativas acabaram. O número sorteado era " + numeroSorteado + ".");
				disableButtons();
			}
		}
	}
	
	private void disableButtons() {
		// Desabilita todas as opções
		for (int i = 0; i < 20; i++) {
			botoes[i].setEnabled(false);
		}
	}
	
	public static void main(String[] args) {
		Q8_PedroMatos jogo = new Q8_PedroMatos();
		jogo.setVisible(true);
	}

}
