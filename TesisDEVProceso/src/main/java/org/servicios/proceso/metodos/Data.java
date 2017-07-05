package org.servicios.proceso.metodos;
public class Data {

	public String nombre;
	public String apellido;
	public String seguro;
	public String suma;
	public String prima;
	
	public Data(String[] elements){
		int i = 0;
		nombre = elements[i++].trim();
		apellido = elements[i++].trim();
		seguro = elements[i++].trim();
		suma = elements[i++].trim();
		prima = elements[i++].trim();
	}
	
	
}