import java.util.Scanner;

public class Ej2App {
	
	public static Scanner teclat = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce el rango minimo aleatorio");
		int num1 = teclat.nextInt();

		System.out.println("Introduce el rango maximo aleatorio");
		int num2 = teclat.nextInt();

		System.out.println("Introduce cuantos numeros quieres generar");
		int numGenerator = teclat.nextInt();
		
		System.out.println("Numeros aleatorios generados: \n");
		for (int i = 0; i < numGenerator; i++) 
		{
			System.out.println("\t - " + numRandom(num1, num2));
		}

	}
	
	public static int numRandom(int x, int y)
	{
		return (int) (Math.random() * (y + 1 - x)) + x;
	}

}
