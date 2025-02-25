package clases;

public class Salon extends Estancia {
	private int tomasRed;
	private boolean terraza;
	private int metrosCuadradosTerraza;
	
	
	public Salon(String n, int mc, int np, int nv,int tr, boolean te, int m) {
		super(n, mc, np, nv);
		tomasRed=tr;
		terraza=te;
		metrosCuadradosTerraza=m;
	}
	public String mostrarInfo() {
		String informacion= super.mostrarInfo()+"; Tiene terraza: "+this.terraza+
				"; Metros cuadrados de la terraza: "+metrosCuadradosTerraza+
				"; Tomas de red: "+tomasRed;
		return informacion;
	}
	
}