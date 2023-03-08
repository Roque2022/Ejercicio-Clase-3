package PkClase3;

public class Ejercicio1_b {
	char abecedario[]=new char[27];//{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
	String Palabra;//Hacer los Getter and Setter
	public  Ejercicio1_b() {};
public void Desplazar(int desplaza)
{
	System.out.println("Palabra Original: " + Palabra );
	
	for(int indice =0; indice<Palabra.length(); indice++)
	{
		char Caracter =Palabra.charAt(indice);
		
		for(int i =0; i<abecedario.length; i++)
		{
		   if(Caracter==abecedario[i] && ((i+desplaza)<27))
		   {
			   Palabra=Palabra.replace(Caracter, abecedario[i+desplaza]);
		   }
		}
	}
	System.out.println("Palabra Codificada: " + Palabra );
	}
public char[] getAbecedario() {
	return abecedario;
}
public void setAbecedario(char[] abecedario) {
	this.abecedario = abecedario;
}
public String getPalabra() {
	return Palabra;
}
public void setPalabra(String palabra) {
	Palabra = palabra;
}
}
