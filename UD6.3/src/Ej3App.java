import javax.swing.JOptionPane;

public class Ej3App {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero"));
		
		if (comprobarPrimo(numero)) 
		{
			JOptionPane.showMessageDialog(null, "El numero " + numero + " es un numero primo.");
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "El numero " + numero + " no es un numero primo.");
		}

	}
	
	public static boolean comprobarPrimo(int num)
	{
		boolean primo = true;
		
		for (int i = 2; i < num && primo; i++) 
		{
			if(num % i == 0)
			{
				primo = false;
			}
		}
		
		return primo;
	}

}
