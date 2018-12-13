package fp.daw.examen;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2 puntos
	 * 
	 * Crea en el método 'main' un juego que consista en generar de forma aleatoria
	 * un número entero comprendido entre 100 y 200 y pedirle al usuario que lo
	 * adivine. Para ello el programa le pedirá que introduza por teclado un número.
	 * Si introduce el número correcto se mostrará un mesaje por pantalla indicando
	 * que ha acertado acompañado del número de intentos realizados y del tiempo
	 * empleado. A continuación, se le dará al usuario la opción de volver a jugar o
	 * de finalizar el juego.
	 * 
	 */

	public static void main(String[] args) {
		Random r= new Random();
		int res;
		String respuesta="";
		int num;
		Scanner sc = new Scanner(System.in);
		do {
		do {
			num=r.nextInt(100)+100;
		System.out.println("dime un numer entre 100 y 200");
		res=sc.nextInt();
		if(res<100 || res>200) {
			System.out.println("numero incorrecto");
		}
		
		
		}while(res<100 || res>200);
		int cont=0;
		while(num!=res) {
				System.out.println("Respuesta incorrecta, introduzca otro numero");
				res=sc.nextInt();
			cont++;
		}
		System.out.println("respuesta correcta!   " + "numero de intentos = "+ cont);
		System.out.println("quiere seguir jugando?");
		respuesta=sc.next();
		}while(respuesta.equalsIgnoreCase("si"));
	}
}