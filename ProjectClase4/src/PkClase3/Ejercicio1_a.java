package PkClase3;

public class Ejercicio1_a {
	private String CadenaLetras;
	private char letra;
	private int CantAparece;
	

	public Ejercicio1_a() {
		
	}
	
	public String getCadenaLetras() 
	{
		return CadenaLetras;
	}
	public void setCadenaLetras(String cadenaLetras) 
	{
		CadenaLetras = cadenaLetras;
	}
	public char getLetra() 
	{
		return letra;
	}
	public void setLetra(char letra) 
	{
		this.letra = letra;
	}
	public int getCantAparece() 
	{
		return CantAparece;
	}
	public void setCantAparece(int cantAparece) 
	{
		CantAparece = cantAparece;
	};
	public int CuentaAparicion()
	{
        for(int indice =0; indice<CadenaLetras.length(); indice++)
		{
			char Caracter =CadenaLetras.charAt(indice);
			  if(Caracter==letra)
			{
				CantAparece+=1;
			}
		}
		return CantAparece;
	}
}
