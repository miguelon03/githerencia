package clases;

public abstract class Estancia {
	protected String nombre;
	protected double metrosCuadrados;
	protected int numeroPuertas;
	protected int numeroVentanas;
	
	public Estancia(String nombre, double metrosCuadrados,int numeroPuertas,int numeroVentanas) {
		this.nombre=nombre;
		this.metrosCuadrados= metrosCuadrados;
		this.numeroPuertas= numeroPuertas;
		this.numeroVentanas=numeroVentanas;
	}
	
	public double getMetrosCuadrados(){
		return metrosCuadrados;
	}
	public String mostrarInfo() {
		String informacion="Nombre: "+nombre+"; Metros Cuadrados: "+metrosCuadrados+
				"; Numero de Puertas: "+numeroPuertas+"; Numero de Ventanas: "+numeroVentanas;
		return informacion;
	}
}