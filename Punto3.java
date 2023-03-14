package FuncionesyArchivos;


import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Punto3 {

	public static void main(String[] args) {
	
		String rutaRelativa = "recursos/Entrada.txt";
		String rr= "recursos/Salida.txt";
		Path pr = Paths.get(rr);
		String code=" ";
		int desp=0;
		Scanner dato = new Scanner (System.in);
		Path pathrelativo = Paths.get(rutaRelativa);
		
		System.out.println("Que desea realizar(codificacion o decodificacion): ");
		code=dato.next().toUpperCase();
		
		System.out.println("Indique el valor del desplazo(1 o 2): ");
		desp = dato.nextInt();
		
		if(desp==1) {
		desp1(pathrelativo,pr,code);
		}
		else if(desp==2)
		{
		desp2(pathrelativo,pr,code);
		}

		
	}

		public static void desp1(Path pathrelativo,Path pr, String code)
		{
			char a= ' ';
			if(code.equals("CODIFICACION")) {		
				try {
					for(String linea:Files.readAllLines(pathrelativo)) {
						for(int i=0; i<linea.length();i++) {
						if(linea.charAt(i)==' ')
						{
							a='a';
							Files.write(pr,String.valueOf(a).getBytes(),StandardOpenOption.APPEND);
						}
						else {
							a=linea.charAt(i);
							a++;
							Files.write(pr,String.valueOf(a).getBytes(),StandardOpenOption.APPEND);
						}
						}
					}
					System.out.print("Se termino de codificar con desplazamiento 1 CORRECTAMENTE.");
				} catch (IOException e) {

					e.printStackTrace();
				}
				
				}
					else if(code.equals("DECODIFICACION"))
					{
						try {
							for(String linea:Files.readAllLines(pathrelativo)) {
								for(int i=0; i<linea.length();i++) {
								if(linea.charAt(i)=='a')
								{
									a=' ';
									Files.write(pr,String.valueOf(a).getBytes(),StandardOpenOption.APPEND);
								}
								else {
									a=linea.charAt(i);
									a--;
									Files.write(pr,String.valueOf(a).getBytes(),StandardOpenOption.APPEND);
								}
								}
							}
							System.out.print("Se termino de decodificar con desplazamiento 1 CORRECTAMENTE.");
						} catch (IOException e) {

							e.printStackTrace();
						}
					}
		}
		
		public static void desp2(Path pathrelativo,Path pr, String code)
		{
			char a= ' ';
			if(code.equals("CODIFICACION")) {		
				try {
					for(String linea:Files.readAllLines(pathrelativo)) {
						for(int i=0; i<linea.length();i++) {
						if(linea.charAt(i)==' ')
						{
							a='b';
							Files.write(pr,String.valueOf(a).getBytes(),StandardOpenOption.APPEND);
						}
						else {
							a=linea.charAt(i);
							a++;
							a++;
							Files.write(pr,String.valueOf(a).getBytes(),StandardOpenOption.APPEND);
						}
						}
					}
					System.out.print("Se termino de codificar con desplazamiento 2 CORRECTAMENTE.");
				}
				catch (IOException e) {

					e.printStackTrace();
				}
				
				}
					else if(code.equals("DECODIFICACION"))
					{
						try {
							for(String linea:Files.readAllLines(pathrelativo)) {
								for(int i=0; i<linea.length();i++) {
								if(linea.charAt(i)=='b')
								{
									a=' ';
									Files.write(pr,String.valueOf(a).getBytes(),StandardOpenOption.APPEND);
								}
								else {
									a=linea.charAt(i);
									a--;
									a--;
									Files.write(pr,String.valueOf(a).getBytes(),StandardOpenOption.APPEND);
								}
								}
							}
							System.out.print("Se termino de decodificar con desplazamiento 2 CORRECTAMENTE.");
						} catch (IOException e) {

							e.printStackTrace();
						}
					}
		}
}
