import javax.swing.JOptionPane;

public class Ej5App {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero"));
		
		JOptionPane.showMessageDialog(null, "El numero " + numero + " en binario es " + numBinario(numero));

	}
	
	public static String numBinario(int num)
	{
		String numBinarioInverso = "";
		String numBinario = "";

		while(num != 0 && num != 1)
		{
			numBinarioInverso += "" + (num % 2);
			num /= 2; 
		}
		
		numBinarioInverso += "" + num;
		
		for (int i = numBinarioInverso.length() - 1; i >= 0; i--) 
		{
			numBinario += numBinarioInverso.charAt(i);
		}
		
		return numBinario;
	}

}
