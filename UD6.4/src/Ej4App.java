import javax.swing.JOptionPane;

public class Ej4App {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero"));
		
		JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es igual a " + factorial(numero));

	}

	/**
	 * Usamos recursividad, a partir de 30 da stackoverflow y el resultado es 0
	 * @param num numero entero introducido por el usuario
	 * @return factorial de num
	 */
	public static int factorial(int num)
	{
		if(num == 1)
		{
			return 1;
		}
		else
		{
			return num * factorial(num - 1);
		}
	}

}
