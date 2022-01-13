import java.util.Scanner;

public class Ej11App {
	
	public static Scanner teclat = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arrayNum1;
		int[] arrayNum2;
		int[] arrayNum3;
		int dimension;
		
		System.out.println("Indique el tamaño del array.");
		dimension = teclat.nextInt();
		
		arrayNum1 = new int[dimension];
		arrayNum2 = new int[dimension];
		
		System.out.println("Indique el valor minimo del array.");
		int min = teclat.nextInt();
		
		System.out.println("Indique el valor maximo del array.");
		int max = teclat.nextInt();
		
		rellenarArray(arrayNum1, min, max);
		
		arrayNum2 = arrayNum1;
		
		System.out.println("\nArray 1 y 2 antes de rellenar array 2");
		mostrarArray(arrayNum1);
		mostrarArray(arrayNum2);
		
		rellenarArray(arrayNum2, min, max);
		
		arrayNum3 = fusionArray(arrayNum1, arrayNum2, dimension);

		System.out.println("\nArray 1 y 2 despues de rellenar array 2");
		mostrarArray(arrayNum1);
		mostrarArray(arrayNum2);
		
		System.out.println("\nArray multiplicacion de 1 y 2");
		mostrarArray(arrayNum3);
	}

	public static void mostrarArray(int[] array)
	{
		for (int i = 0; i < array.length; i++) 
		{
			if (i != (array.length - 1)) 
			{
				System.out.print(array[i] + ", ");
			}
			else
			{
				System.out.println(array[i] + ".");
			}
		}
	}

	public static void rellenarArray(int[] array, int min, int max)//No hace falta retornar el array ya que este sobreescribe el original.
	{
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = (int) (Math.random() * (max + 1 - min)) + min;
		}
	}
	
	public static int[] fusionArray(int[] arrayNum1, int[] arrayNum2, int tamaño) 
	{
		int[] array = new int[tamaño];
		
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = arrayNum1[i] * arrayNum2[i];
		}
		
		return array;
	}

}
