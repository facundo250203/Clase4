package FuncionesyArchivos;

import java.util.Arrays;
import java.util.Collections;

public class Punto1a {

	public static void main(String[] args) {
	Integer para [] = new Integer [3];
	char ubi = 'd';
	
	para [0]=2;
	para [1]=9;
	para [2]=7;
	Orden(para,ubi);
	Mostrar(para);

	
	}

	public static void Orden (Integer[] ord, char ad)
	{
		if(ad=='a') {
			Arrays.sort(ord);
		}
		else if(ad=='d')
		{
			Arrays.sort(ord,Collections.reverseOrder());
		}
	}
	
	public static void Mostrar(Integer [] par)
	{
		for(int i:par)
		{
			System.out.println(i);
		}
	}
	}
