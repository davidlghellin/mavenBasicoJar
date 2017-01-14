package es.david;

public class HolaMaven 
{
	public static void main(String[] args) 
	{
		System.out.println("Hola maven");
		saluda();
		
		ClaseSaluda claseSaluda = new ClaseSaluda();
		claseSaluda.saludaEnClase("David");
	}
	
	private static void saluda()
	{
		System.out.println("¿qué tal?");
	}
	//cambios para actualizar (pruebas)
}
