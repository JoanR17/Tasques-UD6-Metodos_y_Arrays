import java.util.Scanner;

public class Ej8App {
	
	public static Scanner teclat = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arrayNum = new int[10];
		
		rellenarArray(arrayNum);
		mostrarArray(arrayNum);

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

	public static void rellenarArray(int[] array)//No hace falta retornar el array ya que este sobreescribe el original.
	{
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println("Introduce un numero:");
			array[i] = teclat.nextInt();
		}
	}

}
