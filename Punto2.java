package FuncionesyArchivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Punto2 {

	public static void main(String[] args) {
		//programa que suma o multiplica numeros, separados por espacio en distintas filas, o todos en la misma separadas por espacio
		//NO DEJAR ESPACIO AL COMENZAR LA FILA.
		//Tambien opera si los numeros estan uno por fila;
		String rutaRelativa = "recursos/ArchivoNum.txt";
		String opci=" ";
		Scanner dato = new Scanner(System.in);
		
		System.out.println("¿Desea SUMAR o MULTIPLICAR?");
		opci=dato.next().toUpperCase();
		Operar(rutaRelativa,opci);
		
	}
	
	public static void Operar(String ruta, String opci) {
		Path pathrelativo = Paths.get(ruta);
	
		
		int cont=0;;
		try {
			for(String linea: Files.readAllLines(pathrelativo))
			{
				String num[] = linea.split(" ");
				for(String a:num) {
					if(opci.equals("SUMAR"))
					{
					cont = cont + Integer.valueOf(a);
					}
					else if(opci.equals("MULTIPLICAR"))
					{
						if(cont==0)
						{
							cont= Integer.valueOf(a);
						}
						cont= cont * Integer.valueOf(a);
					}
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(cont);
	}
}
