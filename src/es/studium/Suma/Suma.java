package es.studium.Suma;
import java.util.Scanner;
public class Suma
{

	public static void main(String[] args)
	{
		int numero1, numero2;
		// Creamos el objeto que nos permite escribir por teclado
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla
		System.out.println("Dame un número");
		//LEER numero1
		numero1 = teclado.nextInt();
		//Mostramos por pantalla
		System.out.println("Dame otro número");
		//LEER numero2
		numero2 = teclado.nextInt();
		//numero3=numero1+numero2
	
		//Mostramos por pantalla
		System.out.println("El resultado es "+ (numero1+numero2));
		teclado.close();
	}

}
