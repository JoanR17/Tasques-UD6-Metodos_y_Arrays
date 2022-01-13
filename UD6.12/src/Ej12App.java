import java.util.Scanner;

public class Ej12App {
	
	public static Scanner teclat = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arrayNum;
		int num;
		String str = "Indique el valor final de los numeros.";
		
		System.out.println("Indique el tamaño del array.");
		arrayNum = new int[teclat.nextInt()];
		
		rellenarArray(arrayNum, 1, 300);
		
		do 
		{
			System.out.println(str);
			num = teclat.nextInt();
			
			if((num + "").length() != 1)
			{
				str = "El numero tiene que ser de una decima. (0-9)";
			}
			else if(!numeroIntroducidoEsta(arrayNum, num))
			{
				str = "El numero no esta al final de ningun numero de este array.";
			}
		}
		while ((num + "").length() != 1 || !numeroIntroducidoEsta(arrayNum, num));
		
		mostrarArray(arrayNumerosFinales(arrayNum, num));
	}

	/**
	 * Funcion para rellenar un array de forma aleatoria
	 * @param array array a rellenar
	 * @param min rango minimo aleatorio
	 * @param max rango maximo aleatorio
	 */
	public static void rellenarArray(int[] array, int min, int max)//No hace falta retornar el array ya que este sobreescribe el original.
	{
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = (int) (Math.random() * (max + 1 - min)) + min;
		}
	}
	
	/**
	 * Funcion para saber si un numero acaba con el numero deseado
	 * @param num
	 * @param centinela numero con el cual tiene que acabar num
	 * @return True si el numero acaba con el centinela escogido, False si no
	 */
	public static boolean numAcabaEn(int num, int centinela)
	{
		String numero = "" + num;
		char fin = (""+centinela).charAt(0);
		
		return numero.charAt(numero.length() - 1) == fin;
	}
	
	/**
	 * Funcion para saber si el array tiene algun numero que acabe con el valor de centinela
	 * @param array
	 * @param centinela
	 * @return True si hay numeros, False si no
	 */
	public static boolean numeroIntroducidoEsta(int[] array, int centinela)
	{
		boolean numeEsta = false;
		
		for (int i = 0; i < array.length && !numeEsta; i++) 
		{
			if(numAcabaEn(array[i], centinela))
			{
				numeEsta = true;
			}
		}
		
		return numeEsta;
	}
	
	/**
	 * Funcion que printa el array
	 * @param array
	 */
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
	
	/**
	 * Devuelve un array con los numeros del otro array que acaban con el centinela
	 * @param array
	 * @param centinela
	 * @return
	 */
	public static int[] arrayNumerosFinales(int[] array, int centinela)
	{
		int contador = 0;
		int[] arrayFinal;
		
		for (int i = 0; i < array.length; i++) 
		{
			if(numAcabaEn(array[i], centinela))
			{
				contador++;
			}
		}
		
		arrayFinal = new int[contador];
		
		for (int i = 0, j = 0; i < array.length; i++) 
		{
			if(numAcabaEn(array[i], centinela))
			{
				arrayFinal[j] = array[i];
				j++;
			}
		}
		
		return arrayFinal;
	}

}
