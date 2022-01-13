import javax.swing.JOptionPane;

public class Ej6App {

	public static void main(String[] args) {

		int numero;
		String str = "Introduce un numero";
		
		do
		{
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, str));
			
			if(numero <= 0)
			{
				str = "Introduce un numero positivo (mayor a 0)";
			}
		}
		while(numero <= 0);
		
		JOptionPane.showMessageDialog(null, "El numero " + numero + " tiene " + longitudNum(numero) + " digitos.");

	}

	private static int longitudNum(int numero) 
	{
		String numeroStr = "" + numero;

		return numeroStr.length();
	}

}
