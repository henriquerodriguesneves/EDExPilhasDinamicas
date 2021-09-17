package view;

import javax.swing.JOptionPane;
import br.com.leandrocolevati.pilhastring.Pilha;

import controller.historicoController;

public class Principal {

	
	public static void main(String[] args) {
		
		historicoController histCont = new historicoController();
		
		Pilha historico = new Pilha();
		
		int opc = 0;
		while (opc != 9){
			StringBuffer buffer = new StringBuffer();
			buffer.append("Digite uma op��o:\n");
			buffer.append("1 - Inserir um site no hist�rico de navega��o\n");
			buffer.append("2 - Excluir um site do hist�rico de navega��o\n");
			buffer.append("3 - Consultar �ltimo site visitado\n");
			buffer.append("9 - Sair\n");
			String opcStr = JOptionPane.showInputDialog(null, buffer.toString());
			opc = Integer.parseInt(opcStr);
			switch (opc) {
			case 1:
				String site = JOptionPane.showInputDialog(null, "Digite um site");
				histCont.insereEndereco(historico, site);
				break;
			case 2:
				try {
					histCont.removeEndereco(historico);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					histCont.consultaUltimo(historico);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			default:
				break;
			}
		}
		
		
		
	}

}
