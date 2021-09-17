package view;

import javax.swing.JOptionPane;

import controller.historicoController;

public class Principal {

	
	public static void main(String[] args) {
		
		String novoEndereco;
			
		historicoController hCont = new historicoController();
		
		novoEndereco = JOptionPane.showInputDialog(null, "Digite um endereço de e-mail");
		
		JOptionPane.showMessageDialog(null, novoEndereco);
		
	}

}
