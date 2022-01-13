import javax.swing.JOptionPane;

public class Ej7App {

	public static void main(String[] args) {

		double euros = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce una cantidad de euros."));
		String opcion = JOptionPane.showInputDialog(null, "Escoge una opcion:\n\t - Libras \n\t - Dolares \n\t - Yenes ");
		
		convertirEuros(euros, opcion);
	}

	public static void convertirEuros(double euros, String opcion) 
	{
		if(opcion.equals("Libras"))
		{
			JOptionPane.showMessageDialog(null, euros + " € equivalen a " + Math.round((0.86 * euros) * 100.0) / 100.0 + " libras.");
		}
		else if(opcion.equals("Dolares"))
		{
			JOptionPane.showMessageDialog(null, euros + " € equivalen a " + Math.round((1.28611 * euros) * 100.0) / 100.0 + " $.");
		}
		else if(opcion.equals("Yenes"))
		{
			JOptionPane.showMessageDialog(null, euros + " € equivalen a " + Math.round((129.852 * euros) * 100.0) / 100.0 + " yenes.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Tienes que escoger una de las opciones.");
		}
	}

}
