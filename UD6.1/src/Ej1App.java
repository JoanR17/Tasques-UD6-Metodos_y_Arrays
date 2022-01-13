import javax.swing.JOptionPane;

public class Ej1App {

	public static void main(String[] args) {

		int opcion;
		double resultado;
		
		try 
		{
			opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoge una opcion (1, 2 o 3):\n\t 1. Calcular Area Circulo \n\t 2. Calcular Area Triangulo \n\t 3. Calcular Area Cuadrado "));
		}
		catch (Exception e)
		{
			opcion = 0;
		}
		
		switch (opcion) 
		{
			case 1:
					double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Indica cual es el valor del radio(solo el numero): "));
					resultado = areaCirculo(radio);
					JOptionPane.showMessageDialog(null, "La area del circulo es de " + resultado);
				break;
				
			case 2:
					double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Indica cual es el valor de la base del triangulo(solo el numero): "));
					double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Indica cual es el valor de la altura del triangulo(solo el numero): "));
					resultado = areaTriangulo(base, altura);
					JOptionPane.showMessageDialog(null, "La area del triangulo es de " + resultado);
				break;
				
			case 3:
					double lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Indica cual es el valor del lado del circulo(solo el numero): "));
					resultado = areaCuadrado(lado);
					JOptionPane.showMessageDialog(null, "La area del cuadrado es de " + resultado);
				break;
	
			default:
					JOptionPane.showMessageDialog(null, "Tienes que escoger una de las opciones.");
				break;
		}

	}
	
	public static double areaCirculo(double r)
	{
		return Math.pow(r, 2) * Math.PI;
	}
	
	public static double areaTriangulo(double b, double h)
	{
		return b * h / 2;
	}
	
	public static double areaCuadrado(double lado)
	{
		return lado * lado;
	}

}
