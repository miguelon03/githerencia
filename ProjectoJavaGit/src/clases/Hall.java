package clases;

public class Hall extends Estancia {
	private boolean puertaBlindada;

	public Hall(String nombre, double metrosCuadrados, int numeroPuertas, int numeroVentanas, boolean puertaBlindada) {
		super(nombre, metrosCuadrados, numeroPuertas, numeroVentanas);
		this.puertaBlindada= puertaBlindada;
		
	}
	public String mostrarInfo() {
		String informacion= super.mostrarInfo()+"; Tiene puerta blindada: "+this.puertaBlindada;
		return informacion;
	}
	
}
