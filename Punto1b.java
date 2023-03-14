package FuncionesyArchivos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Punto1b {

	public static void main(String[] args) {
		Integer para [] = new Integer [3];
		char ubi = ' ';
		Scanner dato = new Scanner(System.in);
	
		cargar(para,dato);
		orden(para,ubi,dato);

		mostrar(para);
		
	}
	
	public static void cargar(Integer[] vector, Scanner dato) {

		for(int i=0; i<vector.length;i++)
		{
			System.out.println("Ingrese un numero");
			vector[i]= dato.nextInt();
		}
		

	}

	public static void orden(Integer[] vector, char e,Scanner dato)
	{
		System.out.print("Ingrese una letra: a) ascendete d) descendente: ");
		e = dato.next().charAt(0);
	
		if(e =='a') {
			Arrays.sort(vector);
		}
		else if (e =='d') {
			Arrays.sort(vector,Collections.reverseOrder());
		}
		
	}
	
	public static void mostrar(Integer []array) {
		
		for(int i:array) {
			System.out.println(i);
		}
	
	
	}	
}
