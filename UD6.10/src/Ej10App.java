import java.util.Scanner;

public class Ej10App {
	
	public static Scanner teclat = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arrayNum;
		
		System.out.println("Indique el tamaño del array.");
		arrayNum = new int[teclat.nextInt()];
		
		System.out.println("Indique el valor minimo del array.");
		int min = teclat.nextInt();
		
		System.out.println("Indique el valor maximo del array.");
		int max = teclat.nextInt();
		
		rellenarArray(arrayNum, min, max);
		mostrarArray(arrayNum);
		maxArray(arrayNum);
		
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

	public static void rellenarArray(int[] array, int min, int max)//No hace falta retornar el array ya que este sobreescribe el original.
	{
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = (int) (Math.random() * (max + 1 - min)) + min;
			
			if (!comprobarPrimo(array[i])) 
			{
				i--;
			}
		}
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
	
	public static void maxArray(int[] array)
	{
		int max = array[0];
		int posicion = 0;
		
		for (int i = 1; i < array.length; i++) 
		{
			if(max < array[i])
			{
				max = array[i];
				posicion = i;
			}
		}
		
		System.out.println("El valor maximo del array esta en la posición " + posicion + " y su valor es " + max);
	}
}
