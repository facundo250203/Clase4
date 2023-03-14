package FuncionesyArchivos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Punto1c {

	public static void main(String[] args) {
		Integer para [] = new Integer [3];
		char ubi = ' ';
		Scanner dato = new Scanner(System.in);
		int controlador = 0;
		controlador=check(para,ubi);
		
		if(controlador==1) {
			cargar(para,dato);	
		}
		else if(controlador==2)
		{
			orden(para,ubi,dato);	
		}
		else if(controlador == 3) {
			cargar(para,dato);
			orden(para,ubi,dato);
		}
		
		mostrar(para);

	}
	public static int check (Integer[] vector, char e) {
		int a = 0;
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i]==null && a!=1)
			{
			a++;	
			}
			else if(e==' ') {
				a++;	
			}
		}
		
		if(e==' ') {
		a=3;
		}
		return a;
		
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
