package es.david;

public class ClaseSaluda 
{
	private String palabra;

	public String getPalabra() {return palabra;}
	public void setPalabra(String palabra) {this.palabra = palabra;}
	
	public String saludaEnClase(String palabra)
	{
		this.palabra=palabra;
		return "hola " + palabra;
	}
}
