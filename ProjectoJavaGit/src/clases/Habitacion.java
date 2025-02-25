package clases;

public class Habitacion extends Estancia {
	private boolean accesobano;
	private int numeroPuertasArmario;

	public Habitacion(String n, int mc,int np, int nv, int npa, boolean a) {
		super(n, mc, np, nv);
			accesobano=a;
			numeroPuertasArmario=npa;
	}
	public String mostrarInfo() {
		String informacion= super.mostrarInfo()+"Tiene acceso al baño: "+
			this.accesobano+"; Numero de puertas del armario: "+numeroPuertasArmario;
		return informacion;
	}
}