import PkClase3.Ejercicio1_a;
import PkClase3.Ejercicio1_b;

import java.util.Scanner;

public class Iniciar {
	public static void main(String[] args) {
	
		 System.out.println("*********** Clase 3 - ejecicio 1 pto. a *************");
		Ejercicio1_a eje1=new Ejercicio1_a();
	
		Scanner palabra = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Ingrese palabra: ");
		 
	    String word = palabra.nextLine();
	    
	    eje1.setCadenaLetras(word);

	    System.out.println("Ingrese letra a buscar:");
		Scanner LetraBuscar=new Scanner(System.in);
		char Letra= (LetraBuscar.nextLine()).charAt(0);
		eje1.setLetra(Letra);
		
		 System.out.println("La letra: " + Letra +" aparece " + eje1.CuentaAparicion() + " veces");
		 
		
		 System.out.println("*****************************************************"); 
		 
	
		System.out.println("*********** Clase 3 - ejecicio 2 pto. 1 *************");
		 Ejercicio1_b eje1b=new Ejercicio1_b();
		 char ABC[]=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
		 eje1b.setAbecedario(ABC);
		 
		 Scanner palabrab = new Scanner(System.in);  // Create a Scanner object
			System.out.println("Ingrese palabra a codificar: ");
		    String wordb = palabrab.nextLine();
		    eje1b.setPalabra(wordb);
		    
		    System.out.println("Ingrese el desplazamiento :");
			Scanner Desplaza=new Scanner(System.in);
			int Desplazar= Integer.parseInt(Desplaza.nextLine());
			
			eje1b.Desplazar(Desplazar);
			

			
			 System.out.println("*****************************************************"); 
			 
		
			System.out.println("*********** Clase 4 - Majejo de Archivos Lectura/Escritura *************");
		ManejoArchivos Arch = new ManejoArchivos();
		Arch.setPath("C:\\Desktop\\CURSO JAVA\\EjeFiles\\hola.txt");//cambiar ruta
		Arch.setFileName("DesdeJavaCode");
		
		
	Arch.EscribirArchivos("funciona");
		
	Arch.LeerArchivos();
		
	}
	
}










/*
Class3_Array C3= new Class3_Array();
C3.MetodoMostrar();

System.out.println("Desde el metodo Main()");// 
		Class3_Array C3= new Class3_Array(); // C3 es un objeto de la Clase Class3_Array
		C3.MetodoMostrar();  //uso el metodo definido en la clase.
*/