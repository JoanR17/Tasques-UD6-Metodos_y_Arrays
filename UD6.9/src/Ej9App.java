import java.util.Scanner;

public class Ej9App {
	
	public static Scanner teclat = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arrayNum;
		
		System.out.println("Indique el tamaño del array.");
		arrayNum = new int[teclat.nextInt()];
		
		rellenarArray(arrayNum, 0, 9);
		mostrarArraySuma(arrayNum);

	}
	
	public static void mostrarArraySuma(int[] array)
	{
		int suma = 0;
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println("Posicion [" + i + "] -> " + array[i]);
			suma += array[i];
		}
		
		System.out.println("\nLa suma de todos los valores es de " + suma);
	}

	public static void rellenarArray(int[] array, int min, int max)//No hace falta retornar el array ya que este sobreescribe el original.
	{
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = (int) (Math.random() * (max + 1 - min)) + min;
		}
	}

}
