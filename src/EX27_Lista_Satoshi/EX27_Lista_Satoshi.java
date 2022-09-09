package EX27_Lista_Satoshi;

import javax.swing.JOptionPane;


	public class EX27_Lista_Satoshi {
	public static void main(String[] args) {
		
		int numVoltas,circuito,tempoduracao,velocidademedia;
		
		numVoltas=Integer.parseInt(JOptionPane.showInputDialog("Informe o número de voltas"));
		circuito=Integer.parseInt(JOptionPane.showInputDialog("Informe extensão circuito em metros"));
		tempoduracao=Integer.parseInt(JOptionPane.showInputDialog("Informe tempo de duração em minutos"));
		
		velocidademedia = ((circuito/tempoduracao)* numVoltas);
		
		JOptionPane.showMessageDialog(null, "Velocidade média é: " + velocidademedia + "KM");
	}
	}
	